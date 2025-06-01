package com.rahul.programs;

import com.rahul.interfaces.Bancking;

public class LambdaExpression {
public static void main(String[] args) {
	Bancking obj=(double balance)->{
		double interest=balance*5/100;
		return "interest in post is "+interest;
	};
	System.out.println(obj.calcIntereset(150000));
}
}
