package com.javalect.springEx.vo;

public class MemberVo {

	private String name;
	private int age;
	private int studentNum;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getStudentNum() {
		return studentNum;
	}
	public void setStudentNum(int studentNum) {
		this.studentNum = studentNum;
	}
	private MemberVo(String name, int age, int studentNum) {
		this.name = name;
		this.age = age;
		this.studentNum = studentNum;
	}
	private MemberVo() {
	}
	
	
	
}
