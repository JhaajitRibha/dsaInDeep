package DSA_PHASE_1_Pattern_GFGVideos.Array.LinkedList.GFGVideos.DeleteHeadCircularLinkedList;

import DSA_PHASE_1_Pattern_GFGVideos.Array.LinkedList.GFGVideos.Node;

public class DHCLLA2 {
    public static Node deleteHeadCicularLinkedList(Node head){
        if(head==null)return null;
        if(head.next==head)
            return null;
        head.data=head.next.data;
        head.next=head.next.next;
        return head;
    }
}
