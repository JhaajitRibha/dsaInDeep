package gfg160.arrays.problems.MaximumProductSubArray;

public class MaximumProductSubArrayA2 {

    public static int maxThree(int a,int b ,int c){
        int temp = Math.max(a,b);
        return Math.max(temp,c);
    }

    public static int minThree(int a,int b ,int c){
        int temp = Math.min(a,b);
        return Math.min(temp,c);
    }
    public static int maxProduct(int[] arr){
        int minProd = arr[0];
        int maxProd = arr[0];
        int resProd = arr[0];

        for(int i=1;i<arr.length;i++){
            int temp = maxThree(maxProd*arr[i],arr[i],minProd*arr[i]);
            minProd = minThree(minProd*arr[i],arr[i],maxProd*arr[i]);
            maxProd = temp;
            resProd = Math.max(resProd,maxProd);
        }

        return resProd;
    }
    public static void main(String[] args) {
        int[] arr = {2,3,4};
        System.out.println(maxProduct(arr));
    }
}
