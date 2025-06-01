package com.rohan.string;

import java.util.Scanner;

public class PasswordChack {
public static void main(String[] args) {
	String ops="rahul@1234";
	String ups;
	
	Scanner sc=new Scanner(System.in);
	System.out.print("enter your password : ");
	ups=sc.nextLine();
	
	if(ups.equals(ops)) {
		System.out.println("password is correct ");
	}
	else {
		System.out.println("passwors is not correct ");
	}
	sc.close();
}
}
