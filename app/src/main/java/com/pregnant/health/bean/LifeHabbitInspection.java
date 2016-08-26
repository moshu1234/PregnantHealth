package com.pregnant.health.bean;

import java.sql.Timestamp;

/**
 * LifeHabbitInspection entity. @author MyEclipse Persistence Tools
 */

public class LifeHabbitInspection implements java.io.Serializable {

	// Fields

	private GeneralSurveyID id;
	private Timestamp recordTime;
	private Integer sign;
	private String smokeHabit;
	private String coffeeHabit;
	private String wineHabit;
	private String stayUpAllNight;
	private String nourishmentYesOrNo;

	// Constructors

	/** default constructor */
	public LifeHabbitInspection() {
	}

	/** minimal constructor */
	public LifeHabbitInspection(GeneralSurveyID id) {
		this.id = id;
	}

	/** full constructor */
	public LifeHabbitInspection(GeneralSurveyID id,
			Timestamp recordTime, Integer sign, String smokeHabit,
			String coffeeHabit, String wineHabit, String stayUpAllNight,
			String nourishmentYesOrNo) {
		this.id = id;
		this.recordTime = recordTime;
		this.sign = sign;
		this.smokeHabit = smokeHabit;
		this.coffeeHabit = coffeeHabit;
		this.wineHabit = wineHabit;
		this.stayUpAllNight = stayUpAllNight;
		this.nourishmentYesOrNo = nourishmentYesOrNo;
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

	public String getSmokeHabit() {
		return this.smokeHabit;
	}

	public void setSmokeHabit(String smokeHabit) {
		this.smokeHabit = smokeHabit;
	}

	public String getCoffeeHabit() {
		return this.coffeeHabit;
	}

	public void setCoffeeHabit(String coffeeHabit) {
		this.coffeeHabit = coffeeHabit;
	}

	public String getWineHabit() {
		return this.wineHabit;
	}

	public void setWineHabit(String wineHabit) {
		this.wineHabit = wineHabit;
	}

	public String getStayUpAllNight() {
		return this.stayUpAllNight;
	}

	public void setStayUpAllNight(String stayUpAllNight) {
		this.stayUpAllNight = stayUpAllNight;
	}

	public String getNourishmentYesOrNo() {
		return this.nourishmentYesOrNo;
	}

	public void setNourishmentYesOrNo(String nourishmentYesOrNo) {
		this.nourishmentYesOrNo = nourishmentYesOrNo;
	}

}