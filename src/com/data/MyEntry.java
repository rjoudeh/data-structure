package com.data;

public class MyEntry<K, V> {
	private K key;
	private V value;

	public MyEntry(K k, V v) {
		setKey(k);
		setValue(v);
	}

	/**
	 * @return the key
	 */
	public K getKey() {
		return key;
	}

	/**
	 * @param key
	 *            the key to set
	 */
	public void setKey(K key) {
		this.key = key;
	}

	/**
	 * @return the value
	 */
	public V getValue() {
		return value;
	}

	/**
	 * @param value
	 *            the value to set
	 */
	public void setValue(V value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "[" + this.getKey() + ", " + this.value + "]";
	}
	
}
