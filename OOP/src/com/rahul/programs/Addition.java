package com.rahul.programs;

import java.util.Scanner;

import com.rahul.classes.Calculater;

public class Addition {
public static void main(String[] args) {
	int a,b;
	Scanner sc=new Scanner(System.in);
	
	System.out.print("enter first number: ");
	a=sc.nextInt();
	System.out.print("enter second number: ");
	b=sc.nextInt();
	
	Calculater cal=new Calculater();
	cal.calSum(a, b);
	sc.close();
	
}
}
