package com.rahul.program;
import java.sql.*;
public class JoinSelect {
public static void main(String[] args) {
	Connection con;
	Statement st;
	ResultSet rs;
	
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://mysql-java-rahuljavaproject.h.aivencloud.com:25222/rahuldb?user=rahul&password=AVNS_41Lj9VHeZMrU1uyf7Iy");
		st=con.createStatement();
		rs=st.executeQuery("select customers.custnm,cars.modelnm,cars.company,cars.price from customers inner join cars on customers.carid=cars.carid");
		 while(rs.next()) {
			 System.out.println(rs.getString("custnm")+ " || "+rs.getString("modelnm"));
		 }
	
	}
	catch(Exception e) {
		System.out.println(e);
	}
}
}
