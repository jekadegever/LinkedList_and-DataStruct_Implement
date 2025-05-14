package Linked_List;

/**
 * A doubly-linked list implementation using {@link IntNodeTwo} nodes.
 * Supports insertion, rearrangement of negative/positive values, and a custom Josephus-style elimination.
 *
 * Assumes a circular structure for certain operations (like enDenDino).
 *
 * @author Ivgeny Tokarzhevsky
 */
public class IntListTwo {
    private IntNodeTwo _head;
    private IntNodeTwo _tail;

    /**
     * Constructs an empty list.
     */
    public IntListTwo() {
        _head = null;
        _tail = null;
    }

    /**
     * Constructs a list with a given head and tail.
     *
     * @param head the starting node
     * @param tail the ending node
     */
    public IntListTwo(IntNodeTwo head, IntNodeTwo tail) {
        _head = head;
        _tail = tail;
    }

    /**
     * Inserts a new node with the given value immediately after the given node.
     *
     * @param num  the value to insert
     * @param node the node after which to insert the new value
     */
    public void insertAfter(int num, IntNodeTwo node) {
        IntNodeTwo temp = new IntNodeTwo(num);

        if (_head == null) {
            _head = node;
            _tail = node;
            return;
        }

        IntNodeTwo curr = _head;
        while (curr != null && curr != node) {
            curr = curr.getNext();
        }

        if (curr == null) {
            return; // node not found in list
        }

        temp.setNext(curr.getNext());
        temp.setPrev(curr);
        curr.setNext(temp);

        if (temp.getNext() != null) {
            temp.getNext().setPrev(temp);
        } else {
            _tail = temp;
        }
    }

    /**
     * Rearranges the list so that all negative values are on the left side,
     * and all positive values are on the right side.
     * Operates by swapping values between left and right ends.
     */
    public void rearrange() {
        IntNodeTwo left = _head;
        IntNodeTwo right = _tail;

        while (left != null && right != null && left != right && left.getPrev() != right) {
            if (left.getNum() < 0) {
                left = left.getNext();
            } else if (right.getNum() > 0) {
                right = right.getPrev();
            } else {
                int temp = left.getNum();
                left.setNum(right.getNum());
                right.setNum(temp);
                left = left.getNext();
                right = right.getPrev();
            }
        }
    }

    /**
     * Simulates a circular Josephus-style elimination process.
     * Every k-th node is removed until one remains.
     *
     * @param k the step count for elimination
     * @return the value of the last remaining node
     */
    public int enDenDino(int k) {
        if (_head == null || k <= 0) {
            throw new IllegalArgumentException("List is empty or invalid k.");
        }

        IntNodeTwo p = _head;
        IntNodeTwo pred = _head;

        // Ensure circular list
        _tail.setNext(_head);
        _head.setPrev(_tail);

        while (p.getNext() != p) {
            for (int i = 1; i < k; i++) {
                pred = p;
                p = p.getNext();
            }

            pred.setNext(p.getNext());
            p.getNext().setPrev(pred);

            System.out.println(p.getNum() + " left");

            if (p == _head) {
                _head = p.getNext();
            }

            p = p.getNext();
        }

        _head = p;
        _tail = p;
        _head.setNext(null);
        _head.setPrev(null);

        return p.getNum();
    }
}
