package com.cf.test;

import java.io.Serializable;

public class Customer implements Serializable{

	private String name;
	private String email;
	private transient String password = "jsdhf77";//null
	private static String ssn ="XXXXN";//default
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
}
