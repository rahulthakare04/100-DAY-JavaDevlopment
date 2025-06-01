package com.rohan.program;

import java.util.Stack;

public class StaclDemo {
public static void main(String[] args) {
	Stack<String> tech=new Stack<String>();
	tech.push("azur");
	tech.push("spring");
	tech.push("spark");
	tech.push("openai");
	tech.push(null);
	tech.push("spring");
	
	System.out.println(tech);
	
	tech.pop();
	System.out.println(tech);
}
}
