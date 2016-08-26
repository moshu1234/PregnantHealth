package com.pregnant.health.ui.activity;

import com.pregnant.health.R;
import com.pregnant.health.base.BaseActivity;

import butterknife.OnClick;

/**
 * 分析结果
 * Created by cws on 2016/3/24.
 */
public class AnalysisResultActivity extends BaseActivity {
    @Override
    protected int getLayoutView() {
        return R.layout.act_analysis_result;
    }

    @Override
    public int getTitleName() {
        return R.string.title_analyze_results;
    }

    @Override
    protected void initView() {

    }

    @Override
    protected void initData() {

    }

    @OnClick(R.id.btn_guidelines)
    public void guidelines() {
        intent(GuideLinesActivity.class);
    }
}
