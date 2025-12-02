package DSA_PHASE_1_Pattern_GFGVideos.Array.LinkedList.GFGVideos.LinkedList.DoublyLinkedListTraversal;

import DSA_PHASE_1_Pattern_GFGVideos.Array.LinkedList.GFGVideos.LinkedList.DoubleNode;

public class DoublyLInkedListTraversalA1 {
    public static void DoublyLinkedListTraversal(DoubleNode head){
        if(head==null) {
            return;
        }
        DoubleNode temp = head;
        while(temp!=null){
            System.out.print(temp.data+ " ");
            temp = temp.next;
        }
        System.out.println();
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
        DoublyLinkedListTraversal(head);
    }
}
