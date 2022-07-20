package com.virtusa.DataStructures;

import java.util.EmptyStackException;

public class MinStack {
	
	private Node headStack;
	private int count;
	
	public MinStack() {
		headStack = null;
		count=0;
	}
	
	public void push(int value) {
		
		if(headStack==null) {
			headStack = new Node(value);
			count++;
			return;
		}
		
		Node newNode = new Node(value);
		newNode.setNext(headStack);
		headStack = newNode;
		count++;
		
	}
	
	public int top() {
		if(this.isEmpty()) {
			throw new EmptyStackException();
		}
		else {
			return headStack.getData();
		}
	}
	
	public int pop() {
		if(this.isEmpty()) {
			throw new EmptyStackException();
		}
		else {
			int removedData = headStack.getData();
			Node newHead = headStack.getNext();
			headStack = newHead;
			count--;
			return removedData;
		}
	}

	public boolean isEmpty() {
		if(count==0 || headStack==null) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public int getMin() {
		if(isEmpty()) {
			throw new EmptyStackException();
		}
		else {
			int min = headStack.getData();
			Node tempNode = headStack;
			while(tempNode!=null) {
				if(tempNode.getData()<min) {
					min = tempNode.getData();
				}
				tempNode = tempNode.getNext();
			}
			return min;
		}
	}
		
}
