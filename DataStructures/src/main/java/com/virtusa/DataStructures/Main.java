package com.virtusa.DataStructures;

public class Main 
{
    public static void main( String[] args )
    {
        
    	MinStack stack1 = new MinStack();
    	   	    	
    	stack1.push(50);    	  	
    	stack1.push(30);    	
    	stack1.push(20);
    	stack1.push(60);
    	stack1.push(20);
    	stack1.push(10);
    	
    	System.out.println("Min: "+stack1.getMin());
    	System.out.println("Top: "+stack1.top());
    	System.out.println("Pop: "+stack1.pop());
    	System.out.println("Min: "+stack1.getMin());
    	System.out.println("Top: "+stack1.top());
    	
    	  	    	        
    }
}
