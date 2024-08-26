package GeeksForGeeksSelfPaced.LinkedList.Videos.InsertAtPostition;

import GeeksForGeeksSelfPaced.LinkedList.Videos.InsertAtEnd.IAEA1;
import GeeksForGeeksSelfPaced.Node;

public class IAPA1 {

    //1,100->2,200->3,null
    public static Node insertAtPosition(Node head,int data,int position){
        int count = 0;
        Node counterTemp = head;
        Node node = new Node(data);
        Node temp = head;



        while(counterTemp!=null){
            count++;
            counterTemp = counterTemp.next;
        }

        if(position>count+1 || position<1){
            System.out.println("cant be added");

        }else{
            if(position==1){
                node.next=head;
                head=node;
            }else if(position==count+1){
                while(temp.next!=null){
                    temp=temp.next;
                }
                temp.next=node;
            }else {
                temp=head;
                Node prev = head;
                int counter = 1;
                while (counter != position) {
                    prev = temp;
                    temp = temp.next;
                    counter++;

                }

                prev.next=node;
                node.next=temp;
            }
        }

        return head;
    }

    public static void main(String[] args) {
        Node a = new Node(1);
        Node b =  new Node(2);
        Node c = new Node(3);
        a.next=b;
        b.next=c;
        IAEA1.traversal(a);

        Node head=insertAtPosition(a,25,3);
        IAEA1.traversal(head);
        head=insertAtPosition(head,35,1);
        IAEA1.traversal(head);
        head=insertAtPosition(head,45,2);
        IAEA1.traversal(head);
    }
}

