package GeeksForGeeksSelfPaced.binarysearchtree.videos.DeleteElement;

import GeeksForGeeksSelfPaced.binarysearchtree.BSTNode;
import GeeksForGeeksSelfPaced.binarysearchtree.videos.InsertingElement.IEA1;

public class DEA2 {

    public static BSTNode tobeAddedNode(BSTNode root){
        while(root.right!=null){
            root=root.right;
        }
        return root;
    }

    public static BSTNode deleteNode(int data,BSTNode root){
        if(root==null){
            return null;
        }
        if(root.data == data){
            if(root.left==null && root.right==null){
                return null;
            }else if(root.left==null){
                return root.right;
            }else if(root.right==null){
                return root.left;
            }else{
                BSTNode toBeAddedNode = tobeAddedNode(root.left);
                toBeAddedNode.right=root.right;
                return root.left;
            }


        }
        if(data<root.data){
            root.left=deleteNode(data,root.left);
        }else if(data>root.data){
            root.right=deleteNode(data,root.right);
        }

        return root;
    }

    public static void main(String[] args) {
        BSTNode a = new BSTNode(8,null,null);
        BSTNode b = new BSTNode(5,null,null);
        BSTNode c = new BSTNode(12,null,null);
        BSTNode d = new BSTNode(2,null,null);
        BSTNode e = new BSTNode(7,null,null);
        BSTNode f = new BSTNode(10,null,null);
        BSTNode g = new BSTNode(13,null,null);
        BSTNode h = new BSTNode(1,null,null);
        BSTNode i = new BSTNode(3,null,null);
        BSTNode j = new BSTNode(6,null,null);
        BSTNode k = new BSTNode(8,null,null);
        BSTNode l = new BSTNode(4,null,null);

        a.left=b;
        a.right=c;
        b.left=d;
        b.right=e;
        c.left=f;
        c.right=g;
        d.left=h;
        d.right=i;
        e.left=j;
        e.right=k;
        i.right=l;

        IEA1.printBST(a);
        System.out.println();
        System.out.println("****************");

        deleteNode(12,a);
        IEA1.printBST(a);
        System.out.println();
        System.out.println("********************");

    }
}
