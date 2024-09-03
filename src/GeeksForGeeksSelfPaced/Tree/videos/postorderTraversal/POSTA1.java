package GeeksForGeeksSelfPaced.Tree.videos.postorderTraversal;

import GeeksForGeeksSelfPaced.Tree.videos.TreeNode;

public class POSTA1 {


        public static void postorderTraversal(TreeNode node){
            if(node == null){
                return;
            }


            postorderTraversal(node.left);

            postorderTraversal(node.right);

            System.out.println(node.data);

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

            postorderTraversal(a);
        }
    }


