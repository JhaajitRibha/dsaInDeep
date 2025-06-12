package gfg160.arrays.problems.MaximumProductSubArray;

public class MaximumProductSubArrayA1 {
    public static int maxProduct(int[] arr) {
        int maxProduct=1;

        for(int i=0;i<arr.length;i++){
            int currentProduct = arr[i];
            for(int j=i+1;j<arr.length;j++){
                currentProduct*=arr[j];
                maxProduct=Math.max(currentProduct,maxProduct);
            }
        }

        return maxProduct;
    }
    public static void main(String[] args) {
        int[] arr = {-2, 6, -3, -10, 0, 2};
        System.out.println(maxProduct(arr));
    }
}
