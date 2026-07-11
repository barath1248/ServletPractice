package com.bean;

import java.io.Serializable;

@SuppressWarnings("serial")
public class ProductBean implements Serializable {
	private String P_CODE;
	private String P_NAME;
	private String P_COMPANY;
	private String P_PRICE;
	private String P_QTY;

	public ProductBean() {
	}

	public String getP_CODE() {
		return P_CODE;
	}

	public void setP_CODE(String PCODE) {
		P_CODE = PCODE;
	}

	public String getP_NAME() {
		return P_NAME;
	}

	public void setP_NAME(String p_NAME) {
		P_NAME = p_NAME;
	}

	public String getP_COMPANY() {
		return P_COMPANY;
	}

	public void setP_COMPANY(String p_COMPANY) {
		P_COMPANY = p_COMPANY;
	}

	public String getP_PRICE() {
		return P_PRICE;
	}

	public void setP_PRICE(String p_PRICE) {
		P_PRICE = p_PRICE;
	}

	public String getP_QTY() {
		return P_QTY;
	}

	public void setP_QTY(String p_QTY) {
		P_QTY = p_QTY;
	}

}

//alt+shift+s-->setters and getters