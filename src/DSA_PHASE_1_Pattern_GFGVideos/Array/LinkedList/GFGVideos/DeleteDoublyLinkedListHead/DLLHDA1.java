package DSA_PHASE_1_Pattern_GFGVideos.Array.LinkedList.GFGVideos.DeleteDoublyLinkedListHead;

import DSA_PHASE_1_Pattern_GFGVideos.Array.LinkedList.GFGVideos.DoubleNode;
import DSA_PHASE_1_Pattern_GFGVideos.Array.LinkedList.GFGVideos.DoublyLinkedListTraversal.DoublyLInkedListTraversalA1;
import DSA_PHASE_1_Pattern_GFGVideos.Array.LinkedList.GFGVideos.Node;

public class DLLHDA1 {
    public static DoubleNode DeleteDoublyLinkedListHead(DoubleNode head){
        if(head==null){
            return head;
        }
        if(head.next==null){
            return null;
        }
        head=head.next;
        head.prev=null;
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
        DoubleNode newHead= DeleteDoublyLinkedListHead(head);
        DoublyLInkedListTraversalA1.DoublyLinkedListTraversal(newHead);

    }
}
