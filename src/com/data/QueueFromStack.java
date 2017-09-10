package com.data;

public class QueueFromStack<T> {
	MyStack<T> stack1 = new MyStack<>();
	MyStack<T> stack2 = new MyStack<>();
	
	int size = 0;

	public void enqueue(T t) {
		int s = stack1.size;
		for (int i = 0; i < s; i++) {
			stack2.push(stack1.pop());
		}
		stack1.push(t);
	
		int s2 = stack2.size;
		for (int i = 0; i < s2; i++) {
			stack1.push(stack2.pop());
		}
		
		size++;
	}
	
	public T dequeue() {
		size--;
		return stack1.pop();
		
	}
	
	public static void main(String[] args) {
		QueueFromStack<Integer> queue = new QueueFromStack<>();
		queue.enqueue(1);
		queue.enqueue(2);
		System.err.println(queue.dequeue());
		queue.enqueue(3);
		queue.enqueue(4);
		
//		System.out.println(queue.size);
		
		System.err.println(queue.dequeue());
		System.err.println(queue.dequeue());
		System.err.println(queue.dequeue());
	}
}
