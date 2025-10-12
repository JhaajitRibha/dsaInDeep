package DSA_PHASE_1_Pattern_GFGVideos.Array.Patterns.SlidingWindow.maxSubArraySumK;

public class MSSAKA1 {
    public int maxSubArraySumBruteForce(int[] arr,int k){
        int max = Integer.MIN_VALUE;
        for(int i=0;i<=arr.length-k;i++){
            int sum = 0;
            for(int j=i;j<i+k;j++){
                sum+=arr[j];
            }
            if(sum>max){
                max=sum;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr =  {2,1,5,1,3,2};
        int k = 3;
        System.out.println(new MSSAKA1().maxSubArraySumBruteForce(arr,k));
    }
}
