package com.fi.programs;

import com.fi.interfaces.Shopping;

public class AnonymousDemo {
public static void main(String[] args) {
	Shopping obj=new Shopping() {
		
		@Override
		public double calcDiscount(double amount) {
			// TODO Auto-generated method stub
			double discount=amount*10/1000;
			return discount;
		}
	};
	System.out.println("Discount is "+obj.calcDiscount(70000));
}
}
