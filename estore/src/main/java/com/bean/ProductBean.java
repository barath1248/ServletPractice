package com.bean;

import java.io.Serializable;

public class ProductBean implements Serializable {
	private String PCODE;
	private String PNAME;
	private String PCOMPANY;
	private String PPRICE;
	private String PQTY;

	public ProductBean() {
	}

	public String getPCODE() {
		return PCODE;
	}

	public void setPCODE(String pCODE) {
		PCODE = pCODE;
	}

	public String getPNAME() {
		return PNAME;
	}

	public void setPNAME(String pNAME) {
		PNAME = pNAME;
	}

	public String getPCOMPANY() {
		return PCOMPANY;
	}

	public void setPCOMPANY(String pCOMPANY) {
		PCOMPANY = pCOMPANY;
	}

	public String getPPRICE() {
		return PPRICE;
	}

	public void setPPRICE(String pPRICE) {
		PPRICE = pPRICE;
	}

	public String getPQTY() {
		return PQTY;
	}

	public void setPQTY(String pQTY) {
		PQTY = pQTY;
	}
}
