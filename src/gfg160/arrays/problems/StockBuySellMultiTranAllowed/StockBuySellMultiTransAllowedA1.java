package gfg160.arrays.problems.StockBuySellMultiTranAllowed;

public class StockBuySellMultiTransAllowedA1 {
    public static int stockBuySell(int[] prices) {
        int n = prices.length;
        int lMin = prices[0];
        int lMax = prices[0];
        int res = 0;
        int i = 0;
        while (i < n - 1) {
            while (i < n - 1 && prices[i] >= prices[i + 1]) {
                i++;
            }
            lMin = prices[i];
            while (i < n - 1 && prices[i] <= prices[i + 1]) {
                i++;
            }
            lMax = prices[i];
            res += (lMax - lMin);
        }

        return res;
    }

    public static void main(String[] args) {
        int[] prices = {7, 10, 1, 3, 6, 9, 2};
        System.out.println(stockBuySell(prices));
    }

}
