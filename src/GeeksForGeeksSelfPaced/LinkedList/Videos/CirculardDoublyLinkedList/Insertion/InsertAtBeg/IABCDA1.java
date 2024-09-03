package GeeksForGeeksSelfPaced.LinkedList.Videos.CirculardDoublyLinkedList.Insertion.InsertAtBeg;

import GeeksForGeeksSelfPaced.Dnode;

public class IABCDA1 {
    public static void traversalDoublyCirLinList(Dnode head){
        Dnode temp=head;
        do{
            System.out.println(temp.data+ " ");
            temp=temp.next;

        }while(temp!=head);
    }

    public static Dnode insertAtBegDoublyCirLin(Dnode head,int data){
        Dnode node =new Dnode(data);
        if(head==null){

            node.prev=head;
            node.next=head;
            head=node;
        }else{

            node.next=head.next;
            node.prev=head;
            head.next=node;

            int temp=head.data;
            head.data=head.next.data;
            head.next.data=temp;


        }
        return head;
    }



    public static void main(String[] args) {
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
        e.next=a;
        a.prev=e;

        traversalDoublyCirLinList(a);
        Dnode head=insertAtBegDoublyCirLin(a,101);
        traversalDoublyCirLinList(head);
    }
}
