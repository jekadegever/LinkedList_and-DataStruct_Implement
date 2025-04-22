package IntNode;
public class IntNode {

    //parameters
      int _value;
      IntNode _next;

    //constructor
    public IntNode(int value) {
        _value = value;
        _next = null;
    }
   //overload constructor
    public IntNode(int value, IntNode next) {
        _value = value;
        _next = next;
    }

    //methods get
    public int getValue() {
        return _value;
    }
    public IntNode getNext() {
        return _next;
    }

    //methods set
    public void setNext(IntNode next) {
        _next = next;
    }
    public void setValue(int value){
        _value = value;
    }

}
