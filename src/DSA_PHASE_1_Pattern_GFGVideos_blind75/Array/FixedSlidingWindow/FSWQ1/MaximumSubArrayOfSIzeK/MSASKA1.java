package DSA_PHASE_1_Pattern_GFGVideos_blind75.Array.FixedSlidingWindow.FSWQ1.MaximumSubArrayOfSIzeK;

public class MSASKA1 {
    public int getMaxSumSubArray(int[] arr,int k){
        int res = 0;
        for(int i=0;i<=arr.length-k;i++){
            int sum = 0;
            for(int j=i;j<i+k;j++){
                sum+=arr[j];
            }
            if(sum>res){
                res=sum;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] arr2  = {2, 1, 5, 1, 3, 2};
        int[] arr3 = {2, 3, 4, 1, 5};
        int[] arr4  ={1, 2, 3, 1, 2, 3, 4};
        int[] arr5 = {4, -1, 2, 1, -5, 4};

        int res = new MSASKA1().getMaxSumSubArray(arr,2);
        System.out.println(res);

    }
}
