package DSA_PHASE_1_Pattern_GFGVideos.Array.LinkedList.GFGVideos.SotedInsertInLInkedList;

import DSA_PHASE_1_Pattern_GFGVideos.Array.LinkedList.GFGVideos.LInkedListTraversal.LInkedListTraversalA1;
import DSA_PHASE_1_Pattern_GFGVideos.Array.LinkedList.GFGVideos.Node;

public class SILLA1 {
    public static Node sortedInsertLinkedList(Node head,int data){
        return null;
    }
    public static void main(String[] args) {
        Node head = new Node(1);
        Node second = new Node(20);
        Node third = new Node(30);
        Node four = new Node(40);
        Node five = new Node(50);

        head.next = second;
        second.next = third;
        third.next = four;
        four.next = five;
        LInkedListTraversalA1.linkedListTraversal(head);
        sortedInsertLinkedList(head,6);

    }
}
