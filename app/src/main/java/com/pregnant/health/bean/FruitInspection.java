package com.pregnant.health.bean;

/**
 * FruitInspection entity. @author MyEclipse Persistence Tools
 */

public class FruitInspection implements java.io.Serializable {

	// Fields

	private DietarySurveyID id;
	private Integer sign;
	private Double fruitAppleIntake;
	private Double fruitCrabAppleIntake;
	private Double fruitHitomIntake;
	private Double fruitEliIntake;
	private Double fruitShaguoIntake;
	private Double fruitZiputaoIntake;
	private Double fruitLujuIntake;
	private Double fruitBaijinguaIntake;
	private Double fruitGanguiyuanIntake;
	private Double fruitYeziIntake;
	private Double fruitRenshengguoIntake;
	private Double fruitPeachIntake;
	private Double fruitCherryIntake;
	private Double fruitPomeGranateIntake;
	private Double fruitStrawberryIntake;
	private Double fruitLitchiIntake;
	private Double fruitPearIntake;
	private Double fruitPersimmonIntake;
	private Double fruitOrangeIntake;
	private Double fruitCitrusIntake;
	private Double fruitPomeloIntake;
	private Double fruitLemonIntake;
	private Double fruitPineappleIntake;
	private Double fruitMangoIntake;
	private Double fruitBananaIntake;
	private Double fruitStarfruitIntake;
	private Double fruitLoquatIntake;
	private Double fruitMulberryIntake;
	private Double fruitPlumIntake;
	private Double fruitMyrtleIntake;
	private Double fruitHoneydewMelonIntake;
	private Double fruitHamiMelonIntake;
	private Double fruitMuskMelonIntake;
	private Double fruitWaterMelonIntake;
	private Double fruitDateIntake;
	private Double fruitGrapeIntake;
	private Double fruitKiwifruitIntake;
	private Double fruitLonganIntake;
	private Double fruitPapayaIntake;
	private Double fruitOliveIntake;
	private Double fruitOtherIntake;

	// Constructors

	/** default constructor */
	public FruitInspection() {
	}

	/** minimal constructor */
	public FruitInspection(DietarySurveyID id) {
		this.id = id;
	}

