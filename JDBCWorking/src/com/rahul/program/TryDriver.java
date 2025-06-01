package com.rahul.program;

public class TryDriver {
	public static void main(String[] args) {
		System.out.println("first JDBC program runing ");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

		}
		catch(ClassNotFoundException e) {
			System.out.println(e);
		}
		
	}

}
