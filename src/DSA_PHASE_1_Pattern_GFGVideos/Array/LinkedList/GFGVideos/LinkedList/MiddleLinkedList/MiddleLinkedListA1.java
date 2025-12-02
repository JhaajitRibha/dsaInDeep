package DSA_PHASE_1_Pattern_GFGVideos.Array.LinkedList.GFGVideos.LinkedList.MiddleLinkedList;

import DSA_PHASE_1_Pattern_GFGVideos.Array.LinkedList.GFGVideos.LinkedList.LInkedListTraversal.LInkedListTraversalA1;
import DSA_PHASE_1_Pattern_GFGVideos.Array.LinkedList.GFGVideos.LinkedList.Node;

public class MiddleLinkedListA1 {
    public static int findMiddleLinkedListElement(Node head){
        if(head==null){
            return -1;
        }
        if(head.next==null){
            return head.data;
        }
        Node temp = head;
        int count=1;
        while(temp!=null){
            temp=temp.next;
            count++;
        }
        int pos =(count%2==0?count/2:(count/2)+1);
        temp=head;
        count=1;
        while(temp!=null){
            if(count==pos){
                return temp.data;
            }else{
                count++;
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
        Node six = new Node(6);


        head.next = second;
//        second.next = third;
//        third.next=four;
//        four.next=five;
//        five.next=six;

        LInkedListTraversalA1.linkedListTraversal(head);
        System.out.println(findMiddleLinkedListElement(head));
    }
}

