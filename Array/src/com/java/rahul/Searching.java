package com.java.rahul;

import java.util.Scanner;

public class Searching {
public static void main(String[] args) {
	int[] arr= {12,36,54,78,958,17,65,45,96,33};
	Scanner sc=new Scanner(System.in);
	int n;
	boolean flag=false;
	System.out.print("enter a number: ");
	n=sc.nextInt();
	for(int i=0;i<arr.length;i++) {
		if(n==arr[i]) {
			System.out.println("number is found at index : "+i);
			flag=true;
			
		}
	}
	
	if(flag==false) {
		System.out.println("the number is not found");
	}
	
	sc.close();
}

}
