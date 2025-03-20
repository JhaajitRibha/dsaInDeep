package GeeksForGeeksSelfPaced.binarysearchtree.videos.InorderSuccessorFromBST;

import GeeksForGeeksSelfPaced.binarysearchtree.BSTNode;

public class IOSFBSTA2 {

    public static  BSTNode inorderSuccessor(BSTNode root,int value) {
        BSTNode successor = null;
        while (root != null) {
            if (value >= root.data) {
                root = root.right;
            } else {
                successor = root;
                root = root.left;
            }
        }
        return successor;
    }

    public static void main(String[] args) {

        BSTNode a = new BSTNode(5,null,null);
        BSTNode b = new BSTNode(2,null,null);
        BSTNode c = new BSTNode(7,null,null);
        BSTNode d = new BSTNode(1,null,null);
        BSTNode e = new BSTNode(4,null,null);
        BSTNode f = new BSTNode(6,null,null);
        BSTNode g = new BSTNode(9,null,null);
        BSTNode h = new BSTNode(3,null,null);
        BSTNode i = new BSTNode(8,null,null);
        BSTNode j = new BSTNode(10,null,null);


        a.left=b;
        a.right=c;
        b.left=d;
        b.right=e;
        c.left=f;
        c.right=g;
        d.left=h;
        g.left=i;
        g.right=j;

        System.out.println(inorderSuccessor(a,3).data);

    }
}
