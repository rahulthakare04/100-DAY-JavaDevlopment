package com.rohan.program;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
public static void main(String[] args) {
	LinkedHashSet<String> set=new LinkedHashSet<String>();
	set.add("london");
	set.add("mumbai");
	set.add("tokyo");
	set.add("berlin");
	set.add(null);
	System.out.println(set);
}
}
