package DSA_PHASE_1_Pattern_GFGVideos.Array.LinkedList.GFGVideos.DeleteHeadCircularLinkedList;

import DSA_PHASE_1_Pattern_GFGVideos.Array.LinkedList.GFGVideos.CircularLinkedListTraversal.CLLTA1;
import DSA_PHASE_1_Pattern_GFGVideos.Array.LinkedList.GFGVideos.Node;

public class DHCLLA1 {
    public static Node deleteCircularLinkedListHead(Node head){
        if(head==null){
            return null;
        }
        if(head.next==head){
            return null;
        }
        Node temp=head;
        while(temp.next!=head){
            temp=temp.next;
        }
        head = head.next;
        temp.next=head;

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
        Node newHead = deleteCircularLinkedListHead(head);
        CLLTA1.printCircularLinkedList(newHead);

    }
}
