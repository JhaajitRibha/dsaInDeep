package gfg160.arrays.problems.extras;

import java.util.ArrayList;
import java.util.List;

public class AllPermutationArraysA2 {
    public static void allPermutations(int[] nums,int index,List<List<Integer>> ans){
        if(index==nums.length){
            List<Integer> ds = new ArrayList<>();
            for(int i=0;i<nums.length;i++){
                ds.add(nums[i]);
            }
            ans.add(ds);
        }

        for(int i=index;i<nums.length;i++){
            swap(i,index,nums);
            allPermutations(nums,index+1,ans);
            swap(i,index,nums);
        }

    }

    public static void swap(int i,int j,int[] nums){
        int temp  = nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        List<List<Integer>> ans = new ArrayList<>();
        allPermutations(nums,0,ans);
        ans.stream().forEach(x-> System.out.println(x));

    }
}
