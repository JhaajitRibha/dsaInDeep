package GeeksForGeeksSelfPaced.LinkedList.Videos.CircularLinkedList.KthDeletion;

import GeeksForGeeksSelfPaced.LinkedList.Videos.CircularLinkedList.Traversal.TA1;
import GeeksForGeeksSelfPaced.Node;

public class DeleteAtPosition {

    public static Node deleteWithK(Node head,int k) {
        Node prev=head;
        Node next = head;
        if(head==null){
                System.out.println("can't be deleted");
                return head;
        }

        if(head.next==head){
            if(k>1){
                System.out.println("can't be deleted");
                return head;
            }
            head=null;
            return head;
        }

        Node tail=head.next;
        while(tail.next!=head){
            tail=tail.next;
        }

        if(k==1){
            head=head.next;
            tail.next=head;
            return head;
        }

        int count=1;
        boolean flag=false;

        while(next.next!=head){
            prev=next;
            next=next.next;
            count++;
            if(count==k){
                flag=true;
                break;
            }
        }

        if(!flag){
            System.out.println("can't be deleted");
            return head;
        }

        prev.next=next.next;
        return head;
    }

    public static void main(String[] args) {
        //1,200->2,300->3,400->4,500->5->100
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);


        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=a;

        TA1.traversal(a);
        System.out.println("***********");
        Node head=deleteWithK(a,6);
        TA1.traversal(head);



    }
}
