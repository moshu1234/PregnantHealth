package com.pregnant.health.bean;

import java.sql.Timestamp;

/**
 * BodyIngredientInspection entity. @author MyEclipse Persistence Tools
 */

public class BodyIngredientInspection implements java.io.Serializable {

	// Fields

	private GeneralSurveyID id;
	private Timestamp checkDate;
	private Integer sign;
	private Double intracellularFluid;
	private Double extracellularFluid;
	private Double age;
	private Double muscle;
	private Double fat;
	private Double fatfreeBodyWeight;
	private Double sclerotin;
	private Double height;
	private Double protein;
	private Double weight;
	private Double bodyFatPercent;
	private Double skeletalMuscle;
	private Double weightIndexBmi;
	private Double waistToHipratio;
	private Double metabolicRate;
	private Double bodyAge;
	private Double score;
	private Double impedanceRa5;
	private Double impedanceRl500;
	private Double impedanceLa5;
	private Double impedanceLl500;
	private Double impedanceTr5;
	private Double impedanceRl5;
	private Double impedanceLl5;
	private Double impedanceRa500;
	private Double impedanceLa500;
	private Double impedanceTr500;

	// Constructors

	/** default constructor */
	public BodyIngredientInspection() {
	}

	/** minimal constructor */
	public BodyIngredientInspection(GeneralSurveyID id) {
		this.id = id;
	}

	/** full constructor */
	public BodyIngredientInspection(GeneralSurveyID id,
			Timestamp checkDate, Integer sign, Double intracellularFluid,
			Double extracellularFluid, Double age, Double muscle, Double fat,
			Double fatfreeBodyWeight, Double sclerotin, Double height,
			Double protein, Double weight, Double bodyFatPercent,
			Double skeletalMuscle, Double weightIndexBmi,
			Double waistToHipratio, Double metabolicRate, Double bodyAge,
			Double score, Double impedanceRa5, Double impedanceRl500,
			Double impedanceLa5, Double impedanceLl500, Double impedanceTr5,
			Double impedanceRl5, Double impedanceLl5, Double impedanceRa500,
			Double impedanceLa500, Double impedanceTr500) {
		this.id = id;
		this.checkDate = checkDate;
		this.sign = sign;
		this.intracellularFluid = intracellularFluid;
		this.extracellularFluid = extracellularFluid;
		this.age = age;
		this.muscle = muscle;
		this.fat = fat;
		this.fatfreeBodyWeight = fatfreeBodyWeight;
		this.sclerotin = sclerotin;
		this.height = height;
		this.protein = protein;
		this.weight = weight;
		this.bodyFatPercent = bodyFatPercent;
		this.skeletalMuscle = skeletalMuscle;
		this.weightIndexBmi = weightIndexBmi;
		this.waistToHipratio = waistToHipratio;
		this.metabolicRate = metabolicRate;
		this.bodyAge = bodyAge;
		this.score = score;
		this.impedanceRa5 = impedanceRa5;
		this.impedanceRl500 = impedanceRl500;
		this.impedanceLa5 = impedanceLa5;
		this.impedanceLl500 = impedanceLl500;
		this.impedanceTr5 = impedanceTr5;
		this.impedanceRl5 = impedanceRl5;
		this.impedanceLl5 = impedanceLl5;
		this.impedanceRa500 = impedanceRa500;
		this.impedanceLa500 = impedanceLa500;
		this.impedanceTr500 = impedanceTr500;
	}

	// Property accessors

	public GeneralSurveyID getId() {
		return this.id;
	}

	public void setId(GeneralSurveyID id) {
		this.id = id;
	}

	public Timestamp getCheckDate() {
		return this.checkDate;
	}

	public void setCheckDate(Timestamp checkDate) {
		this.checkDate = checkDate;
	}

	public Integer getSign() {
		return this.sign;
	}

	public void setSign(Integer sign) {
		this.sign = sign;
	}

	public Double getIntracellularFluid() {
		return this.intracellularFluid;
	}

	public void setIntracellularFluid(Double intracellularFluid) {
		this.intracellularFluid = intracellularFluid;
	}

	public Double getExtracellularFluid() {
		return this.extracellularFluid;
	}

	public void setExtracellularFluid(Double extracellularFluid) {
		this.extracellularFluid = extracellularFluid;
	}

	public Double getAge() {
		return this.age;
	}

	public void setAge(Double age) {
		this.age = age;
	}

