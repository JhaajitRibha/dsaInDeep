package GeeksForGeeksSelfPaced.binarysearchtree.videos.LCABST;

import GeeksForGeeksSelfPaced.binarysearchtree.BSTNode;

public class LCABSTA1 {

    static BSTNode result = null;
    public static BSTNode lowestCommonAncestor(BSTNode root,BSTNode first,BSTNode second){
        if(root==null){
            return null;
        }

        if(root.data>first.data&& root.data>second.data){
            return lowestCommonAncestor(root.left,first,second);
        }
        else if(root.data<first.data && root.data<second.data){
            return lowestCommonAncestor(root.right,first,second);
        }
        else{
            return root;
        }
    }
    public static void main(String[] args) {
        BSTNode a = new BSTNode(10,null,null);
        BSTNode b = new BSTNode(4,null,null);
        BSTNode c = new BSTNode(13,null,null);
        BSTNode d = new BSTNode(3,null,null);
        BSTNode e = new BSTNode(8,null,null);
        BSTNode f = new BSTNode(11,null,null);
        BSTNode g = new BSTNode(15,null,null);
        BSTNode h = new BSTNode(1,null,null);
        BSTNode i = new BSTNode(6,null,null);
        BSTNode j = new BSTNode(9,null,null);
        BSTNode k = new BSTNode(2,null,null);
        BSTNode l = new BSTNode(5,null,null);
        BSTNode m = new BSTNode(7,null,null);
        a.left=b;
        a.right=c;
        b.left=d;
        b.right=e;
        c.left=f;
        c.right=g;
        d.left=h;
        e.left=i;
        e.right=j;
        h.left=k;
        i.left=l;
        i.right=m;
        BSTNode res = lowestCommonAncestor(a,j,l);
        System.out.println(res==null?"null":res.data);
    }
}
