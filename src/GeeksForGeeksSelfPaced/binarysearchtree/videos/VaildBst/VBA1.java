package GeeksForGeeksSelfPaced.binarysearchtree.videos.VaildBst;

import GeeksForGeeksSelfPaced.binarysearchtree.BSTNode;

public class VBA1 {
    public static boolean validBst(BSTNode root,int min,int max){
        if(root==null){
            return true;
        }
        if(root.data<min || root.data>max){
            return false;
        }
        return validBst(root.left,min,root.data)&&validBst(root.right,root.data,max);
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

        boolean res = validBst(a,Integer.MIN_VALUE,Integer.MAX_VALUE);
        System.out.println(res);
    }
}
