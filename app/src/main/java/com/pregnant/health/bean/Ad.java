package com.pregnant.health.bean;

/**
 * 广告
 *
 * Created by cws on 2016/1/14.
 */
public class Ad {
    private String adImg;
    private String adName;
    /**
     0外部链接，此时adLinke为连接地址
     1影片详情页，此时adLink为cinemaCode
     2商品详情页，此时adLink为goodsCode
     3活动详情页，此时adLink为eventCode
     4附近详情页， 暂无
     */
    private String adLinkType;
    private String adLink;
    private String adContent;
    /**
     * 停留时长
     */
    private int times;

    public int getTimes() {
        return times;
    }

    public void setTimes(int times) {
        this.times = times;
    }

    public String getAdImg() {
        return adImg;
    }

    public void setAdImg(String adImg) {
        this.adImg = adImg;
    }

    public String getAdName() {
        return adName;
    }

    public void setAdName(String adName) {
        this.adName = adName;
    }

    public String getAdLinkType() {
        return adLinkType;
    }

    public void setAdLinkType(String adLinkType) {
        this.adLinkType = adLinkType;
    }

    public String getAdLink() {
        return adLink;
    }

    public void setAdLink(String adLink) {
        this.adLink = adLink;
    }

    public String getAdContent() {
        return adContent;
    }

    public void setAdContent(String adContent) {
        this.adContent = adContent;
    }
}
