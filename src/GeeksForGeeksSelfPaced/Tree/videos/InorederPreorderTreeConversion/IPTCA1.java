package GeeksForGeeksSelfPaced.Tree.videos.InorederPreorderTreeConversion;

import GeeksForGeeksSelfPaced.Tree.videos.LevelOrderTraversal.LOTA1;
import GeeksForGeeksSelfPaced.Tree.videos.TreeNode;

import java.util.Arrays;

public class IPTCA1 {

    public static TreeNode roots;
    public static TreeNode temp = roots;

    public static void conversion(int[] in,int[] pre,int ini,int pri,boolean flag,TreeNode roots){
        if(in.length==1){
            return;
        }

        if(roots==null){
            roots = new TreeNode(pre[pri]);

        }

        int length=0;

        for(int i=0;i<in.length;i++){
            if(in[i]==roots.data){
                break;
            }
            length++;
        }

        int[] leftArr= new int[length];
        for(int i=0;i<in.length;i++){
            if(in[i]==roots.data){
                break;
            }
            leftArr[i]=in[i];
        }
        int rightLength=0;
        for(int i=in.length-1;i>=0;i--){
            if(in[i]==roots.data){
                break;
            }
            rightLength++;
        }

        int[] rightArr = new int[rightLength];

        for(int i=0;i<rightArr.length;i++){
            rightArr[i] = in[i+rightLength];
        }

        flag=false;
        if(!flag && leftArr.length!=0){

            TreeNode left = new TreeNode(pre[pri+1]);
            roots.left=left;
            conversion(leftArr,pre,0,pri+1,flag,roots.left);

        }

        flag=true;
        if(flag && rightArr.length!=0){

            TreeNode right = new TreeNode(pre[pri+2]);
            roots.right=right;
            conversion(rightArr,pre,0,pri+2,flag,roots.right);
        }
    }


    public static void main(String[] args) {

        int[] in = {40,20,50,10,30,80,70,90};
        int[] pre = {10,20,40,50,30,70,80,90};

        conversion(in,pre,0,0,false,temp);




    }
}


//public class IPTCA1 {
//
//    public static TreeNode roots;
//
//    public static TreeNode conversion(int[] in, int[] pre, int inStart, int inEnd, int preIndex) {
//        if (inStart > inEnd) {
//            return null;
//        }
//
//        // Create a new TreeNode with the current root value from preorder
//        TreeNode node = new TreeNode(pre[preIndex]);
//
//        // Find the index of this node in the inorder array
//        int inorderIndex = 0;
//        for (int i = inStart; i <= inEnd; i++) {
//            if (in[i] == node.data) {
//                inorderIndex = i;
//                break;
//            }
//        }
//
//        // Recursively construct the left and right subtrees
//        node.left = conversion(in, pre, inStart, inorderIndex - 1, preIndex + 1);
//        node.right = conversion(in, pre, inorderIndex + 1, inEnd, preIndex + (inorderIndex - inStart + 1));
//
//        return node;
//    }
//
//    public static void main(String[] args) {
//        int[] in = {40, 20, 50, 10, 30, 80, 70, 90};
//        int[] pre = {10, 20, 40, 50, 30, 70, 80, 90};
//
//        roots = conversion(in, pre, 0, in.length - 1, 0);
//
//        // You can implement a method to print the tree to verify the result
//    }
//}
