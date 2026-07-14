package com.bean;

import java.io.Serializable;

@SuppressWarnings("serial")
public class UserBean  implements Serializable{
	private String ub_username;
	private String ub_password;
	private String ub_firstname;
	private String ub_lastname;
	private String ub_mailid;
	private String ub_phone;

	public UserBean() {
	}

	public String getUb_username() {
		return ub_username;
	}

	public void setUb_username(String ub_username) {
		this.ub_username = ub_username;
	}

	public String getUb_password() {
		return ub_password;
	}

	public void setUb_password(String ub_password) {
		this.ub_password = ub_password;
	}

	public String getUb_firstname() {
		return ub_firstname;
	}

	public void setUb_firstname(String ub_firstname) {
		this.ub_firstname = ub_firstname;
	}

	public String getUb_lastname() {
		return ub_lastname;
	}

	public void setUb_lastname(String ub_lastname) {
		this.ub_lastname = ub_lastname;
	}

	public String getUb_mailid() {
		return ub_mailid;
	}

	public void setUb_mailid(String ub_mailid) {
		this.ub_mailid = ub_mailid;
	}

	public String getUb_phone() {
		return ub_phone;
	}

	public void setUb_phone(String ub_phone) {
		this.ub_phone = ub_phone;
	}

}
