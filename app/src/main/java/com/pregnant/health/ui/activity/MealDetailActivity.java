package com.pregnant.health.ui.activity;

import android.content.Intent;
import android.view.View;

import com.pregnant.health.R;
import com.pregnant.health.base.BaseActivity;
import com.pregnant.health.bean.Meal;
import com.pregnant.health.utils.DateUtil;
import com.pregnant.health.utils.DialogHelp;
import com.pregnant.health.utils.SingleSelector;
import com.pregnant.health.utils.TimeSelector;
import com.pregnant.health.view.SettingItemView;

import java.util.ArrayList;
import java.util.Date;

import butterknife.InjectView;
import butterknife.OnClick;

/**
 *
 * Created by cws on 2016/3/23.
 */
public class MealDetailActivity extends BaseActivity implements View.OnClickListener {
    @InjectView(R.id.siv_date)
    SettingItemView siv_date;
    @InjectView(R.id.siv_name)
    SettingItemView siv_name;
    @InjectView(R.id.siv_food)
    SettingItemView siv_food;
    @InjectView(R.id.siv_amount)
    SettingItemView siv_amount;

    private TimeSelector dateSelector;
    private SingleSelector amountSelector;
    private SingleSelector mealSelector;

    Meal meal;

    @Override
    protected int getLayoutView() {
        return R.layout.act_meal_detail;
    }

    @Override
    public int getTitleName() {
        return R.string.title_meal_detail;
    }

    @Override
    protected void initView() {
        siv_date.setOnClickListener(this);
        siv_name.setOnClickListener(this);
        siv_food.setOnClickListener(this);
        siv_amount.setOnClickListener(this);

        dateSelector = new TimeSelector(this, new TimeSelector.ResultHandler() {
            @Override
            public void handle(String time) {
                meal.setDate(time);
                siv_date.setValue(time);
            }
        }, "2015-01-01", DateUtil.format(new Date(), TimeSelector.FORMAT_STR));

        ArrayList<String> data = new ArrayList<String>();
        for (int i = 0; i <= 1000; i++) {
            data.add(String.valueOf(i));
        }
        amountSelector = new SingleSelector(this, new SingleSelector.ResultHandler() {
            @Override
            public void handle(String selectItem) {
                meal.setAmount(selectItem);
                siv_amount.setValue(selectItem + "g");
            }
        }, data, "200");

        // 早餐/午餐/晚餐/加餐
        ArrayList<String> data1 = new ArrayList<String>();
        data1.add("早餐");
        data1.add("午餐");
        data1.add("晚餐");
        data1.add("加餐");

        mealSelector = new SingleSelector(this, new SingleSelector.ResultHandler() {
            @Override
            public void handle(String selectItem) {
                meal.setMealType(selectItem);
                siv_name.setValue(selectItem);
            }
        }, data1);
    }

    @Override
    protected void initData() {
        meal = (Meal) getIntent().getSerializableExtra(EXTRA_KEY_BEAN);
        if (meal.getFoodName() != null) {  // 从列表过来的

        } else { //从膳食调查过来

        }
        setData();
    }

    private void setData() {
        siv_date.setValue(meal.getDate());
        siv_name.setValue(meal.getMealType());
        siv_food.setValue(meal.getFoodName());
        siv_amount.setValue(meal.getAmount());
    }

    @OnClick(R.id.btn_meal_detail_confirm)
    public void confirm(){
        Intent data = new Intent();
        data.putExtra(EXTRA_KEY_BEAN, meal);
        setResult(2, data);
        finish();
    }

    @Override
    public void doTitleRight() {
        meal = null;
        Intent data = new Intent();
        data.putExtra(EXTRA_KEY_BEAN, meal);
        setResult(2, data);
        finish();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.siv_date:
                dateSelector.show();
                break;
            case R.id.siv_name:
                mealSelector.show();
                break;
            case R.id.siv_food:
                intentForResult(CategoryListActivity.class, meal, 3);
                break;
            case R.id.siv_amount:
                showAmountDialog();
                break;
        }
    }

    private void showAmountDialog() {
        final String unit = meal.getAmount().substring(meal.getAmount().length() - 1, meal.getAmount().length());
        DialogHelp.getInputDialog3(this, meal.getFoodName(), new DialogHelp.ResultHandler() {
            @Override
            public void handle(String data) {
                meal.setAmount(data + unit);
                siv_amount.setValue(meal.getAmount());
            }
        }, unit);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (data == null) {
            return;
        }
        if (requestCode == 3) {
            meal = (Meal) data.getSerializableExtra(EXTRA_KEY_BEAN);
            setData();
        }
    }
}
