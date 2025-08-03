package striverDsaSheet.ArraysPartOne.threeNextPermutation;

import java.util.*;

public class nextPermutationA1 {
    public static List<List<Integer>> allPermutationArray(int[] nums) {

        List<List<Integer>> resultList = new ArrayList<>();
        List<Integer> result = new ArrayList<>();
        boolean[] frequency = new boolean[nums.length];
        allPermutationArray(nums,resultList,result,frequency);
        Set<List<Integer>> uniqueSet = new LinkedHashSet<>(resultList);
        List<List<Integer>> resultFinal = new ArrayList<>(uniqueSet);
        return resultFinal;
    }

    public static void allPermutationArray(int[] nums, List<List<Integer>> resultList,List<Integer> result,boolean[] frequency){
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

    public static void nextPermutation(int[] nums) {
        int[] temp = Arrays.copyOf(nums,nums.length);
        Arrays.sort(nums);
        List<List<Integer>> result = allPermutationArray(nums);
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
        int[] arr = {1,5,1};
        nextPermutation(arr);
        Arrays.stream(arr).forEach(x-> System.out.print(x  + " "));
        System.out.println();
    }
}
