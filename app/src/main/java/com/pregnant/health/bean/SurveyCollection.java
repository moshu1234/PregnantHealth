package com.pregnant.health.bean;

import com.alibaba.fastjson.JSON;

import java.sql.Timestamp;
import java.util.List;

/**
 * 调查结果集合
 * 包含生活习惯调查/既往现病史/膳食调查_主食类/膳食调查_豆类及制品/膳食调查_蔬菜类/膳食调查_禽畜类及制品
 * /膳食调查_水产类/膳食调查_油脂/调料/饮料类/膳食调查_水果类/膳食调查_坚果类/膳食调查_膳食增补剂
 * /膳食调查_蛋类/乳制品类/饮食习惯检测/体检测/运动情况调查/实验室检测记录/主诉症状调查表
 * @author lk
 *
 */
public class SurveyCollection {
	/**
	 * 从json字符串转化为SurveyCollection对象
	 * @param jsonStr
	 * @return
	 */
	public static SurveyCollection getInstanceFromJson(String jsonStr){
		return JSON.parseObject(jsonStr, SurveyCollection.class);
	}

	//膳食调查_豆类及制品
	private List<BeanFoodInspection> beanFoodInspection;
	//体检测
	private List<BodyIngredientInspection> bodyIngredientInspection;
	//饮食习惯检测
	private List<DietHabitInspection> dietHabitInspection;
	//既往现病史
	private List<DiseaseHistoryRecord> diseaseHistoryRecord;
	//膳食调查_油脂/调料/饮料类
	private List<DrinkOilFoodInspection> drinkOilFoodInspection;
	//膳食调查_蛋类/乳制品类
	private List<EggMilkInspection> eggMilkInspection;
	//膳食调查_水果类
	private List<FruitInspection> fruitInspection;
	//生活习惯调查
	private List<LifeHabbitInspection> lifeHabbitInspection;
	//膳食调查_禽畜类及制品
	private List<LivestockFoodInspection> livestockFoodInspection;
	//膳食调查_膳食增补剂
	private List<NurtureInspection> nurtureInspection;
	//膳食调查_坚果类
	private List<NutInspection> nutInspection;
	//实验室检测记录
	private List<PhysiqueCheckRecord> physiqueCheckRecord;
	//膳食调查_水产类
	private List<SeaFoodInspection> seaFoodInspection;
	//运动情况调查
	private List<SportConditionInspection> sportConditionInspection;
	//膳食调查_主食类
	private List<StapleFoodInspection> stapleFoodInspection;
	//主诉症状调查表
	private List<StatementSymptomRecord> statementSymptomRecord;
	//膳食调查_蔬菜类
	private List<VegetableFoodInspection> vegetableFoodInspection;

	public List<BeanFoodInspection> getBeanFoodInspection() {
		return beanFoodInspection;
	}

	public void setBeanFoodInspection(List<BeanFoodInspection> beanFoodInspection) {
		this.beanFoodInspection = beanFoodInspection;
	}

	public List<BodyIngredientInspection> getBodyIngredientInspection() {
		return bodyIngredientInspection;
	}

	public void setBodyIngredientInspection(
			List<BodyIngredientInspection> bodyIngredientInspection) {
		this.bodyIngredientInspection = bodyIngredientInspection;
	}

	public List<DietHabitInspection> getDietHabitInspection() {
		return dietHabitInspection;
	}

	public void setDietHabitInspection(List<DietHabitInspection> dietHabitInspection) {
		this.dietHabitInspection = dietHabitInspection;
	}

	public List<DiseaseHistoryRecord> getDiseaseHistoryRecord() {
		return diseaseHistoryRecord;
	}

	public void setDiseaseHistoryRecord(
			List<DiseaseHistoryRecord> diseaseHistoryRecord) {
		this.diseaseHistoryRecord = diseaseHistoryRecord;
	}

	public List<DrinkOilFoodInspection> getDrinkOilFoodInspection() {
		return drinkOilFoodInspection;
	}

	public void setDrinkOilFoodInspection(
			List<DrinkOilFoodInspection> drinkOilFoodInspection) {
		this.drinkOilFoodInspection = drinkOilFoodInspection;
	}

	public List<EggMilkInspection> getEggMilkInspection() {
		return eggMilkInspection;
	}

	public void setEggMilkInspection(List<EggMilkInspection> eggMilkInspection) {
		this.eggMilkInspection = eggMilkInspection;
	}

	public List<FruitInspection> getFruitInspection() {
		return fruitInspection;
	}

	public void setFruitInspection(List<FruitInspection> fruitInspection) {
		this.fruitInspection = fruitInspection;
	}

	public List<LifeHabbitInspection> getLifeHabbitInspection() {
		return lifeHabbitInspection;
	}

	public void setLifeHabbitInspection(
			List<LifeHabbitInspection> lifeHabbitInspection) {
		this.lifeHabbitInspection = lifeHabbitInspection;
	}

	public List<LivestockFoodInspection> getLivestockFoodInspection() {
		return livestockFoodInspection;
	}

	public void setLivestockFoodInspection(
			List<LivestockFoodInspection> livestockFoodInspection) {
		this.livestockFoodInspection = livestockFoodInspection;
	}

	public List<NurtureInspection> getNurtureInspection() {
		return nurtureInspection;
	}

	public void setNurtureInspection(List<NurtureInspection> nurtureInspection) {
		this.nurtureInspection = nurtureInspection;
	}

	public List<NutInspection> getNutInspection() {
		return nutInspection;
	}

	public void setNutInspection(List<NutInspection> nutInspection) {
		this.nutInspection = nutInspection;
	}

