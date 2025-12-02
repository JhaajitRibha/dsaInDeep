package DSA_PHASE_1_Pattern_GFGVideos.Array.LinkedList.GFGVideos.LinkedList.NthFromEndLinkedList;

import DSA_PHASE_1_Pattern_GFGVideos.Array.LinkedList.GFGVideos.LinkedList.LInkedListTraversal.LInkedListTraversalA1;
import DSA_PHASE_1_Pattern_GFGVideos.Array.LinkedList.GFGVideos.LinkedList.Node;

public class NthFromEndLinkedListA1 {
    public static int NthNodeFromLinkedList(Node head,int pos){
        if(head==null){
            return -1;
        }
        Node temp=head;
        int count=0;
        while(temp!=null){
            temp=temp.next;
            count++;
        }
        if(count<pos){
            return -1;
        }
        int elementIndex=count-pos+1;
        temp=head;
        count=0;
        while(temp!=null){
            count++;
            if(count==elementIndex){
                return temp.data;
            }
            temp=temp.next;
        }
        return -1;
    }
    public static void main(String[] args) {
        Node head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node four = new Node(4);
        Node five = new Node(5);

        head.next = second;
        second.next = third;
        third.next=four;
        four.next=five;
        LInkedListTraversalA1.linkedListTraversal(head);
        System.out.println(NthNodeFromLinkedList(head,5));
    }
}
