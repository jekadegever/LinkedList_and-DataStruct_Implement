package Data_Structures;

import Linked_List.IntNode;

public class Queue {
   //parameters of queue
    private IntNode _head;
    private IntNode _tail;


    public Queue(){
        _head = null;
        _tail = null;
    }

    public boolean isEmpty(){
        return _head == null;
    }
    public void enqueue(int num){
        //create IntNode eleent to be able send it in setNext method
        IntNode temp = new IntNode(num, null);
        //if there is already element in tail, make the tail point to new element
        if(!(_tail == null)){
            _tail.setNext(temp);
        }
        // now the new element is tail
        _tail = temp;

        // if all was empty, the first element is tail and head
        if(_head == null){
            _head = _tail;
        }
    }
    public int dequeue(){
        int temp = _head.getValue();
        _head = _head.getNext();
        return temp;

    }
    public int first(){
        return _head.getValue();
    }

}
