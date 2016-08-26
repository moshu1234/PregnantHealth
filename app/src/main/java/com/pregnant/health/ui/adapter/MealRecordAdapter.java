package com.pregnant.health.ui.adapter;

import android.content.Context;
import android.view.View;
import android.widget.TextView;

import com.pregnant.health.R;
import com.pregnant.health.base.SimpleBaseAdapter;
import com.pregnant.health.bean.Meal;

import java.util.List;

/**
 * 膳食记录
 * Created by cws on 2016/3/14.
 */
public class MealRecordAdapter extends SimpleBaseAdapter<Meal> {

    public MealRecordAdapter(Context context, List<Meal> mDatas) {
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
        TextView tv_item_title = holder.findView(R.id.tv_item_title);

        tv_meal.setText(meal.getMealType());
        tv_food.setText(meal.getFoodName());
        tv_amount.setText(meal.getAmount());

        if (position == getPositionForSection(meal.getDate())) {
            tv_item_title.setVisibility(View.VISIBLE);
            tv_item_title.setText(meal.getDate());
        } else {
            tv_item_title.setVisibility(View.GONE);
        }
    }


    /**
     * 根据分类的首字母的Char ascii值获取其第一次出现该首字母的位置
     */
    public int getPositionForSection(String date) {
        for (int i = 0; i < getCount(); i++) {
            String d = getDataList().get(i).getDate();
            if (d.equals(date)) {
                return i;
            }
        }
        return -1;
    }
}
