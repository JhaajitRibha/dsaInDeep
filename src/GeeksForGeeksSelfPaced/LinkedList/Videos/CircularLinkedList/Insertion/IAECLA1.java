package GeeksForGeeksSelfPaced.LinkedList.Videos.CircularLinkedList.Insertion;

import GeeksForGeeksSelfPaced.LinkedList.Videos.CircularLinkedList.Traversal.TA1;
import GeeksForGeeksSelfPaced.Node;

public class IAECLA1 {

    public static Node insertionAtBegCirLinList(Node head,int data){
        Node node = new Node(data);
        Node temp = head;
        if(head==null){
            node.next=node;
            head=node;
            return head;
        }

        while(temp.next!=head){
            temp=temp.next;
        }

        temp.next=node;
        node.next=head;
        head=node;

        return head;
    }

    public static Node insertionAtEndLinkCircularList(Node head,int data){
        Node node = new Node(data);
        if(head==null){
            node.next=node;
            head=node;
            return head;
        }
        Node temp = head;

        while(temp.next!=head){
            temp=temp.next;
        }

        temp.next=node;
        node.next=head;


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
        Node head = insertionAtBegCirLinList(a,101);
        TA1.traversal(head);
        System.out.println("***");
        head=insertionAtBegCirLinList(head,102);
        TA1.traversal(head);
        System.out.println("********");
        head=insertionAtEndLinkCircularList(head,501);
        TA1.traversal(head);
        System.out.println("**********");
        head=insertionAtEndLinkCircularList(head,601);
        TA1.traversal(head);
        System.out.println("**********");


    }
}
