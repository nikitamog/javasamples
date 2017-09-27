/*

Author: Nikita Mogilevsky

Makes a custom, iterable, sortable, linked list class.

Makes use of ListNode.java

*/

import java.util.*;
import java.io.*;

public class CustomLinkedList<E extends Comparable<E>> implements Iterable<E>{
    //first element
    public ListNode<E> front;
    //last element
    public ListNode<E> back;
    //size indicator
    private int size;

    //default constructor
    public LinkedList() {
	front = new ListNode<E>();
	back = new ListNode<E>();
	front.next = back;
	back.next = front;
    }

    //adds an element to the end of the list
    public void add(E element) {
	ListNode<E> node = new ListNode<E>(element);
	back.prev.next = node;
	node.next = back;
    }

    //removes the first occuring element in the list
    public void remove(E element) {
	ListNode<E> temp = front;
	while(temp.data != null) {
	    if(temp.data.compareTo(element) == 0) {
		temp.prev.next = temp.next;
		return;
	    }
	    temp = temp.next;
	}
	return;
    }
}
