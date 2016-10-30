package edu.kis.vh.stacks.unittests;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import edu.kis.vh.stacks.BasicStackImpl;
import edu.kis.vh.stacks.Stack;

public class StackTest {

    private Stack stackObj;

    @Before
    public void setUp() {
        stackObj = new Stack();
    }

    @Test
    public void testPush() {
        int testValue = 4;
        stackObj.push(testValue);

        int result = stackObj.top();
        Assert.assertEquals(testValue, result);
    }

    @Test
    public void testIsEmpty() {
        boolean result = stackObj.isEmpty();
        Assert.assertEquals(true, result);

        stackObj.push(888);

        result = stackObj.isEmpty();
        Assert.assertEquals(false, result);
    }

    @Test
    public void testIsFull() {
        for (int i = 0; i < BasicStackImpl.STACK_CAPACITY - 1; i++) {
            boolean result = stackObj.isFull();
            Assert.assertEquals(false, result);
            stackObj.push(888);
        }

        boolean result = stackObj.isFull();
        Assert.assertEquals(true, result);
    }

    @Test
    public void testTop() {
        int result = stackObj.top();
        Assert.assertEquals(BasicStackImpl.EMPTY_STACK_VALUE, result);

        int testValue = 4;
        stackObj.push(testValue);

        result = stackObj.top();
        Assert.assertEquals(testValue, result);
        result = stackObj.top();
        Assert.assertEquals(testValue, result);
    }

    @Test
    public void testPop() {
        int result = stackObj.pop();
        Assert.assertEquals(BasicStackImpl.EMPTY_STACK_VALUE, result);

        int testValue = 4;
        stackObj.push(testValue);

        result = stackObj.pop();
        Assert.assertEquals(testValue, result);
        result = stackObj.pop();
        Assert.assertEquals(BasicStackImpl.EMPTY_STACK_VALUE, result);
    }

}