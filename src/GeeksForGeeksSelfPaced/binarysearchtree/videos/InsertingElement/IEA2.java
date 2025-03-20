package GeeksForGeeksSelfPaced.binarysearchtree.videos.InsertingElement;


import GeeksForGeeksSelfPaced.binarysearchtree.BSTNode;

public class IEA2 {
    public static BSTNode insertElement(int data,BSTNode root){

        BSTNode parent=null;
        BSTNode current= root;

        while(current!=null){
            parent = current;
            if(data<current.data){
                current = current.left;
            }else if(data>current.data){
                current = current.right;
            }else{
                return root;
            }

        }

        if(data>parent.data){
            parent.right = new BSTNode(data,null,null);
        }else{
            parent.left = new BSTNode(data,null,null);
        }

        return root;
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

        BSTNode result = insertElement(100,a);


        IEA1.printBST(a);
    }

}
