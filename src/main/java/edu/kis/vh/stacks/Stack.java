package edu.kis.vh.stacks;

public class Stack {

	private final int[] items = new int[12];

	final static int EMPTY_STACK_VALUE = -1;
	final static int STACK_CAPACITY = 12;

	private int total = EMPTY_STACK_VALUE;

	public int getTotal() {
		return total;
	}

	public void push(int elemment) {
		if (!isFull())
			items[++total] = elemment;
	}

	public boolean isEmpty() {
		return total == EMPTY_STACK_VALUE;
	}

	public boolean isFull() {
		return total == STACK_CAPACITY - 1;
	}

	public int top() {
		if (isEmpty())
			return EMPTY_STACK_VALUE;
		return items[total];
	}

	public int pop() {
		if (isEmpty())
			return EMPTY_STACK_VALUE;
		return items[total--];
	}

}
