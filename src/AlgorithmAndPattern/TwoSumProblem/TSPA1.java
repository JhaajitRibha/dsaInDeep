package AlgorithmAndPattern.TwoSumProblem;

import java.util.HashMap;
import java.util.Map;

public class TSPA1 {
    public static boolean twoSum(int[] arr,int target){
        Map<Integer,Integer> container= new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int num = Math.abs(arr[i]-target);
            if(container.keySet().contains(num)){
                return true;
            }else{
                container.put(arr[i],i);
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr = {2,6,5,8,11};
        int target = 14;
        System.out.println(twoSum(arr,target));

    }
}
