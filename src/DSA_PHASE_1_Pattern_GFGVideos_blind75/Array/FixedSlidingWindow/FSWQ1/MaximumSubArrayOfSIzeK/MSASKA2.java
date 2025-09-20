package DSA_PHASE_1_Pattern_GFGVideos_blind75.Array.FixedSlidingWindow.FSWQ1.MaximumSubArrayOfSIzeK;

public class MSASKA2 {
    public int getMaxSumSubArray(int[] arr,int k){
        int res=arr[0];
        int sum=0;
        for(int i=0;i<k;i++){
            sum+=arr[i];
        }
        if(sum>res){
            res=sum;
        }
        for(int j=k;j<arr.length;j++){
            sum = sum-arr[j-k];
            sum = sum+arr[j];
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
        int[] arr6 = {100,200,300,400};
        int[] arr7 = {8819,674,8816,7705,5699,5383,6177,2113,1992};
        int[] arr8 = {9753,2228,8097,5261,1870,9643};


        int res = new MSASKA2().getMaxSumSubArray(arr8,3);
        System.out.println(res);
    }
}
