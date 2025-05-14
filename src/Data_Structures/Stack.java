package Data_Structures;

import Linked_List.IntNode;

/**
 * A basic implementation of a stack (LIFO) data structure
 * using a singly linked list.
 * Supports push, pop, top, and utility operations.
 *
 * @author Ivgeny Tokarzhevsky
 */
public class Stack {
    private IntNode _top;

    /**
     * Constructs an empty stack.
     */
    public Stack() {
        _top = null;
    }

    /**
     * Checks if the stack is empty.
     *
     * @return true if the stack contains no elements, false otherwise
     */
    public boolean isEmpty() {
        return _top == null;
    }

    /**
     * Pushes a new value onto the top of the stack.
     *
     * @param num the value to push
     */
    public void push(int num) {
        _top = new IntNode(num, _top);
    }

    /**
     * Removes and returns the value at the top of the stack.
     *
     * @return the value that was at the top
     * @throws IllegalStateException if the stack is empty
     */
    public int pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Cannot pop from an empty stack.");
        }
        int temp = _top.getValue();
        _top = _top.getNext();
        return temp;
    }

    /**
     * Returns the value at the top of the stack without removing it.
     *
     * @return the top value
     * @throws IllegalStateException if the stack is empty
     */
    public int top() {
        if (isEmpty()) {
            throw new IllegalStateException("Cannot access top of an empty stack.");
        }
        return _top.getValue();
    }

    /**
     * Returns a string representation of the stack, from top to bottom.
     * The stack remains unchanged.
     *
     * @return a string listing the elements in the stack
     */
    @Override
    public String toString() {
        String s = "";
        Stack tempStack = new Stack();

        while (!isEmpty()) {
            int temp = pop();
            tempStack.push(temp);
            s += temp + "\t";
        }

        while (!tempStack.isEmpty()) {
            push(tempStack.pop());
        }

        return s;
    }

    /**
     * Recursively prints all elements in the stack from top to bottom.
     * The stack remains unchanged after printing.
     */
    public void print() {
        if (!isEmpty()) {
            int x = pop();
            System.out.println(x);
            print();
            push(x);
        }
    }
}
