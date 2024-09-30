package GeeksForGeeksSelfPaced.Tree.videos.SpiralTreePrinting;

import GeeksForGeeksSelfPaced.Node;
import GeeksForGeeksSelfPaced.Tree.videos.TreeNode;
import com.sun.source.tree.Tree;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class STPA1 {

    public static void spiralTree(TreeNode root) {

        Queue<TreeNode> q = new LinkedList<>();
        Stack<TreeNode> s = new Stack<>();

        boolean flag = false;

        q.add(root);

        while(!q.isEmpty()){
            int size = q.size();
            for(int i=0;i<size;i++){
                TreeNode curr = q.poll();
                if(flag){
                    s.push(curr);
                }else{
                    System.out.print(curr.data + " ");
                }

                if(curr.left!=null){
                    q.add(curr.left);
                }
                if(curr.right!=null){
                    q.add(curr.right);
                }
            }
            while(!s.isEmpty()){
                System.out.print(s.pop().data+ " ");
            }

            System.out.println();
            flag=!flag;
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

        spiralTree(a);

    }
}