	public Double getMuscle() {
		return this.muscle;
	}

	public void setMuscle(Double muscle) {
		this.muscle = muscle;
	}

	public Double getFat() {
		return this.fat;
	}

	public void setFat(Double fat) {
		this.fat = fat;
	}

	public Double getFatfreeBodyWeight() {
		return this.fatfreeBodyWeight;
	}

	public void setFatfreeBodyWeight(Double fatfreeBodyWeight) {
		this.fatfreeBodyWeight = fatfreeBodyWeight;
	}

	public Double getSclerotin() {
		return this.sclerotin;
	}

	public void setSclerotin(Double sclerotin) {
		this.sclerotin = sclerotin;
	}

	public Double getHeight() {
		return this.height;
	}

	public void setHeight(Double height) {
		this.height = height;
	}

	public Double getProtein() {
		return this.protein;
	}

	public void setProtein(Double protein) {
		this.protein = protein;
	}

	public Double getWeight() {
		return this.weight;
	}

	public void setWeight(Double weight) {
		this.weight = weight;
	}

	public Double getBodyFatPercent() {
		return this.bodyFatPercent;
	}

	public void setBodyFatPercent(Double bodyFatPercent) {
		this.bodyFatPercent = bodyFatPercent;
	}

	public Double getSkeletalMuscle() {
		return this.skeletalMuscle;
	}

	public void setSkeletalMuscle(Double skeletalMuscle) {
		this.skeletalMuscle = skeletalMuscle;
	}

	public Double getWeightIndexBmi() {
		return this.weightIndexBmi;
	}

	public void setWeightIndexBmi(Double weightIndexBmi) {
		this.weightIndexBmi = weightIndexBmi;
	}

	public Double getWaistToHipratio() {
		return this.waistToHipratio;
	}

	public void setWaistToHipratio(Double waistToHipratio) {
		this.waistToHipratio = waistToHipratio;
	}

	public Double getMetabolicRate() {
		return this.metabolicRate;
	}

	public void setMetabolicRate(Double metabolicRate) {
		this.metabolicRate = metabolicRate;
	}

	public Double getBodyAge() {
		return this.bodyAge;
	}

	public void setBodyAge(Double bodyAge) {
		this.bodyAge = bodyAge;
	}

	public Double getScore() {
		return this.score;
	}

	public void setScore(Double score) {
		this.score = score;
	}

	public Double getImpedanceRa5() {
		return this.impedanceRa5;
	}

	public void setImpedanceRa5(Double impedanceRa5) {
		this.impedanceRa5 = impedanceRa5;
	}

	public Double getImpedanceRl500() {
		return this.impedanceRl500;
	}

	public void setImpedanceRl500(Double impedanceRl500) {
		this.impedanceRl500 = impedanceRl500;
	}

	public Double getImpedanceLa5() {
		return this.impedanceLa5;
	}

	public void setImpedanceLa5(Double impedanceLa5) {
		this.impedanceLa5 = impedanceLa5;
	}

	public Double getImpedanceLl500() {
		return this.impedanceLl500;
	}

	public void setImpedanceLl500(Double impedanceLl500) {
		this.impedanceLl500 = impedanceLl500;
	}

	public Double getImpedanceTr5() {
		return this.impedanceTr5;
	}

	public void setImpedanceTr5(Double impedanceTr5) {
		this.impedanceTr5 = impedanceTr5;
	}

	public Double getImpedanceRl5() {
		return this.impedanceRl5;
	}

	public void setImpedanceRl5(Double impedanceRl5) {
		this.impedanceRl5 = impedanceRl5;
	}

	public Double getImpedanceLl5() {
		return this.impedanceLl5;
	}

	public void setImpedanceLl5(Double impedanceLl5) {
		this.impedanceLl5 = impedanceLl5;
	}

	public Double getImpedanceRa500() {
		return this.impedanceRa500;
	}

	public void setImpedanceRa500(Double impedanceRa500) {
		this.impedanceRa500 = impedanceRa500;
	}

	public Double getImpedanceLa500() {
		return this.impedanceLa500;
	}

	public void setImpedanceLa500(Double impedanceLa500) {
		this.impedanceLa500 = impedanceLa500;
	}

	public Double getImpedanceTr500() {
		return this.impedanceTr500;
	}

	public void setImpedanceTr500(Double impedanceTr500) {
		this.impedanceTr500 = impedanceTr500;
	}

}