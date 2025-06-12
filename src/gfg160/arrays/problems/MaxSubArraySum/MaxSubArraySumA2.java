package gfg160.arrays.problems.MaxSubArraySum;

public class MaxSubArraySumA2 {
    public static int maxSubarraySum(int[] arr){
        int currMax=arr[0];
        int finalMax=arr[0];

        for(int i=1;i<arr.length;i++){
            currMax =Math.max(currMax+arr[i],arr[i]);
            finalMax = Math.max(currMax,finalMax);
        }

        return finalMax;
    }
    public static void main(String[] args) {
         int[] arr= {5, 4, 1, 7, 8};
        System.out.println(maxSubarraySum(arr));

    }
}
