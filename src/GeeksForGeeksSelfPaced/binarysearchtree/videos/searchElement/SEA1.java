package GeeksForGeeksSelfPaced.binarysearchtree.videos.searchElement;

import GeeksForGeeksSelfPaced.binarysearchtree.BSTNode;

public class SEA1 {

    public static boolean searchElement(int data,BSTNode root){
        if(root==null){
            return false;
        }
        if(data==root.data){
            return true;
        }
        if(data<root.data){
            return searchElement(data,root.left);
        }
        return searchElement(data, root.right);

    }


    public static void main(String[] args) {

        BSTNode a = new BSTNode(10,null,null);
        BSTNode b = new BSTNode(5,null,null);
        BSTNode c = new BSTNode(15,null,null);
        BSTNode d = new BSTNode(12,null,null);
        BSTNode e = new BSTNode(18,null,null);
        a.left=b;
        a.right=c;
        c.left=d;
        c.right=e;

        System.out.println(searchElement(20,a));
    }
}
