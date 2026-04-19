package leetcodePatternWisePhase1.topKFrequentElements347;

import java.util.*;
import java.util.stream.Collectors;


public class TKFE348Brute {
    public static int[] topKFrequent(int[] nums, int k) {
        List<int[]> container =  new ArrayList<>();
        boolean[] visited = new boolean[nums.length];
        for(int i=0;i<nums.length;i++){
            if(visited[i]) continue;
            int count=0;
            for(int j=i;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    visited[j]=true;
                    count++;
                }
            }
            container.add(new int[]{nums[i],count});
        }
        container.sort((a,b)->Integer.compare(b[1], a[1]));
        int[] res= new int[k];
        for(int i=0;i<res.length;i++){
            res[i]=container.get(i)[0];
        }

        return res;
    }

    public static void main(String[] args) {
       int[] nums = {1,1,1,2,2,3};
       int[] nums2 = {1,2,1,2,1,2,3,1,3,2};
       int[] nums3= {1};
        int k = 2;
        int k2=1;
        int[] res = topKFrequent(nums,k);
        Arrays.stream(res).forEach(x-> System.out.println(x));
    }
}
