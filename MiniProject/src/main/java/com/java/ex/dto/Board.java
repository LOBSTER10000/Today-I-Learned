package com.java.ex.dto;

import java.util.Date;

public class Board {
	private int boardNum;
	private String boardHeader;
	private String boardContent;
	private Date boardTime;
	private String userId;
	
	public Board(int boardNum, String boardHeader, String boardContent, Date boardTime, String userId) {
		super();
		this.boardNum = boardNum;
		this.boardHeader = boardHeader;
		this.boardContent = boardContent;
		this.boardTime = boardTime;
		this.userId = userId;
	}

	public Board() {
		super();
	}

	public String getBoardHeader() {
		return boardHeader;
	}

	public void setBoardHeader(String boardHeader) {
		this.boardHeader = boardHeader;
	}

	public String getBoardContent() {
		return boardContent;
	}

	public void setBoardContent(String boardContent) {
		this.boardContent = boardContent;
	}

	public Date getBoardTime() {
		return boardTime;
	}

	public void setBoardTime(Date boardTime) {
		this.boardTime = boardTime;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public int getBoardNum() {
		return boardNum;
	}

	public void setBoardNum(int boardNum) {
		this.boardNum = boardNum;
	}
	
	
}
