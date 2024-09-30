package GeeksForGeeksSelfPaced.Tree.videos.CountNodesInCompleteBinaryTree;

import GeeksForGeeksSelfPaced.Tree.videos.TreeNode;

public class CNICBTA1 {

    public static int countNodesInCompleteBinaryTree(TreeNode root){

        if(root==null){
            return 0;
        }

        int lh=0;
        int rh=0;

        TreeNode curr=root;

        while(curr!=null){
            lh++;
            curr=curr.left;
        }

        curr=root;

        while(curr!=null){
            rh++;
            curr=curr.right;
        }



        return (lh==rh)?(int)Math.pow(2,lh)-1:1+countNodesInCompleteBinaryTree(root.left)+countNodesInCompleteBinaryTree(root.right);
    }

    public static void main(String[] args) {

        TreeNode a = new TreeNode(10);
        TreeNode b = new TreeNode(20);
        TreeNode c = new TreeNode(30);
        TreeNode d = new TreeNode(40);
        TreeNode e = new TreeNode(50);
        TreeNode f = new TreeNode(60);
        TreeNode g = new TreeNode(70);
        TreeNode h = new TreeNode(80);
        TreeNode i = new TreeNode(90);
        TreeNode j = new TreeNode(100);
        TreeNode k = new TreeNode(110);
        TreeNode l = new TreeNode(120);

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
        f.left=l;


        System.out.println(countNodesInCompleteBinaryTree(a));

    }
}
