package DSA;

import java.util.LinkedList;
import java.util.List;

public class Example {
    public static void main(String[] args) {
        List<Integer> integerList=new LinkedList<>();
        integerList.add(10);
        integerList.add(20);
        System.out.println(integerList);

        LinkedListExample obj=new LinkedListExample();
        Node head=null;
        head=obj.addElement(10,head);
//        obj.printNode(head);
        head=obj.addElement(20,head);
        obj.printNode(head);

    }
}
