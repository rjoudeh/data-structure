package com.data;

import java.util.Arrays;

public class MyMap<K, V> {
	int size = 0;
	int defaultSize = 10;
	@SuppressWarnings("unchecked")
	MyEntry<K, V>[] values = new MyEntry[defaultSize];

	public V get(K key) {
		for (int i = 0; i < values.length; i++) {
			if (values[i] != null)
				if (values[i].getKey().equals(key)) {
					return values[i].getValue();
				}
		}

		return null;
	}

	/**
	 * 
	 * @param entry
	 */
	public void put(K key, V value) {
		boolean insert = true;
		for (int i = 0; i < values.length; i++) {
			if (values[i] != null)
				if (values[i].getKey().equals(key)) {
					// update
					values[i].setValue(value);
					insert = false;
				}
		}
		if (insert) {
			if (size == values.length)
				values = Arrays.copyOf(values, values.length + 10);

			values[size++] = new MyEntry<K, V>(key, value);
		}
	}

	/**
	 * 
	 * @param key
	 */
	public void remove(K key) {
		for (int i = 0; i < values.length; i++) {
			if (values[i] != null)
				if (values[i].getKey().equals(key)) {
					values[i] = null;
					shiftEntries(i);
					size--;
					break;

				}
		}
	}

	/**
	 * 
	 * @param start
	 */
	private void shiftEntries(int start) {
		for (int i = start; i < size; i++) {
			if (i + 1 == size)
				break;

			values[i] = values[i + 1];
		}

		values[size - 1] = null;
	}

	@Override
	public String toString() {
		String elements = "";
		for (int i = 0; i < values.length; i++) {
			if (elements == "")
				elements = values[i] + "";
			else
				elements = elements + ", " + values[i];
		}

		return elements;
	}

	public static void main(String[] args) {
		MyMap<String, String> myMap = new MyMap<>();
		myMap.put("name", "Rania");
		myMap.put("age", "28");
		myMap.put("major", "CS");

		System.out.println(myMap);
		System.out.println(myMap.size);

		System.out.println(myMap.get("name"));
		System.out.println(myMap.get("age"));

		myMap.remove("age");
		System.out.println(myMap);

		System.out.println(myMap.size);
	}
}
