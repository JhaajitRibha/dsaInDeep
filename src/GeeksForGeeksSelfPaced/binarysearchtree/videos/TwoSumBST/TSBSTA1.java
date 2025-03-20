package GeeksForGeeksSelfPaced.binarysearchtree.videos.TwoSumBST;

import GeeksForGeeksSelfPaced.binarysearchtree.BSTNode;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class TSBSTA1 {

    private static ArrayList<BSTNode> elements= new ArrayList();
    public static void twoSumFinder(BSTNode root){
        if(root==null){
            return;
        }
        twoSumFinder(root.left);
        elements.add(root);
        twoSumFinder(root.right);
    }

    public static boolean twoSumFinderMain(BSTNode root,int key){
        twoSumFinder(root);
        int i=0;
        int j=elements.size()-1;
        while(i<j){
            if(elements.get(i).data+elements.get(j).data==key){
                return true;
            }else if(elements.get(i).data+elements.get(j).data<key){
                i++;
            }else{
                j--;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        BSTNode a = new BSTNode(5,null,null);
        BSTNode b = new BSTNode(3,null,null);
        BSTNode c = new BSTNode(6,null,null);
        BSTNode d = new BSTNode(2,null,null);
        BSTNode e = new BSTNode(4,null,null);
        BSTNode f = new BSTNode(7,null,null);
        a.left=b;
        a.right=c;
        b.left=d;
        b.right=e;
        c.right=f;
        System.out.println(twoSumFinderMain(a,8));

    }
}
