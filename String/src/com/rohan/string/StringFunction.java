package com.rohan.string;

public class StringFunction {
public static void main(String[] args) {
	String nm="RahulThakare";
	String pincode="443404";
	String password="rahul@1234";
	String slogan="the man who return from the death";
	String s="";
	String obj=new String("king in the north");
	
	System.out.println(nm.length());
	System.out.println(nm.charAt(1));
	System.out.println(nm.toUpperCase());
	System.out.println(nm.toLowerCase());
	System.out.println(slogan.contains("return"));
	System.out.println(slogan.startsWith("the"));
	System.out.println(slogan.endsWith("man"));
	
	System.out.println(nm.equals("RahulThakare"));
	System.out.println(nm.equalsIgnoreCase("rahulthakare"));
	
	System.out.println(nm.indexOf("l"));
	System.out.println(nm.lastIndexOf("l"));
	
	System.out.println(s.isEmpty());
	String res=obj.replace("north", "seven kingdom");
	System.out.println(res);
	System.out.println("--------------------");
	
	String emp="913,rahul,male,devlopment,java fevloper,pune,85000.00";
	String [] word=emp.split(",");
	for(String val:word) {
		System.out.print(val+" ");
	}
	System.out.println();
	
	String clube="           rahul";
	System.out.println(clube.trim());
	
	int x=786;
	String y=String.valueOf(x);
	System.out.println(y.substring(1));
	
}
}
