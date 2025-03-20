package GeeksForGeeksSelfPaced.binarysearchtree.videos;

import GeeksForGeeksSelfPaced.binarysearchtree.BSTNode;

public class NodeWithCount {
    public BSTNode node;
    public int count;
    public NodeWithCount(BSTNode node, int count) {
        this.node = node;
        this.count = count;
    }

    public BSTNode getNode() {
        return node;
    }

    public void setNode(BSTNode node) {
        this.node = node;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "NodeWithCount{" +
                "node=" + node +
                ", count=" + count +
                '}';
    }
}
