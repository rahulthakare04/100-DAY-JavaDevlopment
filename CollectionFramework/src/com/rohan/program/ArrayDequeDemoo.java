package com.rohan.program;

import java.util.ArrayDeque;

public class ArrayDequeDemoo {
public static void main(String[] args) {
	ArrayDeque<String> dq=new ArrayDeque<String>();
	dq.add("java");
	dq.add("spring");
	dq.add("hibernate");
	dq.add("microservises");
	dq.add("spring");
	dq.add("mongodb");
	//dq.add(null); not allow
	System.out.println(dq);
	
	dq.addFirst("rahul");
	dq.addLast("rohan");
	
	System.out.println(dq);
	//dq.removeFirst();
	//dq.removeLast();
	
	//retrive and remove element
	System.out.println(dq.pollFirst());
	System.out.println(dq.pollLast());
	
	//retrive and maintain
	System.out.println(dq.peekFirst());
	System.out.println(dq.peekLast());
	
	
	
}
}
