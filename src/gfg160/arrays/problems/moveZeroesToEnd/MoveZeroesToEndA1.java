package gfg160.arrays.problems.moveZeroesToEnd;

import gfg160.arrays.problems.secondLargestElement.secondLargestElementA1;

public class MoveZeroesToEndA1 {

    void pushZerosToEnd(int[] arr) {
        int nonZeroIndex = 0;
      for(int i=0;i<arr.length;i++){
          if(arr[i]!=0){
              int temp = arr[i];
              arr[i]= arr[nonZeroIndex];
              arr[nonZeroIndex]=temp;
              nonZeroIndex++;
          }
      }

      for(int i=0;i<arr.length;i++){
          System.out.print(arr[i]+ " ");
      }

    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 0, 4, 3, 0, 5, 0};
        new MoveZeroesToEndA1().pushZerosToEnd(arr);


    }


}
