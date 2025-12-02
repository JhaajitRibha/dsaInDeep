package DSA_PHASE_1_Pattern_GFGVideos.Array.LinkedList.GFGVideos.LinkedList.DeletionLinkedList.DeleteLastNode;

import DSA_PHASE_1_Pattern_GFGVideos.Array.LinkedList.GFGVideos.LinkedList.LInkedListTraversal.LInkedListTraversalA1;
import DSA_PHASE_1_Pattern_GFGVideos.Array.LinkedList.GFGVideos.LinkedList.LInkedListTraversal.LinkedListTraversalA2_Recursion;
import DSA_PHASE_1_Pattern_GFGVideos.Array.LinkedList.GFGVideos.LinkedList.Node;

public class DLNA1 {
    public static Node deleteLinkedListAtLast(Node head){
        if(head==null){
            return null;
        }
        if(head.next==null){
            return null;
        }
        Node temp = head;
        while(temp.next.next!=null){
            temp=temp.next;
        }
        temp.next=null;
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
        Node newHead = deleteLinkedListAtLast(head);
        LinkedListTraversalA2_Recursion.traversalByRecursion(newHead);
    }
}
