package com.pregnant.health.bean;

/**
 * VegetableFoodInspection entity. @author MyEclipse Persistence Tools
 */

public class VegetableFoodInspection implements java.io.Serializable {

	// Fields

	private DietarySurveyID id;
	private Integer sign;
	private Double vegetableCandouIntake;
	private Double vegetableSijidouIntake;
	private Double vegetableWandouIntake;
	private Double vegetableChanggongdouIntake;
	private Double vegetableQingjianljIntake;
	private Double vegetableQiukuiIntake;
	private Double vegetableCaiguaIntake;
	private Double vegetableHuluIntake;
	private Double vegetableNanguaIntake;
	private Double vegetableYangcongIntake;
	private Double vegetableSuanbaicaiIntake;
	private Double vegetabCaixinleIntake;
	private Double vegetabXuelihongleIntake;
	private Double vegetableLuoboyingIntake;
	private Double vegetableKongxincaiIntake;
	private Double vegetableChuncunIntake;
	private Double vegetableDongsunIntake;
	private Double vegetableLuweiIntake;
	private Double vegetableDoubancaiIntake;
	private Double vegetableJiaobaiIntake;
	private Double vegetableYangjiangIntake;
	private Double vegetableDisunIntake;
	private Double vegetablePugongyingIntake;
	private Double vegetableYecongIntake;
	private Double vegetableYesuanIntake;
	private Double vegetableYuxingcaiIntake;
	private Double vegetableKoumoIntake;
	private Double vegetableXianmoIntake;
	private Double vegetableShihuacaiIntake;
	private Double vegetableRedRadishIntake;
	private Double vegetableGreenRadishIntake;
	private Double vegetableRadishIntake;
	private Double vegetableGarlicIntake;
	private Double vegetableLilyIntake;
	private Double vegetableLotusIntake;
	private Double vegetableTremellaIntake;
	private Double vegetableCheerfulRadishIntake;
	private Double vegetableTomatoIntake;
	private Double vegetableChiliIntake;
	private Double vegetableRedFlowerStalkIntake;
	private Double vegetableHyacinthBeanIntake;
	private Double vegetableBeanIntake;
	private Double vegetableSnowPeaIntake;
	private Double vegetableSoyBeanIntake;
	private Double vegetablePeaTipIntake;
	private Double vegetableCowPeaIntake;
	private Double vegetableBeanSproutIntake;
	private Double vegetablePeaSeedlingIntake;
	private Double vegetableSweetPepperIntake;
	private Double vegetableMelonIntake;
	private Double vegetableBergamotIntake;
	private Double vegetableCucumberIntake;
	private Double vegetableBitterGourdIntake;
	private Double vegetableLoofahIntake;
	private Double vegetableSquashIntake;
	private Double vegetableGarlicSeedlingIntake;
	private Double vegetableGarlicMossIntake;
	private Double vegetableBigOnionIntake;
	private Double vegetableLittleOnionIntake;
	private Double vegetableChivesIntake;
	private Double vegetableChivesMossIntake;
	private Double vegetableBigCabbageIntake;
	private Double vegetableLittleCabbageIntake;
	private Double vegetableRapeIntake;
	private Double vegetableCabbageIntake;
	private Double vegetableBroccoliIntake;
	private Double vegetableMustardIntake;
	private Double vegetableLeafMustardIntake;
	private Double vegetableSpinachIntake;
	private Double vegetableMalabarSpinachIntake;
	private Double vegetableCeleryIntake;
	private Double vegetableRawLettuceIntake;
	private Double vegetableParsleyIntake;
	private Double vegetableChrysanthemumIntake;
	private Double vegetableFennelIntake;
	private Double vegetableLettuceShootIntake;
	private Double vegetableBambooShootIntake;
	private Double vegetableCressIntake;
	private Double vegetableBraseniaIntake;
	private Double vegetableSowThistleIntake;
	private Double vegetableKelpIntake;
	private Double vegetableYellowBeanSproutIntake;
	private Double vegetableCarrotIntake;
	private Double vegetableYellowChivesIntake;
	private Double vegetableCauliflowerIntake;
	private Double vegetableYamIntake;
	private Double vegetableTaroIntake;
	private Double vegetableGingerIntake;
	private Double vegetableMushroomIntake;
	private Double vegetableEggplantIntake;
	private Double vegetableWaterChestnutIntake;
	private Double vegetableBlackFungusIntake;
	private Double vegetableSeaweedIntake;
	private Double vegetableToonIntake;
	private Double vegetableFragrantMushroomIntake;
	private Double vegetableHazelMushroomIntake;
	private Double vegetableFlatMushroomIntake;
	private Double vegetableOtherIntake;

	// Constructors

	/** default constructor */
	public VegetableFoodInspection() {
	}

	/** minimal constructor */
	public VegetableFoodInspection(DietarySurveyID id) {
		this.id = id;
	}

