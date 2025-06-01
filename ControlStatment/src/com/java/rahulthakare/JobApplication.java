package com.java.rahulthakare;

import java.util.Scanner;

public class JobApplication {
public static void main(String[] args) {
	String name;
	int age,experience;
	Scanner sc=new Scanner(System.in);
	System.out.print("enter the name ");
	name=sc.nextLine();
	System.out.print("enter the age ");
	age=sc.nextInt();
	System.out.print("enter the experience ");
	experience=sc.nextInt();
	
	if(age<=40  && experience>5) {
		System.out.println("you are elligible ");
		
	}
	else {
		System.out.println("your are not elligible ");
	}
	
	sc.close();
	
	
}
}
