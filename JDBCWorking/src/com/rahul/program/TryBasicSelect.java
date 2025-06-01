package com.rahul.program;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class TryBasicSelect {
public static void main(String[] args) {
	Connection con;
	Statement st;
	ResultSet rs;
	
	try
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://mysql-java-rahuljavaproject.h.aivencloud.com:25222/rahuldb?user=rahul&password=AVNS_41Lj9VHeZMrU1uyf7Iy");
		st=con.createStatement();
		rs=st.executeQuery("select * from students");
		System.out.println("the query was executed successfuly");
		while(rs.next()) {
			System.out.println(rs.getString("studnm")+" || "+rs.getString("course") );
			
		}
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
}
}
