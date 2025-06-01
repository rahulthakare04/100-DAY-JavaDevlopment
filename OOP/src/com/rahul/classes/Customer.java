package com.rahul.classes;

public class Customer {
	private String custname;
	private double purchamt;
	
	public Customer() {
		custname="";
		purchamt=0;
	}
	public Customer(String custname,double purchamt) {
		this.custname=custname;
		this.purchamt=purchamt;
		
	}
	public void showvalue() {
		System.out.println("customer name : "+custname);
		System.out.println("purches amt : "+purchamt);
	}
	
	
}
