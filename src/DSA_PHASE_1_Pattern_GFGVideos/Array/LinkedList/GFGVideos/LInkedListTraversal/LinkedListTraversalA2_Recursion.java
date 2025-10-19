package DSA_PHASE_1_Pattern_GFGVideos.Array.LinkedList.GFGVideos.LInkedListTraversal;

import DSA_PHASE_1_Pattern_GFGVideos.Array.LinkedList.GFGVideos.Node;

public class LinkedListTraversalA2_Recursion {
    public static void traversalByRecursion(Node head){
        if(head==null){
            return;
        }
        System.out.print(head.data+" ");
        head=head.next;
        traversalByRecursion(head);
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
        traversalByRecursion(head);
    }
}
