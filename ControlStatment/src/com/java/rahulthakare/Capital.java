package com.java.rahulthakare;
import java.util.Scanner;
public class Capital {
public static void main(String[] args) {
	String contry;
	Scanner sc=new Scanner(System.in);
	System.out.print("enter the country name ");
	contry=sc.nextLine();
	
	switch(contry)
	{
		case "usa":
		 	System.out.println("capital is wasinten DC");
		 	break;
		case "germany":
			System.out.println("capital is berlin");
		 	break;
		case "pakistan":
			System.out.println("captital is eslamabad");
			break;
		default:
		System.out.println("imformation not found");
		
		sc.close();
		
	}
	
	
}
}

