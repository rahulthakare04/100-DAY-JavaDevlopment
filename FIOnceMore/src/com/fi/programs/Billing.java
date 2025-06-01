package com.fi.programs;

import com.fi.classes.Walmart;

public class Billing {
public static void main(String[] args) {
	Walmart obj=new Walmart();
	System.out.println("Discount is "+obj.calcDiscount(45000));
}
}
