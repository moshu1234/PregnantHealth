package com.pregnant.health.bean;

/**
 * 饮食
 * 0-早餐,1-午餐，2-晚餐，3-加餐
 * 用餐时间 大类型  食物名称  食量  日期
 * Created by cws on 2016/3/15.
 */
public class Meal extends BaseBean{
    private String id;
    private String mealType;      // 早餐/午餐/晚餐/加餐
    private String mealTypeId;      // 0/1/2/3
    private String foodType;      // 食物的大类(主食，蔬菜..)按列表序号
    private String foodName;  // 食品名称
    private String date;      // 时间  （2016-03-06 星期日）
    private String amount;    // 数量
    private String tableName;    //
    private String fieldName;    //

    public Meal() {
    }

    public String getMealTypeId() {
        return mealTypeId;
    }

    public void setMealTypeId(String mealTypeId) {
        this.mealTypeId = mealTypeId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMealType() {
        return mealType;
    }

    public void setMealType(String mealType) {
        this.mealType = mealType;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    public String getFoodType() {
        return foodType;
    }

    public void setFoodType(String foodType) {
        this.foodType = foodType;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }
}
