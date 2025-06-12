package gfg160.arrays.problems.rotateArray;

public class rotateArrayA2 {
    static void rotateArr(int arr[], int d) {
        d = d%arr.length;
        for(int i=0;i<d;i++){
            int first = arr[0];
            for(int j=1;j<arr.length;j++){
                arr[j-1]  =arr[j];
            }
            arr[arr.length-1]=first;
        }
    }
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        rotateArr(arr,3);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
