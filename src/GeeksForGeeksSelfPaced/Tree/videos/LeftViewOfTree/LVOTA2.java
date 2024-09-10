package GeeksForGeeksSelfPaced.Tree.videos.LeftViewOfTree;

import GeeksForGeeksSelfPaced.Tree.videos.TreeNode;

public class LVOTA2 {

    static int maxlevel = 0;

    public static void leftView(TreeNode root,int level){
        if(root==null){
            return;
        }
        if(maxlevel<level){
            System.out.print(root.data + " ");
            maxlevel=level;
        }

        leftView(root.left,level+1);
        leftView(root.right,level+1);

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

        leftView(a,1);
        System.out.println();
        maxlevel=0;
        leftView(v,1);
    }
}
