package com.pregnant.health.bean;

import java.sql.Timestamp;

/**
 * DiseaseHistoryRecord entity. @author MyEclipse Persistence Tools
 */

public class DiseaseHistoryRecord implements java.io.Serializable {

	// Fields

	private GeneralSurveyID id;
	private Timestamp recordTime;
	private Integer sign;
	private Integer eyeDryEyeTag;
	private Integer bloodHypoglycemiaTag;
	private Integer bloodHypotensionTag;
	private Integer bloodHypertensionTag;
	private Integer bloodHypercholesterolemiaTag;
	private Integer bloodHyperlipidemiaTag;
	private Integer bloodCardiovascularDiseaseTag;
	private Integer skinSeborrheicDermatitisTag;
	private Integer skinDermatitisTag;
	private Integer otherGlucoseToleranceDecreaseTag;
	private Integer fattyLiver;
	private Integer otherDiabetesTag;

	// Constructors

	/** default constructor */
	public DiseaseHistoryRecord() {
	}

	/** minimal constructor */
	public DiseaseHistoryRecord(GeneralSurveyID id) {
		this.id = id;
	}

	/** full constructor */
	public DiseaseHistoryRecord(GeneralSurveyID id,
			Timestamp recordTime, Integer sign, Integer eyeDryEyeTag,
			Integer bloodHypoglycemiaTag, Integer bloodHypotensionTag,
			Integer bloodHypertensionTag, Integer bloodHypercholesterolemiaTag,
			Integer bloodHyperlipidemiaTag,
			Integer bloodCardiovascularDiseaseTag,
			Integer skinSeborrheicDermatitisTag, Integer skinDermatitisTag,
			Integer otherGlucoseToleranceDecreaseTag, Integer fattyLiver,
			Integer otherDiabetesTag) {
		this.id = id;
		this.recordTime = recordTime;
		this.sign = sign;
		this.eyeDryEyeTag = eyeDryEyeTag;
		this.bloodHypoglycemiaTag = bloodHypoglycemiaTag;
		this.bloodHypotensionTag = bloodHypotensionTag;
		this.bloodHypertensionTag = bloodHypertensionTag;
		this.bloodHypercholesterolemiaTag = bloodHypercholesterolemiaTag;
		this.bloodHyperlipidemiaTag = bloodHyperlipidemiaTag;
		this.bloodCardiovascularDiseaseTag = bloodCardiovascularDiseaseTag;
		this.skinSeborrheicDermatitisTag = skinSeborrheicDermatitisTag;
		this.skinDermatitisTag = skinDermatitisTag;
		this.otherGlucoseToleranceDecreaseTag = otherGlucoseToleranceDecreaseTag;
		this.fattyLiver = fattyLiver;
		this.otherDiabetesTag = otherDiabetesTag;
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

	public Integer getEyeDryEyeTag() {
		return this.eyeDryEyeTag;
	}

	public void setEyeDryEyeTag(Integer eyeDryEyeTag) {
		this.eyeDryEyeTag = eyeDryEyeTag;
	}

	public Integer getBloodHypoglycemiaTag() {
		return this.bloodHypoglycemiaTag;
	}

	public void setBloodHypoglycemiaTag(Integer bloodHypoglycemiaTag) {
		this.bloodHypoglycemiaTag = bloodHypoglycemiaTag;
	}

	public Integer getBloodHypotensionTag() {
		return this.bloodHypotensionTag;
	}

	public void setBloodHypotensionTag(Integer bloodHypotensionTag) {
		this.bloodHypotensionTag = bloodHypotensionTag;
	}

	public Integer getBloodHypertensionTag() {
		return this.bloodHypertensionTag;
	}

	public void setBloodHypertensionTag(Integer bloodHypertensionTag) {
		this.bloodHypertensionTag = bloodHypertensionTag;
	}

	public Integer getBloodHypercholesterolemiaTag() {
		return this.bloodHypercholesterolemiaTag;
	}

	public void setBloodHypercholesterolemiaTag(
			Integer bloodHypercholesterolemiaTag) {
		this.bloodHypercholesterolemiaTag = bloodHypercholesterolemiaTag;
	}

	public Integer getBloodHyperlipidemiaTag() {
		return this.bloodHyperlipidemiaTag;
	}

	public void setBloodHyperlipidemiaTag(Integer bloodHyperlipidemiaTag) {
		this.bloodHyperlipidemiaTag = bloodHyperlipidemiaTag;
	}

	public Integer getBloodCardiovascularDiseaseTag() {
		return this.bloodCardiovascularDiseaseTag;
	}

	public void setBloodCardiovascularDiseaseTag(
			Integer bloodCardiovascularDiseaseTag) {
		this.bloodCardiovascularDiseaseTag = bloodCardiovascularDiseaseTag;
	}

	public Integer getSkinSeborrheicDermatitisTag() {
		return this.skinSeborrheicDermatitisTag;
	}

	public void setSkinSeborrheicDermatitisTag(
			Integer skinSeborrheicDermatitisTag) {
		this.skinSeborrheicDermatitisTag = skinSeborrheicDermatitisTag;
	}

	public Integer getSkinDermatitisTag() {
		return this.skinDermatitisTag;
	}

	public void setSkinDermatitisTag(Integer skinDermatitisTag) {
		this.skinDermatitisTag = skinDermatitisTag;
	}

	public Integer getOtherGlucoseToleranceDecreaseTag() {
		return this.otherGlucoseToleranceDecreaseTag;
	}

	public void setOtherGlucoseToleranceDecreaseTag(
			Integer otherGlucoseToleranceDecreaseTag) {
		this.otherGlucoseToleranceDecreaseTag = otherGlucoseToleranceDecreaseTag;
	}

	public Integer getFattyLiver() {
		return this.fattyLiver;
	}

	public void setFattyLiver(Integer fattyLiver) {
		this.fattyLiver = fattyLiver;
	}

	public Integer getOtherDiabetesTag() {
		return this.otherDiabetesTag;
	}

	public void setOtherDiabetesTag(Integer otherDiabetesTag) {
		this.otherDiabetesTag = otherDiabetesTag;
	}

}