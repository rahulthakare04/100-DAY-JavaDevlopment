package com.rohan.program;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {
public static void main(String[] args) {
	LinkedList<String> names=new LinkedList<String>();
	names.add("english");
	names.add("urdu");
	names.add("german");
	names.add("urdu");
	names.add(null);
	names.set(1, "spanish");
	names.remove("urdu");
	System.out.println(names);
	
	Iterator<String> iterator=names.iterator();
	while(iterator.hasNext())
		System.out.println(iterator.next());

	}
}
