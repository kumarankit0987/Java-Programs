package DSA;


class Node{
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
    }
}
public class LinkedListExample {
    public Node addElement(int element,Node head){
        if (head==null){
            head=new Node(element);
        }else {
            Node temp=head;
            while (temp.next!=null){
                temp=temp.next;
            }
            temp.next=new Node(element);
        }
        return head;
    }

    public void printNode(Node head){
        while (head !=null){
            System.out.println(head.data);
            head=head.next;
        }
    }

}
