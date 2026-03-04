package leetcodePatternWiseLearningFirstTarget.Stream1.Arrrays.TwoSum;

import java.util.Arrays;

public class TwoSumBruteForce {
    public static int[] twoSum(int[] nums, int target) {
        int[] res= new int[2];
        for(int i=0;i<nums.length;i++){
            int sum=nums[i];
            for(int j=i+1;j<nums.length;j++){
                if(target==sum+nums[j]){
                    res[0]=i;
                    res[1]=j;
                }
            }
        }

        return res;
    }
    public static void main(String[] args) {

        int[] nums = {2,7,11,15};
        int target = 9;
        int[] res = twoSum(nums,target);
        Arrays.stream(res).forEach(x-> System.out.println(x));
    }
}
