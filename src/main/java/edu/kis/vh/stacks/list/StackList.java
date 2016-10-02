package edu.kis.vh.stacks.list;

public class StackList {

	final int EMPTY_STACK_VALUE = -1;
	Node last;

	public void pushElement(int element) {
		if (last == null)
			last = new Node(element);
		else {
			last.next = new Node(element);
			last.next.prev = last;
			last = last.next;
		}
	}

	public boolean empty() {
		return last == null;
	}

	public boolean full() {
		return false;
	}

	public int peek() {
		if (empty())
			return EMPTY_STACK_VALUE;
		return last.value;
	}

	public int pop() {
		if (empty())
			return EMPTY_STACK_VALUE;
		int ret = last.value;
		last = last.prev;
		return ret;
	}

}
