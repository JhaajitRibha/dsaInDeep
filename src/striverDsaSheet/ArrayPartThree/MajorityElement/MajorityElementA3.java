package striverDsaSheet.ArrayPartThree.MajorityElement;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//Boyer–Moore Voting
public class MajorityElementA3 {
    public List<Integer> majorityElement(int[] nums) {
        int count1 = 0, count2 = 0;
        Integer candidate1 = null, candidate2 = null;


        for (int num : nums) {
            if (candidate1 != null && num == candidate1) {
                count1++;
            } else if (candidate2 != null && num == candidate2) {
                count2++;
            } else if (count1 == 0) {
                candidate1 = num;
                count1 = 1;
            } else if (count2 == 0) {
                candidate2 = num;
                count2 = 1;
            } else {
                count1--;
                count2--;
            }
        }


        count1 = 0; count2 = 0;
        for (int num : nums) {
            if (num == candidate1) count1++;
            else if (num == candidate2) count2++;
        }

        List<Integer> result = new ArrayList<>();
        int n = nums.length;
        if (count1 > n / 3) result.add(candidate1);
        if (count2 > n / 3) result.add(candidate2);
        return result;
    }
    public static void main(String[] args) {
//        int[] arr = {2,2,1,1,1,2,2};
//        int[] arr2 = {3,2,3};
//        int[]arr3 = {3,3,4};
//        List<Integer> res = new MajorityElementA3().majorityElement(arr);
//        res.forEach(x-> System.out.print(x+ " "));
//        System.out.println();

        System.out.println("************");

            int[][] testInputs = {
                    {1,2},
                {2, 2, 1, 1, 1, 2, 2},
                {3, 2, 3},
                {3, 3, 4},
                {100, 200, 100, 100, 300, 100, 100},
                {1},
                {5, 5, 5, 5, 5},
                {1, 2, 3, 4},
                {3, 3, 4, 3, 2, 3, 1},
                {1, 2, 2, 3, 1, 1, 2},
                {-1, -1, -1, 2, 3, -1, 2, 2},
                {10, -10, 10, -10, 10, 20, -10},
                {9, 3, 9, 9, 2, 9, 4, 9, 3, 3, 3}
            };

            for (int[] input : testInputs) {
                List<Integer> result = new MajorityElementA3().majorityElement(input);
                System.out.println("Input: " + java.util.Arrays.toString(input));
                System.out.println("Output: " + result);
                System.out.println();

        }
    }
}
