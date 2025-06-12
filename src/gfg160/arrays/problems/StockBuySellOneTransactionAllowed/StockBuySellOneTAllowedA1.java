package gfg160.arrays.problems.StockBuySellOneTransactionAllowed;

public class StockBuySellOneTAllowedA1 {

    public static int stockBuySell(int[] arr){

        int max = 0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]-arr[i]<0){
                    continue;
                }else{
                    int profit = arr[j]-arr[i];
                    if(profit>max){
                        max=profit;
                    }
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr =  {1, 3, 6, 9, 11};
        System.out.println(stockBuySell(arr));
    }
}
