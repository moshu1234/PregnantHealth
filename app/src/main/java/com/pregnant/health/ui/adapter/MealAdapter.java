package com.pregnant.health.ui.adapter;

import android.content.Context;
import android.view.View;
import android.widget.TextView;

import com.pregnant.health.R;
import com.pregnant.health.base.SimpleBaseAdapter;
import com.pregnant.health.bean.Meal;

import java.util.List;

/**
 * Created by cws on 2016/3/15.
 */
public class MealAdapter extends SimpleBaseAdapter<Meal> {

    public MealAdapter(Context context, List<Meal> mDatas) {
        super(context, mDatas);
    }

    @Override
    public int getItemResource() {
        return R.layout.item_meal;
    }

    @Override
    public void bindData(int position, View convertView, ViewHolder holder) {
        Meal meal = getDataList().get(position);
        TextView tv_meal = holder.findView(R.id.tv_meal);
        TextView tv_food = holder.findView(R.id.tv_food);
        TextView tv_amount = holder.findView(R.id.tv_amount);
        tv_meal.setText(meal.getMealType());
        tv_food.setText(meal.getFoodName());
        tv_amount.setText(meal.getAmount());
    }
}
