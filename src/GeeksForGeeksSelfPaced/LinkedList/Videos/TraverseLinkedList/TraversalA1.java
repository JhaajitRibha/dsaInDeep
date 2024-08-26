package GeeksForGeeksSelfPaced.LinkedList.Videos.TraverseLinkedList;

class Node{
    int data;
    Node next;

    public Node(int data){
        this.data=data;
        this.next=null;
    }
}

public class TraversalA1 {


    public static void traversalTreasory(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(6);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next= f;

        traversalTreasory(a);

    }
}
