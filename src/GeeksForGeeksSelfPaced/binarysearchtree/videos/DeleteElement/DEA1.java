package GeeksForGeeksSelfPaced.binarysearchtree.videos.DeleteElement;

import GeeksForGeeksSelfPaced.binarysearchtree.BSTNode;
import GeeksForGeeksSelfPaced.binarysearchtree.videos.InsertingElement.IEA1;

public class DEA1 {

    public static BSTNode closestLarger(BSTNode root){
        BSTNode current=  root.right;
        while(current!=null && current.left!=null){
            current= current.left;
        }

        return current;
    }
    public static BSTNode deleteElement(int data,BSTNode root){
        if(root==null){
            return  null;
        }

        BSTNode current = root;
        if(data<current.data){
            root.left=deleteElement(data,current.left);
        }else if(data>current.data){
            root.right=deleteElement(data,current.right);
        }else{
            if(current.left==null && current.right==null){
                return null;
            }else if(current.left==null){
                return current.right;
            }else if(current.right==null){
                return current.left;
            }else{
                BSTNode closestLargerElement = closestLarger(current);
                root.data = closestLargerElement.data;
                root.right=deleteElement(root.data,root.right);
            }
        }

        return root;
    }

    public static void main(String[] args) {
        BSTNode a = new BSTNode(50,null,null);
        BSTNode b = new BSTNode(30,null,null);
        BSTNode c = new BSTNode(70,null,null);
        BSTNode d = new BSTNode(40,null,null);
        BSTNode e = new BSTNode(60,null,null);
        BSTNode f = new BSTNode(80,null,null);

        a.left=b;
        a.right=c;
        b.right=d;
        c.left=e;
        c.right=f;

        IEA1.printBST(a);
        System.out.println();

        BSTNode result = deleteElement(50,a);
        IEA1.printBST(result);
    }
}
