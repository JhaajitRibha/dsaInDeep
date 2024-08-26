package GeeksForGeeksSelfPaced.LinkedList.Videos.PositionWithKey;

import GeeksForGeeksSelfPaced.Node;

public class PWKA1 {

    //1,100->2,200->3,300->4,400

    public static int nodeFinder(Node head,int data){
        int index=-1;
        int counter=1;
        if(head!=null){
            Node temp = head;

            while(temp!=null){
                if(temp.data==data){
                    return counter;
                }
                temp = temp.next;
                counter++;
            }
        }

        return index;
    }

    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);

        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;

        System.out.println(nodeFinder(a,4));
        System.out.println(nodeFinder(a,1));
        System.out.println(nodeFinder(a,5));
        System.out.println(nodeFinder(a,6));


    }
}
