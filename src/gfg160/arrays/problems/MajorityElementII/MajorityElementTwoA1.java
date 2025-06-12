package gfg160.arrays.problems.MajorityElementII;

import java.util.ArrayList;
import java.util.List;

public class MajorityElementTwoA1 {

    public List<Integer> findMajorityElement(int[] arr){
        List<Integer> res  = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            int num = arr[i];
            int count=1;
            if(num!= Integer.MIN_VALUE) {
                for (int j = i + 1; j < arr.length; j++) {
                      if(arr[i]==arr[j]){
                          arr[j]=Integer.MIN_VALUE;
                          count++;
                      }
                }
                if(count>arr.length/3){
                    res.add(num);
                }
            }
        }

        if(res.get(0)>res.get(1)){
            int temp = res.get(0);
            res.set(0,res.get(1));
            res.set(1,temp);
        }
        return res;

    }
    public static void main(String[] args) {
        int[] arr = {2 ,1, 5, 5, 5, 5, 6, 6, 6, 6, 6};
        System.out.println(new MajorityElementTwoA1().findMajorityElement(arr));
    }
}
