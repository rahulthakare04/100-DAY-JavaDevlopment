package com.rahul.programs;

import com.rahul.classes.Barclays;

public class InterfaceDemo {
	public static void main(String[] args) {
		Barclays obj=new Barclays();
		String meg=obj.calcIntereset(300000);
		System.out.println(meg);
	}
}
