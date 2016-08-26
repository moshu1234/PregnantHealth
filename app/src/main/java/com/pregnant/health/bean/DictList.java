package com.pregnant.health.bean;
/**
 * 字典表明细
 * @author lk
 *
 */
public class DictList implements java.io.Serializable {

	// 主键
	private Integer id;
	// 目录标识
	private String code;
	// 显示标题,用于设定选项名称 例如：（不抽、5支以下...）
	private String caption;
	// 默认值 用于设定选项默认的值
	private String defaultValue;
	// 对应数据库表中的字段
	private String fieldName;
	// 描述
	private String remark;
	// 添加时间
	private String addTime;
	// 更新时间
	private String updateTime;
	
	/** default constructor */
	public DictList() {
	}

	/** minimal constructor */
	public DictList(Integer id) {
		this.id = id;
	}

	/** full constructor */
	public DictList(Integer id, String code, String caption,
			String defaultValue, String fieldName, String remark,
			String addTime, String updateTime) {
		super();
		this.id = id;
		this.code = code;
		this.caption = caption;
		this.defaultValue = defaultValue;
		this.fieldName = fieldName;
		this.remark = remark;
		this.addTime = addTime;
		this.updateTime = updateTime;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getCaption() {
		return caption;
	}

	public void setCaption(String caption) {
		this.caption = caption;
	}

	public String getDefaultValue() {
		return defaultValue;
	}

	public void setDefaultValue(String defaultValue) {
		this.defaultValue = defaultValue;
	}

	public String getFieldName() {
		return fieldName;
	}

	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getAddTime() {
		return addTime;
	}

	public void setAddTime(String addTime) {
		this.addTime = addTime;
	}

	public String getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}
	
}
