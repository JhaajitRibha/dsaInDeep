package GeeksForGeeksSelfPaced.LinkedList.Videos.InsertAtEnd;

import GeeksForGeeksSelfPaced.Node;

public class IAEA1 {

    public static void traversal(Node head){
        Node temp = head;

        while(temp!=null){
            System.out.println(temp.data);
            temp = temp.next;

        }
        System.out.println("************8");
    }

    // 1,100->2,200->3,null
    public static Node insertionAtEnd(Node head,int data){

        Node end = new Node(data);
        if(head==null){
            head = end;

        }else{
            Node temp = head;
            while(temp.next!=null){
                temp = temp.next;
            }
            temp.next= end;
        }

        return head;
    }

    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        a.next=b;
        traversal(a);
        Node head = insertionAtEnd(a,3);
        traversal(head);
        head = insertionAtEnd(head,5);
        traversal(head);


    }
}
