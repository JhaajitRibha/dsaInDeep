package GeeksForGeeksSelfPaced.binarysearchtree.videos.floorBst;

import GeeksForGeeksSelfPaced.binarysearchtree.BSTNode;

public class FBA1 {
    public static int getFloor(BSTNode root,int floorNum, int key){
        int result = -1;
        int left=0;
        int right=0;
        if(root==null){
               return floorNum;
        }
        if(key<root.data){
            if(root.data<=key){
                result = root.data;
                floorNum = Math.max(floorNum,result);
            }
            return getFloor(root.left,floorNum,key);
        }else if(key>root.data){
            if(root.data<=key){
                result= root.data;
                floorNum = Math.max(floorNum,result);
            }
            return getFloor(root.right,floorNum,key);
        }else{
            return root.data;
        }

    }
    public static void main(String[] args) {
        BSTNode a = new BSTNode(10,null,null);
        BSTNode b = new BSTNode(5,null,null);
        BSTNode c = new BSTNode(15,null,null);
        BSTNode d = new BSTNode(2,null,null);
        BSTNode e = new BSTNode(8,null,null);
        BSTNode f = new BSTNode(13,null,null);
        BSTNode g = new BSTNode(17,null,null);
        BSTNode h = new BSTNode(6,null,null);
        a.left=b;
        a.right=c;
        b.left=d;
        b.right=e;
        c.left=f;
        c.right=g;
        e.left=h;
        System.out.println(getFloor(a,-1,9));
    }
}
