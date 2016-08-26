package com.pregnant.health.bean;

import java.util.Map;

/**
 * 常规调查对应实体类
 * 
 * @author lk
 *
 */
public class GeneralSurvey {

	// 表名
	public String tableName;
	// 全局档案编号
	private String globalRecordNr;
	// 检测次数
	private String inspectionOrder;
	// 记录时间 (格式：yyyy-MM-dd或yyyy-MM-dd HH:mm:ss)
	public String recordTime;
	// 来源
	public String sign;
	// key字段名，value字段值（时间类型格式：yyyy-MM-dd或yyyy-MM-dd HH:mm:ss）
	public Map<String, String> field;

	public String getTableName() {
		return tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

	public String getGlobalRecordNr() {
		return globalRecordNr;
	}

	public void setGlobalRecordNr(String globalRecordNr) {
		this.globalRecordNr = globalRecordNr;
	}

	public String getInspectionOrder() {
		return inspectionOrder;
	}

	public void setInspectionOrder(String inspectionOrder) {
		this.inspectionOrder = inspectionOrder;
	}

	public String getRecordTime() {
		return recordTime;
	}

	public void setRecordTime(String recordTime) {
		this.recordTime = recordTime;
	}

	public String getSign() {
		return sign;
	}

	public void setSign(String sign) {
		this.sign = sign;
	}

	public Map<String, String> getField() {
		return field;
	}

	public void setField(Map<String, String> field) {
		this.field = field;
	}

}
