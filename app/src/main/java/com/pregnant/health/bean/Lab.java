package com.pregnant.health.bean;

import java.util.List;

/**
 * Created by cws on 2016/5/9.
 */
public class Lab {
    private String blood;
    private String height;
    private List<String> paths;

    public String getBlood() {
        return blood;
    }

    public void setBlood(String blood) {
        this.blood = blood;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public List<String> getPaths() {
        return paths;
    }

    public void setPaths(List<String> paths) {
        this.paths = paths;
    }
}
