package IntNode;

public class Stack {
    private IntNode _top;

    public Stack() {
        _top = null;
    }
     public boolean isEmpty() {
        return _top == null;
     }
     //push method  create temp that hold the new num and point top top
    // then replace and make the new node as top
     public void push(int num) {
        IntNode temp = new IntNode(num,_top);
        _top = temp;
     }
    // only if stack is not empty!!
     //pop method - delete the num by making the top point to the next one
    // and hold the num in temp and return the temp
    public int pop() {
        int temp = _top.getValue();
        _top = _top.getNext();
        return temp;
    }

    public int top(){
        int temp = _top.getValue();
        return temp;
    }
    public String toString() {
        String s="";
        Stack s1 = new Stack();
        while(!isEmpty()){
            int temp = pop();
            s1.push(temp);
            s += temp+ "\t";
        }
        while(!s1.isEmpty()){
            int temp = s1.pop();
            push(temp);
        }
        return s;
    }

    public void print(){
        if(!isEmpty()){
            int x = pop();
            System.out.println(x);
            print();
            push(x);
        }
    }
}
