package com.keizruniversity.beans;

public class Course {
	
	private String courseNum;
	private String course;
	private String courseYr;
	private String instructor;
	private String roomNum;
	private String departName;
	
	public Course() {}

	public Course(String courseNum, String course, String courseYr, String instructor, String roomNum,
			String departName) {
		super();
		this.courseNum = courseNum;
		this.course = course;
		this.courseYr = courseYr;
		this.instructor = instructor;
		this.roomNum = roomNum;
		this.departName = departName;
	}

	public String getCourseNum() {
		return courseNum;
	}

	public void setCourseNum(String courseNum) {
		this.courseNum = courseNum;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getCourseYr() {
		return courseYr;
	}

	public void setCourseYr(String courseYr) {
		this.courseYr = courseYr;
	}

	public String getInstructor() {
		return instructor;
	}

	public void setInstructor(String instructor) {
		this.instructor = instructor;
	}

	public String getRoomNum() {
		return roomNum;
	}

	public void setRoomNum(String roomNum) {
		this.roomNum = roomNum;
	}

	public String getDepartName() {
		return departName;
	}

	public void setDepartName(String departName) {
		this.departName = departName;
	}
	
	
}
