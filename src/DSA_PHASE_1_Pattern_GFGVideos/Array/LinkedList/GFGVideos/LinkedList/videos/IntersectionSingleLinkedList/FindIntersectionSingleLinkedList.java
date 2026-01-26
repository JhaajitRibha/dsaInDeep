package DSA_PHASE_1_Pattern_GFGVideos.Array.LinkedList.GFGVideos.LinkedList.videos.IntersectionSingleLinkedList;

import DSA_PHASE_1_Pattern_GFGVideos.Array.LinkedList.GFGVideos.LinkedList.Node;
import DSA_PHASE_1_Pattern_GFGVideos.Array.LinkedList.GFGVideos.LinkedList.videos.LInkedListTraversal.LInkedListTraversalA1;

public class FindIntersectionSingleLinkedList {
    public static int findIntersectionInLinkedList(Node head, Node head2) {
        int count1 = 0;
        int count2 = 0;

        Node temp = head;
        Node temp2 = head2;

        while (temp != null) {
            count1++;
            temp = temp.next;
        }
        while (temp2 != null) {
            count2++;
            temp2 = temp2.next;
        }
        int count = 0;
        if (count1 > count2) {
            int diff = count1-count2;
            while (head != null) {
                count++;
                if (count > diff) {
                    break;
                }
                head = head.next;
            }
        } else {
            int diff = count2 - count1;
            while (head2 != null) {
                count++;
                if (count > diff) {
                    break;
                }
                head2 = head2.next;
            }
        }

        while (head != null && head2 != null) {
                if (head.data == head2.data) {
                    return head.data;
                }
                head=head.next;
                head2 = head2.next;
            }
        return -1;
    }

    public static void main(String[] args) {
        Node head = new Node(3);
        Node second = new Node(6);
        Node third = new Node(9);
        Node four = new Node(15);
        Node five = new Node(30);
        Node head2 = new Node(10);
        Node seven = new Node(15);
        Node eight = new Node(30);

        head.next = second;
        second.next = third;
        third.next=four;
        four.next=five;
        five.next=null;

        head2.next=seven;
        seven.next=eight;
        eight.next=null;

        LInkedListTraversalA1.linkedListTraversal(head);
        System.out.println();
        System.out.println(findIntersectionInLinkedList(head,head2));
    }
}
