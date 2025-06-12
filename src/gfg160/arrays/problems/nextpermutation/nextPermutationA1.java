package gfg160.arrays.problems.nextpermutation;

public class nextPermutationA1 {
    void nextPermutation(int[] arr) {
        int pivot = -1;
        int j=arr.length-1;
        for(;j>0;j--){
            if(arr[j]>arr[j-1]){
                pivot=arr[j-1];
                break;
            }
        }


        int greaterThanPivotIndex = -1;
        if(pivot==-1){
           for(int i=0;i<arr.length/2;i++) {
               int temp = arr[i];
               arr[i] = arr[arr.length - 1 - i];
               arr[arr.length - 1 - i] = temp;
           }
        }else{
            int greaterThanPivot = Integer.MAX_VALUE;
            int pivotIndex= j-1;
            for(;j<arr.length;j++){
                if(arr[j]<greaterThanPivot && arr[j]>pivot){
                    greaterThanPivot=arr[j];
                    greaterThanPivotIndex=j;
                }
            }

            int temp = arr[pivotIndex];
            arr[pivotIndex] = arr[greaterThanPivotIndex];
            arr[greaterThanPivotIndex] = temp;

            int start = pivotIndex+1;
            int end = arr.length-1;

            while(start<end){
                int temps = arr[start];
                arr[start]=arr[end];
                arr[end]=temps;
                start++;
                end--;
            }

        }
    }


    public static void main(String[] args) {
        int[] arr = {1,2,3};
        new nextPermutationA1().nextPermutation(arr);
        for(int i : arr){
            System.out.print(i+ " ");
        }
    }
}
