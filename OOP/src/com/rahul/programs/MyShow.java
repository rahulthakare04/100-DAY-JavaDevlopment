package com.rahul.programs;

import com.rahul.classes.Film;

public class MyShow {
public static void main(String[] args) {
	Film f=new Film("figth club",1998,"sci-fi","english",9.1);
	f.setFilmname("the matrix");
	f.setGenre("action");
	
	System.out.println(f.getFilmname());
	System.out.println(f.getGenre());
	
	System.out.println(f);

	
}
}
