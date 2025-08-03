package striverDsaSheet.ArraysPartOne.fourMaximumSubArray;

//this is kadane`s algorithm

//Follow up: If you have figured out the O(n) solution, try coding another solution using the divide and conquer approach, which is more subtle.
//try this when merge sort is done and understand its time complexity and space complexity and if its better?


public class MaximumSubArrayA2 {
    public int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        int currentSum = nums[0];
        for(int i=1;i<nums.length;i++){
            currentSum = Math.max(currentSum+nums[i],nums[i]);
            maxSum = Math.max(currentSum,maxSum);
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int[] arr  = {5,4,-1,7,8};
        System.out.println(new MaximumSubArrayA1().maxSubArray(arr));
    }
}
