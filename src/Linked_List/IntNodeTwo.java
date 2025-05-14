package Linked_List;

/**
 * Represents a node in a doubly linked list.
 * Each node holds an integer value and has references to both
 * the next and previous nodes in the list.
 *
 * Used by {@link IntListTwo}.
 *
 * @author Ivgeny Tokarzhevsky
 */
public class IntNodeTwo {
    private int _value;
    private IntNodeTwo _next;
    private IntNodeTwo _prev;

    /**
     * Constructs a node with a given value.
     * Both next and previous references are set to null.
     *
     * @param n the integer value to store
     */
    public IntNodeTwo(int n) {
        _value = n;
        _next = null;
        _prev = null;
    }

    /**
     * Constructs a node with a given value, next, and previous references.
     *
     * @param num the value to store
     * @param next the reference to the next node
     * @param prev the reference to the previous node
     */
    public IntNodeTwo(int num, IntNodeTwo next, IntNodeTwo prev) {
        _value = num;
        _next = next;
        _prev = prev;
    }

    /**
     * Returns the value stored in the node.
     *
     * @return the integer value
     */
    public int getNum() {
        return _value;
    }

    /**
     * Returns the next node in the list.
     *
     * @return the next {@code IntNodeTwo}, or null if none
     */
    public IntNodeTwo getNext() {
        return _next;
    }

    /**
     * Returns the previous node in the list.
     *
     * @return the previous {@code IntNodeTwo}, or null if none
     */
    public IntNodeTwo getPrev() {
        return _prev;
    }

    /**
     * Sets the value stored in the node.
     *
     * @param num the new integer value
     */
    public void setNum(int num) {
        _value = num;
    }

    /**
     * Sets the next node reference.
     *
     * @param next the next {@code IntNodeTwo}
     */
    public void setNext(IntNodeTwo next) {
        _next = next;
    }

    /**
     * Sets the previous node reference.
     *
     * @param prev the previous {@code IntNodeTwo}
     */
    public void setPrev(IntNodeTwo prev) {
        _prev = prev;
    }
}
