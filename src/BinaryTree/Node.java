package BinaryTree;

/**
 * Represents a single node in a binary tree or binary search tree (BST).
 * Each node contains an integer value and references to its left and right child nodes.
 *
 * @author Ivgeny Tokarzhevsky
 */
public class Node {
    private int _number;
    private Node _leftSon;
    private Node _rightSon;

    /**
     * Constructs a new node with the specified value.
     * Both left and right children are initialized to null.
     *
     * @param number the integer value to store in the node
     */
    public Node(int number) {
        _number = number;
        _leftSon = null;
        _rightSon = null;
    }

    /**
     * Sets the value stored in the node.
     *
     * @param number the new integer value
     */
    public void setNumber(int number) {
        _number = number;
    }

    /**
     * Sets the left child of the node.
     *
     * @param leftSon the node to set as the left child
     */
    public void setLeftSon(Node leftSon) {
        _leftSon = leftSon;
    }

    /**
     * Sets the right child of the node.
     *
     * @param rightSon the node to set as the right child
     */
    public void setRightSon(Node rightSon) {
        _rightSon = rightSon;
    }

    /**
     * Returns the value stored in the node.
     *
     * @return the integer value
     */
    public int getNumber() {
        return _number;
    }

    /**
     * Returns the left child of the node.
     *
     * @return the left child node, or null if none
     */
    public Node getLeftSon() {
        return _leftSon;
    }

    /**
     * Returns the right child of the node.
     *
     * @return the right child node, or null if none
     */
    public Node getRightSon() {
        return _rightSon;
    }
}
