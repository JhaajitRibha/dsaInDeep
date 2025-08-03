package striverDsaSheet.ArraysPartOne.threeNextPermutation;

import java.util.ArrayList;
import java.util.List;

public class AllPermutationOfArraysA1 {
    public void allPermutationArray(int[] nums) {

        List<List<Integer>> resultList = new ArrayList<>();
        List<Integer> result = new ArrayList<>();
        boolean[] frequency = new boolean[nums.length];
        allPermutationArray(nums,resultList,result,frequency);
        resultList.stream().forEach(x-> System.out.println(x));
    }

    public void allPermutationArray(int[] nums, List<List<Integer>> resultList,List<Integer> result,boolean[] frequency){
        if(nums.length==result.size()){
            resultList.add(new ArrayList<>(result));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(!frequency[i]){
                result.add(nums[i]);
                frequency[i]=true;
                allPermutationArray(nums,resultList,result,frequency);
                result.remove(result.size()-1);// why can't we put i-1 instead of result.size()-1
                frequency[i]=false;
            }
        }
    }

    public static void main(String[] args) {

        int[] arr = {1,2,3};
        new AllPermutationOfArraysA1().allPermutationArray(arr);
    }
}
