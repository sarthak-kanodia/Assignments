package com.virtusa.DataStructures;

import static org.junit.Assert.assertEquals;

import java.util.EmptyStackException;

import org.junit.Test;

public class MinStackTest 
{
	
    @Test(expected = EmptyStackException.class)
    public void top_ThrowsAnException_StackIsEmpty()
    {    	
        MinStack stack1 = new MinStack();
        stack1.top();
    }
    
    @Test(expected = EmptyStackException.class)
    public void pop_ThrowsAnException_StackIsEmpty()
    {    	
        MinStack stack1 = new MinStack();
        stack1.pop();
    }
    
    @Test
    public void top_ReturnsLastElement_StackContainsElement()
    {    	
        MinStack stack1 = new MinStack();
        stack1.push(10);
        stack1.push(20);
        stack1.push(30);
        stack1.pop();
        
        assertEquals(20, stack1.top());
    }
    
    @Test
    public void pop_ReturnsLastElement_StackContainsElement()
    {    	
        MinStack stack1 = new MinStack();
        stack1.push(10);
        stack1.push(20);
        stack1.push(30);
        assertEquals(30, stack1.top());
    }
    
    @Test(expected = EmptyStackException.class)
    public void getMin_ThrowsException_IfStackIsEmpty()
    {    	
        MinStack stack1 = new MinStack();
        stack1.getMin();
    }
    
    @Test
    public void getMin_MinElement_StackHasElements()
    {    	
        MinStack stack1 = new MinStack();
        stack1.push(10);
        stack1.push(20);
        stack1.push(30);
        assertEquals(10, stack1.getMin());
    }
    
    
}
