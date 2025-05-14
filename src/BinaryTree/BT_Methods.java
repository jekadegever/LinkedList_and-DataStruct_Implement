package BinaryTree;

/**
 * A utility class that provides methods for operating on binary trees
 * and binary search trees (BST).
 *
 * @author Ivgeny Tokarzhevsky
 */
public class BT_Methods {

    /**
     * Searches for a value in a general binary tree (not necessarily a BST).
     *
     * @param root the root node of the tree
     * @param num the value to search for
     * @return true if the value exists in the tree, false otherwise
     */
    public static boolean search(Node root, int num) {
        if (root == null) {
            return false;
        }
        if (root.getNumber() == num) {
            return true;
        }
        return search(root.getLeftSon(), num) || search(root.getRightSon(), num);
    }

    /**
     * Prints the values of the tree nodes in pre-order traversal.
     * Order: root → left → right
     *
     * @param root the root node of the tree
     */
    public static void printPreOrder(Node root) {
        if (root != null) {
            System.out.print(root.getNumber() + " ");
            printPreOrder(root.getLeftSon());
            printPreOrder(root.getRightSon());
        }
    }

    /**
     * Prints the values of the tree nodes in in-order traversal.
     * Order: left → root → right
     *
     * @param root the root node of the tree
     */
    public static void printInOrder(Node root) {
        if (root != null) {
            printInOrder(root.getLeftSon());
            System.out.print(root.getNumber() + " ");
            printInOrder(root.getRightSon());
        }
    }

    /**
     * Prints the values of the tree nodes in post-order traversal.
     * Order: left → right → root
     *
     * @param root the root node of the tree
     */
    public static void printPostOrder(Node root) {
        if (root != null) {
            printPostOrder(root.getLeftSon());
            printPostOrder(root.getRightSon());
            System.out.print(root.getNumber() + " ");
        }
    }

    /**
     * Searches for a value in a Binary Search Tree (BST).
     *
     * @param root the root node of the BST
     * @param num the value to search for
     * @return true if the value exists in the BST, false otherwise
     */
    public static boolean searchInBST(Node root, int num) {
        if (root == null) {
            return false;
        }
        if (root.getNumber() == num) {
            return true;
        }
        if (root.getNumber() < num) {
            return searchInBST(root.getRightSon(), num);
        } else {
            return searchInBST(root.getLeftSon(), num); // fixed: was calling 'search' incorrectly
        }
    }

    /**
     * Inserts a value into a Binary Search Tree (BST).
     * Returns the updated root after insertion.
     *
     * @param bst the root node of the BST (can be null)
     * @param x the value to insert
     * @return the updated root node of the BST
     */
    public static Node insert(Node bst, int x) {
        if (bst == null) {
            return new Node(x);
        }
        if (x < bst.getNumber()) {
            bst.setLeftSon(insert(bst.getLeftSon(), x));
        } else {
            bst.setRightSon(insert(bst.getRightSon(), x));
        }
        return bst;
    }

    /**
     * Finds the maximum value in a binary tree.
     *
     * @param root the root node of the tree
     * @return the maximum value found in the tree
     */
    public static int maxInTree(Node root) {
        if (root == null) {
            return Integer.MIN_VALUE;
        }
        if (root.getLeftSon() == null && root.getRightSon() == null) {
            return root.getNumber();
        }
        int a = maxInTree(root.getLeftSon());
        int b = maxInTree(root.getRightSon());
        return Math.max(Math.max(a, b), root.getNumber());
    }
}
