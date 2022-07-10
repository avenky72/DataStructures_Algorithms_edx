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
     * @param data the data to add to the front of the list
     * @throws java.lang.IllegalArgumentException if data is null
     */
    public void addToFront(T data) {
        // WRITE YOUR CODE HERE (DO NOT MODIFY METHOD HEADER)!
        if (data == null) {
            throw new IllegalArgumentException("Data can't be null");
        }
        SinglyLinkedListNode<T> temp = new SinglyLinkedListNode<>(data);
         if (size == 0) {
            head = temp;
            head.setNext(null);
            tail = head;
        } 
        else{
            temp.setNext(head);
            head = temp;
        }
        size++;
       
    }         

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
            throw new IllegalArgumentException("Data can't be null");
        }
        SinglyLinkedListNode<T> temp = new SinglyLinkedListNode<>(data);
        if (size == 0) {
            head = temp;
            head.setNext(null);
            tail = head;
        }
        else{
            tail.setNext(temp);
            temp.setNext(null);
            tail = temp;
        }
        size++;
    }
    
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
        if (size == 0){
            throw new NoSuchElementException("ERROR: Empty");
        }
        if (size == 1){
            SinglyLinkedListNode<T> k = head;
            head = null;
            tail = null;
            size = 0;
            return k.getData();
        }
        else{
        SinglyLinkedListNode<T> i = head;
        SinglyLinkedListNode<T> j = null;
        j = head.getNext();
        head = null;
        head = j;
        size--;
        return i.getData();
        }
    }

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
        if (size == 0){
            throw new NoSuchElementException("ERROR: Empty");
        }
        if (size == 1){
            SinglyLinkedListNode<T> m = head;
            head = null;
            tail = null;
            size = 0;
            return m.getData();
        }
        else {SinglyLinkedListNode<T> temp = head;
        SinglyLinkedListNode<T> pre = head;
        
        while(temp.getNext() != null) {
            pre = temp;
            temp = temp.getNext();
        }
        pre.setNext(null);
        tail = pre;
        size--;
        return temp.getData();
             }
    }

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