	/** full constructor */
	public FruitInspection(DietarySurveyID id, Integer sign,
			Double fruitAppleIntake, Double fruitCrabAppleIntake,
			Double fruitHitomIntake, Double fruitEliIntake,
			Double fruitShaguoIntake, Double fruitZiputaoIntake,
			Double fruitLujuIntake, Double fruitBaijinguaIntake,
			Double fruitGanguiyuanIntake, Double fruitYeziIntake,
			Double fruitRenshengguoIntake, Double fruitPeachIntake,
			Double fruitCherryIntake, Double fruitPomeGranateIntake,
			Double fruitStrawberryIntake, Double fruitLitchiIntake,
			Double fruitPearIntake, Double fruitPersimmonIntake,
			Double fruitOrangeIntake, Double fruitCitrusIntake,
			Double fruitPomeloIntake, Double fruitLemonIntake,
			Double fruitPineappleIntake, Double fruitMangoIntake,
			Double fruitBananaIntake, Double fruitStarfruitIntake,
			Double fruitLoquatIntake, Double fruitMulberryIntake,
			Double fruitPlumIntake, Double fruitMyrtleIntake,
			Double fruitHoneydewMelonIntake, Double fruitHamiMelonIntake,
			Double fruitMuskMelonIntake, Double fruitWaterMelonIntake,
			Double fruitDateIntake, Double fruitGrapeIntake,
			Double fruitKiwifruitIntake, Double fruitLonganIntake,
			Double fruitPapayaIntake, Double fruitOliveIntake,
			Double fruitOtherIntake) {
		this.id = id;
		this.sign = sign;
		this.fruitAppleIntake = fruitAppleIntake;
		this.fruitCrabAppleIntake = fruitCrabAppleIntake;
		this.fruitHitomIntake = fruitHitomIntake;
		this.fruitEliIntake = fruitEliIntake;
		this.fruitShaguoIntake = fruitShaguoIntake;
		this.fruitZiputaoIntake = fruitZiputaoIntake;
		this.fruitLujuIntake = fruitLujuIntake;
		this.fruitBaijinguaIntake = fruitBaijinguaIntake;
		this.fruitGanguiyuanIntake = fruitGanguiyuanIntake;
		this.fruitYeziIntake = fruitYeziIntake;
		this.fruitRenshengguoIntake = fruitRenshengguoIntake;
		this.fruitPeachIntake = fruitPeachIntake;
		this.fruitCherryIntake = fruitCherryIntake;
		this.fruitPomeGranateIntake = fruitPomeGranateIntake;
		this.fruitStrawberryIntake = fruitStrawberryIntake;
		this.fruitLitchiIntake = fruitLitchiIntake;
		this.fruitPearIntake = fruitPearIntake;
		this.fruitPersimmonIntake = fruitPersimmonIntake;
		this.fruitOrangeIntake = fruitOrangeIntake;
		this.fruitCitrusIntake = fruitCitrusIntake;
		this.fruitPomeloIntake = fruitPomeloIntake;
		this.fruitLemonIntake = fruitLemonIntake;
		this.fruitPineappleIntake = fruitPineappleIntake;
		this.fruitMangoIntake = fruitMangoIntake;
		this.fruitBananaIntake = fruitBananaIntake;
		this.fruitStarfruitIntake = fruitStarfruitIntake;
		this.fruitLoquatIntake = fruitLoquatIntake;
		this.fruitMulberryIntake = fruitMulberryIntake;
		this.fruitPlumIntake = fruitPlumIntake;
		this.fruitMyrtleIntake = fruitMyrtleIntake;
		this.fruitHoneydewMelonIntake = fruitHoneydewMelonIntake;
		this.fruitHamiMelonIntake = fruitHamiMelonIntake;
		this.fruitMuskMelonIntake = fruitMuskMelonIntake;
		this.fruitWaterMelonIntake = fruitWaterMelonIntake;
		this.fruitDateIntake = fruitDateIntake;
		this.fruitGrapeIntake = fruitGrapeIntake;
		this.fruitKiwifruitIntake = fruitKiwifruitIntake;
		this.fruitLonganIntake = fruitLonganIntake;
		this.fruitPapayaIntake = fruitPapayaIntake;
		this.fruitOliveIntake = fruitOliveIntake;
		this.fruitOtherIntake = fruitOtherIntake;
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

	public Double getFruitAppleIntake() {
		return this.fruitAppleIntake;
	}

	public void setFruitAppleIntake(Double fruitAppleIntake) {
		this.fruitAppleIntake = fruitAppleIntake;
	}

	public Double getFruitCrabAppleIntake() {
		return this.fruitCrabAppleIntake;
	}

	public void setFruitCrabAppleIntake(Double fruitCrabAppleIntake) {
		this.fruitCrabAppleIntake = fruitCrabAppleIntake;
	}

	public Double getFruitHitomIntake() {
		return this.fruitHitomIntake;
	}

	public void setFruitHitomIntake(Double fruitHitomIntake) {
		this.fruitHitomIntake = fruitHitomIntake;
	}

	public Double getFruitEliIntake() {
		return this.fruitEliIntake;
	}

	public void setFruitEliIntake(Double fruitEliIntake) {
		this.fruitEliIntake = fruitEliIntake;
	}

	public Double getFruitShaguoIntake() {
		return this.fruitShaguoIntake;
	}

	public void setFruitShaguoIntake(Double fruitShaguoIntake) {
		this.fruitShaguoIntake = fruitShaguoIntake;
	}

	public Double getFruitZiputaoIntake() {
		return this.fruitZiputaoIntake;
	}

	public void setFruitZiputaoIntake(Double fruitZiputaoIntake) {
		this.fruitZiputaoIntake = fruitZiputaoIntake;
	}

	public Double getFruitLujuIntake() {
		return this.fruitLujuIntake;
	}

	public void setFruitLujuIntake(Double fruitLujuIntake) {
		this.fruitLujuIntake = fruitLujuIntake;
	}

	public Double getFruitBaijinguaIntake() {
		return this.fruitBaijinguaIntake;
	}

	public void setFruitBaijinguaIntake(Double fruitBaijinguaIntake) {
		this.fruitBaijinguaIntake = fruitBaijinguaIntake;
	}

	public Double getFruitGanguiyuanIntake() {
		return this.fruitGanguiyuanIntake;
	}

	public void setFruitGanguiyuanIntake(Double fruitGanguiyuanIntake) {
		this.fruitGanguiyuanIntake = fruitGanguiyuanIntake;
	}

	public Double getFruitYeziIntake() {
		return this.fruitYeziIntake;
	}

	public void setFruitYeziIntake(Double fruitYeziIntake) {
		this.fruitYeziIntake = fruitYeziIntake;
	}

	public Double getFruitRenshengguoIntake() {
		return this.fruitRenshengguoIntake;
	}

	public void setFruitRenshengguoIntake(Double fruitRenshengguoIntake) {
		this.fruitRenshengguoIntake = fruitRenshengguoIntake;
	}

	public Double getFruitPeachIntake() {
		return this.fruitPeachIntake;
	}

	public void setFruitPeachIntake(Double fruitPeachIntake) {
		this.fruitPeachIntake = fruitPeachIntake;
	}

	public Double getFruitCherryIntake() {
		return this.fruitCherryIntake;
	}

	public void setFruitCherryIntake(Double fruitCherryIntake) {
		this.fruitCherryIntake = fruitCherryIntake;
	}

	public Double getFruitPomeGranateIntake() {
		return this.fruitPomeGranateIntake;
	}

	public void setFruitPomeGranateIntake(Double fruitPomeGranateIntake) {
		this.fruitPomeGranateIntake = fruitPomeGranateIntake;
	}

	public Double getFruitStrawberryIntake() {
		return this.fruitStrawberryIntake;
	}

	public void setFruitStrawberryIntake(Double fruitStrawberryIntake) {
		this.fruitStrawberryIntake = fruitStrawberryIntake;
	}

	public Double getFruitLitchiIntake() {
		return this.fruitLitchiIntake;
	}

	public void setFruitLitchiIntake(Double fruitLitchiIntake) {
		this.fruitLitchiIntake = fruitLitchiIntake;
	}

	public Double getFruitPearIntake() {
		return this.fruitPearIntake;
	}

	public void setFruitPearIntake(Double fruitPearIntake) {
		this.fruitPearIntake = fruitPearIntake;
	}

	public Double getFruitPersimmonIntake() {
		return this.fruitPersimmonIntake;
	}

	public void setFruitPersimmonIntake(Double fruitPersimmonIntake) {
		this.fruitPersimmonIntake = fruitPersimmonIntake;
	}

	public Double getFruitOrangeIntake() {
		return this.fruitOrangeIntake;
	}

	public void setFruitOrangeIntake(Double fruitOrangeIntake) {
		this.fruitOrangeIntake = fruitOrangeIntake;
	}

	public Double getFruitCitrusIntake() {
		return this.fruitCitrusIntake;
	}

	public void setFruitCitrusIntake(Double fruitCitrusIntake) {
		this.fruitCitrusIntake = fruitCitrusIntake;
	}

	public Double getFruitPomeloIntake() {
		return this.fruitPomeloIntake;
	}

	public void setFruitPomeloIntake(Double fruitPomeloIntake) {
		this.fruitPomeloIntake = fruitPomeloIntake;
	}

	public Double getFruitLemonIntake() {
		return this.fruitLemonIntake;
	}

	public void setFruitLemonIntake(Double fruitLemonIntake) {
		this.fruitLemonIntake = fruitLemonIntake;
	}

	public Double getFruitPineappleIntake() {
		return this.fruitPineappleIntake;
	}

	public void setFruitPineappleIntake(Double fruitPineappleIntake) {
		this.fruitPineappleIntake = fruitPineappleIntake;
	}

	public Double getFruitMangoIntake() {
		return this.fruitMangoIntake;
	}

	public void setFruitMangoIntake(Double fruitMangoIntake) {
		this.fruitMangoIntake = fruitMangoIntake;
	}

	public Double getFruitBananaIntake() {
		return this.fruitBananaIntake;
	}

	public void setFruitBananaIntake(Double fruitBananaIntake) {
		this.fruitBananaIntake = fruitBananaIntake;
	}

	public Double getFruitStarfruitIntake() {
		return this.fruitStarfruitIntake;
	}

	public void setFruitStarfruitIntake(Double fruitStarfruitIntake) {
		this.fruitStarfruitIntake = fruitStarfruitIntake;
	}

	public Double getFruitLoquatIntake() {
		return this.fruitLoquatIntake;
	}

	public void setFruitLoquatIntake(Double fruitLoquatIntake) {
		this.fruitLoquatIntake = fruitLoquatIntake;
	}

	public Double getFruitMulberryIntake() {
		return this.fruitMulberryIntake;
	}

	public void setFruitMulberryIntake(Double fruitMulberryIntake) {
		this.fruitMulberryIntake = fruitMulberryIntake;
	}

	public Double getFruitPlumIntake() {
		return this.fruitPlumIntake;
	}

	public void setFruitPlumIntake(Double fruitPlumIntake) {
		this.fruitPlumIntake = fruitPlumIntake;
	}

	public Double getFruitMyrtleIntake() {
		return this.fruitMyrtleIntake;
	}

	public void setFruitMyrtleIntake(Double fruitMyrtleIntake) {
		this.fruitMyrtleIntake = fruitMyrtleIntake;
	}

	public Double getFruitHoneydewMelonIntake() {
		return this.fruitHoneydewMelonIntake;
	}

	public void setFruitHoneydewMelonIntake(Double fruitHoneydewMelonIntake) {
		this.fruitHoneydewMelonIntake = fruitHoneydewMelonIntake;
	}

	public Double getFruitHamiMelonIntake() {
		return this.fruitHamiMelonIntake;
	}

	public void setFruitHamiMelonIntake(Double fruitHamiMelonIntake) {
		this.fruitHamiMelonIntake = fruitHamiMelonIntake;
	}

	public Double getFruitMuskMelonIntake() {
		return this.fruitMuskMelonIntake;
	}

	public void setFruitMuskMelonIntake(Double fruitMuskMelonIntake) {
		this.fruitMuskMelonIntake = fruitMuskMelonIntake;
	}

	public Double getFruitWaterMelonIntake() {
		return this.fruitWaterMelonIntake;
	}

	public void setFruitWaterMelonIntake(Double fruitWaterMelonIntake) {
		this.fruitWaterMelonIntake = fruitWaterMelonIntake;
	}

	public Double getFruitDateIntake() {
		return this.fruitDateIntake;
	}

	public void setFruitDateIntake(Double fruitDateIntake) {
		this.fruitDateIntake = fruitDateIntake;
	}

	public Double getFruitGrapeIntake() {
		return this.fruitGrapeIntake;
	}

	public void setFruitGrapeIntake(Double fruitGrapeIntake) {
		this.fruitGrapeIntake = fruitGrapeIntake;
	}

	public Double getFruitKiwifruitIntake() {
		return this.fruitKiwifruitIntake;
	}

	public void setFruitKiwifruitIntake(Double fruitKiwifruitIntake) {
		this.fruitKiwifruitIntake = fruitKiwifruitIntake;
	}

	public Double getFruitLonganIntake() {
		return this.fruitLonganIntake;
	}

	public void setFruitLonganIntake(Double fruitLonganIntake) {
		this.fruitLonganIntake = fruitLonganIntake;
	}

	public Double getFruitPapayaIntake() {
		return this.fruitPapayaIntake;
	}

	public void setFruitPapayaIntake(Double fruitPapayaIntake) {
		this.fruitPapayaIntake = fruitPapayaIntake;
	}

	public Double getFruitOliveIntake() {
		return this.fruitOliveIntake;
	}

	public void setFruitOliveIntake(Double fruitOliveIntake) {
		this.fruitOliveIntake = fruitOliveIntake;
	}

	public Double getFruitOtherIntake() {
		return this.fruitOtherIntake;
	}

	public void setFruitOtherIntake(Double fruitOtherIntake) {
		this.fruitOtherIntake = fruitOtherIntake;
	}

}