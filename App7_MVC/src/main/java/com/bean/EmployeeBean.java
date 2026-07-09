package com.bean;
import java.io.Serializable;

@SuppressWarnings("serial")
public class EmployeeBean implements Serializable {
	private String e_id;
	private String e_fname;
	private String e_lname;
	private int e_sal;
	private String e_address;

	public EmployeeBean() {

	}

	public String getE_id() {
		return e_id;
	}

	public void setE_id(String e_id) {
		this.e_id = e_id;
	}

	public String getE_fname() {
		return e_fname;
	}

	public void setE_fname(String e_fname) {
		this.e_fname = e_fname;
	}

	public String getE_lname() {
		return e_lname;
	}

	public void setE_lname(String e_lname) {
		this.e_lname = e_lname;
	}

	public int getE_sal() {
		return e_sal;
	}

	public void setE_sal(int e_sal) {
		this.e_sal = e_sal;
	}

	public String getE_address() {
		return e_address;
	}

	public void setE_address(String e_address) {
		this.e_address = e_address;
	}

}
