package gfg160.arrays.problems.reverseArray;

public class reverseArrayA2 {

    public static void reverseArray(int[] arr){
        int i=0;
        int j=arr.length-1;
        while(i<j){
            arr[i] = arr[i]+arr[j];
            arr[j] = arr[i]-arr[j];
            arr[i] = arr[i]-arr[j];
            i++;
            j--;
        }

        for(int k=0;k<arr.length;k++){
            System.out.print(arr[k] + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 3, 2, 6, 5};
        new reverseArrayA2().reverseArray(arr);

    }
}
