package gfg160.arrays.problems.maxCircularSubArray;

public class maxCircularSubArrayA1 {
    public static int circularSubarraySum(int arr[]) {
        int max = 0;
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            sum=0;
            for(int j=0;j<arr.length;j++){
                int index = (i+j)%arr.length;
                sum=sum+arr[index];
                if(sum>max){
                    max=sum;
                }
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr = {8, -8, 9, -9, 10, -11, 12};
        System.out.println(circularSubarraySum(arr));
    }
}
