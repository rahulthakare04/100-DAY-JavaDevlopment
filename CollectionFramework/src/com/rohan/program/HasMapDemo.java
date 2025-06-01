package com.rohan.program;

import java.util.HashMap;

public class HasMapDemo {
public static void main(String[] args) {
	HashMap<String, String> users=new HashMap<String, String>();
	users.put("praffull", "chelsea");
	users.put("rahul", "thalare");
	users.put("om", "kale");
	users.put("rohan", "uke");
	users.put("akshay","ringne");
	
	System.out.println(users);
	System.out.println(users.get("rahul"));
	System.out.println(users.get("om"));
	System.out.println(users.getOrDefault("amar", "not found"));
}
}
