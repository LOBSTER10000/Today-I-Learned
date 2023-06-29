package com.java.ex.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.java.ex.dto.User;

public class UserDao {
	private Connection conn;
	private PreparedStatement ps;
	private ResultSet rs;
	
	
	public Connection getConnection() {
	        conn = null;
	        String url = "mysql://localhost:3306/miniproject";
	        String id = "root";
	        String pw = "mysql";
	        try {
	            Class.forName("com.mysql.jdbc.Driver");
	            conn = DriverManager.getConnection(url, id, pw);
	           
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	        return conn;
	    }
	

	
	public int joinUser(User userDto) {
		int suc = 0;
		
		try {
			conn = getConnection();
			String sql = "insert into user(userId, userPass, gender) value(?,?,?)";
			ps = conn.prepareStatement(sql);
			ps.setString(1, userDto.getUserId());
			ps.setString(2, userDto.getUserPass());
			ps.setString(3, userDto.getGender());
			suc = ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return suc; 
		
	}
}
