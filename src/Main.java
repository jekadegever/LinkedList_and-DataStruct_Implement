//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import Data_Structures.Stack;
import Linked_List.IntList;
import Linked_List.IntNode;

public class Main {
    public static void main(String[] args) {

   //list learning
     /*   IntNode a = new IntNode(2);
        IntNode b = new IntNode(17);
        IntNode c = new IntNode(13);
        IntNode d = new IntNode(7);
        IntNode e = new IntNode(10);
        IntNode f = new IntNode(5);
        IntNode g = new IntNode(4);
        IntNode h = new IntNode(20);

        a.setNext(b);
        b.setNext(c);
        c.setNext(d);
        d.setNext(e);
        e.setNext(f);
        f.setNext(g);
        g.setNext(h);



        IntList list1 = new IntList(a);
        //IntList list2 = new IntList(c);


        list1.printList();
        //System.out.println();
       //list2.printList();

       //System.out.println("\n"+ list1.equals(list2));
IntList temp = new IntList();
temp = list1.what(3);
System.out.println("\n");
temp.printList();

*/
        //stack learning
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);


       // System.out.println(stack);
        stack.print();
    }
}