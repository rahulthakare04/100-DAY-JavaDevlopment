package com.java.rahul;

public class SortingArray {
public static void main(String[] args) {
	int [] arr= {12,99,78,65,78,63,25,41,56,85,41,22,36,54,1};
	int i,j,temp;
	for(i=0;i<arr.length-1;i++) {
		for(j=i+1;j<arr.length;j++) {
			if(arr[j]<arr[i]) {
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
	}
	for(int val:arr) {
		System.out.print(val+" ");
	}
}
}
