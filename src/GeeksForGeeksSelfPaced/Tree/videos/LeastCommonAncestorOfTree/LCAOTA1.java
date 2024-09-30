package GeeksForGeeksSelfPaced.Tree.videos.LeastCommonAncestorOfTree;

import GeeksForGeeksSelfPaced.Tree.videos.TreeNode;

import java.util.ArrayList;

public class LCAOTA1 {

    public static boolean findPath(TreeNode root,int n,ArrayList<TreeNode> p){

        if(root==null){
            return false;
        }

        boolean flag =true;
        p.add(root);
        boolean left = findPath(root.left,n,p);
        boolean right=findPath(root.right,n,p);
        if(!left && !right){
            flag=false;
        }

        if(root.data==n){
            return true;
        }

        if(!flag){
            p.remove(p.size()-1);
        }

        return flag;

    }

    public static TreeNode lca(TreeNode root,int n1,int n2){
        if(root==null){
            return null;
        }

        ArrayList<TreeNode> first=new ArrayList<>();
        ArrayList<TreeNode> second=new ArrayList<>();

        boolean firstFlag =  findPath(root,n1,first);
        boolean secondFlag= findPath(root,n2,second);


       /* if(!firstFlag && !secondFlag){
            return null;
        }*/

        if(first.isEmpty() && second.isEmpty()){
            return null;
        }

        //both will work

        for(int i=0;i<first.size()-1&& i<second.size()-1;i++){
            if(first.get(i+1)!=second.get(i+1)){
                return first.get(i);
            }
        }

        return null;
    }


    public static void main(String[] args) {

        TreeNode a = new TreeNode(10);
        TreeNode b = new TreeNode(50);
        TreeNode c = new TreeNode(60);
        TreeNode d = new TreeNode(70);
        TreeNode e = new TreeNode(20);
        TreeNode f = new TreeNode(40);
        TreeNode g = new TreeNode(90);
        TreeNode h = new TreeNode(80);
        TreeNode i = new TreeNode(30);

        a.left=b;
        a.right=c;
        b.left=d;
        b.right=e;
        d.left=f;
        e.left=g;
        e.right=h;
        g.left=i;

        TreeNode res = lca(a,80,30);
        TreeNode res2 = lca(a,2532,535);


        System.out.println(res.data+ "  "  + res2);

    }
}
