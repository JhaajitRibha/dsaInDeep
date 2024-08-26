package GeeksForGeeksSelfPaced.LinkedList.Videos.InsertionAtBeginning;


import GeeksForGeeksSelfPaced.Node;

public class IABA1 {

    public static void traversal(Node head){
        Node temp = head;

        while(temp!=null){
            System.out.println(temp.data);
            temp = temp.next;
        }

    }

    public static Node insertNodeAtBeginning(Node head,int data){
        Node first = new Node(data);

        if(head==null){
            head = first;
        }else {

            first.next = head;
            head = first;
        }
        return head;

    }

    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        a.next=b;
        traversal(a);
        System.out.println("***************");
        Node head = insertNodeAtBeginning(a,3);
        traversal(head);
        System.out.println("***************");
        head = insertNodeAtBeginning(head,4);
        traversal(head);

    }
}
