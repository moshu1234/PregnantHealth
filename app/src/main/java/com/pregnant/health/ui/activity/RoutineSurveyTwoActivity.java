package com.pregnant.health.ui.activity;

import android.widget.ListView;

import com.alibaba.fastjson.JSON;
import com.pregnant.health.Constants;
import com.pregnant.health.R;
import com.pregnant.health.base.BaseActivity;
import com.pregnant.health.bean.GeneralSurvey;
import com.pregnant.health.db.DictCatalogDbManager;
import com.pregnant.health.model.Catalog;
import com.pregnant.health.ui.adapter.HistoryAdapter;
import com.pregnant.health.utils.DateUtil;
import com.pregnant.health.utils.JSONUtils;
import com.pregnant.health.utils.SPUtils;
import com.pregnant.health.utils.T;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import butterknife.InjectView;
import butterknife.OnClick;

/**
 * 既往及现病史
 * Created by cws on 2016/3/21.
 */
public class RoutineSurveyTwoActivity extends BaseActivity {
    @InjectView(R.id.lv)
    ListView lv;

    HistoryAdapter historyAdapter;

    Catalog catalog;
    List<Catalog> catalogs;
    GeneralSurvey diseaseHistoryRecord = new GeneralSurvey();

    @Override
    protected int getLayoutView() {
        return R.layout.act_routine_survey_two;
    }

    @Override
    public int getTitleName() {
        return R.string.title_routine_two;
    }

    @Override
    protected void initView() {

    }

    @Override
    protected void initData() {
        catalog = new DictCatalogDbManager().loadByCode(Constants.CODE_DISEASEHISTORYRECORD);
        if (catalog != null) {
            catalogs = JSONUtils.string2Array(this.catalog.getChildren(), Catalog.class);
        }

        historyAdapter = new HistoryAdapter(this, catalogs);
        lv.setAdapter(historyAdapter);

        diseaseHistoryRecord.setTableName("DiseaseHistoryRecord");
        diseaseHistoryRecord.setRecordTime(DateUtil.getFormatDate(System.currentTimeMillis()));
        diseaseHistoryRecord.setSign("1");
        diseaseHistoryRecord.setGlobalRecordNr("123456");
        diseaseHistoryRecord.setInspectionOrder("1");
    }

    @OnClick(R.id.btn_save)
    public void save(){
        boolean isFilled = true;
        List<Catalog> cs = historyAdapter.getDataList();
//        for (Catalog c : cs) {
//            if (TextUtils.isEmpty(c.getDefaultValue())) {
//                isFilled = false;
//            }
//        }
        if (isFilled) {
            Map<String,String> map = new HashMap<String,String>();
            for (Catalog c : cs) {
                map.put(c.getFieldName(), c.getDefaultValue());
            }
            diseaseHistoryRecord.setField(map);

            SPUtils.put(Constants.TABLE_DISEASEHISTORYRECORD, JSON.toJSONString(diseaseHistoryRecord));
            // 更新数据库
//            new DictCatalogDbManager().updateList(cs);

            T.show(getString(R.string.tip_save_success));
            doBack();
        } else {
            T.show(getString(R.string.tip_register_not_full));
        }
    }

    @Override
    public void doTitleRight() {
        historyAdapter.reset();
    }
}
