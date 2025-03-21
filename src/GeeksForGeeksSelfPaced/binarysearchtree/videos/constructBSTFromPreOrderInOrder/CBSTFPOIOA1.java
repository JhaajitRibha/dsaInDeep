package GeeksForGeeksSelfPaced.binarysearchtree.videos.constructBSTFromPreOrderInOrder;

import GeeksForGeeksSelfPaced.binarysearchtree.BSTNode;
import GeeksForGeeksSelfPaced.binarysearchtree.videos.InsertingElement.IEA1;

public class CBSTFPOIOA1 {

    static int preIndex =0;
    public static BSTNode constructBstFromPreInOrder(int[] preOrder,int[] inOrder,int start,int end) {
        if (start > end) {
            return null;
        }
        int index = findIndex(inOrder, start, end, preOrder[preIndex]);
        int value = preOrder[preIndex++];
        BSTNode root = new BSTNode(value, null, null);
        root.left = constructBstFromPreInOrder(preOrder, inOrder, start, index - 1);
        root.right = constructBstFromPreInOrder(preOrder, inOrder, index + 1, end);
        return root;
    }

    public static int findIndex(int[] inorder,int start,int end,int value) {
        for (int i = start; i <= end; i++) {
            if (inorder[i] == value) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] preOrder = {8,5,1,7,10,12};
        int[] inOrder = {1,5,7,8,10,12};

        BSTNode result= constructBstFromPreInOrder(preOrder,inOrder,0,5);
        IEA1.printBST(result);

    }
}
