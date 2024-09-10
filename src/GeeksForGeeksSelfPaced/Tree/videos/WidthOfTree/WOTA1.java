package GeeksForGeeksSelfPaced.Tree.videos.WidthOfTree;

import GeeksForGeeksSelfPaced.Tree.videos.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class WOTA1 {

    public static int widthOfTree(TreeNode root){

        if(root==null){
            return -1;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        int counter=0;
        int max=0;

        queue.add(root);

        while(!queue.isEmpty()){
            counter = queue.size();
            max = Math.max(counter,max);

            for(int i=0;i<counter;i++){
                TreeNode current=queue.poll();
                if(current.left!=null){
                    queue.add(current.left);
                }
                if(current.right!=null){
                    queue.add(current.right);
                }


            }

        }

          return max;

    }
    public static void main(String[] args) {
        TreeNode a = new TreeNode(8);
        TreeNode b = new TreeNode(30);
        TreeNode c = new TreeNode(20);
        TreeNode d = new TreeNode(90);
        TreeNode e = new TreeNode(100);
        TreeNode f = new TreeNode(70);
        TreeNode g = new TreeNode(300);

        a.left=b;
        a.right=c;
        b.left=d;
        b.right=e;
        c.left=f;
        c.right=g;

        System.out.println(widthOfTree(a));
    }
}
