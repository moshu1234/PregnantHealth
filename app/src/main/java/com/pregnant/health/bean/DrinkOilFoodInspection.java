package com.pregnant.health.bean;

/**
 * DrinkOilFoodInspection entity. @author MyEclipse Persistence Tools
 */

public class DrinkOilFoodInspection implements java.io.Serializable {

	// Fields

	private DietarySurveyID id;
	private Integer sign;
	private Double drinkCarbonicAcidIntake;
	private Double drinkQishuiIntake;
	private Double drinkJuzizhiIntake;
	private Double drinkNingmengshuiIntake;
	private Double drinkWumeizhiIntake;
	private Double drinkYuanzhishajiIntake;
	private Double drinkXingrenluIntake;
	private Double drinkHongchaIntake;
	private Double drinkLuchaIntake;
	private Double drinkHuachaIntake;
	private Double drinkOtherIntake;
	private Double oilCowButterIntake;
	private Double oilPigButterIntake;
	private Double oilSleepIntake;
	private Double oilTeaIntake;
	private Double oilBeanIntake;
	private Double oilSunFlowerIntake;
	private Double oilCornIntake;
	private Double oilSesameIntake;
	private Double oilRapeseedIntake;
	private Double oilPeanutIntake;
	private Double oilSaladIntake;
	private Double oilOliveIntake;
	private Double condimentWhiteSugarIntake;
	private Double sugarFengmiIntake;
	private Double sugarPaopaoIntake;
	private Double sugarMianhuaIntake;
	private Double sugarChocolateIntake;
	private Double sugarOtherIntake;
	private Double sugarShanzhaguoIntake;
	private Double sugarBingqinglingIntake;
	private Double sugarBingbangIntake;
	private Double sugarWawatouIntake;
	private Double sugarDaxuegaoIntake;
	private Double condimentCrystalSugarIntake;
	private Double condimentRedSugarIntake;
	private Double condimentSoySauceIntake;
	private Double condimentZhiMaJiangIntake;
	private Double condimentFanQieJiangIntake;
	private Double condimentAppleJiangIntake;
	private Double condimentOtherJiangIntake;
	private Double condimentVinegarIntake;
	private Double condimentSauceIntake;
	private Double condimentFermentedBeanCurdIntake;
	private Double condimentSaltedVegetableIntake;
	private Double condimentRefinedSaltIntake;
	private Double condimentOtherIntake;

	// Constructors

	/** default constructor */
	public DrinkOilFoodInspection() {
	}

	/** minimal constructor */
	public DrinkOilFoodInspection(DietarySurveyID id) {
		this.id = id;
	}

