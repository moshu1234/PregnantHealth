package com.pregnant.health.bean;

/**
 * 类别
 * Created by cws on 2016/3/14.
 */
public class CategoryBean {
    private String id;
    private String parentId;
    private String name;
    private int type;  // 0常吃种类/1其他种类


    public CategoryBean(){}

    public CategoryBean(String id, String parentId, String name) {
        this.id = id;
        this.parentId = parentId;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
}
