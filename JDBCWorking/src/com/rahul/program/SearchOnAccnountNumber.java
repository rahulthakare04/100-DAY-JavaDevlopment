package com.rahul.program;
import java.sql.*;
import java.util.Scanner;

public class SearchOnAccnountNumber {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	int ano;
	System.out.print("Enter account number :");
	ano=sc.nextInt();
	
	//---------------
	
	Connection con;
	PreparedStatement pst;
	ResultSet rs;
	
	try
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://mysql-java-rahuljavaproject.h.aivencloud.com:25222/rahuldb?user=rahul&password=AVNS_41Lj9VHeZMrU1uyf7Iy");
		pst=con.prepareStatement("select * from accounts where accno=?");
		pst.setInt(1, ano);
		rs=pst.executeQuery();
		
		if(rs.next())
			System.out.println("Account name is "+rs.getString("accnm"));
		else
			System.out.println("not found ");
		
	}
	catch(Exception e) {
		System.out.println(e);
	}
}
}
