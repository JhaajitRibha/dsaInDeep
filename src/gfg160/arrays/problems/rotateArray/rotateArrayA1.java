package gfg160.arrays.problems.rotateArray;

public class rotateArrayA1 {
    public static int[] reverseArray(int[] arr,int start,int end){
        while(start<end){
            arr[start] = arr[start]+arr[end];
            arr[end] = arr[start]-arr[end];
            arr[start]=arr[start]-arr[end];
            start++;
            end--;
        }
        return arr;
    }

    static void rotateArr(int arr[], int d) {
          d = d%arr.length;

          reverseArray(arr,0,d-1);
          reverseArray(arr,d,arr.length-1);
          reverseArray(arr,0,arr.length-1);

    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        rotateArr(arr,3);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
