package com.pregnant.health.bean;

/**
 * BeanFoodInspection entity. @author MyEclipse Persistence Tools
 */

public class BeanFoodInspection implements java.io.Serializable {

	// Fields

	private DietarySurveyID id;
	private Integer sign;
	private Double beanRedAdzukiBeanIntake;
	private Double beanRedBeanPasteIntake;
	private Double beanSoyBeanIntake;
	private Double beanGreenBeanIntake;
	private Double beanPeaIntake;
	private Double beanBlueBeanIntake;
	private Double beanBlackBeanIntake;
	private Double beanBroadBeanIntake;
	private Double beanTofuIntake;
	private Double beanCurdIntake;
	private Double beanMilkIntake;
	private Double beanSilkTofuIntake;
	private Double beanYubaIntake;
	private Double beanDryTofuIntake;
	private Double beanBranIntake;
	private Double beanKidneyBeanIntake;
	private Double beanSoyMilkIntake;
	private Double beanTofuPiIntake;
	private Double beanSuJiIntake;
	private Double beanXiaoDouZhouIntake;
	private Double beanDouShaIntake;
	private Double beanZhaCandouIntake;
	private Double beanDouzhiIntake;
	private Double beanJiangyouganIntake;
	private Double beanXunganIntake;
	private Double beanChouganIntake;
	private Double beanBiandouIntake;
	private Double beanWandouIntake;
	private Double beanKaocandouIntake;
	private Double beanOtherIntake;

	// Constructors

	/** default constructor */
	public BeanFoodInspection() {
	}

	/** minimal constructor */
	public BeanFoodInspection(DietarySurveyID id) {
		this.id = id;
	}

