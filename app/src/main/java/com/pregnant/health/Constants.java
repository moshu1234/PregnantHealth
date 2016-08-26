/*
 * Copyright (c) 2015 [1076559197@qq.com | tchen0707@gmail.com]
 *
 * Licensed under the Apache License, Version 2.0 (the "License”);
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.pregnant.health;

public class Constants {

    public static final int EVENT_TITLE_LEFT = 10000;
    public static final int EVENT_TITLE_RIGHT = 10001;

    // 轮播图停留时间
    public static int AUTO_TURNING_TIME = 5000;



    public static final String RESULT_CODE = "success";
    public static final String RESULT_DATA = "result";
    public static final String RESULT_DESC = "message";


    public static final String KEY_IS_FIRST_LOAD_DATA = "isFirstLoadData";

    /**
     * 主诉与病症
      */
    public static final String TABLE_STATEMENTSYMPTOMRECORD = "StatementSymptomRecord";
    // 消化系统
    public static final String CODE_DIGESTIVE = "Digestive";
    // 免疫系统
    public static final String CODE_IMMUNE = "Immune";
    // 皮肤
    public static final String CODE_SKIN = "Skin";
    // 妊娠反应
    public static final String CODE_PREGNANCYREACTION = "PregnancyReaction";
    // 其他症状
    public static final String CODE_OTHERSYMPTOM = "OtherSymptom";

    /**
     * 既往现病史
     */
    public static final String TABLE_DISEASEHISTORYRECORD = "DiseaseHistoryRecord";
    // 既往现病史
    public static final String CODE_DISEASEHISTORYRECORD = "DiseaseHistoryRecord";

    /**
     * 实验室检测
     */
    public static final String TABLE_PHYSIQUECHECKRECORD = "PhysiqueCheckRecord";
    // 实验室检测
    public static final String CODE_PHYSIQUECHECKRECORD = "PhysiqueCheckRecord";

    /**
     * 饮食习惯
     */
    public static final String TABLE_DIETHABITINSPECTION = "DietHabitInspection";
    // 饮食口味
    public static final String CODE_TASTES = "Tastes";
    // 不良饮食嗜好
    public static final String CODE_HOBBY = "Hobby";
    // 其他
    public static final String CODE_OTHERHABIT = "OtherHabit";

    /**
     * 生活习惯
     */
    public static final String TABLE_LIFEHABBITINSPECTION = "LifeHabbitInspection";
    // 抽烟习惯
    public static final String CODE_SMOKEHABIT = "SmokeHabit";
    // 咖啡习惯
    public static final String CODE_COFFEEHABIT = "CoffeeHabit";
    // 经常熬夜
    public static final String CODE_STAYUPALLNIGHT = "StayUpAllNight";
    // 饮酒习惯
    public static final String CODE_WINEHABIT = "WineHabit";
    // 是否服用膳食增补剂
    public static final String CODE_NOURISHMENTYESORNO = "NourishmentYesOrNo";

    /**
     * 运动情况调查
     */
    public static final String TABLE_SPORTCONDITIONINSPECTION = "SportConditionInspection";
    // 职业
    public static final String CODE_PROFESSION = "Profession";
    // 睡眠时间
    public static final String CODE_SLEEP = "Sleep";
    // 职业工作时间
    public static final String CODE_PROFESSIONTIME = "ProfessionTime";
    // 运动调查
    public static final String CODE_STEPCOUNT = "StepCount";


    /**
     * 膳食调查_主食类
     */
    public static final String TABLE_STAPLEFOODINSPECTION = "StapleFoodInspection";
    public static final String CODE_STAPLEFOODINSPECTION = "StapleFoodInspection";

    /**
     * 膳食调查_豆类及制品
     */
    public static final String TABLE_BEANFOODINSPECTION = "BeanFoodInspection";
    public static final String CODE_BEANFOODINSPECTION = "BeanFoodInspection";
    /**
     * 膳食调查_蔬菜类
     */
    public static final String TABLE_VEGETABLEFOODINSPECTION = "VegetableFoodInspection";
    public static final String CODE_VEGETABLEFOODINSPECTION = "VegetableFoodInspection";

    /**
     * 膳食调查_禽畜类及制品
     */
    public static final String TABLE_LIVESTOCKFOODINSPECTION = "LivestockFoodInspection";
    public static final String CODE_LIVESTOCKFOODINSPECTION = "LivestockFoodInspection";

    /**
     * 膳食调查_水产类
     */
    public static final String TABLE_SEAFOODINSPECTION = "SeaFoodInspection";
    public static final String CODE_SEAFOODINSPECTION = "SeaFoodInspection";

    /**
     * 膳食调查_水果类
     */
    public static final String TABLE_FRUITINSPECTION = "FruitInspection";
    public static final String CODE_FRUITINSPECTION = "FruitInspection";

    /**
     * 膳食调查_蛋类/乳制品类
     */
    public static final String TABLE_EGGMILKINSPECTION = "EggMilkInspection";
    public static final String CODE_EGGMILKINSPECTION = "EggMilkInspection";

    /**
     * 膳食调查_油脂/调料/饮料类
     */
    public static final String TABLE_DRINKOILFOODINSPECTION = "DrinkOilFoodInspection";
    public static final String CODE_DRINKOILFOODINSPECTION = "DrinkOilFoodInspection";

    /**
     * 膳食调查_坚果类
     */
    public static final String TABLE_NUTINSPECTION = "NutInspection";
    public static final String CODE_NUTINSPECTION = "NutInspection";

    /**
     * 膳食调查_膳食增补剂
     */
    public static final String TABLE_NURTUREINSPECTION = "NurtureInspection";
    public static final String CODE_NURTUREINSPECTION = "NurtureInspection";



    public static final String KEY_ALL = "all";
    public static final String KEY_MEALS = "meals";
    public static final String KEY_SPORT = "sport";
    public static final String KEY_SPORT_SLEEP = "sport_sleep";
    public static final String KEY_SPORT_PROFESSION = "sport_profession";
    public static final String KEY_SPORT_SPORT = "sport_sport";
    public static final String KEY_ROUTINE = "routine";
    public static final String KEY_LAB = "lab";
}
