package com.ajay.practice.searching;

import java.util.Arrays;

/*
 * Implement binary searcg
 */
public class BinarySearch {
	
/*
 * Read	an array as input and returns the index of the found
 * element, -1 if not found. 
 */
	private int binarySearch(int[] data, int value){
		int low = 0;
		int high = data.length-1;
		
		while(low <= high){
			int middle = low + (high-low)/2;
			if(value>data[middle]) low = middle+1;
			else if(value<data[middle]) high = middle-1;
			else return middle;
		}
		
		return -1;
	}
	
	public static void main(String[] args) {
		int[] input = {2,6,4,9,1,7,3};
		Arrays.sort(input);
		BinarySearch s = new BinarySearch();
		System.out.println(s.binarySearch(input, 9));
	}
}
