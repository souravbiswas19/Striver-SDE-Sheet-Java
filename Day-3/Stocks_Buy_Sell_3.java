public class Stocks_Buy_Sell_3 {
    public int maxProfit(int[] prices) {
        int mini1 = prices[0], mini2 = prices[0], profit1 = 0, profit2 = 0, cost;

        System.out.printf("%-8s %-8s %-10s %-8s %-8s %-10s\n", 
                          "mini1", "cost1", "profit1", "mini2", "cost2", "profit2");

        for (int i = 1; i < prices.length; i++) {
            mini1 = Math.min(prices[i], mini1);
            cost = prices[i] - mini1;
            profit1 = Math.max(cost, profit1);

            mini2 = Math.min(mini2, prices[i] - profit1);
            cost = prices[i] - mini2;
            profit2 = Math.max(cost, profit2);

            System.out.printf("%-8d %-8d %-10d %-8d %-8d %-10d\n", 
                              mini1, prices[i] - mini1, profit1, mini2, prices[i] - mini2, profit2);
        }

        return profit2;
    }

    // Driver code
    public static void main(String[] args) {
        Stocks_Buy_Sell_3 sol = new Stocks_Buy_Sell_3();
        int[] prices = {3, 3, 5, 0, 0, 3, 1, 4};  // Expected output: 6
        int maxProfit = sol.maxProfit(prices);
        System.out.println("Maximum Profit with at most 2 transactions: " + maxProfit);
    }
}
