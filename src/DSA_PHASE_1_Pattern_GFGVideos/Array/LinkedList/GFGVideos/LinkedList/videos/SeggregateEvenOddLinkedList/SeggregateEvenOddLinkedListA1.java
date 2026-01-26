package DSA_PHASE_1_Pattern_GFGVideos.Array.LinkedList.GFGVideos.LinkedList.videos.SeggregateEvenOddLinkedList;

import DSA_PHASE_1_Pattern_GFGVideos.Array.LinkedList.GFGVideos.LinkedList.Node;
import DSA_PHASE_1_Pattern_GFGVideos.Array.LinkedList.GFGVideos.LinkedList.videos.LInkedListTraversal.LInkedListTraversalA1;

public class SeggregateEvenOddLinkedListA1 {

    public static Node seggregateEvenOddLinkedList(Node head){
        Node odd = null;
        Node even = null;
        Node temp = head;
        while(temp!=null){
            Node newNode = new Node(temp.data);
            if(temp.data%2==0){
                if(even==null){
                    even = newNode;

                }else{
                    Node tempEven = even;
                    while(tempEven.next!=null){
                        tempEven= tempEven.next;
                    }
                    tempEven.next=newNode;
                }
            }else{
                if(odd==null){
                    odd = newNode;

                }else{
                    Node tempOdd = odd;
                    while(tempOdd.next!=null){
                        tempOdd= tempOdd.next;
                    }
                    tempOdd.next=newNode;
                }
            }
            temp = temp.next;
        }
        if(even!=null) {
            Node evenTemp = even;
            while (evenTemp.next != null) {
                evenTemp = evenTemp.next;
            }
            evenTemp.next=odd;
            head=even;
        }else{
            head= odd;
        }
        return head;
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

        head.next = second;
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
        Node headAfter = seggregateEvenOddLinkedList(head);
        LInkedListTraversalA1.linkedListTraversal(headAfter);

    }
}
