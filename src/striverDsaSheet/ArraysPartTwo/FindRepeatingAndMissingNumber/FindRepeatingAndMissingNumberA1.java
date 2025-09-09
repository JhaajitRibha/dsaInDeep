package striverDsaSheet.ArraysPartTwo.FindRepeatingAndMissingNumber;

import java.util.Arrays;

public class FindRepeatingAndMissingNumberA1 {
    public int[] findMissingRepeatingNumbers(int[] nums) {
       int[] freq = new int[nums.length+1];
       int duplicate = -1;
       for(int i=0;i<nums.length;i++){
           if(freq[nums[i]]>0){
               duplicate=nums[i];
               break;
           }
           freq[nums[i]]++;
       }

       int totalSum = (nums.length*(nums.length+1)/2);
       int sum=0;
       for(int i=0;i<nums.length;i++){
           sum+=nums[i];
       }
     int missing = totalSum-(sum-duplicate);
       return new int[]{duplicate,missing};
    }
    public static void main(String[] args) {
        int[] arr = {3, 5, 4, 1, 1};
        int[] res = new FindRepeatingAndMissingNumberA1().findMissingRepeatingNumbers(arr);

        Arrays.stream(res).forEach(x-> System.out.println(x));

    }
}

