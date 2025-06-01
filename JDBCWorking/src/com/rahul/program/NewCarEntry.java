package com.rahul.program;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class NewCarEntry {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String id ,nm,co;
	float pr;
	System.out.println("enter carID: ");
	id=sc.nextLine();
	System.out.println("enter model name: ");
	nm=sc.nextLine();
	System.out.println("enter company: ");
	co=sc.nextLine();
	System.out.println("enter the price:");
	pr=sc.nextInt();
	    
	//-------------------------------------------
	
	Connection con;
	PreparedStatement pst;
	
	try
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://mysql-java-rahuljavaproject.h.aivencloud.com:25222/rahuldb?user=rahul&password=AVNS_41Lj9VHeZMrU1uyf7Iy");
		pst=con.prepareStatement("insert into cars values(?,?,?,?)");
		pst.setString(1, id);
		pst.setString(2, nm);
		pst.setString(3, co);
		pst.setFloat(4, pr);
		pst.executeUpdate();
		
		System.out.println("new car are inserted successfully");
	}
	
	catch(Exception e)
	{
		System.out.println(e);
	}
}
}
