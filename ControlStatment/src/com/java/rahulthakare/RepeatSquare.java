package com.java.rahulthakare;

import java.util.Scanner;

public class RepeatSquare {
public static void main(String[] args) {
	int n=1,sq;
	Scanner sc=new Scanner(System.in);
	
	while(n>0) {
		System.out.print("enter the nimber ");
		n=sc.nextInt();
		sq=n*n;
		System.out.println("the square is "+sq);
	}
	sc.close();
}
}
