package striverDsaSheet.ArrayPartThree.MajorityElement;

import java.util.Arrays;

public class MajorityElementA2 {
    public int majorityElement(int[] nums){
        Arrays.sort(nums);
        return nums[nums.length/2];
    }
    public static void main(String[] args) {
        int[] arr = {2,2,1,1,1,2,2};
        int[] arr2 = {3,2,3};
        int[]arr3 = {3,3,4};
        int[] arr4 = {100, 200, 100, 100, 300, 100, 100};
        System.out.println(new MajorityElementA3().majorityElement(arr4));
    }
}
