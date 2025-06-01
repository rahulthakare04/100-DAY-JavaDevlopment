package com.rahul.program;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TryConnectionWithCloudDB {
	public static void main(String[] args) {
		Connection con;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver is runing ");
			con=DriverManager.getConnection("jdbc:mysql://mysql-java-rahuljavaproject.h.aivencloud.com:25222/rahuldb?user=rahul&password=AVNS_41Lj9VHeZMrU1uyf7Iy");
			System.out.println("connection estabilis");
		} catch(ClassNotFoundException e) {
			System.out.println("error loding JDBC driver"+e);
		} catch (SQLException e) {
			System.out.println("error in connection "+e);
			
		}
	}
	
}
