package com.pregnant.health.utils;

import com.pregnant.health.bean.Meal;

import java.util.Comparator;

/**
 * Created by cws on 2016/5/31.
 */
public class ComparatorMeal implements Comparator {
    @Override
    public int compare(Object lhs, Object rhs) {
        Meal meal0 = (Meal) lhs;
        Meal meal1 = (Meal) rhs;
        //首先比较年龄，如果年龄相同，则比较名字

        int flag=meal0.getMealTypeId().compareTo(meal1.getMealTypeId());
        if(flag==0){
            return meal0.getDate().compareTo(meal1.getDate());
        }else{
            return flag;
        }
    }
}
