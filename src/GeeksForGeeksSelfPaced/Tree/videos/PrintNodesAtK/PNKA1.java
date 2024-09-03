package GeeksForGeeksSelfPaced.Tree.videos.PrintNodesAtK;

import GeeksForGeeksSelfPaced.Tree.videos.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class PNKA1 {

    private static Queue<Integer> in = new LinkedList<>();

    public static void printAtK(TreeNode head,int k){
        if(head==null){
            return;
        }
        if(k==0){
            System.out.print(head.data + " ");
        }

        printAtK(head.left,k-1);
        printAtK(head.right,k-1);

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

        printAtK(a,3);

    }
}
