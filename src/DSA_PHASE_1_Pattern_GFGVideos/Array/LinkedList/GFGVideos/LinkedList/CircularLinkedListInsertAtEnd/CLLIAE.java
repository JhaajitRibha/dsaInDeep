package DSA_PHASE_1_Pattern_GFGVideos.Array.LinkedList.GFGVideos.LinkedList.CircularLinkedListInsertAtEnd;

import DSA_PHASE_1_Pattern_GFGVideos.Array.LinkedList.GFGVideos.LinkedList.CircularLinkedListTraversal.CLLTA1;
import DSA_PHASE_1_Pattern_GFGVideos.Array.LinkedList.GFGVideos.LinkedList.Node;

public class CLLIAE {
    public static Node insertCircularLinkedListAtEnd(Node head,int data){
        Node newNode = new Node(data);
        if(head==null){
            newNode.next=newNode;
            head=newNode;
            return head;
        }
        Node temp = head;
        while(temp.next!=head){
            temp=temp.next;
        }
        temp.next=newNode;
        newNode.next=head;
        return head;
    }
    public static void main(String[] args) {
        Node head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node four = new Node(4);
        Node five = new Node(5);

        head.next=head;

//        head.next = second;
//        second.next = head;
//        third.next=four;
//        four.next=five;
//        five.next=head;
        CLLTA1.printCircularLinkedList(head);
        Node newHead= insertCircularLinkedListAtEnd(head,101);
        CLLTA1.printCircularLinkedList(newHead);
    }
}
