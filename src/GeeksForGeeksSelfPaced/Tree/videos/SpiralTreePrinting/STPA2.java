package GeeksForGeeksSelfPaced.Tree.videos.SpiralTreePrinting;

import GeeksForGeeksSelfPaced.Tree.videos.TreeNode;

import java.util.Stack;

public class STPA2 {

    public static void spiralTraversal(TreeNode root){

        Stack<TreeNode> s1=new Stack<>();
        Stack<TreeNode> s2 = new Stack<>();



        s1.push(root);


        while(!s1.isEmpty() || !s2.isEmpty()){
            while(!s1.isEmpty()){
                TreeNode curr= s1.pop();
                System.out.print(curr.data+ " ");
                if(curr.left!=null) {
                    s2.push(curr.left);
                }
                if(curr.right!=null) {
                    s2.push(curr.right);
                }

            }
            System.out.println();

            while(!s2.isEmpty()){
                TreeNode curr = s2.pop();
                System.out.print(curr.data +" ");
                if(curr.right!=null) {
                    s1.push(curr.right);
                }
                if(curr.left!=null) {
                    s1.push(curr.left);
                }
            }
            System.out.println();
        }


    }

    public static void main(String[] args) {
        TreeNode a = new TreeNode(1);
        TreeNode b = new TreeNode(2);
        TreeNode c = new TreeNode(3);
        TreeNode d = new TreeNode(4);
        TreeNode e = new TreeNode(5);
        TreeNode f = new TreeNode(6);
        TreeNode g = new TreeNode(7);
        TreeNode h = new TreeNode(8);
        TreeNode i = new TreeNode(9);
        TreeNode j = new TreeNode(10);

        a.left=b;
        a.right=c;
        b.left=d;
        b.right=e;
        c.left=f;
        c.right=g;
        d.left=h;
        d.right=i;
        f.left=j;

        spiralTraversal(a);

    }

}
