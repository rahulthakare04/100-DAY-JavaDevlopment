package com.rahul.programs;

import java.util.function.Consumer;

public class ConsumerDemo {
public static void main(String[] args) {
	Consumer<Integer> obj=(Integer num)->{
		int sq=num*num;
		System.out.println("square is "+sq);
	};
	obj.accept(5);
}
}
