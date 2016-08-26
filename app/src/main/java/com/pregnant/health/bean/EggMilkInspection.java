package com.pregnant.health.bean;

/**
 * EggMilkInspection entity. @author MyEclipse Persistence Tools
 */

public class EggMilkInspection implements java.io.Serializable {

	// Fields

	private DietarySurveyID id;
	private Integer sign;
	private Double eggChickenIntake;
	private Double eggDuckIntake;
	private Double eggPreservedDuckIntake;
	private Double eggSaltedDuckIntake;
	private Double eggGooseIntake;
	private Double eggQuailIntake;
	private Double milkCowIntake;
	private Double milkYogurtIntake;
	private Double milkCreamIntake;
	private Double milkButterIntake;
	private Double milkCheeseIntake;
	private Double milkDoufuIntake;
	private Double milkSuYouIntake;
	private Double milkLianruIntake;
	private Double milkTabletIntake;
	private Double milkOtherIntake;

	// Constructors

	/** default constructor */
	public EggMilkInspection() {
	}

	/** minimal constructor */
	public EggMilkInspection(DietarySurveyID id) {
		this.id = id;
	}

	/** full constructor */
	public EggMilkInspection(DietarySurveyID id, Integer sign,
			Double eggChickenIntake, Double eggDuckIntake,
			Double eggPreservedDuckIntake, Double eggSaltedDuckIntake,
			Double eggGooseIntake, Double eggQuailIntake, Double milkCowIntake,
			Double milkYogurtIntake, Double milkCreamIntake,
			Double milkButterIntake, Double milkCheeseIntake,
			Double milkDoufuIntake, Double milkSuYouIntake,
			Double milkLianruIntake, Double milkTabletIntake,
			Double milkOtherIntake) {
		this.id = id;
		this.sign = sign;
		this.eggChickenIntake = eggChickenIntake;
		this.eggDuckIntake = eggDuckIntake;
		this.eggPreservedDuckIntake = eggPreservedDuckIntake;
		this.eggSaltedDuckIntake = eggSaltedDuckIntake;
		this.eggGooseIntake = eggGooseIntake;
		this.eggQuailIntake = eggQuailIntake;
		this.milkCowIntake = milkCowIntake;
		this.milkYogurtIntake = milkYogurtIntake;
		this.milkCreamIntake = milkCreamIntake;
		this.milkButterIntake = milkButterIntake;
		this.milkCheeseIntake = milkCheeseIntake;
		this.milkDoufuIntake = milkDoufuIntake;
		this.milkSuYouIntake = milkSuYouIntake;
		this.milkLianruIntake = milkLianruIntake;
		this.milkTabletIntake = milkTabletIntake;
		this.milkOtherIntake = milkOtherIntake;
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

	public Double getEggChickenIntake() {
		return this.eggChickenIntake;
	}

	public void setEggChickenIntake(Double eggChickenIntake) {
		this.eggChickenIntake = eggChickenIntake;
	}

	public Double getEggDuckIntake() {
		return this.eggDuckIntake;
	}

	public void setEggDuckIntake(Double eggDuckIntake) {
		this.eggDuckIntake = eggDuckIntake;
	}

	public Double getEggPreservedDuckIntake() {
		return this.eggPreservedDuckIntake;
	}

	public void setEggPreservedDuckIntake(Double eggPreservedDuckIntake) {
		this.eggPreservedDuckIntake = eggPreservedDuckIntake;
	}

	public Double getEggSaltedDuckIntake() {
		return this.eggSaltedDuckIntake;
	}

	public void setEggSaltedDuckIntake(Double eggSaltedDuckIntake) {
		this.eggSaltedDuckIntake = eggSaltedDuckIntake;
	}

	public Double getEggGooseIntake() {
		return this.eggGooseIntake;
	}

	public void setEggGooseIntake(Double eggGooseIntake) {
		this.eggGooseIntake = eggGooseIntake;
	}

	public Double getEggQuailIntake() {
		return this.eggQuailIntake;
	}

	public void setEggQuailIntake(Double eggQuailIntake) {
		this.eggQuailIntake = eggQuailIntake;
	}

	public Double getMilkCowIntake() {
		return this.milkCowIntake;
	}

	public void setMilkCowIntake(Double milkCowIntake) {
		this.milkCowIntake = milkCowIntake;
	}

	public Double getMilkYogurtIntake() {
		return this.milkYogurtIntake;
	}

	public void setMilkYogurtIntake(Double milkYogurtIntake) {
		this.milkYogurtIntake = milkYogurtIntake;
	}

	public Double getMilkCreamIntake() {
		return this.milkCreamIntake;
	}

	public void setMilkCreamIntake(Double milkCreamIntake) {
		this.milkCreamIntake = milkCreamIntake;
	}

	public Double getMilkButterIntake() {
		return this.milkButterIntake;
	}

	public void setMilkButterIntake(Double milkButterIntake) {
		this.milkButterIntake = milkButterIntake;
	}

	public Double getMilkCheeseIntake() {
		return this.milkCheeseIntake;
	}

	public void setMilkCheeseIntake(Double milkCheeseIntake) {
		this.milkCheeseIntake = milkCheeseIntake;
	}

	public Double getMilkDoufuIntake() {
		return this.milkDoufuIntake;
	}

	public void setMilkDoufuIntake(Double milkDoufuIntake) {
		this.milkDoufuIntake = milkDoufuIntake;
	}

	public Double getMilkSuYouIntake() {
		return this.milkSuYouIntake;
	}

	public void setMilkSuYouIntake(Double milkSuYouIntake) {
		this.milkSuYouIntake = milkSuYouIntake;
	}

	public Double getMilkLianruIntake() {
		return this.milkLianruIntake;
	}

	public void setMilkLianruIntake(Double milkLianruIntake) {
		this.milkLianruIntake = milkLianruIntake;
	}

	public Double getMilkTabletIntake() {
		return this.milkTabletIntake;
	}

	public void setMilkTabletIntake(Double milkTabletIntake) {
		this.milkTabletIntake = milkTabletIntake;
	}

	public Double getMilkOtherIntake() {
		return this.milkOtherIntake;
	}

	public void setMilkOtherIntake(Double milkOtherIntake) {
		this.milkOtherIntake = milkOtherIntake;
	}

}