	public List<PhysiqueCheckRecord> getPhysiqueCheckRecord() {
		return physiqueCheckRecord;
	}

	public void setPhysiqueCheckRecord(List<PhysiqueCheckRecord> physiqueCheckRecord) {
		this.physiqueCheckRecord = physiqueCheckRecord;
	}

	public List<SeaFoodInspection> getSeaFoodInspection() {
		return seaFoodInspection;
	}

	public void setSeaFoodInspection(List<SeaFoodInspection> seaFoodInspection) {
		this.seaFoodInspection = seaFoodInspection;
	}

	public List<SportConditionInspection> getSportConditionInspection() {
		return sportConditionInspection;
	}

	public void setSportConditionInspection(
			List<SportConditionInspection> sportConditionInspection) {
		this.sportConditionInspection = sportConditionInspection;
	}

	public List<StapleFoodInspection> getStapleFoodInspection() {
		return stapleFoodInspection;
	}

	public void setStapleFoodInspection(
			List<StapleFoodInspection> stapleFoodInspection) {
		this.stapleFoodInspection = stapleFoodInspection;
	}

	public List<StatementSymptomRecord> getStatementSymptomRecord() {
		return statementSymptomRecord;
	}

	public void setStatementSymptomRecord(
			List<StatementSymptomRecord> statementSymptomRecord) {
		this.statementSymptomRecord = statementSymptomRecord;
	}

	public List<VegetableFoodInspection> getVegetableFoodInspection() {
		return vegetableFoodInspection;
	}

	public void setVegetableFoodInspection(
			List<VegetableFoodInspection> vegetableFoodInspection) {
		this.vegetableFoodInspection = vegetableFoodInspection;
	}

	public String toJsonStr(){
		return JSON.toJSONString(this);
	}
	
//	public static void main(String args[]){
		DietarySurveyID dietarySurveyID = new DietarySurveyID("12345678", 1, 0, new Timestamp(System.currentTimeMillis()));
//		GeneralSurveyID generalSurveyID = new GeneralSurveyID("12345678", 1);
//		//膳食调查_豆类及制品
//		BeanFoodInspection beanFoodInspection = new BeanFoodInspection(dietarySurveyID);
//		//体检测
//		BodyIngredientInspection bodyIngredientInspection = new BodyIngredientInspection(generalSurveyID);
//		//饮食习惯检测
//		DietHabitInspection dietHabitInspection = new DietHabitInspection(generalSurveyID);
//		//既往现病史
//		DiseaseHistoryRecord diseaseHistoryRecord = new DiseaseHistoryRecord(generalSurveyID);
//		//膳食调查_油脂/调料/饮料类
//		DrinkOilFoodInspection drinkOilFoodInspection = new DrinkOilFoodInspection(dietarySurveyID);
//		//膳食调查_蛋类/乳制品类
//		EggMilkInspection eggMilkInspection = new EggMilkInspection(dietarySurveyID);
//		//膳食调查_水果类
//		FruitInspection fruitInspection = new FruitInspection(dietarySurveyID);
//		//生活习惯调查
//		LifeHabbitInspection lifeHabbitInspection = new LifeHabbitInspection(generalSurveyID);
//		//膳食调查_禽畜类及制品
//		LivestockFoodInspection livestockFoodInspection = new LivestockFoodInspection(dietarySurveyID);
//		//膳食调查_膳食增补剂
//		NurtureInspection nurtureInspection = new NurtureInspection(dietarySurveyID);
//		nurtureInspection.setAymsintake(12.34);
//		//膳食调查_坚果类
//		NutInspection nutInspection = new NutInspection(dietarySurveyID);
//		//实验室检测记录
//		PhysiqueCheckRecord physiqueCheckRecord = new PhysiqueCheckRecord(generalSurveyID);
//		//膳食调查_水产类
//		SeaFoodInspection seaFoodInspection = new SeaFoodInspection(dietarySurveyID);
//		//运动情况调查
//		SportConditionInspection sportConditionInspection = new SportConditionInspection(generalSurveyID);
//		//膳食调查_主食类
//		StapleFoodInspection stapleFoodInspection = new StapleFoodInspection(dietarySurveyID);
//		//主诉症状调查表
//		StatementSymptomRecord statementSymptomRecord = new StatementSymptomRecord(generalSurveyID);
//		//膳食调查_蔬菜类
//		VegetableFoodInspection vegetableFoodInspection = new VegetableFoodInspection(dietarySurveyID);
//		SurveyCollection sc = new SurveyCollection();
//		sc.setBeanFoodInspection(beanFoodInspection);
//		sc.setBodyIngredientInspection(bodyIngredientInspection);
//		sc.setDietHabitInspection(dietHabitInspection);
//		sc.setDiseaseHistoryRecord(diseaseHistoryRecord);
//		sc.setDrinkOilFoodInspection(drinkOilFoodInspection);
//		sc.setEggMilkInspection(eggMilkInspection);
//		sc.setFruitInspection(fruitInspection);
//		sc.setLifeHabbitInspection(lifeHabbitInspection);
//		sc.setLivestockFoodInspection(livestockFoodInspection);
//		sc.setNurtureInspection(nurtureInspection);
//		sc.setNutInspection(nutInspection);
//		sc.setPhysiqueCheckRecord(physiqueCheckRecord);
//		sc.setSeaFoodInspection(seaFoodInspection);
//		sc.setSportConditionInspection(sportConditionInspection);
//		sc.setStapleFoodInspection(stapleFoodInspection);
//		sc.setStatementSymptomRecord(statementSymptomRecord);
//		sc.setVegetableFoodInspection(vegetableFoodInspection);
//		System.out.println(sc.toJsonStr());
//	}
	
}
