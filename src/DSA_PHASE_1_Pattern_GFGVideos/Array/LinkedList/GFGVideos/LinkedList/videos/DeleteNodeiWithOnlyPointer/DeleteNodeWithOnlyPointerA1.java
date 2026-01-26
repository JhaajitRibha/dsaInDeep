package DSA_PHASE_1_Pattern_GFGVideos.Array.LinkedList.GFGVideos.LinkedList.videos.DeleteNodeiWithOnlyPointer;

import DSA_PHASE_1_Pattern_GFGVideos.Array.LinkedList.GFGVideos.LinkedList.Node;
import DSA_PHASE_1_Pattern_GFGVideos.Array.LinkedList.GFGVideos.LinkedList.videos.LInkedListTraversal.LInkedListTraversalA1;

import java.util.LinkedList;

public class DeleteNodeWithOnlyPointerA1 {
    public static void deleteNodeWithPointer(Node pointer){
        pointer.data = pointer.next.data;
        pointer.next=pointer.next.next;
    }
    public static void main(String[] args) {
        Node head = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);
        Node four = new Node(40);
        Node five = new Node(50);

        head.next = second;
        second.next = third;
        third.next=four;
        four.next=five;
        five.next=null;

        LInkedListTraversalA1.linkedListTraversal(head);
        deleteNodeWithPointer(head);
        LInkedListTraversalA1.linkedListTraversal(head);
    }
}
