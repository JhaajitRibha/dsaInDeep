package DSA_PHASE_1_Pattern_GFGVideos.Array.Patterns.SlidingWindow.maxSubArraySumK;

public class MSSAKA2 {
    public int maxSubArraySumOptimal(int[] arr,int k){
        int initialSum = 0;
        for(int i=0;i<k;i++){
            initialSum+=arr[i];
        }
        int max = initialSum;
        for(int i=k;i<arr.length;i++){
            initialSum=initialSum-arr[i-k]+arr[i];
            if(initialSum>max){
                max=initialSum;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr =  {2,1,5,1,3,2};
        int k = 3;
        System.out.println(new MSSAKA2().maxSubArraySumOptimal(arr,k));
    }
}
