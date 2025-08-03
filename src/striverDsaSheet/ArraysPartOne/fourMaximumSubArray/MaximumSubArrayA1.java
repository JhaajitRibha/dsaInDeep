package striverDsaSheet.ArraysPartOne.fourMaximumSubArray;

public class MaximumSubArrayA1 {
    public int maxSubArray(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            int sum=0;
            for(int j=i;j<nums.length;j++){
                sum=sum+nums[j];
                if(sum>maxSum){
                    maxSum=sum;
                }
            }
        }

        return maxSum;
    }
    public static void main(String[] args) {
        int[] arr  = {5,4,-1,7,8};
        System.out.println(new MaximumSubArrayA1().maxSubArray(arr));
    }
}
