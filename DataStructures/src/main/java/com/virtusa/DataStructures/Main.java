package com.virtusa.DataStructures;

public class Main 
{
    public static void main( String[] args )
    {
        
    	MinStack stack1 = new MinStack();
    	
    	stack1.push(10);
    	stack1.push(20);
    	stack1.push(30);
    	stack1.push(40);
    	stack1.push(50);
    	
    	System.out.println("Top: "+stack1.top());
    	
    	System.out.println("Pop: "+stack1.pop());
    	System.out.println("Top: "+stack1.top());
    	
    	System.out.println("Pop: "+stack1.pop());
    	System.out.println("Top: "+stack1.top());
    	
    	System.out.println("Pop: "+stack1.pop());
    	System.out.println("Top: "+stack1.top());
    	
    	System.out.println("Pop: "+stack1.pop());
    	System.out.println("Top: "+stack1.top());
    	
    	System.out.println("Pop: "+stack1.pop());
    	System.out.println("Top: "+stack1.top());
    	
    	    	        
    }
}
