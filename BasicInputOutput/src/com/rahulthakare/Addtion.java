package com.rahulthakare;

import java.util.Scanner;

public class Addtion {
public static void main(String[] args) {
	float x,y,z;
	Scanner sc=new Scanner(System.in);
	System.out.print("enter the first number ");
	x=sc.nextFloat();
	System.out.print("enter the second number ");
	y=sc.nextFloat();
	z=x+y;
	System.out.println("addition of two number is "+z);
	sc.close();
	
}
}
