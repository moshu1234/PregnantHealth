package com.pregnant.health.bean;

import java.sql.Timestamp;

/**
 * 膳食调查ID，组合主键
 */

public class DietarySurveyID implements java.io.Serializable {

	// Fields

	private String globalRecordNr;
	private Integer inspectionOrder;
	private Integer foodTime;
	private Timestamp recordTime;

	// Constructors

	/** default constructor */
	public DietarySurveyID() {
	}

	/** full constructor */
	public DietarySurveyID(String globalRecordNr, Integer inspectionOrder,
			Integer foodTime, Timestamp recordTime) {
		this.globalRecordNr = globalRecordNr;
		this.inspectionOrder = inspectionOrder;
		this.foodTime = foodTime;
		this.recordTime = recordTime;
	}

	// Property accessors

	public String getGlobalRecordNr() {
		return this.globalRecordNr;
	}

	public void setGlobalRecordNr(String globalRecordNr) {
		this.globalRecordNr = globalRecordNr;
	}

	public Integer getInspectionOrder() {
		return this.inspectionOrder;
	}

	public void setInspectionOrder(Integer inspectionOrder) {
		this.inspectionOrder = inspectionOrder;
	}

	public Integer getFoodTime() {
		return this.foodTime;
	}

	public void setFoodTime(Integer foodTime) {
		this.foodTime = foodTime;
	}

	public Timestamp getRecordTime() {
		return this.recordTime;
	}

	public void setRecordTime(Timestamp recordTime) {
		this.recordTime = recordTime;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof DietarySurveyID))
			return false;
		DietarySurveyID castOther = (DietarySurveyID) other;

		return ((this.getGlobalRecordNr() == castOther.getGlobalRecordNr()) || (this
				.getGlobalRecordNr() != null
				&& castOther.getGlobalRecordNr() != null && this
				.getGlobalRecordNr().equals(castOther.getGlobalRecordNr())))
				&& ((this.getInspectionOrder() == castOther
						.getInspectionOrder()) || (this.getInspectionOrder() != null
						&& castOther.getInspectionOrder() != null && this
						.getInspectionOrder().equals(
								castOther.getInspectionOrder())))
				&& ((this.getFoodTime() == castOther.getFoodTime()) || (this
						.getFoodTime() != null
						&& castOther.getFoodTime() != null && this
						.getFoodTime().equals(castOther.getFoodTime())))
				&& ((this.getRecordTime() == castOther.getRecordTime()) || (this
						.getRecordTime() != null
						&& castOther.getRecordTime() != null && this
						.getRecordTime().equals(castOther.getRecordTime())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getGlobalRecordNr() == null ? 0 : this.getGlobalRecordNr()
						.hashCode());
		result = 37
				* result
				+ (getInspectionOrder() == null ? 0 : this.getInspectionOrder()
						.hashCode());
		result = 37 * result
				+ (getFoodTime() == null ? 0 : this.getFoodTime().hashCode());
		result = 37
				* result
				+ (getRecordTime() == null ? 0 : this.getRecordTime()
						.hashCode());
		return result;
	}

}