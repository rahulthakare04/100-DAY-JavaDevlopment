package com.rohan.program;

import java.util.Iterator;
import java.util.TreeMap;

public class TreeMapDemo {
public static void main(String[] args) {
	TreeMap<String, String> users=new TreeMap<String, String>();
	users.put("praffull", "chelsea");
	users.put("rahul", "thalare");
	users.put("om", "kale");
	users.put("rohan", "uke");
	users.put("akshay","ringne");
	System.out.println(users);
	
	Iterator<String> iterator=users.keySet().iterator();
	while(iterator.hasNext())
		System.out.println(iterator.next());
}
}
