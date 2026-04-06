package leetcodePatternWiseLearningFirstTarget.Stream1.Arrrays.TwoSum;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSumOptimal {
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> twoSumMap = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int complement = target-nums[i];
            if(twoSumMap.containsKey(complement)){
                return new int[]{twoSumMap.get(complement),i};
            }else{
                twoSumMap.put(nums[i],i);
            }
        }
        return new int[]{};
    }
    public static void main(String[] args) {

        int[] nums = {2,7,11,15};
        int target = 9;
        int[] res = twoSum(nums,target);
        Arrays.stream(res).forEach(x-> System.out.println(x));
    }
}

