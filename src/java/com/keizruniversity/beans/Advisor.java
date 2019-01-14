package com.keizruniversity.beans;

public class Advisor {
	
	private String fname; 
	private String lname; 
	private String position; 
	private String departName; 
	private String phoneNum;
	private String img;
	
	public Advisor() {}

	public Advisor(String fname, String lname, String position, String departName, String phoneNum, String img) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.position = position;
		this.departName = departName;
		this.phoneNum = phoneNum;
		this.img = img;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getDepartName() {
		return departName;
	}

	public void setDepartName(String departName) {
		this.departName = departName;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}
	
	
}
