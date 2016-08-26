package com.pregnant.health.ui.activity;

import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import com.alibaba.fastjson.JSON;
import com.pregnant.health.Constants;
import com.pregnant.health.R;
import com.pregnant.health.base.BaseActivity;
import com.pregnant.health.bean.Sport;
import com.pregnant.health.model.Catalog;
import com.pregnant.health.ui.adapter.ItemAdapter;
import com.pregnant.health.utils.DateUtil;
import com.pregnant.health.utils.JSONUtils;
import com.pregnant.health.utils.SPUtils;
import com.pregnant.health.utils.TimeSelector;
import com.pregnant.health.view.SettingItemView;

import java.util.Date;

import butterknife.InjectView;

/**
 * 运动调查
 * Created by cws on 2016/3/18.
 */
public class SportSurveyActivity extends BaseActivity implements AdapterView.OnItemClickListener, View.OnClickListener {
    @InjectView(R.id.gv)
    GridView gv;

    @InjectView(R.id.siv_date)
    SettingItemView siv_date;
    @InjectView(R.id.siv_work)
    SettingItemView siv_work;

    private TimeSelector daySelector;


    private int[] resIds = {R.drawable.sport_one, R.drawable.sport_two, R.drawable.sport_three};
    private int[] nameIds = {R.string.title_sport_one, R.string.title_sport_two, R.string.title_sport_three, };

    private Sport sport = new Sport();

    @Override
    protected int getLayoutView() {
        return R.layout.act_sport_survey;
    }

    @Override
    public int getTitleName() {
        return R.string.title_sport_survey;
    }

    @Override
    protected void initView() {
        siv_date.setOnClickListener(this);
        siv_work.setOnClickListener(this);

    }

    @Override
    protected void initData() {
        String s = (String) SPUtils.get(Constants.TABLE_SPORTCONDITIONINSPECTION, "");
        if (!TextUtils.isEmpty(s)) {
            sport = JSONUtils.string2Bean(s, Sport.class);
            siv_date.setValue(sport.getDate());
            siv_work.setValue(sport.getProfession());
        }

        gv.setAdapter(new ItemAdapter(this, resIds, nameIds));
        gv.setOnItemClickListener(this);

        daySelector = new TimeSelector(this, new TimeSelector.ResultHandler() {
            @Override
            public void handle(String time) {
                siv_date.setValue(time);
                sport.setDate(time);
            }
        }, "2015-01-01", DateUtil.format(new Date(), TimeSelector.FORMAT_STR));
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        intent(SportSurveyChildActivity.class, position);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.siv_date:
                daySelector.show();
                break;
            case R.id.siv_work:
                intentForResult(OccupationListActivity.class, 3);
                break;
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (data == null) {
            return;
        }

        if (requestCode == 3) {
            Catalog catalog = (Catalog) data.getSerializableExtra(EXTRA_KEY_BEAN);
            siv_work.setValue(catalog.getCaption());
            sport.setProfession(catalog.getCaption());
        }

    }

    @Override
    public void doBack() {
        String s = JSON.toJSONString(sport);
        SPUtils.put(Constants.TABLE_SPORTCONDITIONINSPECTION, s);
        super.doBack();
    }
}
