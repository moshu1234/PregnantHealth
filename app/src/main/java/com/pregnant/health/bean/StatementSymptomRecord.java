package com.pregnant.health.bean;

import java.sql.Timestamp;

/**
 * StatementSymptomRecord entity. @author MyEclipse Persistence Tools
 */

public class StatementSymptomRecord implements java.io.Serializable {

	// Fields

	private GeneralSurveyID id;
	private Timestamp recordTime;
	private Integer sign;
	private Integer digestiveDiarrheaTag;
	private Integer digestiveInflationTag;
	private Integer digestiveConstipationTag;
	private Integer digestiveAppetiteLossTag;
	private Integer digestiveGastricAcidGrowTag;
	private Integer immuneResistanceLowTag;
	private Integer immuneOralUlcersTag;
	private Integer skinEczemaTag;
	private Integer skinFollicularKeratosisTag;
	private Integer skinDryTag;
	private Integer skinHemorrhagicPetechiaeTag;
	private Integer skinRoughSkinTag;
	private Integer skinRashTag;
	private Integer skinPeelingTag;
	private Integer skinSquamousSkinTag;
	private Integer pregnancyReactionVeryLightTag;
	private Integer pregnancyReactionLightTag;
	private Integer pregnancyReactionHeavyTag;
	private Integer pregnancyReactionVeryHeavyTag;
	private Integer otherSymptomEdemaTag;
	private Integer otherSymptomPalpitationTag;
	private Integer otherSymptomHeartRateSlowTag;
	private Integer otherSymptomThirstPolyuriaTag;
	private Integer otherSymptomBleedingGumTag;

	// Constructors

	/** default constructor */
	public StatementSymptomRecord() {
	}

	/** minimal constructor */
	public StatementSymptomRecord(GeneralSurveyID id) {
		this.id = id;
	}

