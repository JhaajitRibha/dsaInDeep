package GeeksForGeeksSelfPaced.binarysearchtree.videos.InsertingElement;

import GeeksForGeeksSelfPaced.binarysearchtree.BSTNode;

public class IEA1 {

    public static BSTNode insertionElement(int data,BSTNode root){
        BSTNode node  = new BSTNode(data,null,null);

        if(root==null){
            root= node;
            return root;
        }
        boolean flag=false;
        BSTNode left=null;
        BSTNode right= null;

        if(data<root.data){
           left= insertionElement(data,root.left);
        }
        if(data>root.data){
            right=insertionElement(data,root.right);
            flag=true;
        }

        if(flag){
            root.right=right;
        }else{
            root.left=left;
        }

        return root;

    }


     public static void printBST(BSTNode root){
        if(root==null){
            return;
        }
         System.out.println(root.data);
        if(root.left!=null){
            printBST(root.left);
        }
        if(root.right!=null){
            printBST(root.right);
         }


     }


    public static void main(String[] args) {

        BSTNode a = new BSTNode(10,null,null);
        BSTNode b = new BSTNode(5,null,null);
        BSTNode c = new BSTNode(15,null,null);
        BSTNode d = new BSTNode(12,null,null);
        BSTNode e = new BSTNode(18,null,null);

        a.left=b;
        a.right=c;
        c.left=d;
        c.right=e;

        printBST(a);

        System.out.println();
        System.out.println();

        BSTNode afterInsertion = insertionElement(6,a);
        printBST(a);

        BSTNode afterInsertionTwo = insertionElement(7,a);
        printBST(a);

    }
}