	/** full constructor */
	public BeanFoodInspection(DietarySurveyID id, Integer sign,
			Double beanRedAdzukiBeanIntake, Double beanRedBeanPasteIntake,
			Double beanSoyBeanIntake, Double beanGreenBeanIntake,
			Double beanPeaIntake, Double beanBlueBeanIntake,
			Double beanBlackBeanIntake, Double beanBroadBeanIntake,
			Double beanTofuIntake, Double beanCurdIntake,
			Double beanMilkIntake, Double beanSilkTofuIntake,
			Double beanYubaIntake, Double beanDryTofuIntake,
			Double beanBranIntake, Double beanKidneyBeanIntake,
			Double beanSoyMilkIntake, Double beanTofuPiIntake,
			Double beanSuJiIntake, Double beanXiaoDouZhouIntake,
			Double beanDouShaIntake, Double beanZhaCandouIntake,
			Double beanDouzhiIntake, Double beanJiangyouganIntake,
			Double beanXunganIntake, Double beanChouganIntake,
			Double beanBiandouIntake, Double beanWandouIntake,
			Double beanKaocandouIntake, Double beanOtherIntake) {
		this.id = id;
		this.sign = sign;
		this.beanRedAdzukiBeanIntake = beanRedAdzukiBeanIntake;
		this.beanRedBeanPasteIntake = beanRedBeanPasteIntake;
		this.beanSoyBeanIntake = beanSoyBeanIntake;
		this.beanGreenBeanIntake = beanGreenBeanIntake;
		this.beanPeaIntake = beanPeaIntake;
		this.beanBlueBeanIntake = beanBlueBeanIntake;
		this.beanBlackBeanIntake = beanBlackBeanIntake;
		this.beanBroadBeanIntake = beanBroadBeanIntake;
		this.beanTofuIntake = beanTofuIntake;
		this.beanCurdIntake = beanCurdIntake;
		this.beanMilkIntake = beanMilkIntake;
		this.beanSilkTofuIntake = beanSilkTofuIntake;
		this.beanYubaIntake = beanYubaIntake;
		this.beanDryTofuIntake = beanDryTofuIntake;
		this.beanBranIntake = beanBranIntake;
		this.beanKidneyBeanIntake = beanKidneyBeanIntake;
		this.beanSoyMilkIntake = beanSoyMilkIntake;
		this.beanTofuPiIntake = beanTofuPiIntake;
		this.beanSuJiIntake = beanSuJiIntake;
		this.beanXiaoDouZhouIntake = beanXiaoDouZhouIntake;
		this.beanDouShaIntake = beanDouShaIntake;
		this.beanZhaCandouIntake = beanZhaCandouIntake;
		this.beanDouzhiIntake = beanDouzhiIntake;
		this.beanJiangyouganIntake = beanJiangyouganIntake;
		this.beanXunganIntake = beanXunganIntake;
		this.beanChouganIntake = beanChouganIntake;
		this.beanBiandouIntake = beanBiandouIntake;
		this.beanWandouIntake = beanWandouIntake;
		this.beanKaocandouIntake = beanKaocandouIntake;
		this.beanOtherIntake = beanOtherIntake;
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

	public Double getBeanRedAdzukiBeanIntake() {
		return this.beanRedAdzukiBeanIntake;
	}

	public void setBeanRedAdzukiBeanIntake(Double beanRedAdzukiBeanIntake) {
		this.beanRedAdzukiBeanIntake = beanRedAdzukiBeanIntake;
	}

	public Double getBeanRedBeanPasteIntake() {
		return this.beanRedBeanPasteIntake;
	}

	public void setBeanRedBeanPasteIntake(Double beanRedBeanPasteIntake) {
		this.beanRedBeanPasteIntake = beanRedBeanPasteIntake;
	}

	public Double getBeanSoyBeanIntake() {
		return this.beanSoyBeanIntake;
	}

	public void setBeanSoyBeanIntake(Double beanSoyBeanIntake) {
		this.beanSoyBeanIntake = beanSoyBeanIntake;
	}

	public Double getBeanGreenBeanIntake() {
		return this.beanGreenBeanIntake;
	}

	public void setBeanGreenBeanIntake(Double beanGreenBeanIntake) {
		this.beanGreenBeanIntake = beanGreenBeanIntake;
	}

	public Double getBeanPeaIntake() {
		return this.beanPeaIntake;
	}

	public void setBeanPeaIntake(Double beanPeaIntake) {
		this.beanPeaIntake = beanPeaIntake;
	}

	public Double getBeanBlueBeanIntake() {
		return this.beanBlueBeanIntake;
	}

	public void setBeanBlueBeanIntake(Double beanBlueBeanIntake) {
		this.beanBlueBeanIntake = beanBlueBeanIntake;
	}

	public Double getBeanBlackBeanIntake() {
		return this.beanBlackBeanIntake;
	}

	public void setBeanBlackBeanIntake(Double beanBlackBeanIntake) {
		this.beanBlackBeanIntake = beanBlackBeanIntake;
	}

	public Double getBeanBroadBeanIntake() {
		return this.beanBroadBeanIntake;
	}

	public void setBeanBroadBeanIntake(Double beanBroadBeanIntake) {
		this.beanBroadBeanIntake = beanBroadBeanIntake;
	}

	public Double getBeanTofuIntake() {
		return this.beanTofuIntake;
	}

	public void setBeanTofuIntake(Double beanTofuIntake) {
		this.beanTofuIntake = beanTofuIntake;
	}

	public Double getBeanCurdIntake() {
		return this.beanCurdIntake;
	}

	public void setBeanCurdIntake(Double beanCurdIntake) {
		this.beanCurdIntake = beanCurdIntake;
	}

	public Double getBeanMilkIntake() {
		return this.beanMilkIntake;
	}

	public void setBeanMilkIntake(Double beanMilkIntake) {
		this.beanMilkIntake = beanMilkIntake;
	}

	public Double getBeanSilkTofuIntake() {
		return this.beanSilkTofuIntake;
	}

	public void setBeanSilkTofuIntake(Double beanSilkTofuIntake) {
		this.beanSilkTofuIntake = beanSilkTofuIntake;
	}

	public Double getBeanYubaIntake() {
		return this.beanYubaIntake;
	}

	public void setBeanYubaIntake(Double beanYubaIntake) {
		this.beanYubaIntake = beanYubaIntake;
	}

	public Double getBeanDryTofuIntake() {
		return this.beanDryTofuIntake;
	}

	public void setBeanDryTofuIntake(Double beanDryTofuIntake) {
		this.beanDryTofuIntake = beanDryTofuIntake;
	}

	public Double getBeanBranIntake() {
		return this.beanBranIntake;
	}

	public void setBeanBranIntake(Double beanBranIntake) {
		this.beanBranIntake = beanBranIntake;
	}

	public Double getBeanKidneyBeanIntake() {
		return this.beanKidneyBeanIntake;
	}

	public void setBeanKidneyBeanIntake(Double beanKidneyBeanIntake) {
		this.beanKidneyBeanIntake = beanKidneyBeanIntake;
	}

	public Double getBeanSoyMilkIntake() {
		return this.beanSoyMilkIntake;
	}

	public void setBeanSoyMilkIntake(Double beanSoyMilkIntake) {
		this.beanSoyMilkIntake = beanSoyMilkIntake;
	}

	public Double getBeanTofuPiIntake() {
		return this.beanTofuPiIntake;
	}

	public void setBeanTofuPiIntake(Double beanTofuPiIntake) {
		this.beanTofuPiIntake = beanTofuPiIntake;
	}

	public Double getBeanSuJiIntake() {
		return this.beanSuJiIntake;
	}

	public void setBeanSuJiIntake(Double beanSuJiIntake) {
		this.beanSuJiIntake = beanSuJiIntake;
	}

	public Double getBeanXiaoDouZhouIntake() {
		return this.beanXiaoDouZhouIntake;
	}

	public void setBeanXiaoDouZhouIntake(Double beanXiaoDouZhouIntake) {
		this.beanXiaoDouZhouIntake = beanXiaoDouZhouIntake;
	}

	public Double getBeanDouShaIntake() {
		return this.beanDouShaIntake;
	}

	public void setBeanDouShaIntake(Double beanDouShaIntake) {
		this.beanDouShaIntake = beanDouShaIntake;
	}

	public Double getBeanZhaCandouIntake() {
		return this.beanZhaCandouIntake;
	}

	public void setBeanZhaCandouIntake(Double beanZhaCandouIntake) {
		this.beanZhaCandouIntake = beanZhaCandouIntake;
	}

	public Double getBeanDouzhiIntake() {
		return this.beanDouzhiIntake;
	}

	public void setBeanDouzhiIntake(Double beanDouzhiIntake) {
		this.beanDouzhiIntake = beanDouzhiIntake;
	}

	public Double getBeanJiangyouganIntake() {
		return this.beanJiangyouganIntake;
	}

	public void setBeanJiangyouganIntake(Double beanJiangyouganIntake) {
		this.beanJiangyouganIntake = beanJiangyouganIntake;
	}

	public Double getBeanXunganIntake() {
		return this.beanXunganIntake;
	}

	public void setBeanXunganIntake(Double beanXunganIntake) {
		this.beanXunganIntake = beanXunganIntake;
	}

	public Double getBeanChouganIntake() {
		return this.beanChouganIntake;
	}

	public void setBeanChouganIntake(Double beanChouganIntake) {
		this.beanChouganIntake = beanChouganIntake;
	}

	public Double getBeanBiandouIntake() {
		return this.beanBiandouIntake;
	}

	public void setBeanBiandouIntake(Double beanBiandouIntake) {
		this.beanBiandouIntake = beanBiandouIntake;
	}

	public Double getBeanWandouIntake() {
		return this.beanWandouIntake;
	}

	public void setBeanWandouIntake(Double beanWandouIntake) {
		this.beanWandouIntake = beanWandouIntake;
	}

	public Double getBeanKaocandouIntake() {
		return this.beanKaocandouIntake;
	}

	public void setBeanKaocandouIntake(Double beanKaocandouIntake) {
		this.beanKaocandouIntake = beanKaocandouIntake;
	}

	public Double getBeanOtherIntake() {
		return this.beanOtherIntake;
	}

	public void setBeanOtherIntake(Double beanOtherIntake) {
		this.beanOtherIntake = beanOtherIntake;
	}

}