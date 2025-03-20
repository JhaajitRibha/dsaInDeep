package GeeksForGeeksSelfPaced.binarysearchtree.videos;

public class NodeCounts {
    public int leftCount;
    public int rightCount;

    public NodeCounts(int leftCount, int rightCount) {
        this.leftCount = leftCount;
        this.rightCount = rightCount;
    }

    public int getLeftCount() {
        return leftCount;
    }

    public void setLeftCount(int leftCount) {
        this.leftCount = leftCount;
    }

    public int getRightCount() {
        return rightCount;
    }

    public void setRightCount(int rightCount) {
        this.rightCount = rightCount;
    }

    @Override
    public String toString() {
        return "NodeCounts{" +
                "leftCount=" + leftCount +
                ", rightCount=" + rightCount +
                '}';
    }
}

