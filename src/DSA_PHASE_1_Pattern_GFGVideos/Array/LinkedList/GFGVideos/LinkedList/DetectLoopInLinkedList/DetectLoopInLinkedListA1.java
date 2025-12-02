package DSA_PHASE_1_Pattern_GFGVideos.Array.LinkedList.GFGVideos.LinkedList.DetectLoopInLinkedList;

import DSA_PHASE_1_Pattern_GFGVideos.Array.LinkedList.GFGVideos.LinkedList.LInkedListTraversal.LInkedListTraversalA1;
import DSA_PHASE_1_Pattern_GFGVideos.Array.LinkedList.GFGVideos.LinkedList.Node;

import java.util.HashMap;
import java.util.Map;

public class DetectLoopInLinkedListA1 {
    public static boolean detectLoop(Node head){
        Map<Node,Integer> map = new HashMap<>();
        while(head!=null){
            if(map.containsKey(head)){
                return true;
            }
            map.put(head,head.data);
            head=head.next;
        }
        return false;
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
        five.next=null;

//        LInkedListTraversalA1.linkedListTraversal(head);
        System.out.println(detectLoop(head));
    }
}
