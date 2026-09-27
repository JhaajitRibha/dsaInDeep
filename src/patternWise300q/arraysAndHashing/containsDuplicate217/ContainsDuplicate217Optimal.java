package patternWise300q.arraysAndHashing.containsDuplicate217;

import java.util.HashSet;

public class ContainsDuplicate217Optimal {
    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set  = new HashSet<>();
        for (int num : nums) {
            if (!set.add(num)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        System.out.println(containsDuplicate(arr));
    }
}
