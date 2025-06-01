package com.java.rahulthakare;

import java.util.Scanner;

public class StudentRsulat {
public static void main(String[] args) {
	String nm;
	int mark;
	Scanner sc=new Scanner(System.in);
	System.out.print("enter the name ");
	nm=sc.nextLine();
	System.out.print("enter the mark of student ");
	mark=sc.nextInt();
	if(mark>35)
		System.out.println("you are pass "+nm);
	else
		System.out.println("your are faile "+nm);
	sc.close();
	
}
}
