package com.keizruniversity.beans;

public class Student {
	
	private int studentID;
	private String fname; 
	private String lname; 
	private Address address; 
	private String doB; 
	private String sex; 
	private String category;
	private String nationality; 
	private String currentStatus; 
	private Course course; 
	private Advisor advisor; 
	private String img;

	public Student(){}
	
	public Student(int studentID, String fname, String lname, Address address, String doB, String sex, String category,
			 String nationality, String currentStatus, Course course, Advisor advisor, String img) {
		
		this.studentID = studentID;
		this.fname = fname; 
		this.lname = lname; 
		this.address = address; 
		this.doB = doB; 
		this.sex = sex; 
		this.category = category;
		this.nationality = nationality; 
		this.currentStatus = currentStatus; 
		this.course = course; 
		this.advisor = advisor; 
		this.img = img;
	}
	
	

	public int getStudentID() {
		return studentID;
	}

	public void setStudentID(int studentID) {
		this.studentID = studentID;
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

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getDoB() {
		return this.doB;
	}

	public void setDoB(String doB) {
		this.doB = doB;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getCurrentStatus() {
		return currentStatus;
	}

	public void setCurrentStatus(String currentStatus) {
		this.currentStatus = currentStatus;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public Advisor getAdvisor() {
		return advisor;
	}

	public void setAdvisor(Advisor advisor) {
		this.advisor = advisor;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}
	
	

}
