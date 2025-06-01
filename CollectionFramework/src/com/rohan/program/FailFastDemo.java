package com.rohan.program;

import java.util.ArrayList;
import java.util.Iterator;

public class FailFastDemo {
public static void main(String[] args) {
	ArrayList<String> list=new ArrayList<String>();
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
		list.add("akashay");
		//java.util.ConcurrentModificationException
	}
}
}
