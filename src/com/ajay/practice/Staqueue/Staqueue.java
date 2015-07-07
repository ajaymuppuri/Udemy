package com.ajay.practice.Staqueue;

import java.util.Stack;


/*
 * Implement a queue with 2 stacks
 */
public class Staqueue {

	private Stack<String> stack1 = new Stack<String>();
	private Stack<String> stack2 = new Stack<String>();
	
	public void enqueue(String item){
		if(item!=null){
			stack1.push(item);
		}
	}
	
	public String dequeue(){
		while(stack1.size()!=0){
			String item = stack1.pop();
			stack2.push(item);
		}
		
		String itemToReturn =  stack2.pop();
		
		while(stack2.size()!=0){
			String item = stack2.pop();
			stack1.push(item);
		}
		
		return itemToReturn;
	}

	public static void main(String[] args) {
		Staqueue sta = new Staqueue();
		sta.enqueue("a");
		sta.enqueue("b");
		sta.enqueue("c");
		System.out.println(sta.dequeue());
	}
}
