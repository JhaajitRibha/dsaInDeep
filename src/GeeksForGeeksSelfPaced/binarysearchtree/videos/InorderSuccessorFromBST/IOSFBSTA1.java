package GeeksForGeeksSelfPaced.binarysearchtree.videos.InorderSuccessorFromBST;

import GeeksForGeeksSelfPaced.binarysearchtree.BSTNode;

public class IOSFBSTA1 {
    static BSTNode result = null;
    static boolean flag= false;
    public static BSTNode findInorderSuccessor(BSTNode root,int value) {
        if (root == null) {
            return null;
        }
        if(flag){
            return result;
        }
        findInorderSuccessor(root.left, value);
        if (root.data > value && !flag) {
            result = new BSTNode(root.data, null, null);
            flag = true;
        }
        findInorderSuccessor(root.right, value);
        return result;
    }
    public static void main(String[] args) {

        BSTNode a = new BSTNode(5,null,null);
        BSTNode b = new BSTNode(3,null,null);
        BSTNode c = new BSTNode(7,null,null);
        BSTNode d = new BSTNode(2,null,null);
        BSTNode e = new BSTNode(4,null,null);
        BSTNode f = new BSTNode(6,null,null);
        BSTNode g = new BSTNode(9,null,null);
        BSTNode h = new BSTNode(1,null,null);
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

        System.out.println(findInorderSuccessor(a,8).data);

    }
}
