package com.fi.programs;

import com.fi.interfaces.Shopping;

public class LamdaExpression {
public static void main(String[] args) {
	Shopping obj=(double amount)->{
		double discount=amount*8/100;
		return discount;
	};
System.out.println("Discount is "+obj.calcDiscount(950000));

}

}
