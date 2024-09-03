package GeeksForGeeksSelfPaced.LinkedList.Videos.InsertionInSortedLinkedList;

import GeeksForGeeksSelfPaced.Node;

public class ISLA1 {
    public static Node insertionAtSingleLinkedList(Node head,int data){

        Node node = new Node(data);
        Node temp=head;
        if(data<head.data){
            node.next=head;
            head=node;
        }

        return head;
    }
    public static void main(String[] args) {

    }
}
