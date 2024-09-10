package GeeksForGeeksSelfPaced.Tree.videos.MaximumInBinaryTree;

import GeeksForGeeksSelfPaced.Tree.videos.TreeNode;
import com.sun.source.tree.Tree;

public class MIBTA1 {

    public static int maximumInBinaryTree(TreeNode root){
        if(root==null){
            return Integer.MIN_VALUE;
        }

        int max = Math.max(maximumInBinaryTree(root.left),maximumInBinaryTree(root.right));
        return Math.max(max,root.data);


    }

    public static void main(String[] args) {
        TreeNode a = new TreeNode(10);
        TreeNode b = new TreeNode(30);
        TreeNode c = new TreeNode(40);
        TreeNode d = new TreeNode(80);
        TreeNode e = new TreeNode(60);
        TreeNode f = new TreeNode(100);
        TreeNode g = new TreeNode(70);


        a.left=b;
        a.right=c;
        b.left=d;
        b.right=e;
        c.left=e;
        c.right=f;
        d.right=g;


        System.out.println(maximumInBinaryTree(a));
        System.out.println(maximumInBinaryTree(null));

    }
}
