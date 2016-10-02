package edu.kis.vh.stacks.demo;

import edu.kis.vh.stacks.StackHanoi;
import edu.kis.vh.stacks.Stack;
import edu.kis.vh.stacks.factory.DefaultStacksFactory;

class StacksDemo {

	public static void main(String[] args) {
		DefaultStacksFactory factory = new DefaultStacksFactory();
		final int NUMBER_OF_ELEMENTS_ON_STACK = 15;

		Stack[] stacks = { factory.getStandardStack(), factory.getFalseStack(), factory.getFIFOStack(),
				factory.getHanoiStack() };

		for (int i = 1; i < NUMBER_OF_ELEMENTS_ON_STACK; i++)
			for (int j = 0; j < 3; j++)
				stacks[j].push(i);

		java.util.Random rn = new java.util.Random(); // Zle
		for (int i = 1; i < NUMBER_OF_ELEMENTS_ON_STACK; i++)// Zle
			stacks[3].push(rn.nextInt(20));// Zle

		for (int i = 0; i < stacks.length; i++) {// Zle
			while (!stacks[i].isEmpty())// Zle
				System.out.print(stacks[i].pop() + "  ");// Zle
			System.out.println();// Zle
		}

		System.out.println("total rejected is " + ((StackHanoi) stacks[3]).reportRejected());

	}

}