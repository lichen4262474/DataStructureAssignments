
package module1;

import java.util.NoSuchElementException;
/**
 * Your implementation of an ArrayList.
 */
public class ArrayList<T> {

	/*
	 * The initial capacity of the ArrayList.
	 *
	 * DO NOT MODIFY THIS VARIABLE!
	 */
	public static final int INITIAL_CAPACITY = 9;

	/*
	 * Do not add new instance variables or modify existing ones.
	 */
	private T[] backingArray;
	private int size;

	/**
	 * This is the constructor that constructs a new ArrayList.
	 * 
	 * Recall that Java does not allow for regular generic array creation,
	 * so instead we cast an Object[] to a T[] to get the generic typing.
	 */
	public ArrayList() {
		//DO NOT MODIFY THIS METHOD!
		backingArray = (T[]) new Object[INITIAL_CAPACITY];
	}

	/**
	 * Adds the data to the front of the list.
	 *
	 * This add may require elements to be shifted.
	 *
	 * Method should run in O(n) time.
	 *
	 * @param data the data to add to the front of the list
	 * @throws java.lang.IllegalArgumentException if data is null
	 */
	public void addAtIndex(int index, T data) {
		// WRITE YOUR CODE HERE (DO NOT MODIFY METHOD HEADER)!
		T[] newBackingArray = (T[]) new Object[backingArray.length];

		for (int i = 0; i < index; i++) {
			newBackingArray[i] = backingArray[i];
		}
		newBackingArray[index] = data;
		for (int i = index; i < size; i++) {
			newBackingArray[i + 1] = backingArray[i];
		}
		backingArray = newBackingArray;
		size++;
	}

	public void addToFront(T data) {
		// WRITE YOUR CODE HERE (DO NOT MODIFY METHOD HEADER)!
		if (data == null) {
			throw new IllegalArgumentException("Error: some exception was thrown");
		}

		int newCapacity = backingArray.length;
		if (size + 1 > backingArray.length) {
			newCapacity = backingArray.length * 2;
		}
		Object[] newArray = new Object[newCapacity];

		newArray[0] = data;
		for (int i = 0; i < size; i++) {
			newArray[i + 1] = backingArray[i];
		}
		backingArray = (T[]) newArray;
		size++;
	}// close addToFront

	/**
	 * // if (size < INITIAL_CAPACITY) { // // Object[] newArray = new
	 * Object[INITIAL_CAPACITY]; // newArray[0]=data; // for (int i = 1; i <= size;
	 * i++) { // newArray[i]=backingArray[i-1]; // } // backingArray = (T[])
	 * newArray; // size++; // }else{ // int newCapacity = INITIAL_CAPACITY * (1 +
	 * (size - 1) / INITIAL_CAPACITY); // Object[]newArray = new
	 * Object[newCapacity]; // newArray[0]=data; // for (int i = 1; i <= size; i++)
	 * { // newArray[i]=backingArray[i-1]; // } // backingArray = (T[]) newArray; //
	 * size++; // } // close else }// close addToFront /** Adds the data to the back
	 * of the list.
	 *
	 * Method should run in amortized O(1) time.
	 *
	 * @param data the data to add to the back of the list
	 * @throws java.lang.IllegalArgumentException if data is null
	 */
	public void addToBack(T data) {
		// WRITE YOUR CODE HERE (DO NOT MODIFY METHOD HEADER)!
		if (data == null) {
			throw new IllegalArgumentException("Error: some exception was thrown");
		}

		int newCapacity = backingArray.length;
		if (size + 1 > backingArray.length) {
			newCapacity = backingArray.length * 2;
		}
		Object[] newArray = new Object[newCapacity];

		for (int i = 0; i < size; i++) {
			newArray[i] = backingArray[i];
		}
		newArray[size] = data;
		backingArray = (T[]) newArray;
		size++;
	}// close add to back

	/**
	 * Removes and returns the first data of the list.
	 *
	 * Do not shrink the backing array.
	 *
	 * This remove may require elements to be shifted.
	 *
	 * Method should run in O(n) time.
	 *
	 * @return the data formerly located at the front of the list
	 * @throws java.util.NoSuchElementException if the list is empty
	 */
	public T removeFromFront() {
		// WRITE YOUR CODE HERE (DO NOT MODIFY METHOD HEADER)!
		if (size == 0) {
			throw new NoSuchElementException("Error: some exception was thrown");
		} else {
			T deletedElement = backingArray[0];
			int newsize = backingArray.length;
			Object[] newArray = new Object[newsize];
			for (int i = 0; i < size - 1; i++) {
				newArray[i] = backingArray[i + 1];
			}
			backingArray = (T[]) newArray;
			size--;
			return deletedElement;
		}
	}// close remove from front

	/**
	 * Removes and returns the last data of the list.
	 *
	 * Do not shrink the backing array.
	 *
	 * Method should run in O(1) time.
	 *
	 * @return the data formerly located at the back of the list
	 * @throws java.util.NoSuchElementException if the list is empty
	 */
	public T removeFromBack() {
		// WRITE YOUR CODE HERE (DO NOT MODIFY METHOD HEADER)!
		if (size == 0) {
			throw new NoSuchElementException("Error: some exception was thrown");
		} else {
			T deletedElement = backingArray[size - 1];
			backingArray[size - 1] = null;
			size--;
			return deletedElement;
		}
	}

	/**
	 * Returns the backing array of the list.
	 *
	 * For grading purposes only. You shouldn't need to use this method since
	 * you have direct access to the variable.
	 *
	 * @return the backing array of the list
	 */
	public T[] getBackingArray() {
		// DO NOT MODIFY THIS METHOD!
		return backingArray;
	}

	/**
	 * Returns the size of the list.
	 *
	 * For grading purposes only. You shouldn't need to use this method since
	 * you have direct access to the variable.
	 *
	 * @return the size of the list
	 */
	public int size() {
		// DO NOT MODIFY THIS METHOD!
		return size;
	}


}