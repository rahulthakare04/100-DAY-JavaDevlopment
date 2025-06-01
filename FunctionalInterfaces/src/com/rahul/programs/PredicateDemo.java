package com.rahul.programs;

import java.util.function.Predicate;

public class PredicateDemo {
public static void main(String[] args) {
	Predicate<String> obj=(String passward)->{
		if(passward.equals("rahul"))
			return true;
		else
			return false;
	};
	System.out.println(obj.test("rohan"));
}
}
