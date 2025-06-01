package com.rahul.program;
import java.sql.*;
public class SelectCustomers {
public static void main(String[] args) {
	Connection con;
	Statement st;
	ResultSet rs;
	
	try
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://mysql-java-rahuljavaproject.h.aivencloud.com:25222/rahuldb?user=rahul&password=AVNS_41Lj9VHeZMrU1uyf7Iy");
		st=con.createStatement();
		rs=st.executeQuery("select * from customers");
		
		while(rs.next()) {
			System.out.println(rs.getString("custnm")+" || "+rs.getString("city"));
		}
	}
	catch(Exception e) {
		System.out.println(e);
	}
	
}
}
