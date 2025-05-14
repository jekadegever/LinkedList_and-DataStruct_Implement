package Linked_List;

/**
 * Represents a single node in a singly linked list.
 * Each node contains an integer value and a reference to the next node.
 *
 * Used by data structures such as {@link IntList}, {@link Stack}, and {@link Queue}.
 *
 * @author Ivgeny Tokarzhevsky
 */
public class IntNode {

    private int _value;
    private IntNode _next;

    /**
     * Constructs a node with a given value and null as the next reference.
     *
     * @param value the integer value to store
     */
    public IntNode(int value) {
        _value = value;
        _next = null;
    }

    /**
     * Constructs a node with a given value and a reference to the next node.
     *
     * @param value the integer value to store
     * @param next  the next node in the list
     */
    public IntNode(int value, IntNode next) {
        _value = value;
        _next = next;
    }

    /**
     * Returns the value stored in the node.
     *
     * @return the integer value
     */
    public int getValue() {
        return _value;
    }

    /**
     * Returns the next node in the list.
     *
     * @return the next {@code IntNode}, or null if none
     */
    public IntNode getNext() {
        return _next;
    }

    /**
     * Sets the next node reference.
     *
     * @param next the new next node
     */
    public void setNext(IntNode next) {
        _next = next;
    }

    /**
     * Sets the value stored in the node.
     *
     * @param value the new integer value
     */
    public void setValue(int value) {
        _value = value;
    }
}
