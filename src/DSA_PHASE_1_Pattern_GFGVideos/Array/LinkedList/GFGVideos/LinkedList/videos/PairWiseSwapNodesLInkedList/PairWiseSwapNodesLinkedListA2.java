package DSA_PHASE_1_Pattern_GFGVideos.Array.LinkedList.GFGVideos.LinkedList.videos.PairWiseSwapNodesLInkedList;

import DSA_PHASE_1_Pattern_GFGVideos.Array.LinkedList.GFGVideos.LinkedList.Node;
import DSA_PHASE_1_Pattern_GFGVideos.Array.LinkedList.GFGVideos.LinkedList.videos.LInkedListTraversal.LInkedListTraversalA1;

public class PairWiseSwapNodesLinkedListA2 {
    public static void pairWiseSwapLinkedList(Node head){
        Node temp = head;
        while(temp!=null && temp.next!=null){
            Node prev= temp;
            temp = temp.next;
            Node temporary = temp.next;
            temp.next=prev;
            prev.next=temporary;
            temp=temp.next;
        }
    }
    public static void main(String[] args) {
        Node head = new Node(17);
        Node second = new Node(15);
        Node third = new Node(8);
        Node four = new Node(12);
        Node five = new Node(10);
        Node six = new Node(5);
        Node seven = new Node(4);
        Node eight = new Node(1);
        Node nine = new Node(7);
        Node ten = new Node(6);

        head.next =second;
        second.next = third;
        third.next=four;
        four.next=five;
        five.next=six;
        six.next=seven;
        seven.next=eight;
        eight.next=nine;
        nine.next=ten;
        ten.next=null;

        LInkedListTraversalA1.linkedListTraversal(head);
        System.out.println();
        pairWiseSwapLinkedList(head);
        LInkedListTraversalA1.linkedListTraversal(head);
        System.out.println();
    }
}
