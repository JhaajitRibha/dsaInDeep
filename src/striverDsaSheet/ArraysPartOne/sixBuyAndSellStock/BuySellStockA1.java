package striverDsaSheet.ArraysPartOne.sixBuyAndSellStock;

public class BuySellStockA1 {
    public int maxProfit(int[] prices) {
        int low=0;
        int high=0;
        int sum=0;
        int profit=0;
        for(int i=0;i<prices.length-1;i++){
            sum = prices[low]-prices[i+1];
            if(sum>0){
                low=i+1;
            }else {
                high = i + 1;
                profit = Math.max(profit,(prices[high] - prices[low]));
            }

        }
        return profit;
    }

    public int maxProfitTwo(int[] prices){
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price;
            } else {
                maxProfit = Math.max(maxProfit, price - minPrice);
            }
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        int[] arr = {2,4,1};
        int[] arr2 = {3,2,6,5,0,3};
        int[] arr3 = {7,1,5,3,6,4};
//        int rs = new BuySellStockA1().maxProfit(arr);
//        int rs2 = new BuySellStockA1().maxProfit(arr2);
        int rs3=new BuySellStockA1().maxProfitTwo(arr3);
//        System.out.println(rs);
//        System.out.println();
//        System.out.println(rs2);
        System.out.println(rs3);
    }
}
