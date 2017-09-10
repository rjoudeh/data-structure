package com.data;

import java.util.Arrays;

public class MyStack<T> {
	int size = 0;
	int defauleSize = 10;
	Object[] stack = new Object[defauleSize];

	/**
	 * 
	 * @param t
	 */
	public void push(T t) {
		if (size == defauleSize)
			stack = Arrays.copyOf(stack, size + 10);

		stack[size++] = t;
	}

	@SuppressWarnings("unchecked")
	public T pop() {
		Object object = stack[size - 1];
		stack[size--] = null;
		return (T) object;
	}

	@SuppressWarnings("unchecked")
	public T peek() {
		Object object = stack[size];
		return (T) object;
	}

	@Override
	public String toString() {
		String elements = "";
		for (int i = 0; i < size; i++) {
			if (elements == "")
				elements = stack[i] + "";
			else
				elements = elements + ", " + stack[i];
		}

		return elements;
	}

	public static void main(String[] args) {
		MyStack<String> myStack = new MyStack<>();
		myStack.push("r");
		myStack.push("a");
		myStack.push("n");
		myStack.push("i");
		myStack.push("a");

		System.out.println(myStack);

		System.out.print(myStack.pop());
		System.out.print(myStack.pop());
		System.out.print(myStack.pop());
		System.out.print(myStack.pop());
		System.out.print(myStack.pop());

		/// System.out.println(myStack);

	}

}
