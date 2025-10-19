package DSA_PHASE_1_Pattern_GFGVideos.Array.LinkedList.GFGVideos.LInkedListTraversal;

import DSA_PHASE_1_Pattern_GFGVideos.Array.LinkedList.GFGVideos.Node;

public class LInkedListTraversalA1 {
    public static void linkedListTraversal(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data + " ");
            temp=temp.next;
        }
        System.out.println();
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

        linkedListTraversal(head);
    }
}
