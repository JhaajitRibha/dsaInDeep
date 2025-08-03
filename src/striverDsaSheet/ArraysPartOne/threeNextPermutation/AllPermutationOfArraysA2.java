package striverDsaSheet.ArraysPartOne.threeNextPermutation;

import java.util.*;

public class AllPermutationOfArraysA2 {
    public void allPermutationArray(int index,int[] nums,List<List<Integer>> resultList){
        if(index==nums.length){
            List<Integer> permutation = new ArrayList<>();
            for(int num : nums){
                permutation.add(num);
            }
            resultList.add(permutation);
            return;
        }

        for(int i=index;i<nums.length;i++){
            swap(i,index,nums);
            allPermutationArray(index+1,nums,resultList);
            swap(i,index,nums);
        }

    }
    private void swap(int i,int j,int[] nums){
        int t=nums[i];
        nums[i]=nums[j];
        nums[j]=t;
    }
    public static void main(String[] args) {

        int[] arr = {1,2,3};
        List<List<Integer>> resultList = new ArrayList<>();
        new AllPermutationOfArraysA2().allPermutationArray(0,arr,resultList);
        resultList.stream().forEach(x-> System.out.print(x+ " "));
        Set<List<Integer>> ss = new TreeSet<>((a, b) -> {
            for (int i = 0; i < a.size(); i++) {
                int cmp = Integer.compare(a.get(i), b.get(i));
                if (cmp != 0) return cmp;
            }
            return 0;
        });
        ss.addAll(resultList);
        ss.stream().forEach(x-> System.out.print(x+ " "));
    }
}
