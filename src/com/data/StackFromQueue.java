package com.data;

public class StackFromQueue<T> {
	MyQueue<T> q1 = new MyQueue<>();
	MyQueue<T> q2 = new MyQueue<>();

	public void push(T t) {
		q2.enqueue(t);
		int s = q1.size;
		for (int i = 0; i < s; i++) {
			q2.enqueue(q1.dequeue());
		}

		// Swap names
		int s2 = q2.size();
		for (int i = 0; i < s2; i++) {
			q1.enqueue(q2.dequeue());

		}
	}

	public T pull() {
		if (q1.size() > 0)
			return q1.dequeue();

		return null;
	}

	public static void main(String[] args) {
		
		Integer i =  1;
		Integer y = 1;
		System.out.println(i == y);
		
//		StackFromQueue<Integer> stack = new StackFromQueue<>();
//		stack.push(1);
//		stack.push(2);
//		stack.push(3);
//		stack.push(4);
//
//		System.err.println(stack.pull());
//		System.err.println(stack.pull());
//		System.err.println(stack.pull());
//		System.err.println(stack.pull());
	}
}
