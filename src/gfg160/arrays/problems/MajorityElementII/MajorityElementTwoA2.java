package gfg160.arrays.problems.MajorityElementII;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class MajorityElementTwoA2 {
    public List<Integer> findMajorityElement(int[] arr){
        List<Integer> res = new ArrayList<>();
        HashMap<Integer,Integer> maps = new HashMap<>();
        for(int i=0;i<arr.length;i++){
//            if(maps.containsKey(arr[i])){
//                maps.put(arr[i],maps.get(arr[i])+1);
//            }else{
//                maps.put(arr[i],1);
//            }
            maps.put(arr[i],maps.getOrDefault(arr[i],0)+1);
        }
        maps.entrySet().stream().forEach((x)->{
            if(x.getValue()>arr.length/3){
                res.add(x.getKey());
            }
        });

        if(res.get(0)>res.get(1)){
            Collections.swap(res,0,1);
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr = {2 ,1, 6, 6, 6, 6, 6, 5, 5, 5, 5};
        System.out.println(new MajorityElementTwoA2().findMajorityElement(arr));
    }
}
