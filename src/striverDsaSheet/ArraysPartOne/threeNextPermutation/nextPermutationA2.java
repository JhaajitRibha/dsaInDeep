package striverDsaSheet.ArraysPartOne.threeNextPermutation;

import java.util.*;

public class nextPermutationA2 {
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
    public void swap(int i,int j,int[] nums){
        int t=nums[i];
        nums[i]=nums[j];
        nums[j]=t;
    }

    public List<List<Integer>> nextPermutationFind(int[] arr){
        List<List<Integer>> resultList = new ArrayList<>();
        allPermutationArray(0,arr,resultList);
        Set<List<Integer>> ss = new TreeSet<>((a, b) -> {
            for (int i = 0; i < a.size(); i++) {
                int cmp = Integer.compare(a.get(i), b.get(i));
                if (cmp != 0) return cmp;
            }
            return 0;
        });
        ss.addAll(resultList);
        List<List<Integer>> resultFinal = new ArrayList<>(ss);
        return  resultFinal;
    }
    public void nextPermutation(int[] nums){
        int[] temp = Arrays.copyOf(nums,nums.length);
        Arrays.sort(nums);
        List<List<Integer>> result = nextPermutationFind(nums);
        List<Integer> current = new ArrayList<>();
        for(int i=0;i<temp.length;i++){
            current.add(temp[i]);
        }
        int index=-1;
        for(List<Integer> list : result){
            if(list.equals(current)){
                index=result.indexOf(list);
                if(index==result.size()-1){
                    index=0;
                }else{
                    index=index+1;
                }
                break;
            }
        }
        List<Integer> required = result.get(index);
        for(int i=0;i<nums.length;i++){
            nums[i]=required.get(i);
        }

    }

    public static void main(String[] args) {
        int[] arr = {3,2,1};
        Arrays.stream(arr).forEach(x-> System.out.print(x+ " "));
        new nextPermutationA2().nextPermutation(arr);
        Arrays.stream(arr).forEach(x-> System.out.print(x+ " "));
    }
}
