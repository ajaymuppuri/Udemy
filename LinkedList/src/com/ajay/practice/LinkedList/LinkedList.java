package com.ajay.practice.LinkedList;

import com.ajay.practice.Node.Node;

public class LinkedList {
	Node head = new Node();

	/*
	 * Create a Linked List
	 */
	
	public Node createLinkedList(){
		head.setValue(0);
		Node one = new Node();
		one.setValue(1);
		Node two = new Node();
		two.setValue(2);
		Node three = new Node();
		three.setValue(3);
		head.setNext(null);
		head.setNext(one);
		one.setNext(two);
		two.setNext(three);
		three.setNext(null);
		return head;
	}
	
	/*
	 * Print a linked list 
	 */
	
	public void printLinkedList(Node head){
		if(head==null){
			System.out.println("List is Empty! ");
		}
		else{
			System.out.print(head.getValue());
		}
		
		head = head.getNext();
		while(head!=null){
			System.out.print(" -> "+head.getValue());
			head = head.getNext();

		}
	}
	
	/*
	 * Reverse a linked list iteratively
	 */
	
	public Node reverseLinkedList(Node currentNode){
		Node nextNode;
		Node prevNode = null;
		
		if(currentNode==null){
			return null;
		}
		
		if(currentNode.getNext()==null){
			return currentNode;
		}
		else{
			while(currentNode!=null){
				nextNode = currentNode.getNext();
				currentNode.setNext(prevNode);
				prevNode = currentNode;
				currentNode = nextNode;
			}
			
			return prevNode;
		}
	}
	
	public Node revLinkedListRec(Node currentNode){
		Node nextNode;
		if(currentNode==null){
			return null;
		}
		if(currentNode.getNext()==null){
			return currentNode;
		}

		nextNode = currentNode.getNext();
		Node node = revLinkedListRec(nextNode);
		System.out.println(currentNode.getValue());
		node.setNext(currentNode);
		return currentNode;
	}
	
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		Node head = list.createLinkedList();
		list.printLinkedList(head);
		Node last = list.revLinkedListRec(head);
		//list.printLinkedList(last);

	}
}
