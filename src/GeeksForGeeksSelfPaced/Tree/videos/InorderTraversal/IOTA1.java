package GeeksForGeeksSelfPaced.Tree.videos.InorderTraversal;

import GeeksForGeeksSelfPaced.Tree.videos.TreeNode;

public class IOTA1 {

    public static void inorderTraversal(TreeNode node){
        if(node == null){
            return;
        }


        inorderTraversal(node.left);
        System.out.println(node.data);
        inorderTraversal(node.right);


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

        inorderTraversal(a);
    }

}
