package com.pregnant.health.bean;

import java.sql.Timestamp;

/**
 * SystemUser entity. @author MyEclipse Persistence Tools
 */

public class SystemUser implements java.io.Serializable {

	// Fields

	private SystemUserId id;
	private String password;
	private Integer localRoleId;
	private String remarks;
	private Integer deleteTag;
	private Integer createId;
	private Timestamp createTime;
	private Integer lastUpdateId;
	private Timestamp lastUpdateTime;

	// Constructors

	/** default constructor */
	public SystemUser() {
	}

	/** minimal constructor */
	public SystemUser(SystemUserId id) {
		this.id = id;
	}

	/** full constructor */
	public SystemUser(SystemUserId id, String password, Integer localRoleId,
			String remarks, Integer deleteTag, Integer createId,
			Timestamp createTime, Integer lastUpdateId, Timestamp lastUpdateTime) {
		this.id = id;
		this.password = password;
		this.localRoleId = localRoleId;
		this.remarks = remarks;
		this.deleteTag = deleteTag;
		this.createId = createId;
		this.createTime = createTime;
		this.lastUpdateId = lastUpdateId;
		this.lastUpdateTime = lastUpdateTime;
	}

	// Property accessors

	public SystemUserId getId() {
		return this.id;
	}

	public void setId(SystemUserId id) {
		this.id = id;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getLocalRoleId() {
		return this.localRoleId;
	}

	public void setLocalRoleId(Integer localRoleId) {
		this.localRoleId = localRoleId;
	}

	public String getRemarks() {
		return this.remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
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

}