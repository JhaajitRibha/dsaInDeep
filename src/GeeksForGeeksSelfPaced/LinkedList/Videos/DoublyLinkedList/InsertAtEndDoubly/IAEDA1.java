package GeeksForGeeksSelfPaced.LinkedList.Videos.DoublyLinkedList.InsertAtEndDoubly;

import GeeksForGeeksSelfPaced.Dnode;
import GeeksForGeeksSelfPaced.LinkedList.Videos.DoublyLinkedList.InsertAtBegDoubly.IABDA1;

public class IAEDA1 {

    public static Dnode insertAtEnd(Dnode head,int data){
        Dnode node = new Dnode(data);
        if(head==null){
            head=node;
        }else{
            Dnode temp = head;
            while(temp.next!=null){
                temp = temp.next;
            }

            temp.next=node;
            node.prev=temp;
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

        a.next=b;
        b.prev=a;
        b.next=c;
        c.prev=b;
        c.next=d;
        d.prev=c;
        d.next=e;
        e.prev=d;

        IABDA1.traversal(a);
        Dnode head=insertAtEnd(a,101);
        IABDA1.traversal(head);
        head = insertAtEnd(head,102);
        IABDA1.traversal(head);
    }
}
