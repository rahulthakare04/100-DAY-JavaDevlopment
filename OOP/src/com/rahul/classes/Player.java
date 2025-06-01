package com.rahul.classes;

public class Player {
	private String playername;
	private int age;
	private String country;
	private String clube;
	private String postion;
	
	public Player() {
		System.out.println("welcome to playerleg");
	}
	
	public Player(String playername, int age, String country, String clube, String postion) {
		super();
		this.playername = playername;
		this.age = age;
		this.country = country;
		this.clube = clube;
		this.postion = postion;
	}
	public void setPlayername(String playername) {
		this.playername = playername;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public void setClube(String clube) {
		this.clube = clube;
	}
	public void setPostion(String postion) {
		this.postion = postion;
	}
	public String getPlayername() {
		return playername;
	}
	public int getAge() {
		return age;
	}
	public String getCountry() {
		return country;
	}
	public String getClube() {
		return clube;
	}
	public String getPostion() {
		return postion;
	}
	@Override
	public String toString() {
		return "Player [playername=" + playername + ", age=" + age + ", country=" + country + ", clube=" + clube
				+ ", postion=" + postion + "]";
	}
	
	

}
