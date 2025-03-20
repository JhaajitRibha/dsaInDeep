package GeeksForGeeksSelfPaced.binarysearchtree.videos.bottomViewOfBinaryTree;

import GeeksForGeeksSelfPaced.binarysearchtree.BSTNode;

import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

public class BVBTA1 {
    public static void bottomView(BSTNode root){
        Queue<Pair> queue = new LinkedList<>();
        Map<Integer,BSTNode> maps = new TreeMap<>();

        queue.add(new Pair(0,root));

        while(!queue.isEmpty()){
            Pair temp = queue.poll();
            BSTNode node = temp.node;
            int hd = temp.hd;
            maps.put(hd,node);
            if(node.left!=null){
                queue.add(new Pair(hd-1,node.left));
            }
            if(node.right!=null){
                queue.add(new Pair(hd+1,node.right));
            }
        }

        maps.entrySet().stream().forEach(x->{
            System.out.print(x.getValue().data + " ");
        });

        System.out.println();
    }

    public static void main(String[] args) {
        BSTNode a = new BSTNode(10, null, null);
        BSTNode b = new BSTNode(20, null, null);
        BSTNode c = new BSTNode(30, null, null);
        BSTNode d = new BSTNode(40, null, null);
        BSTNode e = new BSTNode(50, null, null);
        BSTNode f = new BSTNode(60, null, null);
        BSTNode g = new BSTNode(70, null, null);

        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        c.left = f;
        c.right = g;

        bottomView(a);
    }
}

class Pair{
    int hd;
    BSTNode node;
    Pair(int hd,BSTNode node){
        this.hd = hd;
        this.node =node;
    }

}