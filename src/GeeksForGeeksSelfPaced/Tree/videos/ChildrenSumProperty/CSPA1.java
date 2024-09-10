package GeeksForGeeksSelfPaced.Tree.videos.ChildrenSumProperty;

import GeeksForGeeksSelfPaced.Tree.videos.TreeNode;

public class CSPA1 {
    public static boolean csp(TreeNode root){
        if(root==null){
            return true;
        }
        if(root.left==null && root.right==null){
            return true;
        }

        int a=0;
        int b=0;

        if(root.left!=null){
            a=root.left.data;
        }else{
            a=0;
        }

        if(root.right!=null){
            b=root.right.data;
        }else{
            b=0;
        }

        int sum = a+b;

        if(sum!=root.data){
            return false;
        }

        boolean leftFlag = csp(root.left);
        boolean rightFlag = csp(root.right);

        return leftFlag&rightFlag;

    }
    public static void main(String[] args) {

        TreeNode a = new TreeNode(20);
        TreeNode b = new TreeNode(8);
        TreeNode c = new TreeNode(12);
        TreeNode d = new TreeNode(3);
        TreeNode e = new TreeNode(5);
        TreeNode f = new TreeNode(2);

        a.left=b;
        a.right=c;
        b.left=d;
        b.right=e;
        c.left=f;

        System.out.println(csp(a));
    }
}
