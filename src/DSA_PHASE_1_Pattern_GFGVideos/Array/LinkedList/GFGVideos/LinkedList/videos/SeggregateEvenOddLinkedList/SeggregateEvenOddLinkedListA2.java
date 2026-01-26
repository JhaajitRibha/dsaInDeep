package DSA_PHASE_1_Pattern_GFGVideos.Array.LinkedList.GFGVideos.LinkedList.videos.SeggregateEvenOddLinkedList;

import DSA_PHASE_1_Pattern_GFGVideos.Array.LinkedList.GFGVideos.LinkedList.Node;
import DSA_PHASE_1_Pattern_GFGVideos.Array.LinkedList.GFGVideos.LinkedList.videos.LInkedListTraversal.LInkedListTraversalA1;

public class SeggregateEvenOddLinkedListA2 {
    public static Node seggregateEvenOddLinkedList(Node head){
        Node evenCurrent = null;
        Node evenHead = null;
        Node oddCurrent = null;
        Node oddHead = null;
        Node temp = head;
        while(temp!=null){
            if(temp.data%2==0){
                if(evenHead==null){
                    evenHead=temp;
                    evenCurrent=evenHead;
                }else{
                    evenCurrent.next=temp;
                    evenCurrent = evenCurrent.next;

                }
            }else{
                if(oddHead == null){
                    oddHead=temp;
                    oddCurrent=oddHead;
                }else{
                    oddCurrent.next=temp;
                    oddCurrent=oddCurrent.next;

                }
            }
            temp  = temp.next;
        }

        if(evenHead==null || oddHead==null){
            return head;
        }else{
            evenCurrent.next=oddHead;
            oddCurrent.next=null;
            head=evenHead;
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
