package com.rohan.program;

import java.util.TreeSet;

public class TreeSetDemo {
public static void main(String[] args) {
	TreeSet<String> set=new TreeSet<String>();
	set.add("london");
	set.add("mumbai");
	set.add("tokyo");
	set.add("berlin");
	//set.add(null); not allow
	System.out.println(set);
	System.out.println(set.first());
	System.out.println(set.last());
	
	System.out.println(set.pollFirst());
	System.out.println(set.pollLast());
	System.out.println(set);
}
}
