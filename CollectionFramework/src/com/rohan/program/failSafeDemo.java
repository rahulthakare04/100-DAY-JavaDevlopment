package com.rohan.program;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class failSafeDemo {
public static void main(String[] args) {
	CopyOnWriteArrayList<String> list=new CopyOnWriteArrayList<String>();
	list.add("rahul");
	list.add("ram");
	list.add("om");
	list.add("dhiraj");
	list.add("rohan");
	list.add("aditya");
	
	Iterator<String> iterator=list.iterator();
	while(iterator.hasNext())
	{
		System.out.println(iterator.next());
		if(!list.contains("akshay"))
		list.add("akshay");
	}
	
	System.out.println("\n upadataed list-");
	System.out.println(list);
}
}
