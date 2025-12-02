package DSA_PHASE_1_Pattern_GFGVideos.Array.LinkedList.GFGVideos.LinkedList.MiddleLinkedList;

import DSA_PHASE_1_Pattern_GFGVideos.Array.LinkedList.GFGVideos.LinkedList.LInkedListTraversal.LInkedListTraversalA1;
import DSA_PHASE_1_Pattern_GFGVideos.Array.LinkedList.GFGVideos.LinkedList.Node;

public class MiddleLinkedListA2 {
    public static int middleLinkedListFind(Node head){
        Node temp=head;
        Node temp2 = head;
        while(temp2!=null && temp2.next!=null){
            temp=temp.next;
            temp2=temp2.next.next;
        }
        return temp.data;
    }
    public static void main(String[] args) {
        Node head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node four = new Node(4);
        Node five = new Node(5);
        Node six = new Node(6);


        head.next = second;
        second.next = third;
        third.next=four;
        four.next=five;
        LInkedListTraversalA1.linkedListTraversal(head);
        System.out.println(middleLinkedListFind(head));
    }

}
