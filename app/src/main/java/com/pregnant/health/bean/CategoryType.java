package com.pregnant.health.bean;

/**
 * Created by cws on 2016/3/29.
 */
public class CategoryType {
    private String id;
    private String name;

    public CategoryType(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
