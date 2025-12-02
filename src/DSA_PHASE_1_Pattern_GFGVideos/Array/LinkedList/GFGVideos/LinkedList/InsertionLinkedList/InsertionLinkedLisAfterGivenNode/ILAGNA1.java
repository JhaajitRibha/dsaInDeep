package DSA_PHASE_1_Pattern_GFGVideos.Array.LinkedList.GFGVideos.LinkedList.InsertionLinkedList.InsertionLinkedLisAfterGivenNode;

import DSA_PHASE_1_Pattern_GFGVideos.Array.LinkedList.GFGVideos.LinkedList.LInkedListTraversal.LInkedListTraversalA1;
import DSA_PHASE_1_Pattern_GFGVideos.Array.LinkedList.GFGVideos.LinkedList.Node;

public class ILAGNA1 {
    public static void insertAfterGivenNode(Node node,int data){
        if(node==null){
            return;
        }
        Node newNode = new Node(data);
        newNode.next=node.next;
        node.next=newNode;
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
        insertAfterGivenNode(head,101);
        LInkedListTraversalA1.linkedListTraversal(head);

    }
}
