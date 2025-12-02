package DSA_PHASE_1_Pattern_GFGVideos.Array.LinkedList.GFGVideos.LinkedList.LinkedListReversalGroup;

import DSA_PHASE_1_Pattern_GFGVideos.Array.LinkedList.GFGVideos.LinkedList.LInkedListTraversal.LInkedListTraversalA1;
import DSA_PHASE_1_Pattern_GFGVideos.Array.LinkedList.GFGVideos.LinkedList.Node;

public class LinkedListReversalGroupA1 {

    public static Node reverseLinkedListGroup(Node head,int k){
        if (head == null) return null;

        Node current = head;
        Node prev = null;
        Node next = null;
        int count = 0;

        while (current != null && count < k) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
            count++;
        }

        if (next != null) {
            head.next = reverseLinkedListGroup(next, k);
        }

        return prev;
    }


    public static void main(String[] args) {
        Node head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node four = new Node(4);
        Node five = new Node(5);
        Node six = new Node(6);
        Node seven = new Node(7);
        Node eight = new Node(8);


        head.next = second;
        second.next = third;
        third.next=four;
        four.next=five;
        five.next=six;
        six.next=seven;
        seven.next=eight;
        eight.next=null;

        LInkedListTraversalA1.linkedListTraversal(head);
        System.out.println();
        LInkedListTraversalA1.linkedListTraversal(reverseLinkedListGroup(head,5));


    }
}
