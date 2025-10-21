package DSA_PHASE_1_Pattern_GFGVideos.Array.LinkedList.GFGVideos.DeletionLinkedList.DeleteFirstNode;

import DSA_PHASE_1_Pattern_GFGVideos.Array.LinkedList.GFGVideos.LInkedListTraversal.LInkedListTraversalA1;
import DSA_PHASE_1_Pattern_GFGVideos.Array.LinkedList.GFGVideos.Node;

public class DFNA1 {
    public static Node deleteFirstNode(Node head){
        if(head==null){
            return null;
        }
        head=head.next;
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
        Node newHead=deleteFirstNode(head);
        LInkedListTraversalA1.linkedListTraversal(newHead);
    }

}
