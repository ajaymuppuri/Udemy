package com.ajay.practice.i18n;

import java.util.HashSet;

public class i18n {
	
	public HashSet<String> getI18nvalues(String input){
		HashSet<String> out = new HashSet<String>();
		for(int i=1; i<=input.length()-2;i++){
			for(int j=1; (j+i)<=input.length()-1;j++){
				StringBuffer sb = new StringBuffer();
				sb.append(input.substring(0, j));
				sb.append(i);
				sb.append(input.substring(j+i, input.length()));
				System.out.println(sb.toString());
			}
		}
		return out;
	}

	
	
	
	public static void main(String[] args) {
		i18n n = new i18n();
		HashSet<String> ret = n.getI18nvalues("careercup");
		for(String r : ret){
			System.out.println(r);
			
		}
	}
}
