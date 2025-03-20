package GeeksForGeeksSelfPaced.binarysearchtree.videos;

import GeeksForGeeksSelfPaced.binarysearchtree.BSTNode;

import java.util.Stack;

public class BSTIterator {

    public static Stack<BSTNode> stack = new Stack<>();
    public BSTIterator(BSTNode root){
        pushAll(root);
    }
    public boolean hasNext(){
        return !stack.isEmpty();
    }

    public BSTNode next(){
        BSTNode node = stack.pop();
        pushAll(node.right);
        return node;
    }
    public void pushAll(BSTNode root){
        while(root!=null){
            stack.push(root);
            root = root.left;
        }
    }

    public static void main(String[] args) {
        BSTNode a = new BSTNode(7,null,null);
        BSTNode b = new BSTNode(3,null,null);
        BSTNode c = new BSTNode(10,null,null);
        BSTNode d = new BSTNode(2,null,null);
        BSTNode e = new BSTNode(6,null,null);
        BSTNode f = new BSTNode(9,null,null);
        BSTNode g = new BSTNode(11,null,null);
        BSTNode h = new BSTNode(1,null,null);
        BSTNode i = new BSTNode(5,null,null);
        BSTNode j = new BSTNode(8,null,null);
        BSTNode k = new BSTNode(4,null,null);

        a.left=b;
        a.right=c;
        b.left=d;
        b.right=e;
        c.left=f;
        c.right=g;
        d.left=h;
        e.left=i;
        f.left=j;
        i.left=k;


        BSTIterator iterator = new BSTIterator(a);
        while(iterator.hasNext()){
            System.out.println(iterator.next().data);
        }


    }
}
