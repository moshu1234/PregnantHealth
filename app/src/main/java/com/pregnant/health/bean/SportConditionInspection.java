package com.pregnant.health.bean;

import java.sql.Timestamp;

/**
 * 运动情况调查
 * SportConditionInspection entity. @author MyEclipse Persistence Tools
 */

public class SportConditionInspection implements java.io.Serializable {

// Fields

    private GeneralSurveyID id;
    private Timestamp recordTime;
    private Integer sign;
    private Double administativeIndustry;
    private Double serviceIndustry;
    private Double agriculture;
    private Double sleepLcak8hour;
    private Double sleep8to10hour;
    private Double sleepExceed10hour;
    private Double professionTime;
    private Double lotRestLittleActivity;
    private Double stepCountFew5000;
    private Double stepCount5000to10000;
    private Double stepCountExceed10000;
    private Double activityTime;

    // Constructors

    /**
     * default constructor
     */
    public SportConditionInspection() {
    }

    /**
     * minimal constructor
     */
    public SportConditionInspection(GeneralSurveyID id) {
        this.id = id;
    }

    /**
     * full constructor
     */
    public SportConditionInspection(GeneralSurveyID id,
                                    Timestamp recordTime, Integer sign, Double administativeIndustry,
                                    Double serviceIndustry, Double agriculture, Double sleepLcak8hour,
                                    Double sleep8to10hour, Double sleepExceed10hour,
                                    Double professionTime, Double lotRestLittleActivity,
                                    Double stepCountFew5000, Double stepCount5000to10000,
                                    Double stepCountExceed10000, Double activityTime) {
        this.id = id;
        this.recordTime = recordTime;
        this.sign = sign;
        this.administativeIndustry = administativeIndustry;
        this.serviceIndustry = serviceIndustry;
        this.agriculture = agriculture;
        this.sleepLcak8hour = sleepLcak8hour;
        this.sleep8to10hour = sleep8to10hour;
        this.sleepExceed10hour = sleepExceed10hour;
        this.professionTime = professionTime;
        this.lotRestLittleActivity = lotRestLittleActivity;
        this.stepCountFew5000 = stepCountFew5000;
        this.stepCount5000to10000 = stepCount5000to10000;
        this.stepCountExceed10000 = stepCountExceed10000;
        this.activityTime = activityTime;
    }

    // Property accessors

    public GeneralSurveyID getId() {
        return this.id;
    }

    public void setId(GeneralSurveyID id) {
        this.id = id;
    }

    public Timestamp getRecordTime() {
        return this.recordTime;
    }

    public void setRecordTime(Timestamp recordTime) {
        this.recordTime = recordTime;
    }

    public Integer getSign() {
        return this.sign;
    }

    public void setSign(Integer sign) {
        this.sign = sign;
    }

    public Double getAdministativeIndustry() {
        return this.administativeIndustry;
    }

    public void setAdministativeIndustry(Double administativeIndustry) {
        this.administativeIndustry = administativeIndustry;
    }

    public Double getServiceIndustry() {
        return this.serviceIndustry;
    }

    public void setServiceIndustry(Double serviceIndustry) {
        this.serviceIndustry = serviceIndustry;
    }

    public Double getAgriculture() {
        return this.agriculture;
    }

    public void setAgriculture(Double agriculture) {
        this.agriculture = agriculture;
    }

    public Double getSleepLcak8hour() {
        return this.sleepLcak8hour;
    }

    public void setSleepLcak8hour(Double sleepLcak8hour) {
        this.sleepLcak8hour = sleepLcak8hour;
    }

    public Double getSleep8to10hour() {
        return this.sleep8to10hour;
    }

    public void setSleep8to10hour(Double sleep8to10hour) {
        this.sleep8to10hour = sleep8to10hour;
    }

    public Double getSleepExceed10hour() {
        return this.sleepExceed10hour;
    }

    public void setSleepExceed10hour(Double sleepExceed10hour) {
        this.sleepExceed10hour = sleepExceed10hour;
    }

    public Double getProfessionTime() {
        return this.professionTime;
    }

    public void setProfessionTime(Double professionTime) {
        this.professionTime = professionTime;
    }

    public Double getLotRestLittleActivity() {
        return this.lotRestLittleActivity;
    }

    public void setLotRestLittleActivity(Double lotRestLittleActivity) {
        this.lotRestLittleActivity = lotRestLittleActivity;
    }

    public Double getStepCountFew5000() {
        return this.stepCountFew5000;
    }

    public void setStepCountFew5000(Double stepCountFew5000) {
        this.stepCountFew5000 = stepCountFew5000;
    }

    public Double getStepCount5000to10000() {
        return this.stepCount5000to10000;
    }

    public void setStepCount5000to10000(Double stepCount5000to10000) {
        this.stepCount5000to10000 = stepCount5000to10000;
    }

    public Double getStepCountExceed10000() {
        return this.stepCountExceed10000;
    }

    public void setStepCountExceed10000(Double stepCountExceed10000) {
        this.stepCountExceed10000 = stepCountExceed10000;
    }

    public Double getActivityTime() {
        return this.activityTime;
    }

    public void setActivityTime(Double activityTime) {
        this.activityTime = activityTime;
    }

}