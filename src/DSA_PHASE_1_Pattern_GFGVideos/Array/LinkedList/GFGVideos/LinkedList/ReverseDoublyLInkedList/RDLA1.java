package DSA_PHASE_1_Pattern_GFGVideos.Array.LinkedList.GFGVideos.LinkedList.ReverseDoublyLInkedList;

import DSA_PHASE_1_Pattern_GFGVideos.Array.LinkedList.GFGVideos.LinkedList.DoubleNode;
import DSA_PHASE_1_Pattern_GFGVideos.Array.LinkedList.GFGVideos.LinkedList.DoublyLinkedListTraversal.DoublyLInkedListTraversalA1;

public class RDLA1 {
    public static DoubleNode reverseDoublyLinkedList(DoubleNode head){

        DoubleNode temp= head;
        DoubleNode t=null;
        while(temp!=null){
            t = temp.prev;
            temp.prev= temp.next;
            temp.next=t;
            temp=temp.prev;
        }
        if(t!=null){
            head=t.prev;
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
        DoubleNode newHead=reverseDoublyLinkedList(head);
        DoublyLInkedListTraversalA1.DoublyLinkedListTraversal(newHead);
    }
}
