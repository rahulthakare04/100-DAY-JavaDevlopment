package com.java.rahul;

import java.util.Scanner;

public class StringArray {
	public static void main(String[] args) {
		//String nms[]= {"rahul","om","rohan","ram","virat","akshay"};
		String[] nms=new String [5]; 
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<=4;i++) {
			System.out.print("enter the name : ");
			nms[i]=sc.nextLine();
		}
//		for(int i=0;i<=4;i++) {
//			System.out.println(nms[i]);
//		}
	for(String val:nms) {
		System.out.println(val);
	}
	sc.close();
			
		}

}
