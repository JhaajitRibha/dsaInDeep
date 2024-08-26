package GeeksForGeeksSelfPaced.LinkedList.Videos.DoublyLinkedList.InsertAtBegDoubly;

import GeeksForGeeksSelfPaced.Dnode;

public class IABDA1 {

    public static void traversal(Dnode head){
        Dnode temp = head;
        while(temp!=null){
            System.out.println("prev : -> " + ((temp.prev == null) ? null : temp.prev.data));
            System.out.println("data : -> " + temp.data);
            System.out.println("next : -> " + ((temp.next == null) ? null : temp.next.data));
            System.out.println("**************************");

            temp=temp.next;
        }
    }

    public static void simpleTraversal(Dnode head){
        Dnode temp = head;
        while(temp!=null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public static Dnode insertAtBegin(Dnode head, int data){
        Dnode node = new Dnode(data);
        if(head==null){
            head=node;
        }
        head.prev=node;
        node.next=head;
        head=node;
        return head;
    }

    public static void main(String[] args) {
        //N,1,200->100,2,300->200,3,400->300,4,500->400,5,n

        Dnode a = new Dnode(1);
        Dnode b = new Dnode(2);
        Dnode c = new Dnode(3);
        Dnode d = new Dnode(4);
        Dnode e = new Dnode(5);

        a.next=b;
        b.prev=a;
        b.next=c;
        c.prev=b;
        c.next=d;
        d.prev=c;
        d.next=e;
        e.prev=d;


        simpleTraversal(a);
        System.out.println("**************");
        traversal(a);
        System.out.println("------------------------");
        Dnode head = insertAtBegin(a,100);
        traversal(head);

    }
}
