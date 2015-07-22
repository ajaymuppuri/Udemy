package com.ajay.practice.Pow;

public class Pow {
	public int getPower(int a, int b){
		if(a==0) return 0;
		int result =1;
		for(int i=1;i<=b;i++){
			result*=a;
		}
		
		return result;
	}
	
	public int getFactorial(int a){
		if(a==0) return 0;
		int result=1;
		for (int i=a;i>0;i--) {
			result*=i;
		}
		
		return result;
	}
	
	
	public static void main(String[] args) {
		Pow p = new Pow();
		//System.out.println(p.getPower(0, 0));
		System.out.println(p.getFactorial(5));
	}
}
