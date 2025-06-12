package gfg160.arrays.problems.MaxSubArraySum;

public class MaxSubArraySumA1 {
    public static int maxSubarraySum(int[] arr) {
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            int curr=arr[i];
            for(int j=i+1;j<arr.length;j++){
                curr +=arr[j];
                if(curr>max){
                    max=curr;
                }
            }
        }

        return max;
    }

    public static int maxSubarraySum2(int[] arr) {
        int res = arr[0];

        // Outer loop for starting point of subarray
        for (int i = 0; i < arr.length; i++) {
            int currSum = 0;

            // Inner loop for ending point of subarray
            for (int j = i; j < arr.length; j++) {
                currSum = currSum + arr[j];

                // Update res if currSum is greater than res
                res = Math.max(res, currSum);
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr={-2,-4};
        System.out.println(maxSubarraySum(arr));
    }
}
