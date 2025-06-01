package com.rohan.program;

import java.util.Iterator;
import java.util.LinkedList;

import com.rahul.classes.Mobile;

public class LisnkedListObject {
public static void main(String[] args) {
	Mobile m1=new Mobile("iPhone16", "apple", 12, 512, "white", 150000);
	Mobile m2=new Mobile("t3 pro g5", "vivo", 8, 64, "black", 20000);
	Mobile m3=new Mobile("galaxy f05", "samsung", 4, 64, "blue", 62000);
	
	LinkedList<Mobile> mobile=new LinkedList<Mobile>();
	mobile.add(m1);
	mobile.add(m2);
	mobile.add(m3);
	
	Iterator<Mobile> iterator=mobile.iterator();
	while(iterator.hasNext())
		System.out.println(iterator.next());
	
	
}
}
