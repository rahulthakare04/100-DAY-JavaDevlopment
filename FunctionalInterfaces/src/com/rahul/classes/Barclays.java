package com.rahul.classes;

import com.rahul.interfaces.Bancking;

public class Barclays implements Bancking {

	@Override
	public String calcIntereset(double balance) {
		// TODO Auto-generated method stub
		double interest;
		interest=balance*7/100;
		return "interest will be "+interest;
	}

}
