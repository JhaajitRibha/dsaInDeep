package DSA_PHASE_1_Pattern_GFGVideos.Array.LinkedList.GFGVideos.LinkedListSearch;

import DSA_PHASE_1_Pattern_GFGVideos.Array.LinkedList.GFGVideos.Node;

public class LLSA2_Recursion {
    public int searchElementRecursive(Node head, int data) {
        if (head == null) {
            return -1;
        }
        if (head.data == data) {
            return 1;
        }
        int res = searchElementRecursive(head.next, data);
        if (res == -1) {
            return -1;
        } else {
            return res + 1;
        }
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
    }
}
