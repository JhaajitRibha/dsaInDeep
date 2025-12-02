package DSA_PHASE_1_Pattern_GFGVideos.Array.LinkedList.GFGVideos.LinkedList.InsertionDoublyLinkedList.InsertionDoublyLInkedListAfterAnyNode;

import DSA_PHASE_1_Pattern_GFGVideos.Array.LinkedList.GFGVideos.LinkedList.DoubleNode;
import DSA_PHASE_1_Pattern_GFGVideos.Array.LinkedList.GFGVideos.LinkedList.DoublyLinkedListTraversal.DoublyLInkedListTraversalA1;

public class IDLNAANA1 {
    public static DoubleNode insertDoublyLinkedListAfterAnyGivenNode(DoubleNode prevNode,DoubleNode head,int data){
        if(prevNode==null){
            return head;
        }
        DoubleNode newNode = new DoubleNode(data);
        newNode.next=prevNode.next;
        newNode.prev = prevNode;
        prevNode.next=newNode;
        if(newNode.next!=null){
            newNode.next.prev=newNode;
        }
        return head;
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
        DoublyLInkedListTraversalA1.DoublyLinkedListTraversal(head);
        DoubleNode newHead = insertDoublyLinkedListAfterAnyGivenNode(second,head,101);
        DoublyLInkedListTraversalA1.DoublyLinkedListTraversal(newHead);
    }
}
