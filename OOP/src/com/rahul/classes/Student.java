package com.rahul.classes;

public class Student {
	public Student(String schoolName) {
		System.out.println("welcome to "+schoolName);
	}
	public void showResult(int mark) {
		if(mark>=35)
			System.out.println("your are pass");
		else
			System.out.println("your are faild");
	}
}