	/** full constructor */
	public DrinkOilFoodInspection(DietarySurveyID id, Integer sign,
			Double drinkCarbonicAcidIntake, Double drinkQishuiIntake,
			Double drinkJuzizhiIntake, Double drinkNingmengshuiIntake,
			Double drinkWumeizhiIntake, Double drinkYuanzhishajiIntake,
			Double drinkXingrenluIntake, Double drinkHongchaIntake,
			Double drinkLuchaIntake, Double drinkHuachaIntake,
			Double drinkOtherIntake, Double oilCowButterIntake,
			Double oilPigButterIntake, Double oilSleepIntake,
			Double oilTeaIntake, Double oilBeanIntake,
			Double oilSunFlowerIntake, Double oilCornIntake,
			Double oilSesameIntake, Double oilRapeseedIntake,
			Double oilPeanutIntake, Double oilSaladIntake,
			Double oilOliveIntake, Double condimentWhiteSugarIntake,
			Double sugarFengmiIntake, Double sugarPaopaoIntake,
			Double sugarMianhuaIntake, Double sugarChocolateIntake,
			Double sugarOtherIntake, Double sugarShanzhaguoIntake,
			Double sugarBingqinglingIntake, Double sugarBingbangIntake,
			Double sugarWawatouIntake, Double sugarDaxuegaoIntake,
			Double condimentCrystalSugarIntake, Double condimentRedSugarIntake,
			Double condimentSoySauceIntake, Double condimentZhiMaJiangIntake,
			Double condimentFanQieJiangIntake,
			Double condimentAppleJiangIntake, Double condimentOtherJiangIntake,
			Double condimentVinegarIntake, Double condimentSauceIntake,
			Double condimentFermentedBeanCurdIntake,
			Double condimentSaltedVegetableIntake,
			Double condimentRefinedSaltIntake, Double condimentOtherIntake) {
		this.id = id;
		this.sign = sign;
		this.drinkCarbonicAcidIntake = drinkCarbonicAcidIntake;
		this.drinkQishuiIntake = drinkQishuiIntake;
		this.drinkJuzizhiIntake = drinkJuzizhiIntake;
		this.drinkNingmengshuiIntake = drinkNingmengshuiIntake;
		this.drinkWumeizhiIntake = drinkWumeizhiIntake;
		this.drinkYuanzhishajiIntake = drinkYuanzhishajiIntake;
		this.drinkXingrenluIntake = drinkXingrenluIntake;
		this.drinkHongchaIntake = drinkHongchaIntake;
		this.drinkLuchaIntake = drinkLuchaIntake;
		this.drinkHuachaIntake = drinkHuachaIntake;
		this.drinkOtherIntake = drinkOtherIntake;
		this.oilCowButterIntake = oilCowButterIntake;
		this.oilPigButterIntake = oilPigButterIntake;
		this.oilSleepIntake = oilSleepIntake;
		this.oilTeaIntake = oilTeaIntake;
		this.oilBeanIntake = oilBeanIntake;
		this.oilSunFlowerIntake = oilSunFlowerIntake;
		this.oilCornIntake = oilCornIntake;
		this.oilSesameIntake = oilSesameIntake;
		this.oilRapeseedIntake = oilRapeseedIntake;
		this.oilPeanutIntake = oilPeanutIntake;
		this.oilSaladIntake = oilSaladIntake;
		this.oilOliveIntake = oilOliveIntake;
		this.condimentWhiteSugarIntake = condimentWhiteSugarIntake;
		this.sugarFengmiIntake = sugarFengmiIntake;
		this.sugarPaopaoIntake = sugarPaopaoIntake;
		this.sugarMianhuaIntake = sugarMianhuaIntake;
		this.sugarChocolateIntake = sugarChocolateIntake;
		this.sugarOtherIntake = sugarOtherIntake;
		this.sugarShanzhaguoIntake = sugarShanzhaguoIntake;
		this.sugarBingqinglingIntake = sugarBingqinglingIntake;
		this.sugarBingbangIntake = sugarBingbangIntake;
		this.sugarWawatouIntake = sugarWawatouIntake;
		this.sugarDaxuegaoIntake = sugarDaxuegaoIntake;
		this.condimentCrystalSugarIntake = condimentCrystalSugarIntake;
		this.condimentRedSugarIntake = condimentRedSugarIntake;
		this.condimentSoySauceIntake = condimentSoySauceIntake;
		this.condimentZhiMaJiangIntake = condimentZhiMaJiangIntake;
		this.condimentFanQieJiangIntake = condimentFanQieJiangIntake;
		this.condimentAppleJiangIntake = condimentAppleJiangIntake;
		this.condimentOtherJiangIntake = condimentOtherJiangIntake;
		this.condimentVinegarIntake = condimentVinegarIntake;
		this.condimentSauceIntake = condimentSauceIntake;
		this.condimentFermentedBeanCurdIntake = condimentFermentedBeanCurdIntake;
		this.condimentSaltedVegetableIntake = condimentSaltedVegetableIntake;
		this.condimentRefinedSaltIntake = condimentRefinedSaltIntake;
		this.condimentOtherIntake = condimentOtherIntake;
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

	public Double getDrinkCarbonicAcidIntake() {
		return this.drinkCarbonicAcidIntake;
	}

	public void setDrinkCarbonicAcidIntake(Double drinkCarbonicAcidIntake) {
		this.drinkCarbonicAcidIntake = drinkCarbonicAcidIntake;
	}

	public Double getDrinkQishuiIntake() {
		return this.drinkQishuiIntake;
	}

	public void setDrinkQishuiIntake(Double drinkQishuiIntake) {
		this.drinkQishuiIntake = drinkQishuiIntake;
	}

	public Double getDrinkJuzizhiIntake() {
		return this.drinkJuzizhiIntake;
	}

	public void setDrinkJuzizhiIntake(Double drinkJuzizhiIntake) {
		this.drinkJuzizhiIntake = drinkJuzizhiIntake;
	}

	public Double getDrinkNingmengshuiIntake() {
		return this.drinkNingmengshuiIntake;
	}

	public void setDrinkNingmengshuiIntake(Double drinkNingmengshuiIntake) {
		this.drinkNingmengshuiIntake = drinkNingmengshuiIntake;
	}

	public Double getDrinkWumeizhiIntake() {
		return this.drinkWumeizhiIntake;
	}

	public void setDrinkWumeizhiIntake(Double drinkWumeizhiIntake) {
		this.drinkWumeizhiIntake = drinkWumeizhiIntake;
	}

	public Double getDrinkYuanzhishajiIntake() {
		return this.drinkYuanzhishajiIntake;
	}

	public void setDrinkYuanzhishajiIntake(Double drinkYuanzhishajiIntake) {
		this.drinkYuanzhishajiIntake = drinkYuanzhishajiIntake;
	}

	public Double getDrinkXingrenluIntake() {
		return this.drinkXingrenluIntake;
	}

	public void setDrinkXingrenluIntake(Double drinkXingrenluIntake) {
		this.drinkXingrenluIntake = drinkXingrenluIntake;
	}

	public Double getDrinkHongchaIntake() {
		return this.drinkHongchaIntake;
	}

	public void setDrinkHongchaIntake(Double drinkHongchaIntake) {
		this.drinkHongchaIntake = drinkHongchaIntake;
	}

	public Double getDrinkLuchaIntake() {
		return this.drinkLuchaIntake;
	}

	public void setDrinkLuchaIntake(Double drinkLuchaIntake) {
		this.drinkLuchaIntake = drinkLuchaIntake;
	}

	public Double getDrinkHuachaIntake() {
		return this.drinkHuachaIntake;
	}

	public void setDrinkHuachaIntake(Double drinkHuachaIntake) {
		this.drinkHuachaIntake = drinkHuachaIntake;
	}

	public Double getDrinkOtherIntake() {
		return this.drinkOtherIntake;
	}

	public void setDrinkOtherIntake(Double drinkOtherIntake) {
		this.drinkOtherIntake = drinkOtherIntake;
	}

	public Double getOilCowButterIntake() {
		return this.oilCowButterIntake;
	}

	public void setOilCowButterIntake(Double oilCowButterIntake) {
		this.oilCowButterIntake = oilCowButterIntake;
	}

	public Double getOilPigButterIntake() {
		return this.oilPigButterIntake;
	}

	public void setOilPigButterIntake(Double oilPigButterIntake) {
		this.oilPigButterIntake = oilPigButterIntake;
	}

	public Double getOilSleepIntake() {
		return this.oilSleepIntake;
	}

	public void setOilSleepIntake(Double oilSleepIntake) {
		this.oilSleepIntake = oilSleepIntake;
	}

	public Double getOilTeaIntake() {
		return this.oilTeaIntake;
	}

	public void setOilTeaIntake(Double oilTeaIntake) {
		this.oilTeaIntake = oilTeaIntake;
	}

	public Double getOilBeanIntake() {
		return this.oilBeanIntake;
	}

	public void setOilBeanIntake(Double oilBeanIntake) {
		this.oilBeanIntake = oilBeanIntake;
	}

	public Double getOilSunFlowerIntake() {
		return this.oilSunFlowerIntake;
	}

	public void setOilSunFlowerIntake(Double oilSunFlowerIntake) {
		this.oilSunFlowerIntake = oilSunFlowerIntake;
	}

	public Double getOilCornIntake() {
		return this.oilCornIntake;
	}

	public void setOilCornIntake(Double oilCornIntake) {
		this.oilCornIntake = oilCornIntake;
	}

	public Double getOilSesameIntake() {
		return this.oilSesameIntake;
	}

	public void setOilSesameIntake(Double oilSesameIntake) {
		this.oilSesameIntake = oilSesameIntake;
	}

	public Double getOilRapeseedIntake() {
		return this.oilRapeseedIntake;
	}

	public void setOilRapeseedIntake(Double oilRapeseedIntake) {
		this.oilRapeseedIntake = oilRapeseedIntake;
	}

	public Double getOilPeanutIntake() {
		return this.oilPeanutIntake;
	}

	public void setOilPeanutIntake(Double oilPeanutIntake) {
		this.oilPeanutIntake = oilPeanutIntake;
	}

	public Double getOilSaladIntake() {
		return this.oilSaladIntake;
	}

	public void setOilSaladIntake(Double oilSaladIntake) {
		this.oilSaladIntake = oilSaladIntake;
	}

	public Double getOilOliveIntake() {
		return this.oilOliveIntake;
	}

	public void setOilOliveIntake(Double oilOliveIntake) {
		this.oilOliveIntake = oilOliveIntake;
	}

	public Double getCondimentWhiteSugarIntake() {
		return this.condimentWhiteSugarIntake;
	}

	public void setCondimentWhiteSugarIntake(Double condimentWhiteSugarIntake) {
		this.condimentWhiteSugarIntake = condimentWhiteSugarIntake;
	}

	public Double getSugarFengmiIntake() {
		return this.sugarFengmiIntake;
	}

	public void setSugarFengmiIntake(Double sugarFengmiIntake) {
		this.sugarFengmiIntake = sugarFengmiIntake;
	}

	public Double getSugarPaopaoIntake() {
		return this.sugarPaopaoIntake;
	}

	public void setSugarPaopaoIntake(Double sugarPaopaoIntake) {
		this.sugarPaopaoIntake = sugarPaopaoIntake;
	}

	public Double getSugarMianhuaIntake() {
		return this.sugarMianhuaIntake;
	}

	public void setSugarMianhuaIntake(Double sugarMianhuaIntake) {
		this.sugarMianhuaIntake = sugarMianhuaIntake;
	}

	public Double getSugarChocolateIntake() {
		return this.sugarChocolateIntake;
	}

	public void setSugarChocolateIntake(Double sugarChocolateIntake) {
		this.sugarChocolateIntake = sugarChocolateIntake;
	}

	public Double getSugarOtherIntake() {
		return this.sugarOtherIntake;
	}

	public void setSugarOtherIntake(Double sugarOtherIntake) {
		this.sugarOtherIntake = sugarOtherIntake;
	}

	public Double getSugarShanzhaguoIntake() {
		return this.sugarShanzhaguoIntake;
	}

	public void setSugarShanzhaguoIntake(Double sugarShanzhaguoIntake) {
		this.sugarShanzhaguoIntake = sugarShanzhaguoIntake;
	}

	public Double getSugarBingqinglingIntake() {
		return this.sugarBingqinglingIntake;
	}

	public void setSugarBingqinglingIntake(Double sugarBingqinglingIntake) {
		this.sugarBingqinglingIntake = sugarBingqinglingIntake;
	}

	public Double getSugarBingbangIntake() {
		return this.sugarBingbangIntake;
	}

	public void setSugarBingbangIntake(Double sugarBingbangIntake) {
		this.sugarBingbangIntake = sugarBingbangIntake;
	}

	public Double getSugarWawatouIntake() {
		return this.sugarWawatouIntake;
	}

	public void setSugarWawatouIntake(Double sugarWawatouIntake) {
		this.sugarWawatouIntake = sugarWawatouIntake;
	}

	public Double getSugarDaxuegaoIntake() {
		return this.sugarDaxuegaoIntake;
	}

	public void setSugarDaxuegaoIntake(Double sugarDaxuegaoIntake) {
		this.sugarDaxuegaoIntake = sugarDaxuegaoIntake;
	}

	public Double getCondimentCrystalSugarIntake() {
		return this.condimentCrystalSugarIntake;
	}

	public void setCondimentCrystalSugarIntake(
			Double condimentCrystalSugarIntake) {
		this.condimentCrystalSugarIntake = condimentCrystalSugarIntake;
	}

	public Double getCondimentRedSugarIntake() {
		return this.condimentRedSugarIntake;
	}

	public void setCondimentRedSugarIntake(Double condimentRedSugarIntake) {
		this.condimentRedSugarIntake = condimentRedSugarIntake;
	}

	public Double getCondimentSoySauceIntake() {
		return this.condimentSoySauceIntake;
	}

	public void setCondimentSoySauceIntake(Double condimentSoySauceIntake) {
		this.condimentSoySauceIntake = condimentSoySauceIntake;
	}

	public Double getCondimentZhiMaJiangIntake() {
		return this.condimentZhiMaJiangIntake;
	}

	public void setCondimentZhiMaJiangIntake(Double condimentZhiMaJiangIntake) {
		this.condimentZhiMaJiangIntake = condimentZhiMaJiangIntake;
	}

	public Double getCondimentFanQieJiangIntake() {
		return this.condimentFanQieJiangIntake;
	}

	public void setCondimentFanQieJiangIntake(Double condimentFanQieJiangIntake) {
		this.condimentFanQieJiangIntake = condimentFanQieJiangIntake;
	}

	public Double getCondimentAppleJiangIntake() {
		return this.condimentAppleJiangIntake;
	}

	public void setCondimentAppleJiangIntake(Double condimentAppleJiangIntake) {
		this.condimentAppleJiangIntake = condimentAppleJiangIntake;
	}

	public Double getCondimentOtherJiangIntake() {
		return this.condimentOtherJiangIntake;
	}

	public void setCondimentOtherJiangIntake(Double condimentOtherJiangIntake) {
		this.condimentOtherJiangIntake = condimentOtherJiangIntake;
	}

	public Double getCondimentVinegarIntake() {
		return this.condimentVinegarIntake;
	}

	public void setCondimentVinegarIntake(Double condimentVinegarIntake) {
		this.condimentVinegarIntake = condimentVinegarIntake;
	}

	public Double getCondimentSauceIntake() {
		return this.condimentSauceIntake;
	}

	public void setCondimentSauceIntake(Double condimentSauceIntake) {
		this.condimentSauceIntake = condimentSauceIntake;
	}

	public Double getCondimentFermentedBeanCurdIntake() {
		return this.condimentFermentedBeanCurdIntake;
	}

	public void setCondimentFermentedBeanCurdIntake(
			Double condimentFermentedBeanCurdIntake) {
		this.condimentFermentedBeanCurdIntake = condimentFermentedBeanCurdIntake;
	}

	public Double getCondimentSaltedVegetableIntake() {
		return this.condimentSaltedVegetableIntake;
	}

	public void setCondimentSaltedVegetableIntake(
			Double condimentSaltedVegetableIntake) {
		this.condimentSaltedVegetableIntake = condimentSaltedVegetableIntake;
	}

	public Double getCondimentRefinedSaltIntake() {
		return this.condimentRefinedSaltIntake;
	}

	public void setCondimentRefinedSaltIntake(Double condimentRefinedSaltIntake) {
		this.condimentRefinedSaltIntake = condimentRefinedSaltIntake;
	}

	public Double getCondimentOtherIntake() {
		return this.condimentOtherIntake;
	}

	public void setCondimentOtherIntake(Double condimentOtherIntake) {
		this.condimentOtherIntake = condimentOtherIntake;
	}

}