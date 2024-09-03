package GeeksForGeeksSelfPaced.Tree.videos.LevelOrderTraversal;

import GeeksForGeeksSelfPaced.Tree.videos.TreeNode;
import com.sun.source.tree.Tree;

import java.util.LinkedList;
import java.util.Queue;

public class LOTA1 {
    public static void levelOrderTraversal(TreeNode head){

        if(head==null){
            return ;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(head);

        while(!queue.isEmpty()){
            TreeNode current = queue.poll();
            System.out.print(current.data + " ");
            if(current.left!=null){
                queue.add(current.left);
            }
            if(current.right!=null){
                queue.add(current.right);
            }
        }

    }
    public static void main(String[] args) {
        TreeNode a = new TreeNode(10);
        TreeNode b = new TreeNode(6);
        TreeNode c = new TreeNode(8);
        TreeNode d = new TreeNode(7);
        TreeNode e = new TreeNode(11);
        TreeNode f = new TreeNode(12);

        a.left=b;
        a.right=c;
        c.right=d;
        d.left=e;
        d.right=f;

        levelOrderTraversal(a);
    }
}
