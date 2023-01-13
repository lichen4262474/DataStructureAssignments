package module1;

import java.util.NoSuchElementException;
/**
 * Your implementation of a Singly-Linked List.
 */
public class SinglyLinkedList<T> {

	/*
	 * Do not add new instance variables or modify existing ones.
	 */
	private SinglyLinkedListNode<T> head;
	private SinglyLinkedListNode<T> tail;
	private int size;

	/*
	 * Do not add a constructor.
	 */

	/**
	 * Adds the element to the front of the list.
	 *
	 * Method should run in O(1) time.
	 * 
	 * @param <head>
	 *
	 * @param data   the data to add to the front of the list
	 * @throws java.lang.IllegalArgumentException if data is null
	 */

	public void addAtIndex(int index, T data) {
		// WRITE YOUR CODE HERE (DO NOT MODIFY METHOD HEADER)!
		if (size == 0) {
			SinglyLinkedListNode e = new SinglyLinkedListNode(data);
			head = e;
			tail = e;
		} else if (index == 0) {
			SinglyLinkedListNode e = new SinglyLinkedListNode(data, head);
			head = e;
		} // add at index 0
		else if (index == size) {
			SinglyLinkedListNode e = new SinglyLinkedListNode(data);
			tail.setNext(e);
			tail = e;
		} // add at the end
		else {
			SinglyLinkedListNode current = head;
			for (int i = 0; i < index - 1; i++) {
				current = current.getNext();
			} // close for
			SinglyLinkedListNode e = new SinglyLinkedListNode(data, current.getNext());
			current.setNext(e);
		} // close else add in the middle
		size++;
	} // close add at index

	public void addToFront(T data) {
		// WRITE YOUR CODE HERE (DO NOT MODIFY METHOD HEADER)!
		if (data == null) {
			throw new IllegalArgumentException("Error: some exception was thrown");
		}
		if (size==0) {
			SinglyLinkedListNode newNode = new SinglyLinkedListNode(data);
			head = newNode;
			tail = newNode;
		}else {
			SinglyLinkedListNode newNode = new SinglyLinkedListNode(data, head);
			head = newNode;
		}
		size++;
	}// close addToFront

	/**
	 * Adds the element to the back of the list.
	 *
	 * Method should run in O(1) time.
	 *
	 * @param data the data to add to the back of the list
	 * @throws java.lang.IllegalArgumentException if data is null
	 */
	public void addToBack(T data) {
		// WRITE YOUR CODE HERE (DO NOT MODIFY METHOD HEADER)!
		if (data == null) {
			throw new IllegalArgumentException("Error: some exception was thrown");
		}
		if (size==0) {
			SinglyLinkedListNode newNode = new SinglyLinkedListNode(data);
			head = newNode;
			tail = newNode;
		}else {
			SinglyLinkedListNode newNode = new SinglyLinkedListNode(data);
			tail.setNext(newNode);
			tail = newNode;
		}
		size++;
	}// close addToBack

	/**
	 * Removes and returns the first data of the list.
	 *
	 * Method should run in O(1) time.
	 *
	 * @return the data formerly located at the front of the list
	 * @throws java.util.NoSuchElementException if the list is empty
	 */
	public T removeFromFront() {
		// WRITE YOUR CODE HERE (DO NOT MODIFY METHOD HEADER)!
		if (size == 0) {
			throw new NoSuchElementException("Error: some exception was thrown");
		}
		SinglyLinkedListNode temp = head;
		if (size == 1) {
			head = null;
			tail = null;
		}else {
			head = head.getNext();
		}
		size--;
		return (T) temp.getData();
	}//close removeFromFront

	/**
	 * Removes and returns the last data of the list.
	 *
	 * Method should run in O(n) time.
	 *
	 * @return the data formerly located at the back of the list
	 * @throws java.util.NoSuchElementException if the list is empty
	 */
	public T removeFromBack() {
		// WRITE YOUR CODE HERE (DO NOT MODIFY METHOD HEADER)!
		if (size == 0) {
			throw new NoSuchElementException("Error: some exception was thrown");
		}
		SinglyLinkedListNode temp = tail;
		if (size == 1) {
			head = null;
			tail = null;
		}else {
			SinglyLinkedListNode current = head;
			while (current.getNext().getNext() != null) {
				current = current.getNext();
			}
			current.setNext(null);
			tail = current;
		}
		size--;
		return (T) temp.getData();
	}//close removeFromBack

	/**
	 * Returns the head node of the list.
	 *
	 * For grading purposes only. You shouldn't need to use this method since
	 * you have direct access to the variable.
	 *
	 * @return the node at the head of the list
	 */
	public SinglyLinkedListNode<T> getHead() {
		// DO NOT MODIFY THIS METHOD!
		return head;
	}

	/**
	 * Returns the tail node of the list.
	 *
	 * For grading purposes only. You shouldn't need to use this method since
	 * you have direct access to the variable.
	 *
	 * @return the node at the tail of the list
	 */
	public SinglyLinkedListNode<T> getTail() {
		// DO NOT MODIFY THIS METHOD!
		return tail;
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
