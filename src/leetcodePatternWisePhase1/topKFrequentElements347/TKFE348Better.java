package leetcodePatternWisePhase1.topKFrequentElements347;

import java.util.*;
import java.util.stream.Collectors;

public class TKFE348Better {
    public static int[] topKFrequentBetter(int[] nums, int k) {
        Map<Integer,Integer> maps = new HashMap<>();
//        for(int i=0;i<nums.length;i++){
//            maps.put(nums[i], maps.getOrDefault(nums[i],0)+1);
//        }
        for (int num : nums) {
            maps.put(num, maps.getOrDefault(num, 0) + 1);
        }
//        Map<Integer,Integer> sortedMap = maps.entrySet().stream().
//                sorted(Map.Entry.<Integer,Integer>comparingByValue().reversed()).collect(Collectors.toMap(
//                        Map.Entry::getKey,
//                        Map.Entry::getValue,
//                        (e1,e2)->e1,
//                        LinkedHashMap::new
//                ));
//        List<Integer> keys = sortedMap.keySet().stream().toList();
//        int[] res = new int[k];

        List<Map.Entry<Integer, Integer>> keys = new ArrayList<>(maps.entrySet());
        keys.sort((a, b) -> Integer.compare(b.getValue(), a.getValue()));
        int[] res = new int[k];
        for(int i=0;i<res.length;i++){
            res[i]=keys.get(i).getKey();
        }
        return res;
    }
    public static void main(String[] args) {
        int[] nums = {1,1,1,2,2,3};
        int[] nums2 = {1,2,1,2,1,2,3,1,3,2};
        int[] nums3= {1};
        int k = 2;
        int k2=1;
        int[] res = topKFrequentBetter(nums,k);
        Arrays.stream(res).forEach(x-> System.out.println(x));
    }
}
