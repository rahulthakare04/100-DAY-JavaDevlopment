package com.java.rahul;

import java.util.Scanner;

public class Integerarray {
public static void main(String[] args) {
	int [] arr=new int[5];
	int [] num= {78,56,11,48,96};
	Scanner sc=new Scanner(System.in);
	System.out.print("enter the number: ");
	for(int i=0;i<arr.length;i++) {
		arr[i]=sc.nextInt();
	}
	
	System.out.println("element in arr is : ");
	
	for(int i=0;i<arr.length;i++) {
		System.out.print(arr[i]+" ");
	}
	System.out.println();
	System.out.println("----------------");
	
	for(int val:arr) {
		System.out.print(val+" ");
	}
	
	
}
}