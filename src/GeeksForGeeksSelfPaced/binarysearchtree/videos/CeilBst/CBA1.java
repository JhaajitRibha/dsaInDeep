package GeeksForGeeksSelfPaced.binarysearchtree.videos.CeilBst;

import GeeksForGeeksSelfPaced.binarysearchtree.BSTNode;

public class CBA1 {

    public static int getCeil(BSTNode root,int ceilNum,int key){
        if(root==null){
            return ceilNum>Integer.MIN_VALUE?ceilNum:-1;
        }
        if(key==root.data){
            return key;
        }
        if(key<root.data){
            ceilNum= root.data;
            return getCeil(root.left,ceilNum,key);
        }
        ceilNum = key;
        return getCeil(root.right,ceilNum,key);

    }

    public static void main(String[] args) {
        BSTNode a = new BSTNode(10,null,null);
        BSTNode b = new BSTNode(5,null,null);
        BSTNode c = new BSTNode(13,null,null);
        BSTNode d = new BSTNode(3,null,null);
        BSTNode e = new BSTNode(6,null,null);
        BSTNode f = new BSTNode(11,null,null);
        BSTNode g = new BSTNode(14,null,null);
        BSTNode h = new BSTNode(2,null,null);
        BSTNode i = new BSTNode(4,null,null);
        BSTNode j = new BSTNode(9,null,null);

        a.left=b;
        a.right=c;
        b.left=d;
        b.right=e;
        c.left=f;
        c.right=g;
        d.left=h;
        d.right=i;
        e.right=j;

        System.out.println(getCeil(a,Integer.MIN_VALUE,8));
    }
}
