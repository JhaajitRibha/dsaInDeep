package GeeksForGeeksSelfPaced.LinkedList.Videos.DoublyLinkedList.Deletion;

import GeeksForGeeksSelfPaced.Dnode;
import GeeksForGeeksSelfPaced.LinkedList.Videos.DoublyLinkedList.InsertAtBegDoubly.IABDA1;
import jdk.dynalink.linker.LinkerServices;

public class DeletetionA1 {
    //N,1,200->100,2,300->200,3,400->300,4,500->400,5,n
    public static Dnode deletionAtEnd(Dnode head){
        Dnode temp = head;
        if(head==null){
            return null;
        }
        while(temp.next.next!=null){
            temp = temp.next;
        }
        temp.next=null;

        return head;
    }

    public static Dnode deletionAtBeg(Dnode head){

        if(head==null){
            return null;
        }

        Dnode temp = head;
        temp = temp.next;
        temp.prev=null;

        head=temp;

        return head;
    }

    public static void main(String[] args) {
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
        Dnode head = deletionAtEnd(a);
        IABDA1.traversal(head);
        IABDA1.simpleTraversal(head);
        System.out.println("*****************");
        head = deletionAtBeg(head);
        IABDA1.simpleTraversal(head);
        System.out.println("********************");
        head = deletionAtBeg(head);
        IABDA1.simpleTraversal(head);
        System.out.println("********************");
    }

}
