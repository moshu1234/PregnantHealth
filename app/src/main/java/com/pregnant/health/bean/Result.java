package com.pregnant.health.bean;
/**
 * 返回结果类
 * @author lk
 *
 * @param <T>
 */
public class Result<T> {

	//操作是否成功
	private boolean success;
	//结果描述
	private String message;
	//返回结果
	private T result;

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public T getResult() {
		return result;
	}

	public void setResult(T result) {
		this.result = result;
	}

}
