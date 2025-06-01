package com.rahulthakare;
import java.util.Scanner;
public class Discount {
	public static void main(String[] args) {
		double amount,discount;
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the amount ");
		amount=sc.nextDouble();
		discount=amount*13/100;
		System.out.print("the discount is "+discount);
		sc.close();
		
		
	}

}
