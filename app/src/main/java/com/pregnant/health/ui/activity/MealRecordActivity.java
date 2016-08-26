package com.pregnant.health.ui.activity;

import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.alibaba.fastjson.JSON;
import com.pregnant.health.Constants;
import com.pregnant.health.R;
import com.pregnant.health.base.BaseActivity;
import com.pregnant.health.bean.Meal;
import com.pregnant.health.ui.adapter.MealRecordAdapter;
import com.pregnant.health.utils.JSONUtils;
import com.pregnant.health.utils.SPUtils;

import java.util.ArrayList;
import java.util.List;

import butterknife.InjectView;

/**
 * Created by cws on 2016/3/23.
 */
public class MealRecordActivity extends BaseActivity {
    @InjectView(R.id.lv_record)
    ListView lv_record;

    List<Meal> meals = new ArrayList<Meal>();

    private int selectPos = -1;

    MealRecordAdapter mealRecordAdapter;

    @Override
    protected int getLayoutView() {
        return R.layout.act_meal_record;
    }

    @Override
    public int getTitleName() {
        return R.string.title_meal_record;
    }

    @Override
    protected void initView() {

    }

    @Override
    protected void initData() {
        String mealsStr = (String) SPUtils.get(Constants.KEY_MEALS, "");
        if (!TextUtils.isEmpty(mealsStr)) {
            meals.addAll(JSONUtils.string2Array(mealsStr, Meal.class));
        }

        mealRecordAdapter = new MealRecordAdapter(this, meals);
        lv_record.setAdapter(mealRecordAdapter);
        lv_record.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                selectPos = position;
                intentForResult(MealDetailActivity.class, mealRecordAdapter.getItem(position), 2);
            }
        });

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (data == null) {
            return;
        }
        if (requestCode == 2) {
            mealRecordAdapter.remove(selectPos);
            Meal meal = (Meal) data.getSerializableExtra(EXTRA_KEY_BEAN);
            if (meal != null) {
                mealRecordAdapter.add(selectPos, meal);
                mealRecordAdapter.notifyDataSetChanged();
            }

            SPUtils.put(Constants.KEY_MEALS, JSON.toJSONString(mealRecordAdapter.getDataList()));

        }
    }

    @Override
    public void doTitleRight() {

    }
}
