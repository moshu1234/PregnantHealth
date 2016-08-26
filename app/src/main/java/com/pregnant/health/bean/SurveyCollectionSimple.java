package com.pregnant.health.bean;

import com.alibaba.fastjson.JSON;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 调查结果集合优化版
 * 
 * @author lk
 *
 */
public class SurveyCollectionSimple {

	/**
	 * 从json字符串转化为SurveyCollection对象
	 * 
	 * @param jsonStr
	 * @return
	 */
	public static SurveyCollectionSimple getInstanceFromJson(String jsonStr) {
		return JSON.parseObject(jsonStr, SurveyCollectionSimple.class);
	}

	/**
	 * 转化为json字符串
	 * 
	 * @return
	 */
	public String toJsonStr() {
		return JSON.toJSONString(this);
	}

	// 常规调查集合
	private List<GeneralSurvey> generalSurveyList;
	// 膳食调查集合
	private List<DietarySurvey> dietarySurveyList;

	public List<GeneralSurvey> getGeneralSurveyList() {
		return generalSurveyList;
	}

	public void setGeneralSurveyList(List<GeneralSurvey> generalSurveyList) {
		this.generalSurveyList = generalSurveyList;
	}

	public List<DietarySurvey> getDietarySurveyList() {
		return dietarySurveyList;
	}

	public void setDietarySurveyList(List<DietarySurvey> dietarySurveyList) {
		this.dietarySurveyList = dietarySurveyList;
	}

	public static void main(String args[]){
		SurveyCollectionSimple scs = new SurveyCollectionSimple();
		List<GeneralSurvey> list = new ArrayList<GeneralSurvey>();
		GeneralSurvey generalSurvey = new GeneralSurvey();
		generalSurvey.setTableName("DiseaseHistoryRecord");
		generalSurvey.setGlobalRecordNr("123456");
		generalSurvey.setInspectionOrder("1");
		generalSurvey.setRecordTime("2016-01-01");
		generalSurvey.setSign("1");
		Map<String,String> map = new HashMap<String,String>();
		map.put("EyeDryEyeTag", "1");
		map.put("BloodHypoglycemiaTag", "1");
		map.put("BloodHypotensionTag", "1");
		map.put("BloodHypertensionTag", "1");
		map.put("BloodHypercholesterolemiaTag", "1");
		map.put("BloodHyperlipidemiaTag", "1");
		map.put("BloodCardiovascularDiseaseTag", "1");
		map.put("SkinSeborrheicDermatitisTag", "1");
		map.put("SkinDermatitisTag", "1");
		map.put("OtherGlucoseToleranceDecreaseTag", "1");
		map.put("FattyLiver", "1");
		map.put("otherDiabetesTag", "1");
		generalSurvey.setField(map);
		list.add(generalSurvey);
		scs.setGeneralSurveyList(list);
		System.out.println(scs.toJsonStr());
		System.out.println(JSON.toJSON(map));
		System.out.println("");
	}
}
