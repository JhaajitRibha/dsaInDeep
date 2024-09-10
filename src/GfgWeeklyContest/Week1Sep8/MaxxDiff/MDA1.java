package GfgWeeklyContest.Week1Sep8.MaxxDiff;

import java.util.Arrays;

public class MDA1 {
    public static long fndMax(int n, int m, int[] arr1, int[] arr2) {

        int[] temp = arr1;
        Arrays.sort(temp);

        int[] reversedArray2 = reverseArray(arr2);


        int total=0;

        int max=Integer.MIN_VALUE;

        int tracker=0;

        for(int i=0;i<n;i++){
            int first = temp[i];
            max = Integer.MIN_VALUE;
            for(int j=0;j<m;j++){
                int second = reversedArray2[j];
                if(reversedArray2[j]!=-1 && Math.abs(second-first)>max){
                    max = Math.abs(second-first);
                    tracker=j;

                }
            }

            total+=max;
            reversedArray2[tracker]=-1;
        }

        return total;

    }

    public static int[] reverseArray(int[] arr){
        int temp=0;
        Arrays.sort(arr);
        for(int i=0;i<arr.length/2;i++){
            temp =arr[i];
            arr[i]=arr[arr.length-i-1];
            arr[arr.length-i-1]=temp;
        }

        return arr;
    }

    public static int findIndex(int[] arr,int num){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==num){
                return i;
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        int arr1[] = {6,5,2};
        int arr2[] = {1,7,9,7,2};

        System.out.println(fndMax(arr1.length,arr2.length,arr1,arr2));

    }
}
