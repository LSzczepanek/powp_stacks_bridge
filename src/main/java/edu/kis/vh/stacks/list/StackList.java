package edu.kis.vh.stacks.list;

import edu.kis.vh.stacks.BasicStackImpl;

public class StackList implements BasicStackImpl {

    private Node last;

    @Override
    public void push(int value) {
        if (last == null)
            last = new Node(value);
        else {
            last.next = new Node(value);
            last.next.prev = last;
            last = last.next;
        }
    }

    @Override
    public boolean isEmpty() {
        return last == null;
    }

    @Override
    public boolean isFull() {
        Node prevous = last;
        for(int i = 0; i < BasicStackImpl.STACK_CAPACITY+1; i++) {
            if(prevous == null)
                return true;
            prevous = prevous.prev;
        }
        return false;
    }

    @Override
    public int top() {
        if (isEmpty())
            return EMPTY_STACK_VALUE;
        return last.value;
    }

    @Override
    public int pop() {
        if (isEmpty())
            return EMPTY_STACK_VALUE;
        int ret = last.value;
        last = last.prev;
        return ret;
    }

}
