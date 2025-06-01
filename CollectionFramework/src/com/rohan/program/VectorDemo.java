package com.rohan.program;

import java.util.Iterator;
import java.util.Vector;

public class VectorDemo {
public static void main(String[] args) {
	Vector<String> player=new Vector<String>();
	player.add("roghit");
	player.add("virat");
	player.add("rishabh");
	player.add("rahul");
	player.add(null);
	player.add(1,"shubhman");
	System.out.println(player);
	
	player.addElement("shreysh");
	System.out.println(player);
	System.out.println(player.elementAt(4));
	player.insertElementAt("hardik",5);
	System.out.println(player);
//	player.removeAll(player)
	
	
	
	Iterator<String> iterator=player.iterator();
	while(iterator.hasNext())
		System.out.println(iterator.next());
}
}
