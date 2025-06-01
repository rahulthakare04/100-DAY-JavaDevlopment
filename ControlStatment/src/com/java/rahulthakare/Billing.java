package com.java.rahulthakare;

import java.util.Scanner;

public class Billing {
public static void main(String[] args) {
	String custname;
	int amount,discount,netbill;
	Scanner sc=new Scanner(System.in);
	System.out.print("enter the custmer name ");
	custname=sc.nextLine();
	System.out.print("enter the purchas amount ");
	amount=sc.nextInt();
	if(amount>20000) {
		System.out.println("discount applied 13 % ");
		discount=amount*10/100;
		
	}
	else{
		System.out.println("discount appliesd 9 % ");
		discount=amount*9/100;
		
		
	}
	netbill=amount+discount;
	System.out.println("--------------------");
	System.out.println("custmer name: "+custname);
	System.out.println("custmer discount: "+discount);
	System.out.println("custmer netbill: "+netbill);
	sc.close();
	
}
}
