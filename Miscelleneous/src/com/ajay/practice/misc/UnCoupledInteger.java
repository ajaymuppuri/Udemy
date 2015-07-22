package com.ajay.practice.misc;

import java.util.HashSet;
import java.util.Set;

public class UnCoupledInteger {

	private Set<Integer> checkUncoupledInteger(int[] data){
		Set<Integer> s = new HashSet<Integer>();
		for (int i = 0; i < data.length; i++) {
			int input = data[i];	
			if(s.contains(input)){
				s.remove(input);
			}
			else{
				s.add(input);
			}
		}
		return s;
	}
	
	public static void main(String[] args) {
		int[] input = {1,4,2,4,1,7,2};
		UnCoupledInteger unc = new UnCoupledInteger();
		Set<Integer> reply = unc.checkUncoupledInteger(input);
		reply.forEach(System.out::println);
	}
}
