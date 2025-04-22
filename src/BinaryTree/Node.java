package BinaryTree;

public class Node {
    private int _number;
    private Node _leftSon;
    private Node _rightSon;

    //const
    //node without childrens
    public Node(int number) {
        _number = number;
        _leftSon = null;
        _rightSon = null;

    }
    public void setNumber(int number) {
        _number = number;
    }
    public void setLeftSon(Node leftSon) {
        _leftSon = leftSon;
    }
    public void setRightSon(Node rightSon) {
        _rightSon = rightSon;
    }
    public int getNumber() {
        return _number;
    }
    public Node getLeftSon() {
        return _leftSon;
    }
    public Node getRightSon() {
        return _rightSon;
    }



}

