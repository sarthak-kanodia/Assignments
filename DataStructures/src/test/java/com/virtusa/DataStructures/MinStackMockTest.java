package com.virtusa.DataStructures;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.spy;

import java.util.EmptyStackException;

import org.junit.Test;

public class MinStackMockTest 
{
	MinStack stack1;
	
    @Test(expected = EmptyStackException.class)
    public void top_ThrowsAnException_StackIsEmpty()
    {    	
        stack1 = spy(MinStack.class);
        stack1.top();
    }
    
    @Test(expected = EmptyStackException.class)
    public void pop_ThrowsAnException_StackIsEmpty()
    {    	
    	stack1 = spy(MinStack.class);
        stack1.pop();
    }
    
    @Test(expected = EmptyStackException.class)
    public void getMin_ThrowsException_IfStackIsEmpty()
    {    	
    	stack1 = spy(MinStack.class);
        stack1.getMin();
    }
    
    @Test
    public void push_IncreaseSize_IfElementIsPushed() {
    	stack1 = spy(MinStack.class);
//    	assertEquals(0, stack1.size());
    	stack1.push(10);
    	stack1.push(20);
    	assertEquals(2, stack1.size());
    }
    
    @Test
    public void top_ReturnsLastElement_StackContainsElement()
    {    	
    	stack1 = spy(MinStack.class);
        stack1.push(10);
        stack1.push(20);
        stack1.push(30);
        stack1.pop();
        
        assertEquals(20, stack1.top());
    }
    
    @Test
    public void pop_ReturnsLastElement_StackContainsElement()
    {    	
    	stack1 = spy(MinStack.class);
        stack1.push(10);
        stack1.push(20);
        stack1.push(30);
        assertEquals(30, stack1.top());
    }
    
 
    @Test
    public void getMin_MinElement_StackContainsElements()
    {    	
    	stack1 = spy(MinStack.class);
        stack1.push(10);
        stack1.push(20);
        stack1.push(30);
        assertEquals(10, stack1.getMin());
    }
    
}
