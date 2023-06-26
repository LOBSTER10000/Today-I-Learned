package com.java.ex.dto;

import java.util.Date;

public class Board {
	private String boardHeader;
	private String boardContent;
	private Date boardTime;
	
	public Board(String boardHeader, String boardContent, Date boardTime) {
		super();
		this.boardHeader = boardHeader;
		this.boardContent = boardContent;
		this.boardTime = boardTime;
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
	
	
}
