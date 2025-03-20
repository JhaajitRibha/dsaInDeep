package GeeksForGeeksSelfPaced.binarysearchtree.videos.TwoSumBST;

import GeeksForGeeksSelfPaced.String.Videos.LeftMostNonRepeatingElement.LMNRE_A1;
import GeeksForGeeksSelfPaced.binarysearchtree.BSTNode;
import GeeksForGeeksSelfPaced.binarysearchtree.videos.BSTIterator;
import GeeksForGeeksSelfPaced.binarysearchtree.videos.BSTIteratorRight;

public class TSBSTA3 {

    public static boolean binarySumCheck(BSTNode root,int key){
        BSTIterator left = new BSTIterator(root);
        BSTIteratorRight right = new BSTIteratorRight(root);
        int a =left.next().data;
        int b= right.next().data;
        while(a<b){
            if(a+b==key){
                return true;
            }else if(a+b<key){
                a = left.next().data;
            }else{
                b=right.next().data;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        BSTNode a = new BSTNode(7,null,null);
        BSTNode b = new BSTNode(3,null,null);
        BSTNode c = new BSTNode(10,null,null);
        BSTNode d = new BSTNode(2,null,null);
        BSTNode e = new BSTNode(6,null,null);
        BSTNode f = new BSTNode(9,null,null);
        BSTNode g = new BSTNode(11,null,null);
        BSTNode h = new BSTNode(1,null,null);
        BSTNode i = new BSTNode(5,null,null);
        BSTNode j = new BSTNode(8,null,null);
        BSTNode k = new BSTNode(4,null,null);

        a.left=b;
        a.right=c;
        b.left=d;
        b.right=e;
        c.left=f;
        c.right=g;
        d.left=h;
        e.left=i;
        f.left=j;
        i.left=k;

        System.out.println(binarySumCheck(a,21));

    }
}
