package gfg160.arrays.problems.rotateArray;

public class rotateArrayA3 {
    static void rotateArr(int arr[], int d) {
        d = d%arr.length;
       int[] temp = new int[arr.length];
//        Input: arr[] = {1, 2, 3, 4, 5, 6}, d = 2
//        Output: {3, 4, 5, 6, 1, 2}
        int i=d;
        int tempIndex=0;
        for(;i<arr.length;i++){
            temp[tempIndex++]=arr[i];
        }
        i=0;
        for(;i<d;i++){
            temp[tempIndex++]=arr[i];
        }

        for(int z=0;z<arr.length;z++){
            arr[z] = temp[z];
            System.out.print(arr[z] + " ");
        }


    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        rotateArr(arr,3);
    }

}
