package com.ajay.practice.misc;

import java.util.HashMap;

/*
 * Given a Json String, find its sum by depth. 
 * Input: {{1,2},2,{1,2}}  Depth:1 -> 2, Depth: 2 -> 6
 */
public class FindSumByDepth {
	
	private static final String START = "{";
	private static final String END = "}";
	private static HashMap<Integer, Integer> map;
	
	public FindSumByDepth(){
		map = new HashMap<Integer, Integer>();
	}
	
	private void insert(int depth, int value){
		if(map.containsKey(depth)){
			Integer val = map.get(depth);
			val += value;
			map.put(depth, val);
		}
		
		else{
			map.put(depth, value);
		}
		
	}
	
	public void stringParser(String text){
		int depth = 0;
		char[] inputText = text.toCharArray();
		for(int i=0;i<inputText.length; i++){
			if(Character.toString(inputText[i]).equals(START)){
				depth++;
				continue;
			}
			
			if(Character.toString(inputText[i]).equals(END)){
				depth--;
				continue;
			}
			
			if(depth>0 && Character.isDigit(inputText[i])){
				insert(depth, Character.getNumericValue(inputText[i]));
			}
			
		}
	}
	
	public static void main(String[] args) {
		String input = "{{1,2},2,{1,2}}";
		FindSumByDepth sum = new FindSumByDepth();
		sum.stringParser(input);
		
		for(int i: map.keySet()){
			System.out.println(i + ":" + map.get(i));

		}
	}
}
