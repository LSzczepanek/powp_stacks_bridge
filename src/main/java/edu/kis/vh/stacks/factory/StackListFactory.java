package edu.kis.vh.stacks.factory;

import edu.kis.vh.stacks.Stack;
import edu.kis.vh.stacks.StackFIFO;
import edu.kis.vh.stacks.StackHanoi;
import edu.kis.vh.stacks.BasicStackImpl;
import edu.kis.vh.stacks.list.StackList;


public class StackListFactory implements IstacksFactory {

    @Override
    public BasicStackImpl getStackImpl() {
        return new StackList();
    }

    @Override
    public Stack getStandardStack() {
        return new Stack(getStackImpl());
    }

    @Override
    public Stack getFalseStack() {
        return new Stack(getStackImpl());
    }

    @Override
    public StackFIFO getFIFOStack() {
        return new StackFIFO(this);
    }

    @Override
    public StackHanoi getHanoiStack() {
        return new StackHanoi(this);
    }
}
