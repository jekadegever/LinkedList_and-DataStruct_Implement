package Linked_List;
public class IntList {
    private IntNode _head;

    public IntList() {
        _head = null;
    }

    public IntList(IntNode node) {
        _head = node;
    }

    public boolean empty() {
        return _head == null;
    }

    public IntNode nextElement(IntNode node) {
        return node.getNext();

    }

    public int getValueOfNode(IntNode node) {
        return node.getValue();
    }

    public void addToEnd(IntNode node) {
        if (empty()) {
            _head = node;
        } else {
            IntNode ptr = _head;
            while (ptr.getNext() != null) {
                ptr = ptr.getNext();
            }
            ptr.setNext(node);
        }
    }

    public void addToHead(IntNode node) {
        IntNode ptr = _head;
        _head = node;
        _head.setNext(ptr);
    }

    public void remove(int num) {
        if (!empty()) {
            if (num == _head.getValue()) {
                _head = _head.getNext();
            } else {
                IntNode ptr = _head;
                while (ptr.getNext() != null) {
                    if (ptr.getNext().getValue() == num) {
                        ptr.setNext(ptr.getNext().getNext());
                        return;
                    } else {
                        ptr = ptr.getNext();
                    }
                }
            }
        }
    }

    public int length() {
        IntNode temp = _head;
        int count = 0;
        while (temp != null) {
            count++;
            temp = temp.getNext();
        }
        return count;
    }

    public IntNode predecessor(IntNode node) {
        if (_head == null || node == _head) {
            return null;
        } else {
            IntNode temp = _head;
            while (temp.getNext() != null) {
                if (temp.getNext().getValue() == node.getValue()) {
                    return temp;
                }
                temp = temp.getNext();
            }
            return null;

        }
    }

    public boolean equals(IntList other) {
        if (this.length() != other.length()) {
            return false;
        }
        IntNode temp1 = _head;
        IntNode temp2 = other._head;

        while (temp1 != null) {
            if (temp1.getValue() != temp2.getValue()) {
                return false;
            }
            temp1 = temp1.getNext();
            temp2 = temp2.getNext();
        }
        return true;
    }

    public void printList() {
        IntNode temp = _head;
        while (temp != null) {
            System.out.print(temp.getValue() + " -> ");
            temp = temp.getNext();
        }
        System.out.print("null");
    }

    //for example
    public IntList what(int k) {
        IntNode x, y, prevX = null, prevY = _head;
        IntNode curr = _head;
        for (int i = 1; i < k && curr != null; i++) {
            prevX = curr;
            curr = curr.getNext();
        }
        x = curr;

        if (curr == null)
            return null;
        IntNode ptr = _head;
        while (curr.getNext() != null) {
            prevY = ptr;
            ptr = ptr.getNext();
            curr = curr.getNext();
        }
        y = ptr;
        if (x.getNext() == y) {
            x.setNext(y.getNext());
            y.setNext(x);
            assert prevX != null;
            prevX.setNext(y);
        } else if (y.getNext() == x) {
            y.setNext(x.getNext());
            x.setNext(y);
            prevY.setNext(x);
        } else if (x == _head) {
            _head = y;
            y.setNext(x.getNext());
            prevY.setNext(x);
            x.setNext(null);
        } else if (y == _head) {
            _head = x;
            x.setNext(y.getNext());
            assert prevX != null;
            prevX.setNext(y);
            y.setNext(null);
        } else {
            ptr = y.getNext();
            y.setNext(x.getNext());
            x.setNext(ptr);
            assert prevX != null;
            prevX.setNext(y);
            prevY.setNext(x);
        }
        return new IntList(_head);

    }

}