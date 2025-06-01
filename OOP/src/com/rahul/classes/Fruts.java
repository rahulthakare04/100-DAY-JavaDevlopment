package com.rahul.classes;
  public class Fruts{
	public static void main(String[] args) {
		Apple obj=new Apple();
		obj.setColor("red");
		System.out.println(obj.color);
	}
}
 class Rahul {

	String color;
	public void setColor(String color) {
		this.color=color;
		System.out.println("color is: "+color);
	}
	
}
 class Apple extends Rahul{
	public void setSize() {
		System.out.println("size is 10");
	}
}
