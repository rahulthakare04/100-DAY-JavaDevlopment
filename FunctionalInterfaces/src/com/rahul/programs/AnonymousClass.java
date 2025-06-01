package com.rahul.programs;

import com.rahul.interfaces.Bancking;

public class AnonymousClass {
public static void main(String[] args) {
	Bancking sbi=new Bancking() {
		
		@Override
		public String calcIntereset(double balance) {
			// TODO Auto-generated method stub
				double interest=balance*4/100;
				
			return "SBI offer interest "+interest;
		}
	};
	System.out.println(sbi.calcIntereset(250000));
}
}
