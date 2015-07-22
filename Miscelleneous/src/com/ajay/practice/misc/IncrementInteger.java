package com.ajay.practice.misc;

/*
 * You are given an array representing integer. Write function
 * which increments this integer
 * Example: input [1,2,3] (represent 123) -> output [1,2,4]
 * @author amuppuri
 */

public class IncrementInteger {
	
	public void increment(int[] data){
		int add=1;
		int carry=add;
		int length = data.length;
		boolean inc = true;
		for(int d: data){
			if(d!=9){
				inc = false;
			}
		}
		
		if(inc){
			length+=1;
		}
		
		int[] newArr = new int[length];
		
		for(int i=data.length-1, j=newArr.length-1;i>=0;i--,j-- ){
			int in = (data[i]+carry)%10;
			carry = (data[i]+carry)/10;
			newArr[j]=in;
			if(j>i){
				newArr[0]=1;
			}
				
		}
		
		for(int k: newArr){
			System.out.println(k);
		}
	}
	
	public static void main(String[] args) {
		int[] input = {0,9,9};
		//             0 1 2
		//             0 1 2 3 
		
		IncrementInteger i = new IncrementInteger();
		i.increment(input);
	}
}
