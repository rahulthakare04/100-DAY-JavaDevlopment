package com.rohan.program;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueDemo {
public static void main(String[] args) {
//	PriorityQueue<Integer> nums=new PriorityQueue<Integer>();
	PriorityQueue<Integer> nums=new PriorityQueue<Integer>(Comparator.reverseOrder());
	nums.add(23);
	nums.add(75);
	nums.add(9);
	nums.add(13);
	nums.add(45);
//	nums.add(null)
	nums.add(75);
	System.out.println(nums);
}
}
