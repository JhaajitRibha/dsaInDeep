package DSA_PHASE_1_Pattern_GFGVideos.Array.LinkedList.GFGVideos.LinkedList.SotedInsertInLInkedList;

import DSA_PHASE_1_Pattern_GFGVideos.Array.LinkedList.GFGVideos.LinkedList.LInkedListTraversal.LInkedListTraversalA1;
import DSA_PHASE_1_Pattern_GFGVideos.Array.LinkedList.GFGVideos.LinkedList.Node;

public class SILLA1 {
    public static Node sortedInsertLinkedList(Node head,int data){
        Node newNode=new Node(data);
        if(head==null){
            return newNode;
        }
        if(head.data>data){
            newNode.next=head;
            head=newNode;
            return head;
        }
        Node temp = head;
        while(temp.next!=null && data>temp.next.data){
            temp=temp.next;
        }
        newNode.next=temp.next;
        temp.next=newNode;
        return head;
    }
    public static void main(String[] args) {
        Node head = new Node(1);
        Node second = new Node(20);
        Node third = new Node(30);
        Node four = new Node(40);
        Node five = new Node(50);

        head.next = second;
        second.next = third;
        third.next = four;
        four.next = five;
        LInkedListTraversalA1.linkedListTraversal(head);
        Node newHead = sortedInsertLinkedList(head,0);
        LInkedListTraversalA1.linkedListTraversal(newHead);
    }
}
