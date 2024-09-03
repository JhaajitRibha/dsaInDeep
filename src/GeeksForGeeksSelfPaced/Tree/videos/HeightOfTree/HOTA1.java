package GeeksForGeeksSelfPaced.Tree.videos.HeightOfTree;

import GeeksForGeeksSelfPaced.Tree.videos.TreeNode;
import com.sun.source.tree.Tree;

public class HOTA1 {

    public static int heightOfTree(TreeNode head){

        if(head==null){
            return 0;
        }

        return (Math.max(heightOfTree(head.left),heightOfTree(head.right))+1);
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

        System.out.println(heightOfTree(a));
    }
}
