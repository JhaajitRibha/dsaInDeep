package Blind75.aLongestConsecutiveSequence;

import java.util.Arrays;

public class LongestConsecutiveSequenceA2 {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        if(nums.length==1){
            return 1;
        }
        int maxCount=Integer.MIN_VALUE;
        int num=0;
        Arrays.sort(nums);
        int i=0;
        int count=1;
        while(i<nums.length-1){
            num=nums[i];
            if(num==nums[i+1]){
                i++;
            }else if(num+1==nums[i+1]){
                i++;
                count++;
            }else{
                if(count>maxCount){
                    maxCount=count;
                }
                count=1;
                i++;
            }
        }
        if(count>maxCount){
             maxCount=count;
        }
        return maxCount==Integer.MIN_VALUE?0:maxCount;
    }
    public static void main(String[] args) {
        int[] arr = {100,4,200,1,3,2};
        //1,2,3,4,100,200
        int[] arr2={0,3,7,2,5,8,4,6,0,1};
        int[] arr3={1,0,1,1,1,2};
        //0,1,1,1,1,2
        int[] arr4={-1, -2, -3, 5, 6};
        System.out.println(new LongestConsecutiveSequenceA2().longestConsecutive(arr4));
    }

}
