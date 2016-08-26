package com.pregnant.health.ui.activity;

import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ListView;

import com.alibaba.fastjson.JSON;
import com.pregnant.health.Constants;
import com.pregnant.health.R;
import com.pregnant.health.base.BaseActivity;
import com.pregnant.health.bean.DietarySurvey;
import com.pregnant.health.bean.Meal;
import com.pregnant.health.ui.adapter.ItemAdapter;
import com.pregnant.health.ui.adapter.MealAdapter;
import com.pregnant.health.utils.ComparatorMeal;
import com.pregnant.health.utils.DateUtil;
import com.pregnant.health.utils.JSONUtils;
import com.pregnant.health.utils.SPUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import butterknife.InjectView;
import butterknife.OnClick;

/**
 * 膳食调查
 * Created by cws on 2016/3/15.
 */
public class MealSurveyActivity extends BaseActivity {
    @InjectView(R.id.gv)
    GridView gv;
    @InjectView(R.id.lv_meal)
    ListView lv_meal;
    private List<Meal> meals = new ArrayList<Meal>();

    MealAdapter mealAdapter;

    int selectPos;

    private int[] resIds = {R.drawable.meal_breakfast, R.drawable.meal_launch, R.drawable.meal_dinner, R.drawable.meal_snack};
    private int[] names = {R.string.name_breakfast, R.string.name_launch, R.string.name_dinner, R.string.name_snack};

    List<DietarySurvey> dietarySurveyList = new ArrayList<DietarySurvey>();

    @Override
    protected int getLayoutView() {
        return R.layout.act_meal_survey;
    }

    @Override
    public int getTitleName() {
        return R.string.title_meal_survey;
    }

    @Override
    protected void initView() {
    }


    @Override
    protected void initData() {
        gv.setAdapter(new ItemAdapter(this, resIds, names));
        gv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Meal meal = new Meal();
                meal.setMealType(getString(names[position]));
                meal.setMealTypeId(position + "");
                intentForResult(CategoryListActivity.class, meal, 1);
            }
        });

        parseMeals();

        mealAdapter = new MealAdapter(this, meals);
        lv_meal.setAdapter(mealAdapter);
        lv_meal.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                selectPos = position;
                intentForResult(MealDetailActivity.class, mealAdapter.getItem(position), 2);
            }
        });
    }

    private void parseMeals() {
        meals.clear();
        String mealsStr = (String) SPUtils.get(Constants.KEY_MEALS, "");
        if (!TextUtils.isEmpty(mealsStr)) {
            List<Meal> meals = new ArrayList<Meal>();
            for (Meal m : JSONUtils.string2Array(mealsStr, Meal.class)) {
                // 只显示当天的饮食记录
                if (DateUtil.getFormatDate(System.currentTimeMillis()).equals(m.getDate())) {
                    meals.add(m);
                }
            }
            this.meals.addAll(meals);
        }
    }

    @OnClick(R.id.tv_record)
    public void toRecord() {
        intentForResult(MealRecordActivity.class, 3);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (data == null && requestCode != 3) {
            return;
        }
        if (requestCode == 1) {
            String mealStr = data.getStringExtra(EXTRA_KEY_BEAN);
            List<Meal> meals = new ArrayList<Meal>();
            for (Meal m : JSONUtils.string2Array(mealStr, Meal.class)) {
                if (DateUtil.getFormatDate(System.currentTimeMillis()).equals(m.getDate())) {
                    meals.add(m);
                }
            }
            mealAdapter.addAll(meals);
        } else if (requestCode == 2) {
            Meal meal = (Meal) data.getSerializableExtra(EXTRA_KEY_BEAN);
            if (meal == null) {
                mealAdapter.remove(selectPos);
            } else {
                mealAdapter.replace(selectPos, meal);
            }
        } else if (requestCode == 3) {
            parseMeals();
            mealAdapter.replaceAll(meals);
        }
        List<Meal> dataList = mealAdapter.getDataList();
        ComparatorMeal comparator = new ComparatorMeal();
        Collections.sort(dataList, comparator);

        String mealsStr = (String) SPUtils.get(Constants.KEY_MEALS, "");

        List<Meal> mealsTemp = new ArrayList<Meal>();
        if (!TextUtils.isEmpty(mealsStr)) {
            List<Meal> mealsAll = JSONUtils.string2Array(mealsStr, Meal.class);
            for (Meal m : mealsAll) {
                if (DateUtil.getFormatDate(System.currentTimeMillis()).equals(m.getDate())) {
                    mealsTemp.add(m);
                }
            }
            mealsAll.removeAll(mealsTemp);
            mealsAll.addAll(dataList);
            SPUtils.put(Constants.KEY_MEALS, JSON.toJSONString(mealsAll));
        } else {
            if (dataList.size() > 0) {
                SPUtils.put(Constants.KEY_MEALS, JSON.toJSONString(dataList));
            }
        }

    }

    @Override
    public void doBack() {
        if (mealAdapter.getDataList().size() > 0) {
            DietarySurvey survey0 = new DietarySurvey();
            survey0.setTableName(mealAdapter.getDataList().get(0).getTableName());
            survey0.setFoodTime("0");
            Map<String, String> map0 = new HashMap<String, String>();

            DietarySurvey survey1 = new DietarySurvey();
            survey0.setTableName(mealAdapter.getDataList().get(0).getTableName());
            survey0.setFoodTime("1");
            Map<String, String> map1 = new HashMap<String, String>();

            DietarySurvey survey2 = new DietarySurvey();
            survey0.setTableName(mealAdapter.getDataList().get(0).getTableName());
            survey0.setFoodTime("2");
            Map<String, String> map2 = new HashMap<String, String>();

            DietarySurvey survey3 = new DietarySurvey();
            survey0.setTableName(mealAdapter.getDataList().get(0).getTableName());
            survey0.setFoodTime("3");
            Map<String, String> map3 = new HashMap<String, String>();
            for (Meal m : mealAdapter.getDataList()) {
                switch (m.getMealTypeId()) {
                    case "0":
                        map0.put(m.getFieldName(), m.getAmount().substring(0, m.getAmount().length() - 1));
                        break;
                    case "1":
                        map1.put(m.getFieldName(), m.getAmount().substring(0, m.getAmount().length() - 1));
                        break;
                    case "2":
                        map2.put(m.getFieldName(), m.getAmount().substring(0, m.getAmount().length() - 1));
                        break;
                    case "3":
                        map3.put(m.getFieldName(), m.getAmount().substring(0, m.getAmount().length() - 1));
                        break;
                }
            }
            survey0.setField(map0);
            survey1.setField(map1);
            survey2.setField(map2);
            survey3.setField(map3);
            dietarySurveyList.add(survey0);
            dietarySurveyList.add(survey1);
            dietarySurveyList.add(survey2);
            dietarySurveyList.add(survey3);
            SPUtils.put(Constants.TABLE_STAPLEFOODINSPECTION, JSON.toJSONString(dietarySurveyList));
        } else {
            SPUtils.put(Constants.TABLE_STAPLEFOODINSPECTION, "");
        }

        super.doBack();
    }
}
