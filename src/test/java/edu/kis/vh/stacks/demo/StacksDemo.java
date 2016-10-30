package edu.kis.vh.stacks.demo;

import java.util.Random;

import edu.kis.vh.stacks.Stack;
import edu.kis.vh.stacks.StackHanoi;
import edu.kis.vh.stacks.factory.IstacksFactory;
import edu.kis.vh.stacks.factory.StackListFactory;

class StacksDemo {

    final static int NUMBER_OF_ELEMENTS = 15;
    final static int HANOI = 3;

    public static void main(String[] args) {
        Stack[] stacks = testStacks(new StackListFactory());

        fillStacks(stacks);
        fillStackWithRandomInts(stacks[HANOI], 20);

        showStacks(stacks);

        System.out.println("total rejected is "
                + ((StackHanoi) stacks[HANOI]).reportRejected());
    }

    private static void showStacks(Stack[] stacks) {
        for (int i = 0; i < stacks.length; i++) {
            while (!stacks[i].isEmpty()) {
                System.out.print(stacks[i].pop() + "  ");
            }
            System.out.println();
        }
    }

    private static void fillStackWithRandomInts(Stack stack, int range) {
        Random rn = new  Random();
        for (int i = 1; i < NUMBER_OF_ELEMENTS; i++)
            stack.push(rn.nextInt(range));
    }

    private static void fillStacks(Stack[] stacks) {
        for (int i = 1; i < NUMBER_OF_ELEMENTS; i++)
            for (int j = 0; j < stacks.length; j++)
                stacks[j].push(i);
    }

    private static Stack[] testStacks(IstacksFactory factory) {
        return new Stack[]{
                factory.getStandardStack(),
                factory.getFalseStack(),
                factory.getFIFOStack(),
                factory.getHanoiStack()
        };
    }

}