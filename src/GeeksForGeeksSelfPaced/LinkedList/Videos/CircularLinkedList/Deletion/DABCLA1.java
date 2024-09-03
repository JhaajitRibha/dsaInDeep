package GeeksForGeeksSelfPaced.LinkedList.Videos.CircularLinkedList.Deletion;

import GeeksForGeeksSelfPaced.LinkedList.Videos.CircularLinkedList.Traversal.TA1;
import GeeksForGeeksSelfPaced.Node;

public class DABCLA1 {

    public static Node deletionAtBegCircularLinkedList(Node head){
        if(head==null){
            return head;
        }

        Node temp = head;

        while(temp.next!=head){
            temp = temp.next;
        }

        temp.next=head.next;
        head=head.next;


        return head;
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

        TA1.traversal(a);
        System.out.println("****");
        Node head=deletionAtBegCircularLinkedList(a);
        TA1.traversal(head);

    }
}
