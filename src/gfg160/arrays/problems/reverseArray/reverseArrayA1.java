package gfg160.arrays.problems.reverseArray;

public class reverseArrayA1 {
    public void reverseArray(int arr[]) {
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length-1-i];
            arr[arr.length-1-i]=temp;
        }

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
    }
    public static void main(String[] args) {
         int[] arr = {1, 4, 3, 2, 6, 5};
         new reverseArrayA1().reverseArray(arr);

    }
}