	/** full constructor */
	public StatementSymptomRecord(GeneralSurveyID id,
			Timestamp recordTime, Integer sign, Integer digestiveDiarrheaTag,
			Integer digestiveInflationTag, Integer digestiveConstipationTag,
			Integer digestiveAppetiteLossTag,
			Integer digestiveGastricAcidGrowTag,
			Integer immuneResistanceLowTag, Integer immuneOralUlcersTag,
			Integer skinEczemaTag, Integer skinFollicularKeratosisTag,
			Integer skinDryTag, Integer skinHemorrhagicPetechiaeTag,
			Integer skinRoughSkinTag, Integer skinRashTag,
			Integer skinPeelingTag, Integer skinSquamousSkinTag,
			Integer pregnancyReactionVeryLightTag,
			Integer pregnancyReactionLightTag,
			Integer pregnancyReactionHeavyTag,
			Integer pregnancyReactionVeryHeavyTag,
			Integer otherSymptomEdemaTag, Integer otherSymptomPalpitationTag,
			Integer otherSymptomHeartRateSlowTag,
			Integer otherSymptomThirstPolyuriaTag,
			Integer otherSymptomBleedingGumTag) {
		this.id = id;
		this.recordTime = recordTime;
		this.sign = sign;
		this.digestiveDiarrheaTag = digestiveDiarrheaTag;
		this.digestiveInflationTag = digestiveInflationTag;
		this.digestiveConstipationTag = digestiveConstipationTag;
		this.digestiveAppetiteLossTag = digestiveAppetiteLossTag;
		this.digestiveGastricAcidGrowTag = digestiveGastricAcidGrowTag;
		this.immuneResistanceLowTag = immuneResistanceLowTag;
		this.immuneOralUlcersTag = immuneOralUlcersTag;
		this.skinEczemaTag = skinEczemaTag;
		this.skinFollicularKeratosisTag = skinFollicularKeratosisTag;
		this.skinDryTag = skinDryTag;
		this.skinHemorrhagicPetechiaeTag = skinHemorrhagicPetechiaeTag;
		this.skinRoughSkinTag = skinRoughSkinTag;
		this.skinRashTag = skinRashTag;
		this.skinPeelingTag = skinPeelingTag;
		this.skinSquamousSkinTag = skinSquamousSkinTag;
		this.pregnancyReactionVeryLightTag = pregnancyReactionVeryLightTag;
		this.pregnancyReactionLightTag = pregnancyReactionLightTag;
		this.pregnancyReactionHeavyTag = pregnancyReactionHeavyTag;
		this.pregnancyReactionVeryHeavyTag = pregnancyReactionVeryHeavyTag;
		this.otherSymptomEdemaTag = otherSymptomEdemaTag;
		this.otherSymptomPalpitationTag = otherSymptomPalpitationTag;
		this.otherSymptomHeartRateSlowTag = otherSymptomHeartRateSlowTag;
		this.otherSymptomThirstPolyuriaTag = otherSymptomThirstPolyuriaTag;
		this.otherSymptomBleedingGumTag = otherSymptomBleedingGumTag;
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

	public Integer getDigestiveDiarrheaTag() {
		return this.digestiveDiarrheaTag;
	}

	public void setDigestiveDiarrheaTag(Integer digestiveDiarrheaTag) {
		this.digestiveDiarrheaTag = digestiveDiarrheaTag;
	}

	public Integer getDigestiveInflationTag() {
		return this.digestiveInflationTag;
	}

	public void setDigestiveInflationTag(Integer digestiveInflationTag) {
		this.digestiveInflationTag = digestiveInflationTag;
	}

	public Integer getDigestiveConstipationTag() {
		return this.digestiveConstipationTag;
	}

	public void setDigestiveConstipationTag(Integer digestiveConstipationTag) {
		this.digestiveConstipationTag = digestiveConstipationTag;
	}

	public Integer getDigestiveAppetiteLossTag() {
		return this.digestiveAppetiteLossTag;
	}

	public void setDigestiveAppetiteLossTag(Integer digestiveAppetiteLossTag) {
		this.digestiveAppetiteLossTag = digestiveAppetiteLossTag;
	}

	public Integer getDigestiveGastricAcidGrowTag() {
		return this.digestiveGastricAcidGrowTag;
	}

	public void setDigestiveGastricAcidGrowTag(
			Integer digestiveGastricAcidGrowTag) {
		this.digestiveGastricAcidGrowTag = digestiveGastricAcidGrowTag;
	}

	public Integer getImmuneResistanceLowTag() {
		return this.immuneResistanceLowTag;
	}

	public void setImmuneResistanceLowTag(Integer immuneResistanceLowTag) {
		this.immuneResistanceLowTag = immuneResistanceLowTag;
	}

	public Integer getImmuneOralUlcersTag() {
		return this.immuneOralUlcersTag;
	}

	public void setImmuneOralUlcersTag(Integer immuneOralUlcersTag) {
		this.immuneOralUlcersTag = immuneOralUlcersTag;
	}

	public Integer getSkinEczemaTag() {
		return this.skinEczemaTag;
	}

	public void setSkinEczemaTag(Integer skinEczemaTag) {
		this.skinEczemaTag = skinEczemaTag;
	}

	public Integer getSkinFollicularKeratosisTag() {
		return this.skinFollicularKeratosisTag;
	}

	public void setSkinFollicularKeratosisTag(Integer skinFollicularKeratosisTag) {
		this.skinFollicularKeratosisTag = skinFollicularKeratosisTag;
	}

	public Integer getSkinDryTag() {
		return this.skinDryTag;
	}

	public void setSkinDryTag(Integer skinDryTag) {
		this.skinDryTag = skinDryTag;
	}

	public Integer getSkinHemorrhagicPetechiaeTag() {
		return this.skinHemorrhagicPetechiaeTag;
	}

	public void setSkinHemorrhagicPetechiaeTag(
			Integer skinHemorrhagicPetechiaeTag) {
		this.skinHemorrhagicPetechiaeTag = skinHemorrhagicPetechiaeTag;
	}

	public Integer getSkinRoughSkinTag() {
		return this.skinRoughSkinTag;
	}

	public void setSkinRoughSkinTag(Integer skinRoughSkinTag) {
		this.skinRoughSkinTag = skinRoughSkinTag;
	}

	public Integer getSkinRashTag() {
		return this.skinRashTag;
	}

	public void setSkinRashTag(Integer skinRashTag) {
		this.skinRashTag = skinRashTag;
	}

	public Integer getSkinPeelingTag() {
		return this.skinPeelingTag;
	}

	public void setSkinPeelingTag(Integer skinPeelingTag) {
		this.skinPeelingTag = skinPeelingTag;
	}

	public Integer getSkinSquamousSkinTag() {
		return this.skinSquamousSkinTag;
	}

	public void setSkinSquamousSkinTag(Integer skinSquamousSkinTag) {
		this.skinSquamousSkinTag = skinSquamousSkinTag;
	}

	public Integer getPregnancyReactionVeryLightTag() {
		return this.pregnancyReactionVeryLightTag;
	}

	public void setPregnancyReactionVeryLightTag(
			Integer pregnancyReactionVeryLightTag) {
		this.pregnancyReactionVeryLightTag = pregnancyReactionVeryLightTag;
	}

	public Integer getPregnancyReactionLightTag() {
		return this.pregnancyReactionLightTag;
	}

	public void setPregnancyReactionLightTag(Integer pregnancyReactionLightTag) {
		this.pregnancyReactionLightTag = pregnancyReactionLightTag;
	}

	public Integer getPregnancyReactionHeavyTag() {
		return this.pregnancyReactionHeavyTag;
	}

	public void setPregnancyReactionHeavyTag(Integer pregnancyReactionHeavyTag) {
		this.pregnancyReactionHeavyTag = pregnancyReactionHeavyTag;
	}

	public Integer getPregnancyReactionVeryHeavyTag() {
		return this.pregnancyReactionVeryHeavyTag;
	}

	public void setPregnancyReactionVeryHeavyTag(
			Integer pregnancyReactionVeryHeavyTag) {
		this.pregnancyReactionVeryHeavyTag = pregnancyReactionVeryHeavyTag;
	}

	public Integer getOtherSymptomEdemaTag() {
		return this.otherSymptomEdemaTag;
	}

	public void setOtherSymptomEdemaTag(Integer otherSymptomEdemaTag) {
		this.otherSymptomEdemaTag = otherSymptomEdemaTag;
	}

	public Integer getOtherSymptomPalpitationTag() {
		return this.otherSymptomPalpitationTag;
	}

	public void setOtherSymptomPalpitationTag(Integer otherSymptomPalpitationTag) {
		this.otherSymptomPalpitationTag = otherSymptomPalpitationTag;
	}

	public Integer getOtherSymptomHeartRateSlowTag() {
		return this.otherSymptomHeartRateSlowTag;
	}

	public void setOtherSymptomHeartRateSlowTag(
			Integer otherSymptomHeartRateSlowTag) {
		this.otherSymptomHeartRateSlowTag = otherSymptomHeartRateSlowTag;
	}

	public Integer getOtherSymptomThirstPolyuriaTag() {
		return this.otherSymptomThirstPolyuriaTag;
	}

	public void setOtherSymptomThirstPolyuriaTag(
			Integer otherSymptomThirstPolyuriaTag) {
		this.otherSymptomThirstPolyuriaTag = otherSymptomThirstPolyuriaTag;
	}

	public Integer getOtherSymptomBleedingGumTag() {
		return this.otherSymptomBleedingGumTag;
	}

	public void setOtherSymptomBleedingGumTag(Integer otherSymptomBleedingGumTag) {
		this.otherSymptomBleedingGumTag = otherSymptomBleedingGumTag;
	}

}