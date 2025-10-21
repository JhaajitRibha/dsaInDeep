package DSA_PHASE_1_Pattern_GFGVideos.Array.LinkedList.GFGVideos.InsertionDoublyLinkedList.InsertionDoublyLinkedListBeforeAnyNode;

import DSA_PHASE_1_Pattern_GFGVideos.Array.LinkedList.GFGVideos.DoubleNode;
import DSA_PHASE_1_Pattern_GFGVideos.Array.LinkedList.GFGVideos.DoublyLinkedListTraversal.DoublyLInkedListTraversalA1;

public class IDLLBANA1 {
    public static DoubleNode insertDoublyLinkedListBeforeAnyNode(DoubleNode nextNode,DoubleNode head,int data){
        if(nextNode==null){
            return null;
        }
        DoubleNode newNode = new DoubleNode(data);
        newNode.prev = nextNode.prev;
        newNode.next=nextNode;
        nextNode.prev= newNode;
        if(newNode.prev!=null){
            newNode.prev.next=newNode;
        }else{
            head=newNode;
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
        DoubleNode newHead = insertDoublyLinkedListBeforeAnyNode(head,head,6);
        DoublyLInkedListTraversalA1.DoublyLinkedListTraversal(newHead);
    }
}
