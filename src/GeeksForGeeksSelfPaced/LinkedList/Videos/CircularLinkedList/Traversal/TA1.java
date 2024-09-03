package GeeksForGeeksSelfPaced.LinkedList.Videos.CircularLinkedList.Traversal;

import GeeksForGeeksSelfPaced.Node;

public class TA1 {

    public static void traversal(Node head){
        if(head==null){
            return;
        }

        Node temp = head;

        do{
            System.out.println(temp.data);
            temp=temp.next;

        }while(temp!=head);
    }
    public static void main(String[] args) {
        //1,200->2,300->3,400->4,500->5,100
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(6);

        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
        f.next=a;

        traversal(a);

    }
}
