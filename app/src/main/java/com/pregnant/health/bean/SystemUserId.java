package com.pregnant.health.bean;

/**
 * SystemUserId entity. @author MyEclipse Persistence Tools
 */

public class SystemUserId implements java.io.Serializable {

	// Fields

	private Integer localUserId;
	private String name;
	private String login;

	// Constructors

	/** default constructor */
	public SystemUserId() {
	}

	/** full constructor */
	public SystemUserId(Integer localUserId, String name, String login) {
		this.localUserId = localUserId;
		this.name = name;
		this.login = login;
	}

	// Property accessors

	public Integer getLocalUserId() {
		return this.localUserId;
	}

	public void setLocalUserId(Integer localUserId) {
		this.localUserId = localUserId;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLogin() {
		return this.login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof SystemUserId))
			return false;
		SystemUserId castOther = (SystemUserId) other;

		return ((this.getLocalUserId() == castOther.getLocalUserId()) || (this
				.getLocalUserId() != null && castOther.getLocalUserId() != null && this
				.getLocalUserId().equals(castOther.getLocalUserId())))
				&& ((this.getName() == castOther.getName()) || (this.getName() != null
						&& castOther.getName() != null && this.getName()
						.equals(castOther.getName())))
				&& ((this.getLogin() == castOther.getLogin()) || (this
						.getLogin() != null && castOther.getLogin() != null && this
						.getLogin().equals(castOther.getLogin())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getLocalUserId() == null ? 0 : this.getLocalUserId()
						.hashCode());
		result = 37 * result
				+ (getName() == null ? 0 : this.getName().hashCode());
		result = 37 * result
				+ (getLogin() == null ? 0 : this.getLogin().hashCode());
		return result;
	}

}