package com.rohan.program;

import java.util.HashSet;
import java.util.Iterator;

public class HasSetDemo {
public static void main(String[] args) {
	HashSet<String> set=new HashSet<String>();
	set.add("london");
	set.add("mumbai");
	set.add("tokyo");
	set.add("berlin");
	set.add("mumbai");
	set.add(null);
	System.out.println(set.contains("hydeerabad"));
	System.out.println(set);
	
	Iterator<String> iterator=set.iterator();
	while(iterator.hasNext())
		System.out.println(iterator.next());
}
}
