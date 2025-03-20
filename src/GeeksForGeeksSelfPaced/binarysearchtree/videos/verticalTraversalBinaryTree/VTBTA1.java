package GeeksForGeeksSelfPaced.binarysearchtree.videos.verticalTraversalBinaryTree;

import GeeksForGeeksSelfPaced.binarysearchtree.BSTNode;

import java.util.*;

public class VTBTA1 {
    public static void verticalTraversalTree(BSTNode root){
        Queue<Pair> queue = new LinkedList<>();
        Map<Integer, ArrayList<BSTNode>> maps = new TreeMap<>();
        queue.add(new Pair(0,root));
        while(!queue.isEmpty()){
            Pair temp = queue.poll();
            int hd = temp.hd;
            BSTNode node = temp.node;
            if(maps.containsKey(hd)){
                maps.get(hd).add(node);
            }else{
                maps.put(hd,new ArrayList<>());
                maps.get(hd).add(node);
            }
            if(node.left!=null){
                queue.add(new Pair(hd-1,node.left));
            }
            if(node.right!=null){
                queue.add(new Pair(hd+1,node.right));
            }

        }

        maps.forEach((k,v)->{
            for(BSTNode node : v){
                System.out.print(node.data + " ");
            }
            System.out.println();
        });


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
        c.left = d;
        c.right = e;


        verticalTraversalTree(a);
    }
}

class Pair{
    int hd;
    BSTNode node;
    public Pair(int hd,BSTNode node){
        this.hd = hd;
        this.node=node;
    }
}

