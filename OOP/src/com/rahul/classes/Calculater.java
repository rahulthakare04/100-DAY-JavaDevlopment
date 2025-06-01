package com.rahul.classes;

public class Calculater {
	private int result;
	
	public Calculater() {
		result=0;
		System.out.println("welcome to calculater class");
	}
	public void calSum(int a,int b) {
		int c=a+b;
		System.out.println("sum is "+c);
	}
	public void calSquare(int n) {
		int sq=n*n;
		System.out.println("square is "+sq);
	}
	
}
