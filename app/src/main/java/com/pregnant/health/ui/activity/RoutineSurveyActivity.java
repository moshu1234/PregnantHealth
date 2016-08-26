package com.pregnant.health.ui.activity;

import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import com.alibaba.fastjson.JSON;
import com.pregnant.health.Constants;
import com.pregnant.health.GloableParams;
import com.pregnant.health.R;
import com.pregnant.health.base.BaseActivity;
import com.pregnant.health.bean.RoutineSurvey;
import com.pregnant.health.ui.adapter.ItemAdapter;
import com.pregnant.health.utils.DateUtil;
import com.pregnant.health.utils.JSONUtils;
import com.pregnant.health.utils.L;
import com.pregnant.health.utils.SPUtils;
import com.pregnant.health.utils.SingleSelector;
import com.pregnant.health.utils.TimeSelector;
import com.pregnant.health.view.SettingItemView;

import java.util.ArrayList;
import java.util.Date;

import butterknife.InjectView;

/**
 * 新建检测
 * Created by cws on 2016/3/18.
 */
public class RoutineSurveyActivity extends BaseActivity implements AdapterView.OnItemClickListener, View.OnClickListener {
    @InjectView(R.id.gv)
    GridView gv;

    @InjectView(R.id.siv_date)
    SettingItemView siv_date;
    @InjectView(R.id.siv_week)
    SettingItemView siv_week;
    @InjectView(R.id.siv_pregnancy)
    SettingItemView siv_pregnancy;

    private TimeSelector daySelector;
    private SingleSelector weekSelector;
    private SingleSelector pregnancySelector;

    RoutineSurvey routineSurvey = new RoutineSurvey();


    private int[] resIds = {R.drawable.routine_one, R.drawable.routine_two, R.drawable.routine_three, R.drawable.routine_four, R.drawable.routine_five};
    private int[] nameIds = {R.string.title_routine_one, R.string.title_routine_two, R.string.title_routine_three, R.string.title_routine_four, R.string.title_routine_five};

    @Override
    protected int getLayoutView() {
        return R.layout.act_routine_survey;
    }

    @Override
    public int getTitleName() {
        return R.string.title_routine_survey;
    }

    @Override
    protected void initView() {
        siv_date.setOnClickListener(this);
        siv_week.setOnClickListener(this);
        siv_pregnancy.setOnClickListener(this);

    }

    @Override
    protected void initData() {
        String s = (String) SPUtils.get(Constants.KEY_ROUTINE, "");
        if (!TextUtils.isEmpty(s)) {
            routineSurvey = JSONUtils.string2Bean(s, RoutineSurvey.class);
            siv_date.setValue(routineSurvey.getDate());
            setOther();
        } else {
            // 初始化（检测日期最好改为由app自动读取系统时间）
            String nowTime = DateUtil.format(new Date(), TimeSelector.FORMAT_STR);
            siv_date.setValue(nowTime);
            setOther();
            routineSurvey.setDate(nowTime);
        }

        gv.setAdapter(new ItemAdapter(this, resIds, nameIds));
        gv.setOnItemClickListener(this);

        if (GloableParams.user != null) {
            daySelector = new TimeSelector(this, new TimeSelector.ResultHandler() {
                @Override
                public void handle(String time) {
                    siv_date.setValue(time);
                    setOther();
                    routineSurvey.setDate(time);
                }
            }, DateUtil.getFormatDate(GloableParams.user.getLastMenses()), DateUtil.format(new Date(), TimeSelector.FORMAT_STR));
        }


        ArrayList<String> data = new ArrayList<String>();
        for (int i = 1; i <= 40; i++) {
            data.add(String.valueOf(i));
        }


//        weekSelector = new SingleSelector(this, new SingleSelector.ResultHandler() {
//            @Override
//            public void handle(String selectItem) {
//                siv_week.setValue(selectItem + "周");
//            }
//        }, data, "1");
//
    }

    private void setOther() {
        if (GloableParams.user != null) {
            //孕周=（检测时间—末次月经时间）/7 的商为孕周
            L.i("检测时间:" + DateUtil.getMillionSeconds(siv_date.getValue()) + "\n"
                    + "末次月经:" + GloableParams.user.getLastMenses());
            int weeks = (int) ((DateUtil.getMillionSeconds(siv_date.getValue()) - GloableParams.user.getLastMenses()) / 1000 / 60 / 60 / 24 / 7);
            siv_week.setValue(weeks + "周");

            //        孕期判断：
            //        孕周<=13      孕早期
            //        14<=孕周<=27  孕中
            //        28<=孕周      孕晚期期
            if (weeks <= 13) {
                siv_pregnancy.setValue("孕早期");
            } else if (weeks <= 27) {
                siv_pregnancy.setValue("孕中期");
            } else {
                siv_pregnancy.setValue("孕晚期");
            }
        }
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        switch (position) {
            case 0:
                intent(RoutineSurveyOneActivity.class);
                break;
            case 1:
                intent(RoutineSurveyTwoActivity.class);
                break;
            case 2:
                intent(RoutineSurveyThreeActivity.class);
                break;
            case 3:
                intent(RoutineSurveyFourActivity.class);
                break;
            case 4:
                intent(RoutineSurveyFiveActivity.class);
                break;
        }
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.siv_date:
                daySelector.show();
                break;
            case R.id.siv_week:
            case R.id.siv_pregnancy:

                break;
        }
    }

    @Override
    public void doBack() {
        if (!TextUtils.isEmpty(routineSurvey.getDate())){
            SPUtils.put(Constants.KEY_ROUTINE, JSON.toJSONString(routineSurvey));
        }
        super.doBack();
    }
}
