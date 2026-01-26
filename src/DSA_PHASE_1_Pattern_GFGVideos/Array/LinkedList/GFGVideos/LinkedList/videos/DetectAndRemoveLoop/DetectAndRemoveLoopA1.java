package DSA_PHASE_1_Pattern_GFGVideos.Array.LinkedList.GFGVideos.LinkedList.videos.DetectAndRemoveLoop;

import DSA_PHASE_1_Pattern_GFGVideos.Array.LinkedList.GFGVideos.LinkedList.videos.LInkedListTraversal.LInkedListTraversalA1;
import DSA_PHASE_1_Pattern_GFGVideos.Array.LinkedList.GFGVideos.LinkedList.Node;

public class DetectAndRemoveLoopA1 {
    public static Node detectLoopAndRemove(Node head){
        Node slow=head;
        Node fast=head;
        while(slow!=null && fast!=null && fast.next!=null){
            slow=slow.next;
            fast= fast.next.next;
            if(slow==fast){
                removeLoop(slow,head);
                return head;
            }
        }
        return head;
    }

    public static void removeLoop(Node loop,Node head){
        Node ptr1 = loop;
        Node ptr2 = head;
        while(ptr1!=ptr2){
            ptr1 = ptr1.next;
            ptr2 = ptr2.next;
        }

        ptr2 = ptr2.next;
        if(ptr1!=ptr2.next){
            ptr2=ptr2.next;
        }
        ptr2.next=null;
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
        five.next=third;

//        LInkedListTraversalA1.linkedListTraversal(head);
        detectLoopAndRemove(head);
        LInkedListTraversalA1.linkedListTraversal(head);

    }
}
