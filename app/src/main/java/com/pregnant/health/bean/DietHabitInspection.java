package com.pregnant.health.bean;

import java.sql.Timestamp;

/**
 * DietHabitInspection entity. @author MyEclipse Persistence Tools
 */

public class DietHabitInspection implements java.io.Serializable {

    // Fields

    private GeneralSurveyID id;
    private Timestamp recordTime;
    private Integer sign;
    private Integer greasy;
    private Integer sweet;
    private Integer pungent;
    private Integer longTimeLf;
    private Integer repeatWashRice;
    private Integer sodaInRice;
    private Integer longTimePolishedRich;
    private Integer lessFruitVegetable;
    private Integer sodaInVegetable;
    private Integer longTimeVegetarianDiet;
    private Integer longTimeNoStaple;
    private Integer longTimeNoBreakfast;
    private Integer repeatFreeze;
    private Integer boilMilkWithBag;
    private Integer longTimeSaltFood;
    private Integer smudgFood;
    private Integer longTimeAnimalViscus;
    private Integer repeatHeatOil;

    // Constructors

    /**
     * default constructor
     */
    public DietHabitInspection() {
    }

    /**
     * minimal constructor
     */
    public DietHabitInspection(GeneralSurveyID id) {
        this.id = id;
    }

    /**
     * full constructor
     */
    public DietHabitInspection(GeneralSurveyID id, Timestamp recordTime,
                               Integer sign, Integer greasy, Integer sweet, Integer pungent,
                               Integer longTimeLf, Integer repeatWashRice, Integer sodaInRice,
                               Integer longTimePolishedRich, Integer lessFruitVegetable,
                               Integer sodaInVegetable, Integer longTimeVegetarianDiet,
                               Integer longTimeNoStaple, Integer longTimeNoBreakfast,
                               Integer repeatFreeze, Integer boilMilkWithBag,
                               Integer longTimeSaltFood, Integer smudgFood,
                               Integer longTimeAnimalViscus, Integer repeatHeatOil) {
        this.id = id;
        this.recordTime = recordTime;
        this.sign = sign;
        this.greasy = greasy;
        this.sweet = sweet;
        this.pungent = pungent;
        this.longTimeLf = longTimeLf;
        this.repeatWashRice = repeatWashRice;
        this.sodaInRice = sodaInRice;
        this.longTimePolishedRich = longTimePolishedRich;
        this.lessFruitVegetable = lessFruitVegetable;
        this.sodaInVegetable = sodaInVegetable;
        this.longTimeVegetarianDiet = longTimeVegetarianDiet;
        this.longTimeNoStaple = longTimeNoStaple;
        this.longTimeNoBreakfast = longTimeNoBreakfast;
        this.repeatFreeze = repeatFreeze;
        this.boilMilkWithBag = boilMilkWithBag;
        this.longTimeSaltFood = longTimeSaltFood;
        this.smudgFood = smudgFood;
        this.longTimeAnimalViscus = longTimeAnimalViscus;
        this.repeatHeatOil = repeatHeatOil;
    }

    // Property accessors

    public GeneralSurveyID getId() {
        return this.id;
    }

    public void setId(GeneralSurveyID id) {
        this.id = id;
    }

    public Timestamp getRecordTime() {
        return this.recordTime;
    }

    public void setRecordTime(Timestamp recordTime) {
        this.recordTime = recordTime;
    }

    public Integer getSign() {
        return this.sign;
    }

    public void setSign(Integer sign) {
        this.sign = sign;
    }

    public Integer getGreasy() {
        return this.greasy;
    }

    public void setGreasy(Integer greasy) {
        this.greasy = greasy;
    }

    public Integer getSweet() {
        return this.sweet;
    }

    public void setSweet(Integer sweet) {
        this.sweet = sweet;
    }

    public Integer getPungent() {
        return this.pungent;
    }

    public void setPungent(Integer pungent) {
        this.pungent = pungent;
    }

    public Integer getLongTimeLf() {
        return this.longTimeLf;
    }

    public void setLongTimeLf(Integer longTimeLf) {
        this.longTimeLf = longTimeLf;
    }

    public Integer getRepeatWashRice() {
        return this.repeatWashRice;
    }

    public void setRepeatWashRice(Integer repeatWashRice) {
        this.repeatWashRice = repeatWashRice;
    }

    public Integer getSodaInRice() {
        return this.sodaInRice;
    }

    public void setSodaInRice(Integer sodaInRice) {
        this.sodaInRice = sodaInRice;
    }

    public Integer getLongTimePolishedRich() {
        return this.longTimePolishedRich;
    }

    public void setLongTimePolishedRich(Integer longTimePolishedRich) {
        this.longTimePolishedRich = longTimePolishedRich;
    }

    public Integer getLessFruitVegetable() {
        return this.lessFruitVegetable;
    }

    public void setLessFruitVegetable(Integer lessFruitVegetable) {
        this.lessFruitVegetable = lessFruitVegetable;
    }

    public Integer getSodaInVegetable() {
        return this.sodaInVegetable;
    }

    public void setSodaInVegetable(Integer sodaInVegetable) {
        this.sodaInVegetable = sodaInVegetable;
    }

    public Integer getLongTimeVegetarianDiet() {
        return this.longTimeVegetarianDiet;
    }

    public void setLongTimeVegetarianDiet(Integer longTimeVegetarianDiet) {
        this.longTimeVegetarianDiet = longTimeVegetarianDiet;
    }

    public Integer getLongTimeNoStaple() {
        return this.longTimeNoStaple;
    }

    public void setLongTimeNoStaple(Integer longTimeNoStaple) {
        this.longTimeNoStaple = longTimeNoStaple;
    }

    public Integer getLongTimeNoBreakfast() {
        return this.longTimeNoBreakfast;
    }

    public void setLongTimeNoBreakfast(Integer longTimeNoBreakfast) {
        this.longTimeNoBreakfast = longTimeNoBreakfast;
    }

    public Integer getRepeatFreeze() {
        return this.repeatFreeze;
    }

    public void setRepeatFreeze(Integer repeatFreeze) {
        this.repeatFreeze = repeatFreeze;
    }

    public Integer getBoilMilkWithBag() {
        return this.boilMilkWithBag;
    }

    public void setBoilMilkWithBag(Integer boilMilkWithBag) {
        this.boilMilkWithBag = boilMilkWithBag;
    }

    public Integer getLongTimeSaltFood() {
        return this.longTimeSaltFood;
    }

    public void setLongTimeSaltFood(Integer longTimeSaltFood) {
        this.longTimeSaltFood = longTimeSaltFood;
    }

    public Integer getSmudgFood() {
        return this.smudgFood;
    }

    public void setSmudgFood(Integer smudgFood) {
        this.smudgFood = smudgFood;
    }

    public Integer getLongTimeAnimalViscus() {
        return this.longTimeAnimalViscus;
    }

    public void setLongTimeAnimalViscus(Integer longTimeAnimalViscus) {
        this.longTimeAnimalViscus = longTimeAnimalViscus;
    }

    public Integer getRepeatHeatOil() {
        return this.repeatHeatOil;
    }

    public void setRepeatHeatOil(Integer repeatHeatOil) {
        this.repeatHeatOil = repeatHeatOil;
    }

}