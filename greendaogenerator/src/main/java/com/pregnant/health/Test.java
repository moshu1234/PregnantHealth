package com.pregnant.health;

import com.alibaba.fastjson.JSON;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by cws on 2016/4/26.
 */
public class Test {

    public static void main(String[] args) throws Exception {
        String[] one = {"腹泻", "气胀", "食欲减退"};
        String[] two = {"口腔溃疡", "免疫力低下"};

        Tags ts = new Tags();
        List<Tag> tags = new ArrayList<Tag>();

        for (int i = 0; i < one.length; i++) {
            tags.add(new Tag(i + "", one[i]));
        }
        ts.setXh(tags);

        List<Tag> tags2 = new ArrayList<Tag>();
        for (int i = 0; i < two.length; i++) {
            tags2.add(new Tag(i + "", two[i]));
        }
        ts.setMy(tags2);

        System.out.println(JSON.toJSONString(ts));
    }
}
