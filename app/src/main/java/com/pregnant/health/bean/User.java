package com.pregnant.health.bean;

/**
 * Created by cws on 2016/4/23.
 */
public class User {
    private String basicId;  // 基本信息编号
    private String medicalRecordNumber;  // 医院档案编号
    private String sign;    // 0-来源PC,1-来源APP
    private String mobilePhone;  // 手机号
    private String name;   // 姓名
    private int height;  // 身高
    private long birthDate;  //  出生年月
    private long lastMenses;  //  末次月经
    private String profession;  // 职业
    private String education;   //  文化程度
    private String nationality;  //  民族
    private String email;   // 邮箱
    private String bloodType;  //  血型
    private String deleteTag;  //  删除标记
    private String createId;   //  创建者标号
    private String createTime;  //  创建时间
    private String lastUpdateId;  //  最后修改者编号
    private String lastUpdateTime;  // 最后修改时间
    private String uploadTag;  // 上传同步标记
    private String basicInfoRecordedState;  // 基本信息录入状态（1未录入）
    private String pregnancyState;  // 受孕状态
    private String patientId;  //
    private String hospitalCaseNum;  // 住院案例编号
    private String certificateType;
    private String certificateNum;
    private String weightBefPregnancy;

    public String getBasicId() {
        return basicId;
    }

    public void setBasicId(String basicId) {
        this.basicId = basicId;
    }

    public String getMedicalRecordNumber() {
        return medicalRecordNumber;
    }

    public void setMedicalRecordNumber(String medicalRecordNumber) {
        this.medicalRecordNumber = medicalRecordNumber;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public long getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(long birthDate) {
        this.birthDate = birthDate;
    }

    public long getLastMenses() {
        return lastMenses;
    }

    public void setLastMenses(long lastMenses) {
        this.lastMenses = lastMenses;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBloodType() {
        return bloodType;
    }

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }

    public String getDeleteTag() {
        return deleteTag;
    }

    public void setDeleteTag(String deleteTag) {
        this.deleteTag = deleteTag;
    }

    public String getCreateId() {
        return createId;
    }

    public void setCreateId(String createId) {
        this.createId = createId;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getLastUpdateId() {
        return lastUpdateId;
    }

    public void setLastUpdateId(String lastUpdateId) {
        this.lastUpdateId = lastUpdateId;
    }

    public String getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(String lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    public String getUploadTag() {
        return uploadTag;
    }

    public void setUploadTag(String uploadTag) {
        this.uploadTag = uploadTag;
    }

    public String getBasicInfoRecordedState() {
        return basicInfoRecordedState;
    }

    public void setBasicInfoRecordedState(String basicInfoRecordedState) {
        this.basicInfoRecordedState = basicInfoRecordedState;
    }

    public String getPregnancyState() {
        return pregnancyState;
    }

    public void setPregnancyState(String pregnancyState) {
        this.pregnancyState = pregnancyState;
    }

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public String getHospitalCaseNum() {
        return hospitalCaseNum;
    }

    public void setHospitalCaseNum(String hospitalCaseNum) {
        this.hospitalCaseNum = hospitalCaseNum;
    }

    public String getCertificateType() {
        return certificateType;
    }

    public void setCertificateType(String certificateType) {
        this.certificateType = certificateType;
    }

    public String getCertificateNum() {
        return certificateNum;
    }

    public void setCertificateNum(String certificateNum) {
        this.certificateNum = certificateNum;
    }

    public String getWeightBefPregnancy() {
        return weightBefPregnancy;
    }

    public void setWeightBefPregnancy(String weightBefPregnancy) {
        this.weightBefPregnancy = weightBefPregnancy;
    }
}
