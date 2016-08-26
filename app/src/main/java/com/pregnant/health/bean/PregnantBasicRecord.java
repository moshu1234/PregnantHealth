package com.pregnant.health.bean;

import java.sql.Timestamp;

/**
 * PregnantBasicRecord entity. @author MyEclipse Persistence Tools
 */

public class PregnantBasicRecord implements java.io.Serializable {

	// Fields

	private String basicId;
	private String medicalRecordNumber;
	private Integer sign;
	private String mobilePhone;
	private String name;
	private Double height;
	private Timestamp birthDate;
	private Timestamp lastMenses;
	private String profession;
	private String education;
	private String nationality;
	private String email;
	private String bloodType;
	private Integer deleteTag;
	private Integer createId;
	private Timestamp createTime;
	private Integer lastUpdateId;
	private Timestamp lastUpdateTime;
	private Integer uploadTag;
	private String basicInfoRecordedState;
	private String pregnancyState;
	private String patientId;
	private String hospitalCaseNum;
	private String certificateType;
	private String certificateNum;

	// Constructors

	/** default constructor */
	public PregnantBasicRecord() {
	}

	/** minimal constructor */
	public PregnantBasicRecord(String basicId) {
		this.basicId = basicId;
	}

	/** full constructor */
	public PregnantBasicRecord(String basicId, String medicalRecordNumber,
			Integer sign, String mobilePhone, String name, Double height,
			Timestamp birthDate, Timestamp lastMenses, String profession,
			String education, String nationality, String email,
			String bloodType, Integer deleteTag, Integer createId,
			Timestamp createTime, Integer lastUpdateId,
			Timestamp lastUpdateTime, Integer uploadTag,
			String basicInfoRecordedState, String pregnancyState,
			String patientId, String hospitalCaseNum, String certificateType,
			String certificateNum) {
		this.basicId = basicId;
		this.medicalRecordNumber = medicalRecordNumber;
		this.sign = sign;
		this.mobilePhone = mobilePhone;
		this.name = name;
		this.height = height;
		this.birthDate = birthDate;
		this.lastMenses = lastMenses;
		this.profession = profession;
		this.education = education;
		this.nationality = nationality;
		this.email = email;
		this.bloodType = bloodType;
		this.deleteTag = deleteTag;
		this.createId = createId;
		this.createTime = createTime;
		this.lastUpdateId = lastUpdateId;
		this.lastUpdateTime = lastUpdateTime;
		this.uploadTag = uploadTag;
		this.basicInfoRecordedState = basicInfoRecordedState;
		this.pregnancyState = pregnancyState;
		this.patientId = patientId;
		this.hospitalCaseNum = hospitalCaseNum;
		this.certificateType = certificateType;
		this.certificateNum = certificateNum;
	}

	// Property accessors

	public String getBasicId() {
		return this.basicId;
	}

	public void setBasicId(String basicId) {
		this.basicId = basicId;
	}

	public String getMedicalRecordNumber() {
		return this.medicalRecordNumber;
	}

	public void setMedicalRecordNumber(String medicalRecordNumber) {
		this.medicalRecordNumber = medicalRecordNumber;
	}

	public Integer getSign() {
		return this.sign;
	}

	public void setSign(Integer sign) {
		this.sign = sign;
	}

	public String getMobilePhone() {
		return this.mobilePhone;
	}

	public void setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getHeight() {
		return this.height;
	}

	public void setHeight(Double height) {
		this.height = height;
	}

	public Timestamp getBirthDate() {
		return this.birthDate;
	}

	public void setBirthDate(Timestamp birthDate) {
		this.birthDate = birthDate;
	}

	public Timestamp getLastMenses() {
		return this.lastMenses;
	}

	public void setLastMenses(Timestamp lastMenses) {
		this.lastMenses = lastMenses;
	}

	public String getProfession() {
		return this.profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}

	public String getEducation() {
		return this.education;
	}

	public void setEducation(String education) {
		this.education = education;
	}

	public String getNationality() {
		return this.nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getBloodType() {
		return this.bloodType;
	}

	public void setBloodType(String bloodType) {
		this.bloodType = bloodType;
	}

	public Integer getDeleteTag() {
		return this.deleteTag;
	}

	public void setDeleteTag(Integer deleteTag) {
		this.deleteTag = deleteTag;
	}

	public Integer getCreateId() {
		return this.createId;
	}

	public void setCreateId(Integer createId) {
		this.createId = createId;
	}

	public Timestamp getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Timestamp createTime) {
		this.createTime = createTime;
	}

	public Integer getLastUpdateId() {
		return this.lastUpdateId;
	}

	public void setLastUpdateId(Integer lastUpdateId) {
		this.lastUpdateId = lastUpdateId;
	}

	public Timestamp getLastUpdateTime() {
		return this.lastUpdateTime;
	}

	public void setLastUpdateTime(Timestamp lastUpdateTime) {
		this.lastUpdateTime = lastUpdateTime;
	}

	public Integer getUploadTag() {
		return this.uploadTag;
	}

	public void setUploadTag(Integer uploadTag) {
		this.uploadTag = uploadTag;
	}

	public String getBasicInfoRecordedState() {
		return this.basicInfoRecordedState;
	}

	public void setBasicInfoRecordedState(String basicInfoRecordedState) {
		this.basicInfoRecordedState = basicInfoRecordedState;
	}

	public String getPregnancyState() {
		return this.pregnancyState;
	}

	public void setPregnancyState(String pregnancyState) {
		this.pregnancyState = pregnancyState;
	}

	public String getPatientId() {
		return this.patientId;
	}

	public void setPatientId(String patientId) {
		this.patientId = patientId;
	}

	public String getHospitalCaseNum() {
		return this.hospitalCaseNum;
	}

	public void setHospitalCaseNum(String hospitalCaseNum) {
		this.hospitalCaseNum = hospitalCaseNum;
	}

	public String getCertificateType() {
		return this.certificateType;
	}

	public void setCertificateType(String certificateType) {
		this.certificateType = certificateType;
	}

	public String getCertificateNum() {
		return this.certificateNum;
	}

	public void setCertificateNum(String certificateNum) {
		this.certificateNum = certificateNum;
	}

}