package IntNode;

public class IntListTwo {
    private IntNodeTwo _head;
    private IntNodeTwo _tail;

    public IntListTwo(){
        _head = null;
        _tail = null;
    }
    public IntListTwo(IntNodeTwo head, IntNodeTwo tail){
        _head = head;
        _tail = tail;
    }
    public void insertAfter(int num, IntNodeTwo node){
        IntNodeTwo temp = new IntNodeTwo(num);


        if(_head == null){
            _head = node;
            _tail = _head;
        }
        else{
            IntNodeTwo curr = _head;
            while(curr != node){
                curr=curr.getNext();
            }
            temp.setNext(curr.getNext());
            temp.setPrev(curr);
            curr.setNext(temp);
            if(temp.getNext() == null){
                _tail = temp;
            }
            else{
                temp.getNext().setPrev(temp);
            }



        }

        while(temp != null ){
            temp=temp.getNext();
            if(temp.getNum() == num){
                temp.setNext(node);
                return;
            }

        }
    }
    //negative numbers in left side, positive numbers in right side
    public void rearrange(){
        IntNodeTwo left = _head;
        IntNodeTwo right = _tail;

        while(left != right){
            if(left.getNum() < 0){
                left = left.getNext();
            }
            else if(right.getNum() > 0){
                right = right.getPrev();
            }
            else{
                int temp = left.getNum();
                left.setNum(right.getNum());
                right.setNum(temp);
            }
        }

    }
    public int enDenDino(int k){
        IntNodeTwo p = _head;
        IntNodeTwo pred = _head;

        while(!((p == _head) && ( p.getNext() == _head))){
            for ( int i=1; i<k; i++){
                pred = p;
                p = p.getNext();
            }

            pred.setNext(p.getNext());
            System.out.println (p.getNum()+ "left");
            if(p == _head)
                 _head = p.getNext();

            p = p.getNext();
        }
        return p.getNum();

    }
}
