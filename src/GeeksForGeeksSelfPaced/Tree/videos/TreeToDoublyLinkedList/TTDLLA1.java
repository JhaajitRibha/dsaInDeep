package GeeksForGeeksSelfPaced.Tree.videos.TreeToDoublyLinkedList;

import GeeksForGeeksSelfPaced.Dnode;
import GeeksForGeeksSelfPaced.Tree.videos.TreeNode;

public class TTDLLA1 {

    static Dnode head= null;

    public static void treeToDoublyLinkedList(TreeNode root){


        if(root==null){
            return;
        }

        treeToDoublyLinkedList(root.left);
        TTDLLA1.head=addNodeAtEnd(head,root.data);
        treeToDoublyLinkedList(root.right);

    }

    public static Dnode addNodeAtEnd(Dnode head,int data){

        Dnode node = new Dnode(data);
        if(head==null){
            head=node;
            return head;
        }
        Dnode temp = head;

        while(temp.next!=null){
            temp = temp.next;
        }

        temp.next=node;
        node.prev=temp;


        return head;

    }

    public static void main(String[] args) {

        TreeNode a =new TreeNode(10);
        TreeNode b = new TreeNode(5);
        TreeNode c = new TreeNode(20);
        TreeNode d = new TreeNode(30);
        TreeNode e = new TreeNode(35);

        a.left=b;
        a.right=c;
        c.left=d;
        c.right=e;


        treeToDoublyLinkedList(a);

        while(head!=null){
            System.out.print((head.prev==null?null:head.prev.data)+ " : " + head.data +" : " + (head.next==null?null:head.next.data));
            System.out.println();
            head = head.next;
        }

    }
}
