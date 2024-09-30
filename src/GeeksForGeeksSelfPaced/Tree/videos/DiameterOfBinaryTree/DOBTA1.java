package GeeksForGeeksSelfPaced.Tree.videos.DiameterOfBinaryTree;

import GeeksForGeeksSelfPaced.Tree.videos.TreeNode;

public class DOBTA1 {



    public static UtilityMax diameterOfTree(TreeNode root,int max){
        if(root==null){
            return new UtilityMax(0,0);
        }
        UtilityMax left = diameterOfTree(root.left,max);
        UtilityMax right= diameterOfTree(root.right,max);

        int count = 1+left.count+right.count;
        int tempMax = Math.max(left.max,right.max);
        max = Math.max(count,tempMax);

        count = 1+Math.max(left.count,right.count);

        return new UtilityMax(max,count);

    }

    public static void main(String[] args) {

        TreeNode a = new TreeNode(10);
        TreeNode b = new TreeNode(20);
        TreeNode c = new TreeNode(30);
        TreeNode d = new TreeNode(40);
        TreeNode e = new TreeNode(50);
        TreeNode f = new TreeNode(60);
        TreeNode g = new TreeNode(80);
        TreeNode h = new TreeNode(90);
        TreeNode i = new TreeNode(69);
        TreeNode j = new TreeNode(18);

//        a.left=b;
//        a.right=c;
//        b.left=d;
//        b.right=e;
//        d.left=f;
//        d.right=g;
//        e.right=h;
//        f.left=i;
//        h.right=j;

        UtilityMax res = diameterOfTree(a,Integer.MIN_VALUE);
        System.out.println(res.max);



    }
}
