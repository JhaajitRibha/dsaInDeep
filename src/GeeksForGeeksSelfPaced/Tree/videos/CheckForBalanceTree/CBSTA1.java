package GeeksForGeeksSelfPaced.Tree.videos.CheckForBalanceTree;

import GeeksForGeeksSelfPaced.Tree.videos.HeightOfTree.HOTA1;
import GeeksForGeeksSelfPaced.Tree.videos.TreeNode;

public class CBSTA1 {

    public static boolean checkBalanceTree(TreeNode root){
        if(root==null){
            return true;
        }

        int left= HOTA1.heightOfTree(root.left);
        int right=HOTA1.heightOfTree(root.right);

        int sum = Math.abs(left-right);
        if(sum>1){
            return false;
        }

        return (checkBalanceTree(root.left) && checkBalanceTree(root.right));

    }


    public static void main(String[] args) {

        TreeNode a = new TreeNode(30);
        TreeNode b = new TreeNode(40);
        TreeNode c = new TreeNode(80);
        TreeNode d = new TreeNode(50);
        TreeNode e = new TreeNode(70);
        TreeNode f = new TreeNode(5);
        TreeNode g = new TreeNode(20);
        TreeNode h = new TreeNode(10);

        a.left=b;
        a.right=c;
        b.left=d;
        b.right=e;
        c.left=f;
        e.left=g;
        e.right=h;



//        a.left=b;
//        a.right=c;
//        b.left=d;
//        b.right=e;
//        c.right=f;
//        f.left=g;


//         a.left=b;
//         b.left=c;


//        a.left=b;
//        a.right=c;
//        c.left=d;
//        c.right=e;

        System.out.println(checkBalanceTree(a));
    }
}
