package Blind75.aLongestConsecutiveSequence;

public class LongestConsecutiveSequenceA1 {
    public int longestConsecutive(int[] nums) {

        int maxCount= Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            int num=nums[i];
            int count=0;
            int j=0;
            while(j<nums.length){
                if(nums[j]==num){
                    count++;
                    num=num+1;
                    j=0;
                }else {
                    j++;
                }
            }
            if(count>maxCount){
                maxCount=count;
            }
        }
        return maxCount==Integer.MIN_VALUE?0:maxCount;
    }
    public static void main(String[] args) {

        int[] arr = {100,4,200,1,3,2};
        int[] arr2={0,3,7,2,5,8,4,6,0,1};
        int[] arr3={1,0,1,1,1,2};
        int[] arr4={-1, -2, -3, 5, 6};
        System.out.println(new LongestConsecutiveSequenceA1().longestConsecutive(arr3));


    }
}
