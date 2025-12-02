package DSA_PHASE_1_Pattern_GFGVideos.Array.LinkedList.GFGVideos.LinkedList.LinkedListSearch;

import DSA_PHASE_1_Pattern_GFGVideos.Array.LinkedList.GFGVideos.LinkedList.Node;

public class LLSA1 {
    public static int searchElementInLinkedList(Node head,int data){
        int pos=1;
        if(head==null){
            return -1;
        }
        Node temp = head;
        while(temp!=null){
            if(temp.data==data){
                return pos;
            }
            pos++;
            temp = temp.next;
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
        System.out.println(searchElementInLinkedList(head,1));
        System.out.println(searchElementInLinkedList(head,2));
        System.out.println(searchElementInLinkedList(head,3));
        System.out.println(searchElementInLinkedList(head,4));
        System.out.println(searchElementInLinkedList(head,5));
    }
}
