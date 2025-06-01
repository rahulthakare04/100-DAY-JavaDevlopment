package com.rahulthakare;

import java.util.Scanner;

public class SquareCalculater {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n,sq;
	System.out.print("enter the  number ");
	 n=sc.nextInt();
	sq=n*n;
	System.out.println("the square is "+sq);
	sc.close();
	
}
}
