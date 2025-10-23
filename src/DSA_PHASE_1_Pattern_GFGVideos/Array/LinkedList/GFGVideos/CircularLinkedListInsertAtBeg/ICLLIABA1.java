package DSA_PHASE_1_Pattern_GFGVideos.Array.LinkedList.GFGVideos.CircularLinkedListInsertAtBeg;

import DSA_PHASE_1_Pattern_GFGVideos.Array.LinkedList.GFGVideos.LInkedListTraversal.LInkedListTraversalA1;
import DSA_PHASE_1_Pattern_GFGVideos.Array.LinkedList.GFGVideos.CircularLinkedListTraversal.CLLTA1;
import DSA_PHASE_1_Pattern_GFGVideos.Array.LinkedList.GFGVideos.Node;

public class ICLLIABA1 {
    public static Node circularLinkedListInsertAtBeg(int data,Node head){
        Node newNode =new Node(data);
        if(head==null){
            newNode.next = newNode;
            return newNode;
        }

        Node temp = head;
        while(temp.next!=head){
            temp=temp.next;
        }
        newNode.next=head;
        temp.next=newNode;
        head=newNode;
        return head;
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
        five.next=head;
       CLLTA1.printCircularLinkedList(head);
        Node newHead= circularLinkedListInsertAtBeg(6,head);
        CLLTA1.printCircularLinkedList(newHead);


    }
}
