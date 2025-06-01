package com.rohan.program;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListBasic {
public static void main(String[] args) {
	ArrayList<String> names=new ArrayList<String>();
	System.out.println(names.isEmpty());
	names.add("rahul");
	names.add("rohan");
	names.add("om");
	names.add("ragat");
	names.add("sanchit");
//	System.out.println(names);
	names.add(null);
	names.add("rohan");
	System.out.println(names);
	names.remove(5);
	System.out.println(names);
	names.set(3, "tony");
	System.out.println(names);
	Collections.sort(names);
	System.out.println(names);
	System.out.println(names.size());
	names.clear();
	
	
	ArrayList<Integer> nums=new ArrayList<Integer>();
    nums.add(9);
    nums.add(36);
    nums.add(25);
    nums.add(25);
    System.out.println(nums);
    
    for(int i=0;i<nums.size();i++)
    	System.out.println(nums.get(i));

}
}
