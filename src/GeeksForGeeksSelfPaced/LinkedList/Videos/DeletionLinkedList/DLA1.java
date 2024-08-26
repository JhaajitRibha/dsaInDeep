package GeeksForGeeksSelfPaced.LinkedList.Videos.DeletionLinkedList;

import GeeksForGeeksSelfPaced.LinkedList.Videos.InsertionAtBeginning.IABA1;
import GeeksForGeeksSelfPaced.Node;

public class DLA1 {

    public static Node deleteFirstNode(Node head){

        if(head!=null){
            head = head.next;
        }
        return head;
    }

    public static Node deleteLastNode(Node head){
        if(head==null){
            return head;
        }

        if(head.next==null){
            head=null;
            return head;
        }


            Node temp = head;
            Node prev = temp;
            while(temp.next!=null){
                prev=temp;
                temp = temp.next;

            }

            prev.next=null;


        return head;
    }

    public static void main(String[] args) {

        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e =  new Node(5);

        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;

        IABA1.traversal(a);
        System.out.println("**************");
        Node head = deleteFirstNode(a);
        head = deleteLastNode(head);
        IABA1.traversal(head);
        System.out.println("***************");
        head=deleteFirstNode(head);
        head=deleteLastNode(head);
        IABA1.traversal(head);
        System.out.println("**********");
        head=deleteLastNode(head);
        IABA1.traversal(head);

    }
}
