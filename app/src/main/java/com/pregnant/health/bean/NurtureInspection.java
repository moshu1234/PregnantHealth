package com.pregnant.health.bean;

/**
 * NurtureInspection entity. @author MyEclipse Persistence Tools
 */

public class NurtureInspection implements java.io.Serializable {

	// Fields

	private DietarySurveyID id;
	private Integer sign;
	private Double proteinIntake;
	private Double fiberIntake;
	private Double fatIntake;
	private Double vcintake;
	private Double vb1intake;
	private Double vb6intake;
	private Double vb12intake;
	private Double caIntake;
	private Double mgIntake;
	private Double feIntake;
	private Double znIntake;
	private Double vaintake;
	private Double seIntake;
	private Double folicAcidIntake;
	private Double aymsintake;
	private Double dhaintake;
	private Double epaintake;

	// Constructors

	/** default constructor */
	public NurtureInspection() {
	}

	/** minimal constructor */
	public NurtureInspection(DietarySurveyID id) {
		this.id = id;
	}

	/** full constructor */
	public NurtureInspection(DietarySurveyID id, Integer sign,
			Double proteinIntake, Double fiberIntake, Double fatIntake,
			Double vcintake, Double vb1intake, Double vb6intake,
			Double vb12intake, Double caIntake, Double mgIntake,
			Double feIntake, Double znIntake, Double vaintake, Double seIntake,
			Double folicAcidIntake, Double aymsintake, Double dhaintake,
			Double epaintake) {
		this.id = id;
		this.sign = sign;
		this.proteinIntake = proteinIntake;
		this.fiberIntake = fiberIntake;
		this.fatIntake = fatIntake;
		this.vcintake = vcintake;
		this.vb1intake = vb1intake;
		this.vb6intake = vb6intake;
		this.vb12intake = vb12intake;
		this.caIntake = caIntake;
		this.mgIntake = mgIntake;
		this.feIntake = feIntake;
		this.znIntake = znIntake;
		this.vaintake = vaintake;
		this.seIntake = seIntake;
		this.folicAcidIntake = folicAcidIntake;
		this.aymsintake = aymsintake;
		this.dhaintake = dhaintake;
		this.epaintake = epaintake;
	}

	// Property accessors

	public DietarySurveyID getId() {
		return this.id;
	}

	public void setId(DietarySurveyID id) {
		this.id = id;
	}

	public Integer getSign() {
		return this.sign;
	}

	public void setSign(Integer sign) {
		this.sign = sign;
	}

	public Double getProteinIntake() {
		return this.proteinIntake;
	}

	public void setProteinIntake(Double proteinIntake) {
		this.proteinIntake = proteinIntake;
	}

	public Double getFiberIntake() {
		return this.fiberIntake;
	}

	public void setFiberIntake(Double fiberIntake) {
		this.fiberIntake = fiberIntake;
	}

	public Double getFatIntake() {
		return this.fatIntake;
	}

	public void setFatIntake(Double fatIntake) {
		this.fatIntake = fatIntake;
	}

	public Double getVcintake() {
		return this.vcintake;
	}

	public void setVcintake(Double vcintake) {
		this.vcintake = vcintake;
	}

	public Double getVb1intake() {
		return this.vb1intake;
	}

	public void setVb1intake(Double vb1intake) {
		this.vb1intake = vb1intake;
	}

	public Double getVb6intake() {
		return this.vb6intake;
	}

	public void setVb6intake(Double vb6intake) {
		this.vb6intake = vb6intake;
	}

	public Double getVb12intake() {
		return this.vb12intake;
	}

	public void setVb12intake(Double vb12intake) {
		this.vb12intake = vb12intake;
	}

	public Double getCaIntake() {
		return this.caIntake;
	}

	public void setCaIntake(Double caIntake) {
		this.caIntake = caIntake;
	}

	public Double getMgIntake() {
		return this.mgIntake;
	}

	public void setMgIntake(Double mgIntake) {
		this.mgIntake = mgIntake;
	}

	public Double getFeIntake() {
		return this.feIntake;
	}

	public void setFeIntake(Double feIntake) {
		this.feIntake = feIntake;
	}

	public Double getZnIntake() {
		return this.znIntake;
	}

	public void setZnIntake(Double znIntake) {
		this.znIntake = znIntake;
	}

	public Double getVaintake() {
		return this.vaintake;
	}

	public void setVaintake(Double vaintake) {
		this.vaintake = vaintake;
	}

	public Double getSeIntake() {
		return this.seIntake;
	}

	public void setSeIntake(Double seIntake) {
		this.seIntake = seIntake;
	}

	public Double getFolicAcidIntake() {
		return this.folicAcidIntake;
	}

	public void setFolicAcidIntake(Double folicAcidIntake) {
		this.folicAcidIntake = folicAcidIntake;
	}

	public Double getAymsintake() {
		return aymsintake;
	}

	public void setAymsintake(Double aymsintake) {
		this.aymsintake = aymsintake;
	}

	public Double getDhaintake() {
		return this.dhaintake;
	}

	public void setDhaintake(Double dhaintake) {
		this.dhaintake = dhaintake;
	}

	public Double getEpaintake() {
		return this.epaintake;
	}

	public void setEpaintake(Double epaintake) {
		this.epaintake = epaintake;
	}

}