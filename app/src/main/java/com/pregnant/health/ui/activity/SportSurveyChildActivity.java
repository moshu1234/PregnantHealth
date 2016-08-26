package com.pregnant.health.ui.activity;

import android.text.TextUtils;
import android.widget.ListView;
import android.widget.TextView;

import com.alibaba.fastjson.JSON;
import com.pregnant.health.Constants;
import com.pregnant.health.R;
import com.pregnant.health.base.BaseActivity;
import com.pregnant.health.db.DictCatalogDbManager;
import com.pregnant.health.model.Catalog;
import com.pregnant.health.ui.adapter.SleepAdapter;
import com.pregnant.health.utils.DateUtil;
import com.pregnant.health.utils.JSONUtils;
import com.pregnant.health.utils.SPUtils;
import com.pregnant.health.utils.SingleSelector2;

import java.util.ArrayList;
import java.util.List;

import butterknife.InjectView;
import butterknife.OnClick;

/**
 * 睡眠时间调查 / 职业调查 / 运动调查
 * Created by cws on 2016/3/24.
 */
public class SportSurveyChildActivity extends BaseActivity {
    @InjectView(R.id.lv_sleep)
    ListView lv_sleep;
    @InjectView(R.id.tv_tip)
    TextView tv_tip;

    private SingleSelector2 sleepSelector;
    private SleepAdapter sleepAdapter;
    private List<Catalog> sleepList = new ArrayList<Catalog>();
    int type;

    Catalog catalog;

    List<Catalog> catalogs;

    String key;

    @Override
    protected int getLayoutView() {
        return R.layout.act_sleep_survey;
    }

    @Override
    public int getTitleName() {
        type = getIntent().getIntExtra(EXTRA_KEY_TYPE, -1);
        switch (type) {
            case 0:  // 睡眠

                key = Constants.KEY_SPORT_SLEEP;
                catalog = new DictCatalogDbManager().loadByCode(Constants.CODE_SLEEP);
                catalogs = JSONUtils.string2Array(catalog.getChildren(), Catalog.class);

                return R.string.title_sport_one;
            case 1:  // 职业

                key = Constants.KEY_SPORT_PROFESSION;
                catalog = new DictCatalogDbManager().loadByCode(Constants.CODE_PROFESSIONTIME);
                catalogs = JSONUtils.string2Array(catalog.getChildren(), Catalog.class);

                return R.string.title_sport_two;
            case 2:  // 运动

                key = Constants.KEY_SPORT_SPORT;
                catalog = new DictCatalogDbManager().loadByCode(Constants.CODE_STEPCOUNT);
                catalogs = JSONUtils.string2Array(catalog.getChildren(), Catalog.class);

                return R.string.title_sport_three;
            default:
                return R.string.title_sport_one;

        }
    }

    @Override
    protected void initView() {
    }

    @Override
    protected void initData() {
        String s = (String) SPUtils.get(key, "");
        if (!TextUtils.isEmpty(s)) {
            sleepList.addAll(JSONUtils.string2Array(s, Catalog.class));
        }

        sleepAdapter = new SleepAdapter(this, sleepList);
        sleepAdapter.setKey(key);
        lv_sleep.setAdapter(sleepAdapter);

        switch (type) {
            case 0:  // 睡眠
                tv_tip.setText("睡眠时间");
                initSleepData();
                break;
            case 1:  // 职业
                tv_tip.setText("工作时长");
                initOccupationData();
                break;
            case 2:  // 运动
                tv_tip.setText("运动时长");
                initSportData();
                break;
        }
    }

    /**
     * 初始化睡眠时间调查
     */
    private void initSleepData() {
        sleepSelector = new SingleSelector2(this, new SingleSelector2.ResultHandler() {
            @Override
            public void handle(Catalog selectItem) {
                deal(selectItem);
            }
        }, catalogs, catalogs.get(0));
    }

    /**
     * 处理
     * @param selectItem
     */
    private void deal(Catalog selectItem) {
        selectItem.setAddTime(DateUtil.getFormatDate(System.currentTimeMillis()));
        List<Catalog> dataList = sleepAdapter.getDataList();
        boolean flag = true;
        for (int i = 0; i < dataList.size(); i++) {
            if (dataList.get(i).getAddTime().equals(selectItem.getAddTime())) {
                dataList.get(i).setCaption(selectItem.getCaption());
                flag = false;
            }
        }
        if (flag) {
            sleepAdapter.add(0, selectItem);
        } else {
            sleepAdapter.notifyDataSetChanged();
        }
        save(sleepAdapter.getDataList());
    }

    private void save(List<Catalog> dataList) {
        SPUtils.put(key, JSON.toJSONString(dataList));
    }

    /**
     * 初始化职业调查
     */

    private void initOccupationData() {
        catalogs.clear();
        for(int i = 0; i <= 24; i++) {
            Catalog catalog = new Catalog();
            catalog.setCaption(i + "小时");
            catalogs.add(catalog);
        }
        sleepSelector = new SingleSelector2(this, new SingleSelector2.ResultHandler() {
            @Override
            public void handle(Catalog selectItem) {
                deal(selectItem);
            }
        }, catalogs, catalogs.get(0));
    }

    /**
     * 初始化运动调查
     */
    private void initSportData() {
        List<Catalog> times = new ArrayList<>();
        for(int i = 0; i <= 24; i++) {
            Catalog catalog = new Catalog();
            catalog.setCaption(i + "小时");
            times.add(catalog);
        }

        sleepSelector = new SingleSelector2(this, new SingleSelector2.ResultHandler() {
            @Override
            public void handle(Catalog selectItem) {
                deal(selectItem);
            }
        }, catalogs, times, catalogs.get(0), times.get(0));
    }

    @OnClick(R.id.tv_add)
    public void add(){
        sleepSelector.show();
    }
}
