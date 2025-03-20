package GeeksForGeeksSelfPaced.binarysearchtree.videos.KthSmallestElement;

import GeeksForGeeksSelfPaced.Node;
import GeeksForGeeksSelfPaced.binarysearchtree.BSTNode;
import GeeksForGeeksSelfPaced.binarysearchtree.videos.NodeCounts;
import GeeksForGeeksSelfPaced.binarysearchtree.videos.NodeWithCount;

public class KSEA1 {

    private static int count=0;
    private static int result=-1;

    public static void kthSmallestNumber(BSTNode root,int k){
        if(root==null){
            return;
        }
        kthSmallestNumber(root.left,k);

        count++;
        if(count==k){
            result=root.data;
            return;
        }

        kthSmallestNumber(root.right,k);
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


        kthSmallestNumber(a,5);
        System.out.println(result);


    }
}
