package GeeksForGeeksSelfPaced.Tree.videos.LeftViewOfTree;

import GeeksForGeeksSelfPaced.Tree.videos.TreeNode;
import com.sun.source.tree.Tree;

public class LVOTA1 {

    public static void leftView(TreeNode root){
        if(root == null){
            return;
        }

        System.out.print(root.data+ " ");
        if(root.left==null){
            leftView(root.right);
        }else {
            leftView(root.left);
        }
    }

    public static void main(String[] args) {
        TreeNode a = new TreeNode(10);
        TreeNode b = new TreeNode(20);
        TreeNode c = new TreeNode(30);
        TreeNode d = new TreeNode(40);
        TreeNode e = new TreeNode(50);
        TreeNode f = new TreeNode(60);
        TreeNode g = new TreeNode(70);

        TreeNode v = new TreeNode(30);
        TreeNode w = new TreeNode(50);
        TreeNode x = new TreeNode(60);
        TreeNode y = new TreeNode(10);

        v.right=w;
        w.left=x;
        x.right=y;


        a.left=b;
        a.right=c;
        b.left=d;
        b.right=e;
        c.left=e;
        c.right=f;



        leftView(a);
        System.out.println();
        leftView(v);
    }
}
