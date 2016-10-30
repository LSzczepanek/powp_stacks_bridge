package edu.kis.vh.stacks;


public interface BasicStackImpl {

    int EMPTY_STACK_VALUE = -1;
    int STACK_CAPACITY = 12;

    void push(int element);
    int pop();
    boolean isEmpty();
    boolean isFull();
    int top();
    

}
