package leetcodePatternWiseLearningFirstTarget.Stream1.Arrrays.MaximumSubArray;

public class MaximumSubArraySumBruteForce {
    public static int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            int sum = nums[i];
            for(int j=i+1;j<nums.length;j++){
                sum =sum+nums[j];
                if(sum>max){
                    max=sum;
                }
            }
            if(sum>max){
                max=sum;
            }
        }

        return max;
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
