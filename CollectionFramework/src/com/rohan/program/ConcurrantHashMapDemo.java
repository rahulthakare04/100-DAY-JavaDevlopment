package com.rohan.program;

import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrantHashMapDemo {
public static void main(String[] args) {
	ConcurrentHashMap<String, String> users=new ConcurrentHashMap<String, String>();
	users.put("praffull", "chelsea");
	users.put("rahul", "thalare");
	users.put("om", "kale");
	users.put("rohan", "uke");
	users.put("akshay","ringne");
	System.out.println(users);
	
	Iterator<String> iterator=users.keySet().iterator();
	while(iterator.hasNext())
	{
		System.out.println(iterator.next());
		users.put("buttler","england");
	}
	System.out.println(users);
}
}
