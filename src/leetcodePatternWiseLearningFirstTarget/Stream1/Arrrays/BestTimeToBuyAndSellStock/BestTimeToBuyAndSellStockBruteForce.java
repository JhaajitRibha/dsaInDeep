package leetcodePatternWiseLearningFirstTarget.Stream1.Arrrays.BestTimeToBuyAndSellStock;

public class BestTimeToBuyAndSellStockBruteForce {
    public static int maxProfit(int[] prices) {
        int profit = 0;
        for(int i=0;i<prices.length;i++){
            for(int j=i+1;j<prices.length;j++){
                if(prices[j]>prices[i]){
                    int diff = prices[j]-prices[i];
                    if(diff>profit){
                        profit=diff;
                    }
                }
            }
        }

        return profit;
    }

    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        int[] prices2 = {7, 6, 4, 3, 1};
        int[] prices3 = {2,4,1};
        System.out.println(maxProfit(prices));
        System.out.println(maxProfit(prices2));
        System.out.println(maxProfit(prices3));
    }
}
