package DSA_PHASE_1_Pattern_GFGVideos.Array.LinkedList.GFGVideos.LinkedList.LinkedListReversal;

import DSA_PHASE_1_Pattern_GFGVideos.Array.LinkedList.GFGVideos.LinkedList.LInkedListTraversal.LInkedListTraversalA1;
import DSA_PHASE_1_Pattern_GFGVideos.Array.LinkedList.GFGVideos.LinkedList.Node;

public class LLRA1 {
    public Node reverseLinkedList(Node head){
        Node prev = null;
        Node next=null;
        Node current=head;
        while(current!=null){
            next = current.next;
            current.next=prev;
            prev=current;
            current=next;
        }

        head=prev;
        return head;
    }



    public static void main(String[] args) {
        Node head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node four = new Node(4);
        Node five = new Node(5);

        head.next = second;
        second.next = third;
        third.next=four;
        four.next=five;

        LInkedListTraversalA1.linkedListTraversal(head);
        System.out.println();
        LInkedListTraversalA1.linkedListTraversal(new LLRA1().reverseLinkedList(head));
    }
}
