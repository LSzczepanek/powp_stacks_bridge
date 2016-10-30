package edu.kis.vh.stacks;


public class BasicStackArray implements BasicStackImpl {

    private final int[] items = new int[STACK_CAPACITY];

    private int total = EMPTY_STACK_VALUE;

    
    @Override
    public int pop() {
        if (isEmpty()) {
            return EMPTY_STACK_VALUE;
        }

        return items[total--];
    }
    
    @Override
    public void push(int element) {
        if (!isFull()) {
            items[++total] = element;
        }
    }

    @Override
    public boolean isEmpty() {
        return total == EMPTY_STACK_VALUE;
    }

    @Override
    public boolean isFull() {
        return total == STACK_CAPACITY - 1;
    }

    @Override
    public int top() {
        if (isEmpty()) {
            return EMPTY_STACK_VALUE;
        }

        return items[total];
    }

}
