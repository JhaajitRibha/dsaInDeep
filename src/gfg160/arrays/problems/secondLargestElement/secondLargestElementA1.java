package gfg160.arrays.problems.secondLargestElement;

public class secondLargestElementA1 {
    public int getSecondLargest(int[] arr) {
        int largest = Integer.MIN_VALUE;
        int secondLargest=Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                secondLargest=largest;
                largest=arr[i];
            }else if(arr[i]>secondLargest && arr[i]!=largest){
                secondLargest=arr[i];
            }

        }

        if(secondLargest!=Integer.MIN_VALUE) {
            return secondLargest;
        }else{
            return -1;
        }

    }
    public static void main(String[] args) {


        int[] arr= {10,10,10};
        System.out.println(new secondLargestElementA1().getSecondLargest(arr));

    }
}
