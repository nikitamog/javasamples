/*

  Author: Nikita Mogilevsky

  Creates a list node for 

*/

public class ListNode<E> {
    public E data;
    public ListNode<E> next;
    public ListNode<E> prev;

    public ListNode(E value, ListNode<E> succ, ListNode<E> pred) {
	data = value;
	next = succ;
	prev = pred;
    }

    //constructor with data and next
    public ListNode(E value, ListNode<E> succ) {
	this(value, succ, null);
    }

    //constructor with just data
    public ListNode(E value) {
	this(value, null);
    }
    
    //default constructor
    //e.g. ListNode<String> foo = new ListNode<String>("blah");
    public ListNode() {
	this(null);
    }

}
