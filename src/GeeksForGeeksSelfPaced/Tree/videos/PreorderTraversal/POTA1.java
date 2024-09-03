package GeeksForGeeksSelfPaced.Tree.videos.PreorderTraversal;

import GeeksForGeeksSelfPaced.Tree.videos.TreeNode;

public class POTA1 {
    public static void preorderTraversal(TreeNode node){
        if(node == null){
            return;
        }

        System.out.println(node.data);
        preorderTraversal(node.left);

        preorderTraversal(node.right);


    }
    public static void main(String[] args) {
        TreeNode a = new TreeNode(10);
        TreeNode b = new TreeNode(20);
        TreeNode c = new TreeNode(30);
        TreeNode d = new TreeNode(40);
        TreeNode e = new TreeNode(50);

        a.left=b;
        a.right=c;
        c.left=d;
        c.right=e;

        preorderTraversal(a);
    }
}
