package GeeksForGeeksSelfPaced.LinkedList.Videos.DoublyLinkedList.ReverseDoubly;

import GeeksForGeeksSelfPaced.Dnode;
import GeeksForGeeksSelfPaced.LinkedList.Videos.DoublyLinkedList.InsertAtBegDoubly.IABDA1;
import GeeksForGeeksSelfPaced.LinkedList.Videos.InsertionAtBeginning.IABA1;

public class RDLA1 {

    public static Dnode reverseDoubly(Dnode head){
        if(head==null|| head.next==null){
            return head;
        }

        Dnode temp = head;
        Dnode temp2=head;

        while(temp2.next!=null){
            temp2=temp2.next;
        }

        head=temp2;

        while(temp2!=null){
            Dnode counter;
            counter=temp2.next;
            temp2.next=temp2.prev;
            temp2.prev=counter;
            temp2=temp2.next;
        }


        return head;
    }
    public static void main(String[] args) {
        //N,1,200->100,2,300->200,3,400->300,4,500->400,5,n

        Dnode a = new Dnode(100);
        Dnode b = new Dnode(200);
        Dnode c = new Dnode(300);
        Dnode d = new Dnode(400);
        Dnode e = new Dnode(500);
        Dnode f = new Dnode(600);

        a.next=b;
        b.prev=a;
        b.next=c;
        c.prev=b;
        c.next=d;
        d.prev=c;
        d.next=e;
        e.prev=d;
        e.next=f;
        f.prev=e;

        IABDA1.traversal(a);
        IABDA1.simpleTraversal(a);
        Dnode head=reverseDoubly(a);
        IABDA1.traversal(head);
        IABDA1.simpleTraversal(head);




    }
}
