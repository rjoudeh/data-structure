package com.data;

import java.util.Arrays;

public class MyList<T> {
	int size = 0;
	int defaultSize = 5;
	Object[] array;

	public MyList() {
		array = new Object[defaultSize];
	}

	/**
	 * 
	 * @param element
	 */
	public void add(T element) {
		if (size == array.length)
			array = Arrays.copyOf(array, size + 1);

		array[size++] = element;
	}

	/**
	 * 
	 * @param index
	 */
	public void remove(int index) {
		if (index < array.length) {
			array[index] = null;
			shiftElements(index);

			size--;
		}

	}

	/**
	 * 
	 */
	public void removeAll() {
		for (int i = 0; i < array.length; i++) {
			array[i] = null;
		}
	}

	/*
	 * 
	 */
	private void shiftElements(int start) {
		for (int i = start; i < size; i++) {
			if (i + 1 == size)
				break;

			array[i] = array[i + 1];
		}
		array[size - 1] = null;
	}

	@Override
	public String toString() {
		String elements = "";
		for (int i = 0; i < array.length; i++) {
			// if (array[i] != null)
			if (elements == "")
				elements = array[i] + "";
			else
				elements = elements + ", " + array[i];
		}

		return elements;
	}

	public static void main(String[] args) {
		MyList<Integer> myList = new MyList<>();

		myList.add(1);
		myList.add(2);
		myList.add(3);
		myList.add(4);
		myList.add(5);
		myList.add(6);
		myList.add(7);

		System.out.println(myList);

		myList.remove(5);
		System.out.println(myList);

	}

}
