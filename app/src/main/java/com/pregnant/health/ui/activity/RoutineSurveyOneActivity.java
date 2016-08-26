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

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import butterknife.InjectView;
import butterknife.OnClick;

/**
 * Created by cws on 2016/3/21.
 */
public class RoutineSurveyOneActivity extends BaseActivity {
    @InjectView(R.id.mvgOne)
    CheckBoxGroup mvgOne;
    @InjectView(R.id.mvgTwo)
    CheckBoxGroup mvgTwo;
    @InjectView(R.id.mvgThree)
    CheckBoxGroup mvgThree;
    @InjectView(R.id.mvgFive)
    CheckBoxGroup mvgFive;
    @InjectView(R.id.frg)
    FlowRadioGroup frg;

    Catalog catalogs;
    List<Catalog> data;
    GeneralSurvey statementSymptomRecord = new GeneralSurvey();

    Catalog four;

    @Override
    protected int getLayoutView() {
        return R.layout.act_routine_survey_one;
    }

    @Override
    public int getTitleName() {
        return R.string.title_routine_one;
    }

    @Override
    protected void initView() {

    }

    @Override
    protected void initData() {
//        String data = ACache.get(this).getAsString(Constants.KEY_ALL);
//        List<Catalog> catalogs = JSONUtils.string2Array2(data, Catalog.class);

        mvgOne.setKey(Constants.TABLE_STATEMENTSYMPTOMRECORD);
        mvgOne.setTags(getData(Constants.CODE_DIGESTIVE));

        mvgTwo.setKey(Constants.TABLE_STATEMENTSYMPTOMRECORD);
        mvgTwo.setTags(getData(Constants.CODE_IMMUNE));

        mvgThree.setKey(Constants.TABLE_STATEMENTSYMPTOMRECORD);
        mvgThree.setTags(getData(Constants.CODE_SKIN));

        mvgFive.setKey(Constants.TABLE_STATEMENTSYMPTOMRECORD);
        mvgFive.setTags(getData(Constants.CODE_OTHERSYMPTOM));



        data = getData(Constants.CODE_PREGNANCYREACTION);
        frg.setKey(Constants.TABLE_STATEMENTSYMPTOMRECORD);
        frg.setTags(data);

        frg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
               four = data.get(checkedId);
            }
        });

        statementSymptomRecord.setTableName(catalogs.getTableName());
        statementSymptomRecord.setRecordTime(DateUtil.getFormatDate(System.currentTimeMillis()));
        statementSymptomRecord.setSign("1");
        statementSymptomRecord.setGlobalRecordNr("123456");
        statementSymptomRecord.setInspectionOrder("1");
    }

    private List<Catalog> getData(String code) {
        catalogs = new DictCatalogDbManager().loadByCode(code);
        return JSONUtils.string2Array(catalogs.getChildren(), Catalog.class);
    }

    @OnClick(R.id.btn_save)
    public void save() {
        List<Catalog> list1 = mvgOne.getList();
        List<Catalog> list2 = mvgTwo.getList();
        List<Catalog> list3 = mvgThree.getList();
        List<Catalog> list5 = mvgFive.getList();

        if (four == null) {
            four = frg.getSelected();
        }

//        if (list1.size() > 0
//                && list2.size() > 0
//                && list3.size() > 0
//                && list5.size() > 0
//                && four != null
//                ) {
            Map<String,String> map = new HashMap<String,String>();
            if (list1.size() > 0) {
                for (Catalog c : list1) {
                    map.put(c.getFieldName(), "1");
                }
            }
            if (list2.size() > 0) {
                for (Catalog c : list2) {
                    map.put(c.getFieldName(), "1");
                }
            }
            if (list3.size() > 0) {
                for (Catalog c : list3) {
                    map.put(c.getFieldName(), "1");
                }
            }
            if (list5.size() > 0) {
                for (Catalog c : list5) {
                    map.put(c.getFieldName(), "1");
                }
            }
            if (four != null) {
                map.put(four.getFieldName(), "1");
            }

            statementSymptomRecord.setField(map);

            SPUtils.put(Constants.TABLE_STATEMENTSYMPTOMRECORD, JSON.toJSONString(statementSymptomRecord));

            T.show(getString(R.string.tip_save_success));
            doBack();
//        } else {
//            T.show(getString(R.string.tip_register_not_full));
//        }

    }

    @Override
    public void doTitleRight() {
        mvgOne.reset();
        mvgTwo.reset();
        mvgThree.reset();
        mvgFive.reset();
        frg.reset();

        SPUtils.put(Constants.TABLE_STATEMENTSYMPTOMRECORD, "");
    }

    @Override
    public void doBack() {
        super.doBack();
    }
}
