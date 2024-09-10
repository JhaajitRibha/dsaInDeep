package GeeksForGeeksSelfPaced.Tree.videos.SizeOfTree;

import GeeksForGeeksSelfPaced.Tree.videos.TreeNode;

public class SOTA1 {

    public static int sizeOfTree(TreeNode root){
        if(root==null){
            return 0;
        }

        return 1+sizeOfTree(root.left)+sizeOfTree(root.right);
    }

    public static void main(String[] args) {
        TreeNode a = new TreeNode(10);
        TreeNode b = new TreeNode(80);
        TreeNode c = new TreeNode(70);
        TreeNode d = new TreeNode(30);
        TreeNode e = new TreeNode(40);
        TreeNode f = new TreeNode(100);



        a.left=b;
        a.right=c;
        b.left=d;
        b.right=e;
        c.left=f;

        System.out.println(sizeOfTree(a));
    }
}
