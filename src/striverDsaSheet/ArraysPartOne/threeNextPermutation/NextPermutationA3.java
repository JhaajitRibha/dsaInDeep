package striverDsaSheet.ArraysPartOne.threeNextPermutation;

import java.util.Arrays;

public class NextPermutationA3 {
    public static void nextPermutation(int[] nums) {
        int n = nums.length;
        int i;

        for (i = n - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                break;
            }
        }

        if (i >= 0) {
            for (int j = n - 1; j > i; j--) {
                if (nums[j] > nums[i]) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                    break;
                }
            }
        }
        int start = i+1;
        int end = nums.length - 1;

        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;

            start++;
            end--;
        }
    }

    public static void main(String[] args) {

        int[] arr = {5, 3, 4, 9, 7, 6};
        nextPermutation(arr);
        Arrays.stream(arr).forEach(x-> System.out.print(x+ " "));
    }
}
