package com.java.ex.dto;

public class User {
	private String userId;
	private String userPass;
	private String gender;
	
	public User(String userId, String userPass, String gender) {
		super();
		this.userId = userId;
		this.userPass = userPass;
		this.gender = gender;
	}
	
	public User() {
		super();
	}
	
	public String getUserId() {
		return userId;
	}

	public String getGender() {
		return gender;
	}
	
	public String getUserPass() {
		return userPass;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public void setUserPass(String userPass) {
		this.userPass = userPass;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
	
	
}
