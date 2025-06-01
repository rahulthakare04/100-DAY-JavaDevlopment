package com.rahul.programs;

import com.rahul.classes.Player;

public class EnglishFootbol {
public static void main(String[] args) {
	Player p1=new Player("messy",36,"argentina","nigthwhach","striker");
	System.out.println(p1);
	
	Player p2=new Player();
	p2.setPlayername("ronaldo");
	p2.setAge(39);
	p2.setCountry("poetugal");
	p2.setClube("fight clube");
	p2.setPostion("striker");
	System.out.println(p2);
	System.out.println("player name :"+p2.getPlayername());
	System.out.println("country : "+p2.getCountry());
	
}
}
