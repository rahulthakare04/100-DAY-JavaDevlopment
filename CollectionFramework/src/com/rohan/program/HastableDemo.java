package com.rohan.program;

import java.util.Hashtable;
import java.util.Iterator;

public class HastableDemo {
public static void main(String[] args) {
	Hashtable<Integer, String> ht=new Hashtable<Integer, String>();
	ht.put(9, "rahul");
	ht.put(26, "rohan");
	ht.put(13,"om");
	ht.put(1, "akshay");
	ht.putIfAbsent(0, "sakshi");
	ht.remove(9);
	System.out.println(ht);
	
	System.out.println(ht.keys());
	
	Iterator<Integer> itrk=ht.keys().asIterator();
	while(itrk.hasNext())
		System.out.println(itrk.next());
	
	Iterator<String> itrv=ht.values().iterator();
	while(itrv.hasNext())
		System.out.println(itrv.next());
	
	System.out.println(ht.get(13));
	System.out.println(ht.contains("joe root"));
	
	
}
}
