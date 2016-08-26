package com.pregnant.health.bean;

import java.util.List;

/**
 * 字典表目录
 * @author lk
 *
 */
public class DictCatalog implements java.io.Serializable {
	//主键
	private Integer id;
	//名称 例如：（抽烟习惯）
	private String name;
	//名称英文标识
	private String code;
	//对应数据库中表名称
	private String tableName;
	//描述
	private String remark;
	//添加时间
	private String addTime;
	//更新时间
	private String updateTime;
	//包含明细
	private List<DictList> children;
	
	/** default constructor */
	public DictCatalog() {
	}

	/** minimal constructor */
	public DictCatalog(Integer id) {
		this.id = id;
	}
	
	/** full constructor */
	public DictCatalog(Integer id, String name, String code, String tableName,
			String remark, String addTime, String updateTime) {
		super();
		this.id = id;
		this.name = name;
		this.code = code;
		this.tableName = tableName;
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getTableName() {
		return tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
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

	public List<DictList> getChildren() {
		return children;
	}

	public void setChildren(List<DictList> children) {
		this.children = children;
	}
	
}
