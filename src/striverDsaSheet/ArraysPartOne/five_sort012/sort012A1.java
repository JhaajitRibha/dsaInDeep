package striverDsaSheet.ArraysPartOne.five_sort012;

import java.util.Arrays;

public class sort012A1 {
    public void sortColors(int[] nums) {

        int low = 0, mid = 0;
        int high = nums.length - 1;

        while (mid <= high) {
            if (nums[mid] == 0) {
                swap(nums, low, mid);
                low++;
                mid++;
            } else if (nums[mid] == 1) {
                mid++;
            } else {
                swap(nums, mid, high);
                high--;
            }

        }

    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {2, 0, 2, 1, 1, 0};
        Arrays.stream(arr).forEach(x -> System.out.print(x + " "));
        new sort012A1().sortColors(arr);
        System.out.println();
        Arrays.stream(arr).forEach(x -> System.out.print(x + " "));
    }
}
