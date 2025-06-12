package gfg160.arrays.problems.extras;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AllPermutationsArrays {
    public static void findPermutations(int[] nums,List<Integer> ds,boolean[] freq,List<List<Integer>> ans){
        if(nums.length == ds.size()){
            ans.add(new ArrayList<>(ds));
            return ;
        }

        for(int i=0;i<nums.length;i++){
            if(!freq[i]){
                freq[i]=true;
                ds.add(nums[i]);
                findPermutations(nums,ds,freq,ans);
                ds.remove(ds.size()-1);
                freq[i]=false;
            }
        }
    }

    public static void main(String[] args) {

        int[] nums = new int[]{1,2,3};
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        boolean freq[] = new boolean[nums.length];
        findPermutations(nums,ds,freq,ans);
        ans.stream().forEach(x-> System.out.println(x));
        System.out.println(ans.size());


    }
}
