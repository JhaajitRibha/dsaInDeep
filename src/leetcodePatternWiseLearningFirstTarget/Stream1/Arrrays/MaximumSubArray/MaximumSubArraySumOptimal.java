package leetcodePatternWiseLearningFirstTarget.Stream1.Arrrays.MaximumSubArray;

public class MaximumSubArraySumOptimal {
    public static int maxSubArray(int[] nums) {

        int currentSum = 0;
        int maxSum = nums[0];

        for(int num : nums){

            currentSum = currentSum + num;

            if(currentSum > maxSum){
                maxSum = currentSum;
            }

            if(currentSum < 0){
                currentSum = 0;
            }
        }

        return maxSum;
    }
    public static void main(String[] args) {
        int nums[] = {-2,1,-3,4,-1,2,1,-5,4};
        int nums2[] = {1};
        int nums3[] = {5,4,-1,7,8};
        System.out.println(maxSubArray(nums));
        System.out.println(maxSubArray(nums2));
        System.out.println(maxSubArray(nums3));
    }
}
