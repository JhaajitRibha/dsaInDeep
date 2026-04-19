package leetcodePatternWisePhase1.topKFrequentElements347;

import java.util.*;

public class TKFE348Optimal {
    public static int[] topKFrequentOptimal(int[] nums, int k) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int num : nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }
        List<Integer>[] bucket = new ArrayList[nums.length + 1];

        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            int num = entry.getKey();
            int freq = entry.getValue();

            if (bucket[freq] == null) {
                bucket[freq] = new ArrayList<>();
            }

            bucket[freq].add(num);
        }

        int[] res = new int[k];
        int index = 0;

        for (int i = bucket.length - 1; i >= 0 && index < k; i--) {
            if (bucket[i] != null) {
                for (int num : bucket[i]) {
                    res[index++] = num;
                    if (index == k) break;
                }
            }
        }

        return res;
    }
    public static void main(String[] args) {
        int[] nums = {1,1,1,2,2,3};
        int[] nums2 = {1,2,1,2,1,2,3,1,3,2};
        int[] nums3= {1};
        int k = 2;
        int k2=1;
        int[] res = topKFrequentOptimal(nums,k);
        Arrays.stream(res).forEach(x-> System.out.println(x));
    }
}
