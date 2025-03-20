package GeeksForGeeksSelfPaced.binarysearchtree.videos.constructBstFromPreOrder;

import GeeksForGeeksSelfPaced.binarysearchtree.BSTNode;
import GeeksForGeeksSelfPaced.binarysearchtree.videos.InsertingElement.IEA1;

public class CBFPA2 {
    public static BSTNode constructFromPreOrder(int[] preOrder, int upperBound, int[] i) {
        if (i[0] == preOrder.length || i[0] > upperBound) {
            return null;
        }
        BSTNode root = new BSTNode(preOrder[i[0]++], null, null);
        root.left = constructFromPreOrder(preOrder, root.data, i);
        root.right = constructFromPreOrder(preOrder, upperBound, i);
        return root;
    }
    public static void main(String[] args) {
        BSTNode root = constructFromPreOrder(new int[]{8,1,5,7,10,12},Integer.MAX_VALUE,new int[]{0});
        IEA1.printBST(root);

    }
}
