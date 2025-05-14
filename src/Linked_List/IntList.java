package Linked_List;

/**
 * A singly linked list implementation with various utility methods such as
 * insertion, removal, search, and comparison.
 *
 * Each node is represented by an {@link IntNode} object.
 *
 * @author Ivgeny Tokarzhevsky
 */
public class IntList {
    private IntNode _head;

    /**
     * Constructs an empty list.
     */
    public IntList() {
        _head = null;
    }

    /**
     * Constructs a list starting from a given node.
     *
     * @param node the node to set as the head of the list
     */
    public IntList(IntNode node) {
        _head = node;
    }

    /**
     * Checks whether the list is empty.
     *
     * @return true if the list has no elements, false otherwise
     */
    public boolean empty() {
        return _head == null;
    }

    /**
     * Returns the next node in the list after the given node.
     *
     * @param node the node to find its successor
     * @return the next node, or null if none
     */
    public IntNode nextElement(IntNode node) {
        return node.getNext();
    }

    /**
     * Returns the value of the given node.
     *
     * @param node the node to extract value from
     * @return the integer value stored in the node
     */
    public int getValueOfNode(IntNode node) {
        return node.getValue();
    }

    /**
     * Adds a node to the end of the list.
     *
     * @param node the node to add
     */
    public void addToEnd(IntNode node) {
        if (empty()) {
            _head = node;
        } else {
            IntNode ptr = _head;
            while (ptr.getNext() != null) {
                ptr = ptr.getNext();
            }
            ptr.setNext(node);
        }
    }

    /**
     * Adds a node to the beginning (head) of the list.
     *
     * @param node the node to add
     */
    public void addToHead(IntNode node) {
        node.setNext(_head);
        _head = node;
    }

    /**
     * Removes the first occurrence of the given value from the list.
     *
     * @param num the value to remove
     */
    public void remove(int num) {
        if (!empty()) {
            if (_head.getValue() == num) {
                _head = _head.getNext();
            } else {
                IntNode ptr = _head;
                while (ptr.getNext() != null) {
                    if (ptr.getNext().getValue() == num) {
                        ptr.setNext(ptr.getNext().getNext());
                        return;
                    }
                    ptr = ptr.getNext();
                }
            }
        }
    }

    /**
     * Returns the length of the list.
     *
     * @return the number of nodes in the list
     */
    public int length() {
        int count = 0;
        IntNode temp = _head;
        while (temp != null) {
            count++;
            temp = temp.getNext();
        }
        return count;
    }

    /**
     * Finds the node that precedes the given node in the list.
     *
     * @param node the node to find its predecessor
     * @return the node before the given node, or null if not found or node is head
     */
    public IntNode predecessor(IntNode node) {
        if (_head == null || node == _head) {
            return null;
        }
        IntNode temp = _head;
        while (temp.getNext() != null) {
            if (temp.getNext().getValue() == node.getValue()) {
                return temp;
            }
            temp = temp.getNext();
        }
        return null;
    }

    /**
     * Compares this list with another for structural and value equality.
     *
     * @param other another IntList
     * @return true if both lists contain the same values in the same order
     */
    public boolean equals(IntList other) {
        if (this.length() != other.length()) {
            return false;
        }
        IntNode temp1 = this._head;
        IntNode temp2 = other._head;
        while (temp1 != null) {
            if (temp1.getValue() != temp2.getValue()) {
                return false;
            }
            temp1 = temp1.getNext();
            temp2 = temp2.getNext();
        }
        return true;
    }

    /**
     * Prints the entire list in a readable format: value -> value -> ... -> null
     */
    public void printList() {
        IntNode temp = _head;
        while (temp != null) {
            System.out.print(temp.getValue() + " -> ");
            temp = temp.getNext();
        }
        System.out.print("null");
    }

    /**
     * Reorders the list by swapping the k-th node and the last node.
     *
     * Note: This method modifies the current list and returns a reference to the updated one.
     *
     * @param k the position (1-based) of the node to swap with the last node
     * @return the updated list, or null if k is out of bounds
     */
    public IntList what(int k) {
        IntNode x, y, prevX = null, prevY = _head;
        IntNode curr = _head;

        for (int i = 1; i < k && curr != null; i++) {
            prevX = curr;
            curr = curr.getNext();
        }
        x = curr;

        if (curr == null)
            return null;

        IntNode ptr = _head;
        while (curr.getNext() != null) {
            prevY = ptr;
            ptr = ptr.getNext();
            curr = curr.getNext();
        }
        y = ptr;

        if (x == y) return this;

        if (x.getNext() == y) {
            x.setNext(y.getNext());
            y.setNext(x);
            if (prevX != null)
                prevX.setNext(y);
        } else if (y.getNext() == x) {
            y.setNext(x.getNext());
            x.setNext(y);
            if (prevY != null)
                prevY.setNext(x);
        } else if (x == _head) {
            _head = y;
            y.setNext(x.getNext());
            prevY.setNext(x);
            x.setNext(null);
        } else if (y == _head) {
            _head = x;
            x.setNext(y.getNext());
            if (prevX != null)
                prevX.setNext(y);
            y.setNext(null);
        } else {
            ptr = y.getNext();
            y.setNext(x.getNext());
            x.setNext(ptr);
            if (prevX != null)
                prevX.setNext(y);
            if (prevY != null)
                prevY.setNext(x);
        }

        return new IntList(_head);
    }
}
