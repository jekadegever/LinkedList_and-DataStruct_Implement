package IntNode;

public class IntNodeTwo {
    private int _value;
    private IntNodeTwo _next, _prev;

    public IntNodeTwo(int n) {
        _value = n;
        _prev = null;
        _next = null;
    }
    public IntNodeTwo(int num, IntNodeTwo next, IntNodeTwo prev){
        _value = num;
        _prev = prev;
        _next = next;
    }

    public int getNum() {
        return _value;
    }
    public IntNodeTwo getNext() {
        return _next;
    }
    public IntNodeTwo getPrev() {
        return _prev;
    }
    public void setNum(int num) {
        _value = num;
    }
    public void setNext(IntNodeTwo next) {
        _next = next;
    }
    public void setPrev(IntNodeTwo prev) {
        _prev = prev;
    }

}
