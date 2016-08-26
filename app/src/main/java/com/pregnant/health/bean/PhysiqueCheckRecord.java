package com.pregnant.health.bean;

import java.sql.Timestamp;

/**
 * PhysiqueCheckRecord entity. @author MyEclipse Persistence Tools
 */

public class PhysiqueCheckRecord implements java.io.Serializable {

	// Fields

	private GeneralSurveyID id;
	private Timestamp recordTime;
	private Integer sign;
	private Double fundalHeight;
	private Double highBloodPressure;
	private Double lowBloodPressure;
	private String BModeUltrasound;
	private String booldConventionCheck;
	private String urineConventionCheck;

	// Constructors

	/** default constructor */
	public PhysiqueCheckRecord() {
	}

	/** minimal constructor */
	public PhysiqueCheckRecord(GeneralSurveyID id) {
		this.id = id;
	}

	/** full constructor */
	public PhysiqueCheckRecord(GeneralSurveyID id, Timestamp recordTime,
			Integer sign, Double fundalHeight, Double highBloodPressure,
			Double lowBloodPressure, String BModeUltrasound,
			String booldConventionCheck, String urineConventionCheck) {
		this.id = id;
		this.recordTime = recordTime;
		this.sign = sign;
		this.fundalHeight = fundalHeight;
		this.highBloodPressure = highBloodPressure;
		this.lowBloodPressure = lowBloodPressure;
		this.BModeUltrasound = BModeUltrasound;
		this.booldConventionCheck = booldConventionCheck;
		this.urineConventionCheck = urineConventionCheck;
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

	public Double getFundalHeight() {
		return this.fundalHeight;
	}

	public void setFundalHeight(Double fundalHeight) {
		this.fundalHeight = fundalHeight;
	}

	public Double getHighBloodPressure() {
		return this.highBloodPressure;
	}

	public void setHighBloodPressure(Double highBloodPressure) {
		this.highBloodPressure = highBloodPressure;
	}

	public Double getLowBloodPressure() {
		return this.lowBloodPressure;
	}

	public void setLowBloodPressure(Double lowBloodPressure) {
		this.lowBloodPressure = lowBloodPressure;
	}

	public String getBModeUltrasound() {
		return this.BModeUltrasound;
	}

	public void setBModeUltrasound(String BModeUltrasound) {
		this.BModeUltrasound = BModeUltrasound;
	}

	public String getBooldConventionCheck() {
		return this.booldConventionCheck;
	}

	public void setBooldConventionCheck(String booldConventionCheck) {
		this.booldConventionCheck = booldConventionCheck;
	}

	public String getUrineConventionCheck() {
		return this.urineConventionCheck;
	}

	public void setUrineConventionCheck(String urineConventionCheck) {
		this.urineConventionCheck = urineConventionCheck;
	}

}