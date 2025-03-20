package GeeksForGeeksSelfPaced.binarysearchtree.videos.TwoSumBST;

import GeeksForGeeksSelfPaced.binarysearchtree.BSTNode;

public class TSBSTA2 {
    static int[] arrayContainer;
    static int index=0;
    public static int countNodes(BSTNode root){
        if(root==null){
            return 0;
        }
        return 1+countNodes(root.left)+countNodes(root.right);
    }
    public static void twoSumFinder(BSTNode root){
        if(root==null){
            return;
        }
        twoSumFinder(root.left);
        arrayContainer[index++]=root.data;
        twoSumFinder(root.right);
    }
    public static boolean twoSumFinderMain(BSTNode root, int key){
        int count = countNodes(root);
        arrayContainer = new int[count];
        index=0;
        twoSumFinder(root);
        int i=0;
        int j=arrayContainer.length-1;
        while(i<j){
            if(arrayContainer[i]+arrayContainer[j]==key){
                return true;
            }else if(arrayContainer[i]+arrayContainer[j]<key){
                i++;
            }else{
                j--;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        BSTNode a = new BSTNode(5, null, null);
        BSTNode b = new BSTNode(3, null, null);
        BSTNode c = new BSTNode(6, null, null);
        BSTNode d = new BSTNode(2, null, null);
        BSTNode e = new BSTNode(4, null, null);
        BSTNode f = new BSTNode(7, null, null);
        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        c.right = f;
        System.out.println(twoSumFinderMain(a, 111));
    }
}