	/** full constructor */
	public VegetableFoodInspection(DietarySurveyID id, Integer sign,
			Double vegetableCandouIntake, Double vegetableSijidouIntake,
			Double vegetableWandouIntake, Double vegetableChanggongdouIntake,
			Double vegetableQingjianljIntake, Double vegetableQiukuiIntake,
			Double vegetableCaiguaIntake, Double vegetableHuluIntake,
			Double vegetableNanguaIntake, Double vegetableYangcongIntake,
			Double vegetableSuanbaicaiIntake, Double vegetabCaixinleIntake,
			Double vegetabXuelihongleIntake, Double vegetableLuoboyingIntake,
			Double vegetableKongxincaiIntake, Double vegetableChuncunIntake,
			Double vegetableDongsunIntake, Double vegetableLuweiIntake,
			Double vegetableDoubancaiIntake, Double vegetableJiaobaiIntake,
			Double vegetableYangjiangIntake, Double vegetableDisunIntake,
			Double vegetablePugongyingIntake, Double vegetableYecongIntake,
			Double vegetableYesuanIntake, Double vegetableYuxingcaiIntake,
			Double vegetableKoumoIntake, Double vegetableXianmoIntake,
			Double vegetableShihuacaiIntake, Double vegetableRedRadishIntake,
			Double vegetableGreenRadishIntake, Double vegetableRadishIntake,
			Double vegetableGarlicIntake, Double vegetableLilyIntake,
			Double vegetableLotusIntake, Double vegetableTremellaIntake,
			Double vegetableCheerfulRadishIntake, Double vegetableTomatoIntake,
			Double vegetableChiliIntake, Double vegetableRedFlowerStalkIntake,
			Double vegetableHyacinthBeanIntake, Double vegetableBeanIntake,
			Double vegetableSnowPeaIntake, Double vegetableSoyBeanIntake,
			Double vegetablePeaTipIntake, Double vegetableCowPeaIntake,
			Double vegetableBeanSproutIntake,
			Double vegetablePeaSeedlingIntake,
			Double vegetableSweetPepperIntake, Double vegetableMelonIntake,
			Double vegetableBergamotIntake, Double vegetableCucumberIntake,
			Double vegetableBitterGourdIntake, Double vegetableLoofahIntake,
			Double vegetableSquashIntake, Double vegetableGarlicSeedlingIntake,
			Double vegetableGarlicMossIntake, Double vegetableBigOnionIntake,
			Double vegetableLittleOnionIntake, Double vegetableChivesIntake,
			Double vegetableChivesMossIntake, Double vegetableBigCabbageIntake,
			Double vegetableLittleCabbageIntake, Double vegetableRapeIntake,
			Double vegetableCabbageIntake, Double vegetableBroccoliIntake,
			Double vegetableMustardIntake, Double vegetableLeafMustardIntake,
			Double vegetableSpinachIntake,
			Double vegetableMalabarSpinachIntake, Double vegetableCeleryIntake,
			Double vegetableRawLettuceIntake, Double vegetableParsleyIntake,
			Double vegetableChrysanthemumIntake, Double vegetableFennelIntake,
			Double vegetableLettuceShootIntake,
			Double vegetableBambooShootIntake, Double vegetableCressIntake,
			Double vegetableBraseniaIntake, Double vegetableSowThistleIntake,
			Double vegetableKelpIntake, Double vegetableYellowBeanSproutIntake,
			Double vegetableCarrotIntake, Double vegetableYellowChivesIntake,
			Double vegetableCauliflowerIntake, Double vegetableYamIntake,
			Double vegetableTaroIntake, Double vegetableGingerIntake,
			Double vegetableMushroomIntake, Double vegetableEggplantIntake,
			Double vegetableWaterChestnutIntake,
			Double vegetableBlackFungusIntake, Double vegetableSeaweedIntake,
			Double vegetableToonIntake, Double vegetableFragrantMushroomIntake,
			Double vegetableHazelMushroomIntake,
			Double vegetableFlatMushroomIntake, Double vegetableOtherIntake) {
		this.id = id;
		this.sign = sign;
		this.vegetableCandouIntake = vegetableCandouIntake;
		this.vegetableSijidouIntake = vegetableSijidouIntake;
		this.vegetableWandouIntake = vegetableWandouIntake;
		this.vegetableChanggongdouIntake = vegetableChanggongdouIntake;
		this.vegetableQingjianljIntake = vegetableQingjianljIntake;
		this.vegetableQiukuiIntake = vegetableQiukuiIntake;
		this.vegetableCaiguaIntake = vegetableCaiguaIntake;
		this.vegetableHuluIntake = vegetableHuluIntake;
		this.vegetableNanguaIntake = vegetableNanguaIntake;
		this.vegetableYangcongIntake = vegetableYangcongIntake;
		this.vegetableSuanbaicaiIntake = vegetableSuanbaicaiIntake;
		this.vegetabCaixinleIntake = vegetabCaixinleIntake;
		this.vegetabXuelihongleIntake = vegetabXuelihongleIntake;
		this.vegetableLuoboyingIntake = vegetableLuoboyingIntake;
		this.vegetableKongxincaiIntake = vegetableKongxincaiIntake;
		this.vegetableChuncunIntake = vegetableChuncunIntake;
		this.vegetableDongsunIntake = vegetableDongsunIntake;
		this.vegetableLuweiIntake = vegetableLuweiIntake;
		this.vegetableDoubancaiIntake = vegetableDoubancaiIntake;
		this.vegetableJiaobaiIntake = vegetableJiaobaiIntake;
		this.vegetableYangjiangIntake = vegetableYangjiangIntake;
		this.vegetableDisunIntake = vegetableDisunIntake;
		this.vegetablePugongyingIntake = vegetablePugongyingIntake;
		this.vegetableYecongIntake = vegetableYecongIntake;
		this.vegetableYesuanIntake = vegetableYesuanIntake;
		this.vegetableYuxingcaiIntake = vegetableYuxingcaiIntake;
		this.vegetableKoumoIntake = vegetableKoumoIntake;
		this.vegetableXianmoIntake = vegetableXianmoIntake;
		this.vegetableShihuacaiIntake = vegetableShihuacaiIntake;
		this.vegetableRedRadishIntake = vegetableRedRadishIntake;
		this.vegetableGreenRadishIntake = vegetableGreenRadishIntake;
		this.vegetableRadishIntake = vegetableRadishIntake;
		this.vegetableGarlicIntake = vegetableGarlicIntake;
		this.vegetableLilyIntake = vegetableLilyIntake;
		this.vegetableLotusIntake = vegetableLotusIntake;
		this.vegetableTremellaIntake = vegetableTremellaIntake;
		this.vegetableCheerfulRadishIntake = vegetableCheerfulRadishIntake;
		this.vegetableTomatoIntake = vegetableTomatoIntake;
		this.vegetableChiliIntake = vegetableChiliIntake;
		this.vegetableRedFlowerStalkIntake = vegetableRedFlowerStalkIntake;
		this.vegetableHyacinthBeanIntake = vegetableHyacinthBeanIntake;
		this.vegetableBeanIntake = vegetableBeanIntake;
		this.vegetableSnowPeaIntake = vegetableSnowPeaIntake;
		this.vegetableSoyBeanIntake = vegetableSoyBeanIntake;
		this.vegetablePeaTipIntake = vegetablePeaTipIntake;
		this.vegetableCowPeaIntake = vegetableCowPeaIntake;
		this.vegetableBeanSproutIntake = vegetableBeanSproutIntake;
		this.vegetablePeaSeedlingIntake = vegetablePeaSeedlingIntake;
		this.vegetableSweetPepperIntake = vegetableSweetPepperIntake;
		this.vegetableMelonIntake = vegetableMelonIntake;
		this.vegetableBergamotIntake = vegetableBergamotIntake;
		this.vegetableCucumberIntake = vegetableCucumberIntake;
		this.vegetableBitterGourdIntake = vegetableBitterGourdIntake;
		this.vegetableLoofahIntake = vegetableLoofahIntake;
		this.vegetableSquashIntake = vegetableSquashIntake;
		this.vegetableGarlicSeedlingIntake = vegetableGarlicSeedlingIntake;
		this.vegetableGarlicMossIntake = vegetableGarlicMossIntake;
		this.vegetableBigOnionIntake = vegetableBigOnionIntake;
		this.vegetableLittleOnionIntake = vegetableLittleOnionIntake;
		this.vegetableChivesIntake = vegetableChivesIntake;
		this.vegetableChivesMossIntake = vegetableChivesMossIntake;
		this.vegetableBigCabbageIntake = vegetableBigCabbageIntake;
		this.vegetableLittleCabbageIntake = vegetableLittleCabbageIntake;
		this.vegetableRapeIntake = vegetableRapeIntake;
		this.vegetableCabbageIntake = vegetableCabbageIntake;
		this.vegetableBroccoliIntake = vegetableBroccoliIntake;
		this.vegetableMustardIntake = vegetableMustardIntake;
		this.vegetableLeafMustardIntake = vegetableLeafMustardIntake;
		this.vegetableSpinachIntake = vegetableSpinachIntake;
		this.vegetableMalabarSpinachIntake = vegetableMalabarSpinachIntake;
		this.vegetableCeleryIntake = vegetableCeleryIntake;
		this.vegetableRawLettuceIntake = vegetableRawLettuceIntake;
		this.vegetableParsleyIntake = vegetableParsleyIntake;
		this.vegetableChrysanthemumIntake = vegetableChrysanthemumIntake;
		this.vegetableFennelIntake = vegetableFennelIntake;
		this.vegetableLettuceShootIntake = vegetableLettuceShootIntake;
		this.vegetableBambooShootIntake = vegetableBambooShootIntake;
		this.vegetableCressIntake = vegetableCressIntake;
		this.vegetableBraseniaIntake = vegetableBraseniaIntake;
		this.vegetableSowThistleIntake = vegetableSowThistleIntake;
		this.vegetableKelpIntake = vegetableKelpIntake;
		this.vegetableYellowBeanSproutIntake = vegetableYellowBeanSproutIntake;
		this.vegetableCarrotIntake = vegetableCarrotIntake;
		this.vegetableYellowChivesIntake = vegetableYellowChivesIntake;
		this.vegetableCauliflowerIntake = vegetableCauliflowerIntake;
		this.vegetableYamIntake = vegetableYamIntake;
		this.vegetableTaroIntake = vegetableTaroIntake;
		this.vegetableGingerIntake = vegetableGingerIntake;
		this.vegetableMushroomIntake = vegetableMushroomIntake;
		this.vegetableEggplantIntake = vegetableEggplantIntake;
		this.vegetableWaterChestnutIntake = vegetableWaterChestnutIntake;
		this.vegetableBlackFungusIntake = vegetableBlackFungusIntake;
		this.vegetableSeaweedIntake = vegetableSeaweedIntake;
		this.vegetableToonIntake = vegetableToonIntake;
		this.vegetableFragrantMushroomIntake = vegetableFragrantMushroomIntake;
		this.vegetableHazelMushroomIntake = vegetableHazelMushroomIntake;
		this.vegetableFlatMushroomIntake = vegetableFlatMushroomIntake;
		this.vegetableOtherIntake = vegetableOtherIntake;
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

	public Double getVegetableCandouIntake() {
		return this.vegetableCandouIntake;
	}

	public void setVegetableCandouIntake(Double vegetableCandouIntake) {
		this.vegetableCandouIntake = vegetableCandouIntake;
	}

	public Double getVegetableSijidouIntake() {
		return this.vegetableSijidouIntake;
	}

	public void setVegetableSijidouIntake(Double vegetableSijidouIntake) {
		this.vegetableSijidouIntake = vegetableSijidouIntake;
	}

	public Double getVegetableWandouIntake() {
		return this.vegetableWandouIntake;
	}

	public void setVegetableWandouIntake(Double vegetableWandouIntake) {
		this.vegetableWandouIntake = vegetableWandouIntake;
	}

	public Double getVegetableChanggongdouIntake() {
		return this.vegetableChanggongdouIntake;
	}

	public void setVegetableChanggongdouIntake(
			Double vegetableChanggongdouIntake) {
		this.vegetableChanggongdouIntake = vegetableChanggongdouIntake;
	}

	public Double getVegetableQingjianljIntake() {
		return this.vegetableQingjianljIntake;
	}

	public void setVegetableQingjianljIntake(Double vegetableQingjianljIntake) {
		this.vegetableQingjianljIntake = vegetableQingjianljIntake;
	}

	public Double getVegetableQiukuiIntake() {
		return this.vegetableQiukuiIntake;
	}

	public void setVegetableQiukuiIntake(Double vegetableQiukuiIntake) {
		this.vegetableQiukuiIntake = vegetableQiukuiIntake;
	}

	public Double getVegetableCaiguaIntake() {
		return this.vegetableCaiguaIntake;
	}

	public void setVegetableCaiguaIntake(Double vegetableCaiguaIntake) {
		this.vegetableCaiguaIntake = vegetableCaiguaIntake;
	}

	public Double getVegetableHuluIntake() {
		return this.vegetableHuluIntake;
	}

	public void setVegetableHuluIntake(Double vegetableHuluIntake) {
		this.vegetableHuluIntake = vegetableHuluIntake;
	}

	public Double getVegetableNanguaIntake() {
		return this.vegetableNanguaIntake;
	}

	public void setVegetableNanguaIntake(Double vegetableNanguaIntake) {
		this.vegetableNanguaIntake = vegetableNanguaIntake;
	}

	public Double getVegetableYangcongIntake() {
		return this.vegetableYangcongIntake;
	}

	public void setVegetableYangcongIntake(Double vegetableYangcongIntake) {
		this.vegetableYangcongIntake = vegetableYangcongIntake;
	}

	public Double getVegetableSuanbaicaiIntake() {
		return this.vegetableSuanbaicaiIntake;
	}

	public void setVegetableSuanbaicaiIntake(Double vegetableSuanbaicaiIntake) {
		this.vegetableSuanbaicaiIntake = vegetableSuanbaicaiIntake;
	}

	public Double getVegetabCaixinleIntake() {
		return this.vegetabCaixinleIntake;
	}

	public void setVegetabCaixinleIntake(Double vegetabCaixinleIntake) {
		this.vegetabCaixinleIntake = vegetabCaixinleIntake;
	}

	public Double getVegetabXuelihongleIntake() {
		return this.vegetabXuelihongleIntake;
	}

	public void setVegetabXuelihongleIntake(Double vegetabXuelihongleIntake) {
		this.vegetabXuelihongleIntake = vegetabXuelihongleIntake;
	}

	public Double getVegetableLuoboyingIntake() {
		return this.vegetableLuoboyingIntake;
	}

	public void setVegetableLuoboyingIntake(Double vegetableLuoboyingIntake) {
		this.vegetableLuoboyingIntake = vegetableLuoboyingIntake;
	}

	public Double getVegetableKongxincaiIntake() {
		return this.vegetableKongxincaiIntake;
	}

	public void setVegetableKongxincaiIntake(Double vegetableKongxincaiIntake) {
		this.vegetableKongxincaiIntake = vegetableKongxincaiIntake;
	}

	public Double getVegetableChuncunIntake() {
		return this.vegetableChuncunIntake;
	}

	public void setVegetableChuncunIntake(Double vegetableChuncunIntake) {
		this.vegetableChuncunIntake = vegetableChuncunIntake;
	}

	public Double getVegetableDongsunIntake() {
		return this.vegetableDongsunIntake;
	}

	public void setVegetableDongsunIntake(Double vegetableDongsunIntake) {
		this.vegetableDongsunIntake = vegetableDongsunIntake;
	}

	public Double getVegetableLuweiIntake() {
		return this.vegetableLuweiIntake;
	}

	public void setVegetableLuweiIntake(Double vegetableLuweiIntake) {
		this.vegetableLuweiIntake = vegetableLuweiIntake;
	}

	public Double getVegetableDoubancaiIntake() {
		return this.vegetableDoubancaiIntake;
	}

	public void setVegetableDoubancaiIntake(Double vegetableDoubancaiIntake) {
		this.vegetableDoubancaiIntake = vegetableDoubancaiIntake;
	}

	public Double getVegetableJiaobaiIntake() {
		return this.vegetableJiaobaiIntake;
	}

	public void setVegetableJiaobaiIntake(Double vegetableJiaobaiIntake) {
		this.vegetableJiaobaiIntake = vegetableJiaobaiIntake;
	}

	public Double getVegetableYangjiangIntake() {
		return this.vegetableYangjiangIntake;
	}

	public void setVegetableYangjiangIntake(Double vegetableYangjiangIntake) {
		this.vegetableYangjiangIntake = vegetableYangjiangIntake;
	}

	public Double getVegetableDisunIntake() {
		return this.vegetableDisunIntake;
	}

	public void setVegetableDisunIntake(Double vegetableDisunIntake) {
		this.vegetableDisunIntake = vegetableDisunIntake;
	}

	public Double getVegetablePugongyingIntake() {
		return this.vegetablePugongyingIntake;
	}

	public void setVegetablePugongyingIntake(Double vegetablePugongyingIntake) {
		this.vegetablePugongyingIntake = vegetablePugongyingIntake;
	}

	public Double getVegetableYecongIntake() {
		return this.vegetableYecongIntake;
	}

	public void setVegetableYecongIntake(Double vegetableYecongIntake) {
		this.vegetableYecongIntake = vegetableYecongIntake;
	}

	public Double getVegetableYesuanIntake() {
		return this.vegetableYesuanIntake;
	}

	public void setVegetableYesuanIntake(Double vegetableYesuanIntake) {
		this.vegetableYesuanIntake = vegetableYesuanIntake;
	}

	public Double getVegetableYuxingcaiIntake() {
		return this.vegetableYuxingcaiIntake;
	}

	public void setVegetableYuxingcaiIntake(Double vegetableYuxingcaiIntake) {
		this.vegetableYuxingcaiIntake = vegetableYuxingcaiIntake;
	}

	public Double getVegetableKoumoIntake() {
		return this.vegetableKoumoIntake;
	}

	public void setVegetableKoumoIntake(Double vegetableKoumoIntake) {
		this.vegetableKoumoIntake = vegetableKoumoIntake;
	}

	public Double getVegetableXianmoIntake() {
		return this.vegetableXianmoIntake;
	}

	public void setVegetableXianmoIntake(Double vegetableXianmoIntake) {
		this.vegetableXianmoIntake = vegetableXianmoIntake;
	}

	public Double getVegetableShihuacaiIntake() {
		return this.vegetableShihuacaiIntake;
	}

	public void setVegetableShihuacaiIntake(Double vegetableShihuacaiIntake) {
		this.vegetableShihuacaiIntake = vegetableShihuacaiIntake;
	}

	public Double getVegetableRedRadishIntake() {
		return this.vegetableRedRadishIntake;
	}

	public void setVegetableRedRadishIntake(Double vegetableRedRadishIntake) {
		this.vegetableRedRadishIntake = vegetableRedRadishIntake;
	}

	public Double getVegetableGreenRadishIntake() {
		return this.vegetableGreenRadishIntake;
	}

	public void setVegetableGreenRadishIntake(Double vegetableGreenRadishIntake) {
		this.vegetableGreenRadishIntake = vegetableGreenRadishIntake;
	}

	public Double getVegetableRadishIntake() {
		return this.vegetableRadishIntake;
	}

	public void setVegetableRadishIntake(Double vegetableRadishIntake) {
		this.vegetableRadishIntake = vegetableRadishIntake;
	}

	public Double getVegetableGarlicIntake() {
		return this.vegetableGarlicIntake;
	}

	public void setVegetableGarlicIntake(Double vegetableGarlicIntake) {
		this.vegetableGarlicIntake = vegetableGarlicIntake;
	}

	public Double getVegetableLilyIntake() {
		return this.vegetableLilyIntake;
	}

	public void setVegetableLilyIntake(Double vegetableLilyIntake) {
		this.vegetableLilyIntake = vegetableLilyIntake;
	}

	public Double getVegetableLotusIntake() {
		return this.vegetableLotusIntake;
	}

	public void setVegetableLotusIntake(Double vegetableLotusIntake) {
		this.vegetableLotusIntake = vegetableLotusIntake;
	}

	public Double getVegetableTremellaIntake() {
		return this.vegetableTremellaIntake;
	}

	public void setVegetableTremellaIntake(Double vegetableTremellaIntake) {
		this.vegetableTremellaIntake = vegetableTremellaIntake;
	}

	public Double getVegetableCheerfulRadishIntake() {
		return this.vegetableCheerfulRadishIntake;
	}

	public void setVegetableCheerfulRadishIntake(
			Double vegetableCheerfulRadishIntake) {
		this.vegetableCheerfulRadishIntake = vegetableCheerfulRadishIntake;
	}

	public Double getVegetableTomatoIntake() {
		return this.vegetableTomatoIntake;
	}

	public void setVegetableTomatoIntake(Double vegetableTomatoIntake) {
		this.vegetableTomatoIntake = vegetableTomatoIntake;
	}

	public Double getVegetableChiliIntake() {
		return this.vegetableChiliIntake;
	}

	public void setVegetableChiliIntake(Double vegetableChiliIntake) {
		this.vegetableChiliIntake = vegetableChiliIntake;
	}

	public Double getVegetableRedFlowerStalkIntake() {
		return this.vegetableRedFlowerStalkIntake;
	}

	public void setVegetableRedFlowerStalkIntake(
			Double vegetableRedFlowerStalkIntake) {
		this.vegetableRedFlowerStalkIntake = vegetableRedFlowerStalkIntake;
	}

	public Double getVegetableHyacinthBeanIntake() {
		return this.vegetableHyacinthBeanIntake;
	}

	public void setVegetableHyacinthBeanIntake(
			Double vegetableHyacinthBeanIntake) {
		this.vegetableHyacinthBeanIntake = vegetableHyacinthBeanIntake;
	}

	public Double getVegetableBeanIntake() {
		return this.vegetableBeanIntake;
	}

	public void setVegetableBeanIntake(Double vegetableBeanIntake) {
		this.vegetableBeanIntake = vegetableBeanIntake;
	}

	public Double getVegetableSnowPeaIntake() {
		return this.vegetableSnowPeaIntake;
	}

	public void setVegetableSnowPeaIntake(Double vegetableSnowPeaIntake) {
		this.vegetableSnowPeaIntake = vegetableSnowPeaIntake;
	}

	public Double getVegetableSoyBeanIntake() {
		return this.vegetableSoyBeanIntake;
	}

	public void setVegetableSoyBeanIntake(Double vegetableSoyBeanIntake) {
		this.vegetableSoyBeanIntake = vegetableSoyBeanIntake;
	}

	public Double getVegetablePeaTipIntake() {
		return this.vegetablePeaTipIntake;
	}

	public void setVegetablePeaTipIntake(Double vegetablePeaTipIntake) {
		this.vegetablePeaTipIntake = vegetablePeaTipIntake;
	}

	public Double getVegetableCowPeaIntake() {
		return this.vegetableCowPeaIntake;
	}

	public void setVegetableCowPeaIntake(Double vegetableCowPeaIntake) {
		this.vegetableCowPeaIntake = vegetableCowPeaIntake;
	}

	public Double getVegetableBeanSproutIntake() {
		return this.vegetableBeanSproutIntake;
	}

	public void setVegetableBeanSproutIntake(Double vegetableBeanSproutIntake) {
		this.vegetableBeanSproutIntake = vegetableBeanSproutIntake;
	}

	public Double getVegetablePeaSeedlingIntake() {
		return this.vegetablePeaSeedlingIntake;
	}

	public void setVegetablePeaSeedlingIntake(Double vegetablePeaSeedlingIntake) {
		this.vegetablePeaSeedlingIntake = vegetablePeaSeedlingIntake;
	}

	public Double getVegetableSweetPepperIntake() {
		return this.vegetableSweetPepperIntake;
	}

	public void setVegetableSweetPepperIntake(Double vegetableSweetPepperIntake) {
		this.vegetableSweetPepperIntake = vegetableSweetPepperIntake;
	}

	public Double getVegetableMelonIntake() {
		return this.vegetableMelonIntake;
	}

	public void setVegetableMelonIntake(Double vegetableMelonIntake) {
		this.vegetableMelonIntake = vegetableMelonIntake;
	}

	public Double getVegetableBergamotIntake() {
		return this.vegetableBergamotIntake;
	}

	public void setVegetableBergamotIntake(Double vegetableBergamotIntake) {
		this.vegetableBergamotIntake = vegetableBergamotIntake;
	}

	public Double getVegetableCucumberIntake() {
		return this.vegetableCucumberIntake;
	}

	public void setVegetableCucumberIntake(Double vegetableCucumberIntake) {
		this.vegetableCucumberIntake = vegetableCucumberIntake;
	}

	public Double getVegetableBitterGourdIntake() {
		return this.vegetableBitterGourdIntake;
	}

	public void setVegetableBitterGourdIntake(Double vegetableBitterGourdIntake) {
		this.vegetableBitterGourdIntake = vegetableBitterGourdIntake;
	}

	public Double getVegetableLoofahIntake() {
		return this.vegetableLoofahIntake;
	}

	public void setVegetableLoofahIntake(Double vegetableLoofahIntake) {
		this.vegetableLoofahIntake = vegetableLoofahIntake;
	}

	public Double getVegetableSquashIntake() {
		return this.vegetableSquashIntake;
	}

	public void setVegetableSquashIntake(Double vegetableSquashIntake) {
		this.vegetableSquashIntake = vegetableSquashIntake;
	}

	public Double getVegetableGarlicSeedlingIntake() {
		return this.vegetableGarlicSeedlingIntake;
	}

	public void setVegetableGarlicSeedlingIntake(
			Double vegetableGarlicSeedlingIntake) {
		this.vegetableGarlicSeedlingIntake = vegetableGarlicSeedlingIntake;
	}

	public Double getVegetableGarlicMossIntake() {
		return this.vegetableGarlicMossIntake;
	}

	public void setVegetableGarlicMossIntake(Double vegetableGarlicMossIntake) {
		this.vegetableGarlicMossIntake = vegetableGarlicMossIntake;
	}

	public Double getVegetableBigOnionIntake() {
		return this.vegetableBigOnionIntake;
	}

	public void setVegetableBigOnionIntake(Double vegetableBigOnionIntake) {
		this.vegetableBigOnionIntake = vegetableBigOnionIntake;
	}

	public Double getVegetableLittleOnionIntake() {
		return this.vegetableLittleOnionIntake;
	}

	public void setVegetableLittleOnionIntake(Double vegetableLittleOnionIntake) {
		this.vegetableLittleOnionIntake = vegetableLittleOnionIntake;
	}

	public Double getVegetableChivesIntake() {
		return this.vegetableChivesIntake;
	}

	public void setVegetableChivesIntake(Double vegetableChivesIntake) {
		this.vegetableChivesIntake = vegetableChivesIntake;
	}

	public Double getVegetableChivesMossIntake() {
		return this.vegetableChivesMossIntake;
	}

	public void setVegetableChivesMossIntake(Double vegetableChivesMossIntake) {
		this.vegetableChivesMossIntake = vegetableChivesMossIntake;
	}

	public Double getVegetableBigCabbageIntake() {
		return this.vegetableBigCabbageIntake;
	}

	public void setVegetableBigCabbageIntake(Double vegetableBigCabbageIntake) {
		this.vegetableBigCabbageIntake = vegetableBigCabbageIntake;
	}

	public Double getVegetableLittleCabbageIntake() {
		return this.vegetableLittleCabbageIntake;
	}

	public void setVegetableLittleCabbageIntake(
			Double vegetableLittleCabbageIntake) {
		this.vegetableLittleCabbageIntake = vegetableLittleCabbageIntake;
	}

	public Double getVegetableRapeIntake() {
		return this.vegetableRapeIntake;
	}

	public void setVegetableRapeIntake(Double vegetableRapeIntake) {
		this.vegetableRapeIntake = vegetableRapeIntake;
	}

	public Double getVegetableCabbageIntake() {
		return this.vegetableCabbageIntake;
	}

	public void setVegetableCabbageIntake(Double vegetableCabbageIntake) {
		this.vegetableCabbageIntake = vegetableCabbageIntake;
	}

	public Double getVegetableBroccoliIntake() {
		return this.vegetableBroccoliIntake;
	}

	public void setVegetableBroccoliIntake(Double vegetableBroccoliIntake) {
		this.vegetableBroccoliIntake = vegetableBroccoliIntake;
	}

	public Double getVegetableMustardIntake() {
		return this.vegetableMustardIntake;
	}

	public void setVegetableMustardIntake(Double vegetableMustardIntake) {
		this.vegetableMustardIntake = vegetableMustardIntake;
	}

	public Double getVegetableLeafMustardIntake() {
		return this.vegetableLeafMustardIntake;
	}

	public void setVegetableLeafMustardIntake(Double vegetableLeafMustardIntake) {
		this.vegetableLeafMustardIntake = vegetableLeafMustardIntake;
	}

	public Double getVegetableSpinachIntake() {
		return this.vegetableSpinachIntake;
	}

	public void setVegetableSpinachIntake(Double vegetableSpinachIntake) {
		this.vegetableSpinachIntake = vegetableSpinachIntake;
	}

	public Double getVegetableMalabarSpinachIntake() {
		return this.vegetableMalabarSpinachIntake;
	}

	public void setVegetableMalabarSpinachIntake(
			Double vegetableMalabarSpinachIntake) {
		this.vegetableMalabarSpinachIntake = vegetableMalabarSpinachIntake;
	}

	public Double getVegetableCeleryIntake() {
		return this.vegetableCeleryIntake;
	}

	public void setVegetableCeleryIntake(Double vegetableCeleryIntake) {
		this.vegetableCeleryIntake = vegetableCeleryIntake;
	}

	public Double getVegetableRawLettuceIntake() {
		return this.vegetableRawLettuceIntake;
	}

	public void setVegetableRawLettuceIntake(Double vegetableRawLettuceIntake) {
		this.vegetableRawLettuceIntake = vegetableRawLettuceIntake;
	}

	public Double getVegetableParsleyIntake() {
		return this.vegetableParsleyIntake;
	}

	public void setVegetableParsleyIntake(Double vegetableParsleyIntake) {
		this.vegetableParsleyIntake = vegetableParsleyIntake;
	}

	public Double getVegetableChrysanthemumIntake() {
		return this.vegetableChrysanthemumIntake;
	}

	public void setVegetableChrysanthemumIntake(
			Double vegetableChrysanthemumIntake) {
		this.vegetableChrysanthemumIntake = vegetableChrysanthemumIntake;
	}

	public Double getVegetableFennelIntake() {
		return this.vegetableFennelIntake;
	}

	public void setVegetableFennelIntake(Double vegetableFennelIntake) {
		this.vegetableFennelIntake = vegetableFennelIntake;
	}

	public Double getVegetableLettuceShootIntake() {
		return this.vegetableLettuceShootIntake;
	}

	public void setVegetableLettuceShootIntake(
			Double vegetableLettuceShootIntake) {
		this.vegetableLettuceShootIntake = vegetableLettuceShootIntake;
	}

	public Double getVegetableBambooShootIntake() {
		return this.vegetableBambooShootIntake;
	}

	public void setVegetableBambooShootIntake(Double vegetableBambooShootIntake) {
		this.vegetableBambooShootIntake = vegetableBambooShootIntake;
	}

	public Double getVegetableCressIntake() {
		return this.vegetableCressIntake;
	}

	public void setVegetableCressIntake(Double vegetableCressIntake) {
		this.vegetableCressIntake = vegetableCressIntake;
	}

	public Double getVegetableBraseniaIntake() {
		return this.vegetableBraseniaIntake;
	}

	public void setVegetableBraseniaIntake(Double vegetableBraseniaIntake) {
		this.vegetableBraseniaIntake = vegetableBraseniaIntake;
	}

	public Double getVegetableSowThistleIntake() {
		return this.vegetableSowThistleIntake;
	}

	public void setVegetableSowThistleIntake(Double vegetableSowThistleIntake) {
		this.vegetableSowThistleIntake = vegetableSowThistleIntake;
	}

	public Double getVegetableKelpIntake() {
		return this.vegetableKelpIntake;
	}

	public void setVegetableKelpIntake(Double vegetableKelpIntake) {
		this.vegetableKelpIntake = vegetableKelpIntake;
	}

	public Double getVegetableYellowBeanSproutIntake() {
		return this.vegetableYellowBeanSproutIntake;
	}

	public void setVegetableYellowBeanSproutIntake(
			Double vegetableYellowBeanSproutIntake) {
		this.vegetableYellowBeanSproutIntake = vegetableYellowBeanSproutIntake;
	}

	public Double getVegetableCarrotIntake() {
		return this.vegetableCarrotIntake;
	}

	public void setVegetableCarrotIntake(Double vegetableCarrotIntake) {
		this.vegetableCarrotIntake = vegetableCarrotIntake;
	}

	public Double getVegetableYellowChivesIntake() {
		return this.vegetableYellowChivesIntake;
	}

	public void setVegetableYellowChivesIntake(
			Double vegetableYellowChivesIntake) {
		this.vegetableYellowChivesIntake = vegetableYellowChivesIntake;
	}

	public Double getVegetableCauliflowerIntake() {
		return this.vegetableCauliflowerIntake;
	}

	public void setVegetableCauliflowerIntake(Double vegetableCauliflowerIntake) {
		this.vegetableCauliflowerIntake = vegetableCauliflowerIntake;
	}

	public Double getVegetableYamIntake() {
		return this.vegetableYamIntake;
	}

	public void setVegetableYamIntake(Double vegetableYamIntake) {
		this.vegetableYamIntake = vegetableYamIntake;
	}

	public Double getVegetableTaroIntake() {
		return this.vegetableTaroIntake;
	}

	public void setVegetableTaroIntake(Double vegetableTaroIntake) {
		this.vegetableTaroIntake = vegetableTaroIntake;
	}

	public Double getVegetableGingerIntake() {
		return this.vegetableGingerIntake;
	}

	public void setVegetableGingerIntake(Double vegetableGingerIntake) {
		this.vegetableGingerIntake = vegetableGingerIntake;
	}

	public Double getVegetableMushroomIntake() {
		return this.vegetableMushroomIntake;
	}

	public void setVegetableMushroomIntake(Double vegetableMushroomIntake) {
		this.vegetableMushroomIntake = vegetableMushroomIntake;
	}

	public Double getVegetableEggplantIntake() {
		return this.vegetableEggplantIntake;
	}

	public void setVegetableEggplantIntake(Double vegetableEggplantIntake) {
		this.vegetableEggplantIntake = vegetableEggplantIntake;
	}

	public Double getVegetableWaterChestnutIntake() {
		return this.vegetableWaterChestnutIntake;
	}

	public void setVegetableWaterChestnutIntake(
			Double vegetableWaterChestnutIntake) {
		this.vegetableWaterChestnutIntake = vegetableWaterChestnutIntake;
	}

	public Double getVegetableBlackFungusIntake() {
		return this.vegetableBlackFungusIntake;
	}

	public void setVegetableBlackFungusIntake(Double vegetableBlackFungusIntake) {
		this.vegetableBlackFungusIntake = vegetableBlackFungusIntake;
	}

	public Double getVegetableSeaweedIntake() {
		return this.vegetableSeaweedIntake;
	}

	public void setVegetableSeaweedIntake(Double vegetableSeaweedIntake) {
		this.vegetableSeaweedIntake = vegetableSeaweedIntake;
	}

	public Double getVegetableToonIntake() {
		return this.vegetableToonIntake;
	}

	public void setVegetableToonIntake(Double vegetableToonIntake) {
		this.vegetableToonIntake = vegetableToonIntake;
	}

	public Double getVegetableFragrantMushroomIntake() {
		return this.vegetableFragrantMushroomIntake;
	}

	public void setVegetableFragrantMushroomIntake(
			Double vegetableFragrantMushroomIntake) {
		this.vegetableFragrantMushroomIntake = vegetableFragrantMushroomIntake;
	}

	public Double getVegetableHazelMushroomIntake() {
		return this.vegetableHazelMushroomIntake;
	}

	public void setVegetableHazelMushroomIntake(
			Double vegetableHazelMushroomIntake) {
		this.vegetableHazelMushroomIntake = vegetableHazelMushroomIntake;
	}

	public Double getVegetableFlatMushroomIntake() {
		return this.vegetableFlatMushroomIntake;
	}

	public void setVegetableFlatMushroomIntake(
			Double vegetableFlatMushroomIntake) {
		this.vegetableFlatMushroomIntake = vegetableFlatMushroomIntake;
	}

	public Double getVegetableOtherIntake() {
		return this.vegetableOtherIntake;
	}

	public void setVegetableOtherIntake(Double vegetableOtherIntake) {
		this.vegetableOtherIntake = vegetableOtherIntake;
	}

}