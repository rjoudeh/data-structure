package com.data;

import java.util.Arrays;

public class MyQueue<T> {
	int size = 0;
	int defauleSize = 10;
	Object[] queue = new Object[defauleSize];

	/**
	 * 
	 * @param t
	 */
	public void enqueue(T t) {
		if (size == defauleSize)
			queue = Arrays.copyOf(queue, size + 10);

		queue[size++] = t;
	}

	@SuppressWarnings("unchecked")
	public T dequeue() {
		Object object = queue[0];
		queue[0] = null;
		shiftQueue();
		size--;

		return (T) object;
	}

	@SuppressWarnings("unchecked")
	public T peek() {
		Object object = queue[0];
		return (T) object;
	}

	public int size() {
		return this.size;
	}

	/**
	 * 
	 */
	private void shiftQueue() {
		for (int i = 0; i < size; i++) {
			if (i + 1 == size)
				break;
			queue[i] = queue[i + 1];
		}

		queue[size - 1] = null;
	}

	@Override
	public String toString() {
		String elements = "";
		for (int i = 0; i < size; i++) {
			if (elements == "")
				elements = queue[i] + "";
			else
				elements = elements + ", " + queue[i];
		}

		return elements;
	}

	public static boolean exists(int n, Integer[] f) {
		for (int i = 0; i < f.length; i++) {
			if (n == f[i])
				return true;
		}

		return false;
	}

	public static void main(String[] args) {
		// MyQueue<Integer> myQueue = new MyQueue<>();
		// MyQueue<Integer> myQueue2 = new MyQueue<>();
		//
		// myQueue.enqueue(10);
		//
		// myQueue.enqueue(20);
		// myQueue.enqueue(30);
		// myQueue.enqueue(40);

		// System.out.println(myQueue);
		// System.out.println(myQueue.size);
		//
		// myQueue.pop();
		// // myQueue.pop();
		// myQueue.pop();
		// System.out.println(myQueue);
		// System.out.println(myQueue.size);
	}
}
