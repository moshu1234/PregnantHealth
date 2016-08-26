package com.pregnant.health.ui.activity;

import android.widget.RadioGroup;

import com.alibaba.fastjson.JSON;
import com.pregnant.health.Constants;
import com.pregnant.health.R;
import com.pregnant.health.base.BaseActivity;
import com.pregnant.health.bean.GeneralSurvey;
import com.pregnant.health.db.DictCatalogDbManager;
import com.pregnant.health.model.Catalog;
import com.pregnant.health.utils.DateUtil;
import com.pregnant.health.utils.JSONUtils;
import com.pregnant.health.utils.SPUtils;
import com.pregnant.health.utils.T;
import com.pregnant.health.view.CheckBoxGroup;
import com.pregnant.health.view.FlowRadioGroup;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import butterknife.InjectView;
import butterknife.OnClick;

/**
 * 饮食习惯
 * Created by cws on 2016/3/21.
 */
public class RoutineSurveyFourActivity extends BaseActivity {

    @InjectView(R.id.frgTwo)
    FlowRadioGroup frgTwo;
    @InjectView(R.id.mvgThree)
    CheckBoxGroup mvgThree;
    @InjectView(R.id.mvgOne)
    CheckBoxGroup mvgOne;

    List<String> list = new ArrayList<String>();

    Catalog catalog;
    GeneralSurvey dietHabitInspection = new GeneralSurvey();
    List<Catalog> data;
    Catalog two;

    @Override
    protected int getLayoutView() {
        return R.layout.act_routine_survey_four;
    }

    @Override
    public int getTitleName() {
        return R.string.title_routine_four;
    }

    @Override
    protected void initView() {

    }

    @Override
    protected void initData() {
        mvgOne.setKey(Constants.TABLE_DIETHABITINSPECTION);
        mvgOne.setTags(getData(Constants.CODE_HOBBY));

        data = getData(Constants.CODE_TASTES);
        frgTwo.setKey(Constants.TABLE_DIETHABITINSPECTION);
        frgTwo.setTags(data);

        mvgThree.setKey(Constants.TABLE_DIETHABITINSPECTION);
        mvgThree.setTags(getData(Constants.CODE_OTHERHABIT));

        frgTwo.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                two = data.get(checkedId);
            }
        });

        dietHabitInspection.setTableName(catalog.getTableName());
        dietHabitInspection.setRecordTime(DateUtil.getFormatDate(System.currentTimeMillis()));
        dietHabitInspection.setSign("1");
        dietHabitInspection.setGlobalRecordNr("123456");
        dietHabitInspection.setInspectionOrder("1");
    }

    private List<Catalog> getData(String code) {
        catalog = new DictCatalogDbManager().loadByCode(code);
        return JSONUtils.string2Array(catalog.getChildren(), Catalog.class);
    }

    @OnClick(R.id.btn_save)
    public void save() {
        List<Catalog> list2 = mvgOne.getList();
        List<Catalog> list3 = mvgThree.getList();

        if (two == null) {
            two = frgTwo.getSelected();
        }

//        if (list2.size() > 0
//                && list3.size() > 0
//                && two != null
//                ) {
        Map<String, String> map = new HashMap<String, String>();
        if (list2.size() > 0) {
            for (Catalog c : list2) {
                map.put(c.getFieldName(), "1");
            }
        }
        if (list2.size() > 0) {
            for (Catalog c : list3) {
                map.put(c.getFieldName(), "1");
            }
        }
        if (two != null) {
            map.put(two.getFieldName(), "1");
        }
        dietHabitInspection.setField(map);

        SPUtils.put(Constants.TABLE_DIETHABITINSPECTION, JSON.toJSONString(dietHabitInspection));

        T.show(getString(R.string.tip_save_success));
        doBack();
//        } else {
//            T.show(getString(R.string.tip_register_not_full));
//        }
    }

    @Override
    public void doTitleRight() {
        mvgOne.reset();
        mvgThree.reset();
        frgTwo.reset();
        two = null;

        SPUtils.put(Constants.TABLE_DIETHABITINSPECTION, "");
    }
}
