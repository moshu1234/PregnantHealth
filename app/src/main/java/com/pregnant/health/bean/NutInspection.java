package com.pregnant.health.bean;

/**
 * NutInspection entity. @author MyEclipse Persistence Tools
 */

public class NutInspection implements java.io.Serializable {

	// Fields

	private DietarySurveyID id;
	private Integer sign;
	private Double nutWalnutIntake;
	private Double nutChestnutIntake;
	private Double nutGanhetaoIntake;
	private Double nutKaoxingrenIntake;
	private Double nutChaohuashengIntake;
	private Double nutChaokuihuaziIntake;
	private Double nutBaizhimaIntake;
	private Double nutPinenutIntake;
	private Double nutAlmondIntake;
	private Double nutCashewIntake;
	private Double nutHazelnutIntake;
	private Double nutPeanutIntake;
	private Double nutSunflowerSeedIntake;
	private Double nutLotusSeedIntake;
	private Double nutPumpkinSeedIntake;
	private Double nutMelonSeedIntake;
	private Double nutSesameIntake;
	private Double nutOtherIntake;

	// Constructors

	/** default constructor */
	public NutInspection() {
	}

	/** minimal constructor */
	public NutInspection(DietarySurveyID id) {
		this.id = id;
	}

	/** full constructor */
	public NutInspection(DietarySurveyID id, Integer sign,
			Double nutWalnutIntake, Double nutChestnutIntake,
			Double nutGanhetaoIntake, Double nutKaoxingrenIntake,
			Double nutChaohuashengIntake, Double nutChaokuihuaziIntake,
			Double nutBaizhimaIntake, Double nutPinenutIntake,
			Double nutAlmondIntake, Double nutCashewIntake,
			Double nutHazelnutIntake, Double nutPeanutIntake,
			Double nutSunflowerSeedIntake, Double nutLotusSeedIntake,
			Double nutPumpkinSeedIntake, Double nutMelonSeedIntake,
			Double nutSesameIntake, Double nutOtherIntake) {
		this.id = id;
		this.sign = sign;
		this.nutWalnutIntake = nutWalnutIntake;
		this.nutChestnutIntake = nutChestnutIntake;
		this.nutGanhetaoIntake = nutGanhetaoIntake;
		this.nutKaoxingrenIntake = nutKaoxingrenIntake;
		this.nutChaohuashengIntake = nutChaohuashengIntake;
		this.nutChaokuihuaziIntake = nutChaokuihuaziIntake;
		this.nutBaizhimaIntake = nutBaizhimaIntake;
		this.nutPinenutIntake = nutPinenutIntake;
		this.nutAlmondIntake = nutAlmondIntake;
		this.nutCashewIntake = nutCashewIntake;
		this.nutHazelnutIntake = nutHazelnutIntake;
		this.nutPeanutIntake = nutPeanutIntake;
		this.nutSunflowerSeedIntake = nutSunflowerSeedIntake;
		this.nutLotusSeedIntake = nutLotusSeedIntake;
		this.nutPumpkinSeedIntake = nutPumpkinSeedIntake;
		this.nutMelonSeedIntake = nutMelonSeedIntake;
		this.nutSesameIntake = nutSesameIntake;
		this.nutOtherIntake = nutOtherIntake;
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

	public Double getNutWalnutIntake() {
		return this.nutWalnutIntake;
	}

	public void setNutWalnutIntake(Double nutWalnutIntake) {
		this.nutWalnutIntake = nutWalnutIntake;
	}

	public Double getNutChestnutIntake() {
		return this.nutChestnutIntake;
	}

	public void setNutChestnutIntake(Double nutChestnutIntake) {
		this.nutChestnutIntake = nutChestnutIntake;
	}

	public Double getNutGanhetaoIntake() {
		return this.nutGanhetaoIntake;
	}

	public void setNutGanhetaoIntake(Double nutGanhetaoIntake) {
		this.nutGanhetaoIntake = nutGanhetaoIntake;
	}

	public Double getNutKaoxingrenIntake() {
		return this.nutKaoxingrenIntake;
	}

	public void setNutKaoxingrenIntake(Double nutKaoxingrenIntake) {
		this.nutKaoxingrenIntake = nutKaoxingrenIntake;
	}

	public Double getNutChaohuashengIntake() {
		return this.nutChaohuashengIntake;
	}

	public void setNutChaohuashengIntake(Double nutChaohuashengIntake) {
		this.nutChaohuashengIntake = nutChaohuashengIntake;
	}

	public Double getNutChaokuihuaziIntake() {
		return this.nutChaokuihuaziIntake;
	}

	public void setNutChaokuihuaziIntake(Double nutChaokuihuaziIntake) {
		this.nutChaokuihuaziIntake = nutChaokuihuaziIntake;
	}

	public Double getNutBaizhimaIntake() {
		return this.nutBaizhimaIntake;
	}

	public void setNutBaizhimaIntake(Double nutBaizhimaIntake) {
		this.nutBaizhimaIntake = nutBaizhimaIntake;
	}

	public Double getNutPinenutIntake() {
		return this.nutPinenutIntake;
	}

	public void setNutPinenutIntake(Double nutPinenutIntake) {
		this.nutPinenutIntake = nutPinenutIntake;
	}

	public Double getNutAlmondIntake() {
		return this.nutAlmondIntake;
	}

	public void setNutAlmondIntake(Double nutAlmondIntake) {
		this.nutAlmondIntake = nutAlmondIntake;
	}

	public Double getNutCashewIntake() {
		return this.nutCashewIntake;
	}

	public void setNutCashewIntake(Double nutCashewIntake) {
		this.nutCashewIntake = nutCashewIntake;
	}

	public Double getNutHazelnutIntake() {
		return this.nutHazelnutIntake;
	}

	public void setNutHazelnutIntake(Double nutHazelnutIntake) {
		this.nutHazelnutIntake = nutHazelnutIntake;
	}

	public Double getNutPeanutIntake() {
		return this.nutPeanutIntake;
	}

	public void setNutPeanutIntake(Double nutPeanutIntake) {
		this.nutPeanutIntake = nutPeanutIntake;
	}

	public Double getNutSunflowerSeedIntake() {
		return this.nutSunflowerSeedIntake;
	}

	public void setNutSunflowerSeedIntake(Double nutSunflowerSeedIntake) {
		this.nutSunflowerSeedIntake = nutSunflowerSeedIntake;
	}

	public Double getNutLotusSeedIntake() {
		return this.nutLotusSeedIntake;
	}

	public void setNutLotusSeedIntake(Double nutLotusSeedIntake) {
		this.nutLotusSeedIntake = nutLotusSeedIntake;
	}

	public Double getNutPumpkinSeedIntake() {
		return this.nutPumpkinSeedIntake;
	}

	public void setNutPumpkinSeedIntake(Double nutPumpkinSeedIntake) {
		this.nutPumpkinSeedIntake = nutPumpkinSeedIntake;
	}

	public Double getNutMelonSeedIntake() {
		return this.nutMelonSeedIntake;
	}

	public void setNutMelonSeedIntake(Double nutMelonSeedIntake) {
		this.nutMelonSeedIntake = nutMelonSeedIntake;
	}

	public Double getNutSesameIntake() {
		return this.nutSesameIntake;
	}

	public void setNutSesameIntake(Double nutSesameIntake) {
		this.nutSesameIntake = nutSesameIntake;
	}

	public Double getNutOtherIntake() {
		return this.nutOtherIntake;
	}

	public void setNutOtherIntake(Double nutOtherIntake) {
		this.nutOtherIntake = nutOtherIntake;
	}

}