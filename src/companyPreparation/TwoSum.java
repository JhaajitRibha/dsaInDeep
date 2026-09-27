package companyPreparation;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            int complement = target-nums[i];
            if(map.containsKey(complement)){
                return new int[]{map.get(complement),i};
            }
            map.put(nums[i],i);
        }

        return new int[]{-1,-1};
    }
    public static void main(String[] args) {

        int[] nums = {2,7,11,15};
        int[] nums2 = {3,2,4};
        int target = 9;
        int target2= 6;

        Arrays.stream(twoSum(nums,target)).forEach(x-> System.out.println(x));
        Arrays.stream(twoSum(nums2,target2)).forEach(x-> System.out.println(x));
    }
}
