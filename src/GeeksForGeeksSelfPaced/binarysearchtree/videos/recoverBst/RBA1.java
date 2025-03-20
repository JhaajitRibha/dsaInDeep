package GeeksForGeeksSelfPaced.binarysearchtree.videos.recoverBst;

import GeeksForGeeksSelfPaced.binarysearchtree.BSTNode;
import GeeksForGeeksSelfPaced.binarysearchtree.videos.InsertingElement.IEA1;

import java.util.Arrays;

public class RBA1 {

    public static int count = 0;
    public static int counter=0;
    public static int[] sortedElements = null;
    public static void countElements(BSTNode root){
        if(root==null){
            return;
        }
        countElements(root.left);
        count=count+1;
        countElements(root.right);
    }
    public static void sortedArray(BSTNode root){
        countElements(root);
        sortedElements=new int[count];
        sortedArrayWorker(root);

    }
    public static void sortedArrayWorker(BSTNode root){
       if(root==null){
           return;
       }
       sortedArrayWorker(root.left);
       sortedElements[counter++] = root.data;
       sortedArrayWorker(root.right);
    }
    public static int comparingAndRearranging(int[] sortedArray,int counter,BSTNode root){
        if(root==null){
            return counter;
        }
        counter = comparingAndRearranging(sortedArray,counter,root.left);
        if(sortedArray[counter]!=root.data){
            root.data=sortedArray[counter];
        }
        counter++;
        counter = comparingAndRearranging(sortedArray,counter,root.right);
        return counter;
    }
    public static void main(String[] args) {
        BSTNode a = new BSTNode(3,null,null);
        BSTNode b = new BSTNode(1,null,null);
        BSTNode c  = new BSTNode(4,null,null);
        BSTNode d = new BSTNode(2,null,null);
        a.left=b;
        a.right=c;
        c.left=d;
        sortedArray(a);
        Arrays.sort(sortedElements);
        Arrays.stream(sortedElements).forEach(x-> System.out.print(x + "  "));
        System.out.println();
        counter=0;
        comparingAndRearranging(sortedElements,counter,a);
        IEA1.printBST(a);
    }
}

