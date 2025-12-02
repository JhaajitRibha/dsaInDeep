package DSA_PHASE_1_Pattern_GFGVideos.Array.LinkedList.GFGVideos.LinkedList.RemoveSortedLinkedList;

import DSA_PHASE_1_Pattern_GFGVideos.Array.LinkedList.GFGVideos.LinkedList.LInkedListTraversal.LInkedListTraversalA1;
import DSA_PHASE_1_Pattern_GFGVideos.Array.LinkedList.GFGVideos.LinkedList.Node;

public class RemoveSortedLinkedListA2 {
    public static void sortedLinkedList(Node head){
        Node curr=head;
        while(curr!=null){
            Node temp=curr;
            while(temp!=null && temp.data==curr.data){
                temp=temp.next;
            }
            curr.next=temp;
            curr=curr.next;
        }
    }
    public static void main(String[] args) {
        Node head = new Node(11);
        Node second = new Node(11);
        Node third = new Node(11);
        Node four = new Node(21);
        Node five = new Node(43);
        Node six = new Node(43);
        Node seven = new Node(60);

        head.next = second;
        second.next = third;
        third.next=four;
        four.next=five;
        five.next=six;
        six.next=seven;
        LInkedListTraversalA1.linkedListTraversal(head);
        sortedLinkedList(head);
        LInkedListTraversalA1.linkedListTraversal(head);
    }
}
