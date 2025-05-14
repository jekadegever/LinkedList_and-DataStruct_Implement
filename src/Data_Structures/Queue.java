package Data_Structures;

import Linked_List.IntNode;

/**
 * A basic implementation of a Queue data structure using a singly linked list.
 * Supports typical enqueue and dequeue operations in FIFO order.
 *
 * @author Ivgeny Tokarzhevsky
 */
public class Queue {
    // Reference to the front (head) and rear (tail) of the queue
    private IntNode _head;
    private IntNode _tail;

    /**
     * Constructs an empty queue.
     */
    public Queue() {
        _head = null;
        _tail = null;
    }

    /**
     * Checks if the queue is empty.
     *
     * @return true if the queue contains no elements, false otherwise
     */
    public boolean isEmpty() {
        return _head == null;
    }

    /**
     * Adds a new element to the end of the queue.
     *
     * @param num the integer value to enqueue
     */
    public void enqueue(int num) {
        IntNode temp = new IntNode(num, null);

        if (_tail != null) {
            _tail.setNext(temp);
        }
        _tail = temp;

        if (_head == null) {
            _head = _tail;
        }
    }

    /**
     * Removes and returns the element at the front of the queue.
     *
     * @return the value at the front of the queue
     * @throws IllegalStateException if the queue is empty
     */
    public int dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Cannot dequeue from an empty queue.");
        }

        int temp = _head.getValue();
        _head = _head.getNext();

        if (_head == null) {
            _tail = null; // queue became empty
        }

        return temp;
    }

    /**
     * Returns the element at the front of the queue without removing it.
     *
     * @return the value at the front of the queue
     * @throws IllegalStateException if the queue is empty
     */
    public int first() {
        if (isEmpty()) {
            throw new IllegalStateException("Cannot access first element of an empty queue.");
        }
        return _head.getValue();
    }
}
