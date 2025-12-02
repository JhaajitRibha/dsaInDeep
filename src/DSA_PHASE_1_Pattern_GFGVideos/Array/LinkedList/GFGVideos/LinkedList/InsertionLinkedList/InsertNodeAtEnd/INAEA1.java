package DSA_PHASE_1_Pattern_GFGVideos.Array.LinkedList.GFGVideos.LinkedList.InsertionLinkedList.InsertNodeAtEnd;

import DSA_PHASE_1_Pattern_GFGVideos.Array.LinkedList.GFGVideos.LinkedList.LInkedListTraversal.LInkedListTraversalA1;
import DSA_PHASE_1_Pattern_GFGVideos.Array.LinkedList.GFGVideos.LinkedList.Node;

public class INAEA1 {
    public static void insertAtEnd(Node head,int data){
        if(head==null){
            return;
        }
        Node newNode = new Node(data);
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
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
        insertAtEnd(head,10);
        LInkedListTraversalA1.linkedListTraversal(head);
    }
}
