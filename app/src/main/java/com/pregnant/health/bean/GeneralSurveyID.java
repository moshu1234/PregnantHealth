package com.pregnant.health.bean;

/**
 * 常规调查ID，组合主键
 */

public class GeneralSurveyID implements java.io.Serializable {

	// Fields

	private String globalRecordNr;
	private Integer inspectionOrder;

	// Constructors

	/** default constructor */
	public GeneralSurveyID() {
	}

	/** full constructor */
	public GeneralSurveyID(String globalRecordNr,
			Integer inspectionOrder) {
		this.globalRecordNr = globalRecordNr;
		this.inspectionOrder = inspectionOrder;
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

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof GeneralSurveyID))
			return false;
		GeneralSurveyID castOther = (GeneralSurveyID) other;

		return ((this.getGlobalRecordNr() == castOther.getGlobalRecordNr()) || (this
				.getGlobalRecordNr() != null
				&& castOther.getGlobalRecordNr() != null && this
				.getGlobalRecordNr().equals(castOther.getGlobalRecordNr())))
				&& ((this.getInspectionOrder() == castOther
						.getInspectionOrder()) || (this.getInspectionOrder() != null
						&& castOther.getInspectionOrder() != null && this
						.getInspectionOrder().equals(
								castOther.getInspectionOrder())));
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
		return result;
	}

}