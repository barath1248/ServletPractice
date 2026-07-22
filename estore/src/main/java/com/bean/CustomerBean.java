package com.bean;

import java.io.Serializable;

@SuppressWarnings("serial")
public class CustomerBean implements Serializable {
	private String CNAME;
	private String CPASSWORD;
	private String CFNAME;
	private String CLNAME;
	private String CADDRESS;
	private String CMAILID;
	private String CMOBILE;

	public CustomerBean() {
	}

	public String getCNAME() {
		return CNAME;
	}

	public void setCNAME(String cNAME) {
		CNAME = cNAME;
	}

	public String getCPASSWORD() {
		return CPASSWORD;
	}

	public void setCPASSWORD(String cPASSWORD) {
		CPASSWORD = cPASSWORD;
	}

	public String getCFNAME() {
		return CFNAME;
	}

	public void setCFNAME(String cFNAME) {
		CFNAME = cFNAME;
	}

	public String getCLNAME() {
		return CLNAME;
	}

	public void setCLNAME(String cLNAME) {
		CLNAME = cLNAME;
	}

	public String getCADDRESS() {
		return CADDRESS;
	}

	public void setCADDRESS(String cADDRESS) {
		CADDRESS = cADDRESS;
	}

	public String getCMAILID() {
		return CMAILID;
	}

	public void setCMAILID(String cMAILID) {
		CMAILID = cMAILID;
	}

	public String getCMOBILE() {
		return CMOBILE;
	}

	public void setCMOBILE(String cMOBILE) {
		CMOBILE = cMOBILE;
	}

}
