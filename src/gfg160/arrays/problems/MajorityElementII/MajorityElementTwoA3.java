package gfg160.arrays.problems.MajorityElementII;

import java.util.ArrayList;
import java.util.List;

public class MajorityElementTwoA3 {
    public List<Integer> findMajorityElement(int[] nums){
//        int eleOne = -1;
//        int eleTwo = -1;
//        int count1 = 0;
//        int count2 = 0;
//
//        for(int i=0;i<arr.length;i++){
//            if(arr[i]==eleOne){
//                count1++;
//            }else if(arr[i]==eleTwo){
//                count2++;
//            }else if(count1==0){
//                eleOne = arr[i];
//                count1++;
//            }else if(count2==0){
//                eleTwo = arr[i];
//                count2++;
//            }else{
//                count1--;
//                count2--;
//            }
//        }
//        List<Integer> res = new ArrayList<>();
//        count1=0;
//        count2=0;
//
//        for(int i=0;i<arr.length;i++){
//            if(arr[i]==eleOne){
//                count1++;
//            }
//            if(arr[i]==eleTwo){
//                count2++;
//            }
//        }
//
//        if(count1>arr.length/3){
//            res.add(eleOne);
//        }
//        if(count2>arr.length/3){
//            res.add(eleTwo);
//        }
//
//        if(res.size()==2){
//            if(res.get(0)>res.get(1)){
//                int temp = res.get(0);
//                res.set(0,res.get(1));
//                res.set(1,temp);
//            }
//        }
//
//
//        return res;


        int eleOne = -1;
        int eleTwo = -1;
        int count1 = 0;
        int count2 = 0;

        for(int i=0;i<nums.length;i++){
            if(nums[i]==eleOne){
                count1++;
            }else if(nums[i]==eleTwo){
                count2++;
            }else if(count1==0){
                eleOne = nums[i];
                count1++;
            }else if(count2==0){
                eleTwo = nums[i];
                count2++;
            }else{
                count1--;
                count2--;
            }

        }
        List<Integer> res = new ArrayList<>();
        count1=0;
        count2=0;

        for(int i=0;i<nums.length;i++){
            if(nums[i]==eleOne){
                count1++;
            }
            if(nums[i]==eleTwo){
                count2++;
            }
        }
        if(count1>nums.length/3){
            res.add(eleOne);
        }
        if(count2>nums.length/3){
            res.add(eleTwo);
        }

        if(res.size()==2){
            if(res.get(0)>res.get(1)){
                int temp=res.get(0);
                res.set(0,res.get(1));
                res.set(1,temp);
            }
        }

        return res;

    }
    public static void main(String[] args) {
        int[] arr = {2 ,1, 5, 5, 5, 5, 6, 6, 6, 6, 6};
        System.out.println(new MajorityElementTwoA3().findMajorityElement(arr));

    }
}
