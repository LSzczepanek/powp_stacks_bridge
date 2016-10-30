package edu.kis.vh.stacks;

import edu.kis.vh.stacks.factory.IstacksFactory;

public class StackHanoi extends Stack {

    private int totalRejected = 0;

    public StackHanoi(IstacksFactory factory) {
        super(factory.getStackImpl());
    }

    public int reportRejected() {
        return totalRejected;
    }

    @Override
    public void push(int element) {
        if (!isEmpty() && element > top()) {
            totalRejected++;
        } else {
            super.push(element);
        }
    }
}
