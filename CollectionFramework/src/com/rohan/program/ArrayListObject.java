package com.rohan.program;

import java.util.ArrayList;
import java.util.Iterator;

import com.rahul.classes.Mobile;

public class ArrayListObject {
public static void main(String[] args) {
	Mobile m1=new Mobile("iPhone16", "apple", 12, 512, "white", 150000);
	Mobile m2=new Mobile("t3 pro g5", "vivo", 8, 64, "black", 20000);
	Mobile m3=new Mobile("galaxy f05", "samsung", 4, 64, "blue", 62000);
	
	ArrayList<Mobile> mobileList=new ArrayList<Mobile>();
	mobileList.add(m1);
	mobileList.add(m2);
	mobileList.add(m3);
	
	System.out.println(mobileList);
	
//	for(int i=0;i<mobileList.size();i++)
//		System.out.println(mobileList.get(i).getModelName());
//	
	
	Mobile obj;

	Iterator<Mobile> iterator = mobileList.iterator();
	while(iterator.hasNext())
	{
//		System.out.println(iterator.next());
		obj=iterator.next();
		System.out.println(obj.getModelName()  +"|"+  obj.getPrice());
		
	}
	
	
}
}
