public class Stocks_Buy_Sell_1 {
    public int maxProfit(int[] prices) {
        int mini = prices[0], profit = 0, cost;
        for(int i = 1; i < prices.length; i++)
        {
            cost = prices[i] - mini;
            if(prices[i] < mini)
            {
                mini  = prices[i];
            }
            if(cost > profit)
            {
                profit  = cost;
            }
        }
        return profit;
    }

    public static void main(String[] args) {
        Stocks_Buy_Sell_1 sbs = new Stocks_Buy_Sell_1();

        // Sample stock prices
        int[] prices = {7, 1, 5, 3, 6, 4};  // Expected totalProfit = 7

        int result = sbs.maxProfit(prices);
        System.out.println("Maximum profit: " + result);
    }
}