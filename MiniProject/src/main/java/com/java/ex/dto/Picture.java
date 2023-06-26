package com.java.ex.dto;

import java.util.Date;

public class Picture {
	
	private String pictureName;
	private String picturePath;
	private String userId;
	private Date enrollDate;
	

	public Picture(String pictureName, String picturePath, String userId, Date enrollDate) {
		super();
		this.pictureName = pictureName;
		this.picturePath = picturePath;
		this.userId = userId;
		this.enrollDate = enrollDate;
	}
	
	
	public Picture() {
		super();
	}


	public String getPictureName() {
		return pictureName;
	}
	public String getPicturePath() {
		return picturePath;
	}
	public String getUserId() {
		return userId;
	}
	public Date getEnrollDate() {
		return enrollDate;
	}
	
	public void setPictureName(String pictureName) {
		this.pictureName = pictureName;
	}
	public void setPicturePath(String picturePath) {
		this.picturePath = picturePath;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public void setEnrollDate(Date enrollDate) {
		this.enrollDate = enrollDate;
	}
	
	
	
}
