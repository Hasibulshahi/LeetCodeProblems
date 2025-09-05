package top_150_problems.array_string.problem_121;

public class BestTimeToBuyAndSellStock {
    public BestTimeToBuyAndSellStock() {
        System.out.println("****************** 121. Best Time to Buy and Sell Stock *******************");
        int[] prices = {2,4,1};
        System.out.println(this.maxProfit(prices));
    }
    public int maxProfit(int[] prices) {
        int min = prices[0], max = 0;
        for (int i=1; i<prices.length; i++){
            int profit = prices[i] - min;
            if (profit > max)
                max = profit;
            if (prices[i] < min){
                min = prices[i];
            }
        }
        return max;
    }
}
