package GeeksForGeeksSelfPaced.LinkedList.Videos.RecursiveTravelLinkedList;

class Node{
    int data;
    Node next;

    public Node(int data){
        this.data = data;
        this.next = null;
    }
}




public class RTLA1 {
    public static void traversal(Node head){

        if(head == null){
            return;
        }

        System.out.println(head.data);
        traversal(head.next);
    }

    public static void main(String[] args) {
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


        traversal(a);
    }
}
