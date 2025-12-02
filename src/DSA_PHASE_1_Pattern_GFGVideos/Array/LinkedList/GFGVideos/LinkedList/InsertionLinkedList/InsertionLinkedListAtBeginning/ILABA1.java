package DSA_PHASE_1_Pattern_GFGVideos.Array.LinkedList.GFGVideos.LinkedList.InsertionLinkedList.InsertionLinkedListAtBeginning;

import DSA_PHASE_1_Pattern_GFGVideos.Array.LinkedList.GFGVideos.LinkedList.LInkedListTraversal.LInkedListTraversalA1;
import DSA_PHASE_1_Pattern_GFGVideos.Array.LinkedList.GFGVideos.LinkedList.Node;

public class ILABA1 {
    public static Node linkedListInsertionAtBeg(Node head,int data){
        if(head==null){
            return head;
        }
        Node newNode = new Node(data);
        newNode.next=head;
        head=newNode;
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
        System.out.println("before operation:");
        LInkedListTraversalA1.linkedListTraversal(head);
        System.out.println();
        Node newHead = linkedListInsertionAtBeg(head,6);
        System.out.println("after operation");
        LInkedListTraversalA1.linkedListTraversal(newHead);

    }
}

