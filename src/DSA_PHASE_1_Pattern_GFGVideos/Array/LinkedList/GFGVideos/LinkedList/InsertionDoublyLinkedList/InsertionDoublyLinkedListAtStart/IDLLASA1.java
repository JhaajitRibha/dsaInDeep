package DSA_PHASE_1_Pattern_GFGVideos.Array.LinkedList.GFGVideos.LinkedList.InsertionDoublyLinkedList.InsertionDoublyLinkedListAtStart;

import DSA_PHASE_1_Pattern_GFGVideos.Array.LinkedList.GFGVideos.LinkedList.DoubleNode;
import DSA_PHASE_1_Pattern_GFGVideos.Array.LinkedList.GFGVideos.LinkedList.DoublyLinkedListTraversal.DoublyLInkedListTraversalA1;

public class IDLLASA1 {
    public static DoubleNode insertDoublyLinkedListAtStart(DoubleNode head,int data){
        DoubleNode newNode = new DoubleNode(data);
        if(head==null){
            return newNode;
        }
        newNode.next=head;
        head.prev=newNode;
        head=newNode;
        return newNode;
    }
    public static void main(String[] args) {
        DoubleNode head = new DoubleNode(1);
        DoubleNode  second = new DoubleNode(2);
        DoubleNode  third = new DoubleNode(3);
        DoubleNode fourth  =new DoubleNode(4);
        DoubleNode fifth = new DoubleNode(5);

        head.prev=null;
        head.next=second;
        second.prev=head;
        second.next=third;
        third.prev=second;
        third.next=fourth;
        fourth.prev=third;
        fourth.next=fifth;
        fifth.prev=fourth;
        fifth.next=null;

        DoublyLInkedListTraversalA1.DoublyLinkedListTraversal(null);
        DoubleNode newNode = insertDoublyLinkedListAtStart(null,100);
        DoublyLInkedListTraversalA1.DoublyLinkedListTraversal(newNode);
    }
}
