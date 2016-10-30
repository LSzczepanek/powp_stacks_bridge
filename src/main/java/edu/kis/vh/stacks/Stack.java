package edu.kis.vh.stacks;


public class Stack {

    private BasicStackImpl stackImpl;
    
    public Stack (){
    	
    }

    public Stack(BasicStackImpl stackImpl) {
        this.stackImpl = stackImpl;
    }

    public void push(int element) {
        stackImpl.push(element);
    }

    public boolean isEmpty() {
       return stackImpl.isEmpty();
    }

    public boolean isFull() {
        return stackImpl.isFull();
    }

    public int top() {
        return stackImpl.top();
    }

    public int pop() {
        return stackImpl.pop();
    }

}
