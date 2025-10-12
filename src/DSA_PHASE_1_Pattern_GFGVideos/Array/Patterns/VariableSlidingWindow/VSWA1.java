package DSA_PHASE_1_Pattern_GFGVideos.Array.Patterns.VariableSlidingWindow;

public class VSWA1 {
    public int maxSum(int[] arr,int k){
        int minCount=Integer.MAX_VALUE;

        for(int i=0;i<arr.length;i++){
            int sum=0;
            int count=0;
            for(int j=i;j<arr.length;j++){
                sum = sum+arr[j];
                count++;
                if(sum>=7){
                    if(count<minCount){
                        minCount=count;
                    }
                    break;
                }
            }
        }
        return minCount == Integer.MAX_VALUE ? 0 : minCount;
    }
    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 2, 4, 3};
        int k =7;
        System.out.println(new VSWA1().maxSum(arr,k));
    }
}
