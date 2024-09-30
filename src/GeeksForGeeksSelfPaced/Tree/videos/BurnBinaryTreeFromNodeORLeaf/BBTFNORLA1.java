package GeeksForGeeksSelfPaced.Tree.videos.BurnBinaryTreeFromNodeORLeaf;

import GeeksForGeeksSelfPaced.Tree.videos.TreeNode;
import com.sun.source.tree.Tree;

import java.util.HashMap;
import java.util.Map;

public class BBTFNORLA1 {

    public static Map<TreeNode,TreeNode> parentHolder=new HashMap<>();

    public static void parentConstructor(TreeNode root){
        if(root == null){
            return;
        }

        if(root.left!=null) {
            parentHolder.put(root.left, root);
        }
        if(root.right!=null){
            parentHolder.put(root.right, root);
        }

        parentConstructor(root.left);
        parentConstructor(root.right);
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
        c.right=f;
        e.left=g;
        e.right=h;
        f.right=i;
        i.right=j;

        parentHolder.put(a,null);

        parentConstructor(a);


        parentHolder.forEach((k,v)->{
            if(k!=null && v!=null){
                System.out.println(k.data + " : " + v.data);
            }
        });

    }
}
