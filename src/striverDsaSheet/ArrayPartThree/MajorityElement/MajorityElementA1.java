package striverDsaSheet.ArrayPartThree.MajorityElement;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

public class MajorityElementA1 {
    public int majorityElement(int[] nums){
        int max= Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max= nums[i];
            }
        }

        int[] temp = new int[max+1];
        for(int i=0;i<nums.length;i++){
            temp[nums[i]]++;
        }

        int res = IntStream.range(0, temp.length).boxed().max(Comparator.comparingInt(i->temp[i])).orElse(-1);
        return res;
    }

    public int majorityElementTwo(int[] nums){
        Map<Integer,Integer> freq = new HashMap();
        for(int i=0;i<nums.length;i++){
            if(freq.containsKey(nums[i])){
                freq.replace(nums[i],freq.get(nums[i])+1);
            }else{
                freq.put(nums[i],1);
            }
        }

        return freq.entrySet().stream().reduce((x,y)->x.getValue()>y.getValue()?x:y).get().getKey().intValue();
    }
    public static void main(String[] args) {
        int[] arr = {2,2,1,1,1,2,2};
        int[] arr2 = {3,2,3};
        int[]arr3 = {3,3,4};
        int[] arr4 = {100, 200, 100, 100, 300, 100, 100};
        System.out.println(new MajorityElementA1().majorityElementTwo(arr));
    }
}
