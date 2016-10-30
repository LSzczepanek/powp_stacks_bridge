package edu.kis.vh.stacks;

import edu.kis.vh.stacks.factory.IstacksFactory;

public class StackFIFO extends Stack {

    private final Stack temp;

    public StackFIFO(IstacksFactory factory) {
        super(factory.getStackImpl());
        temp = new Stack(factory.getStackImpl());
    }

    @Override
    public int pop() {
        while (!isEmpty()) {
            temp.push(super.pop());
        }

        int ret = temp.pop();

        while (!temp.isEmpty()) {
            push(temp.pop());
        }

        return ret;
    }
}
