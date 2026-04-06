package leetcodePatternWisePhase1.containsDuplicate217;

import java.util.Arrays;
import java.util.HashSet;

public class CD217Optimal {
    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set  = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num)) {
                return true;
            }
            set.add(num);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        System.out.println(containsDuplicate(nums));
    }

}
