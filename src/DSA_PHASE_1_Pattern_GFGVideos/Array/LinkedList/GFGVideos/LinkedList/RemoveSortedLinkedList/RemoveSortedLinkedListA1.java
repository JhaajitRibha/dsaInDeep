package DSA_PHASE_1_Pattern_GFGVideos.Array.LinkedList.GFGVideos.LinkedList.RemoveSortedLinkedList;

import DSA_PHASE_1_Pattern_GFGVideos.Array.LinkedList.GFGVideos.LinkedList.LInkedListTraversal.LInkedListTraversalA1;
import DSA_PHASE_1_Pattern_GFGVideos.Array.LinkedList.GFGVideos.LinkedList.Node;

public class RemoveSortedLinkedListA1 {
    public static Node linkedListSortedRemoveDuplicate(Node head){
        if(head==null){
            return null;
        }
        Node temp=head;
        while(temp.next!=null){
           if(temp.data==temp.next.data){
               temp.next=temp.next.next;
           }else{
               temp=temp.next;
           }
        }
        return head;
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
        linkedListSortedRemoveDuplicate(head);
        LInkedListTraversalA1.linkedListTraversal(head);

    }
}
