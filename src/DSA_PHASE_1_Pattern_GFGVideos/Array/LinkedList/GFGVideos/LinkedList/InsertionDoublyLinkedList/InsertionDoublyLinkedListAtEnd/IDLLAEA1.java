package DSA_PHASE_1_Pattern_GFGVideos.Array.LinkedList.GFGVideos.LinkedList.InsertionDoublyLinkedList.InsertionDoublyLinkedListAtEnd;

import DSA_PHASE_1_Pattern_GFGVideos.Array.LinkedList.GFGVideos.LinkedList.DoubleNode;
import DSA_PHASE_1_Pattern_GFGVideos.Array.LinkedList.GFGVideos.LinkedList.DoublyLinkedListTraversal.DoublyLInkedListTraversalA1;

public class IDLLAEA1 {
    public static DoubleNode insertDoublyLinkedList(DoubleNode head,int data){
        DoubleNode newNode = new DoubleNode(data);
        if(head==null){
            head=newNode;
            return head;
        }
        DoubleNode temp = head;
        while(temp.next!=null){
            temp=temp.next;
        }
        newNode.prev=temp;
        temp.next=newNode;
        return head;
    }
    public static void main(String[] args) {
        DoubleNode  head = new DoubleNode(1);
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
        System.out.println();
        DoubleNode newHead = insertDoublyLinkedList(head,6);
        DoublyLInkedListTraversalA1.DoublyLinkedListTraversal(newHead);

    }
}
