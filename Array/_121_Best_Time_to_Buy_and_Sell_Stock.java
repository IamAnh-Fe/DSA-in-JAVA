

public class _121_Best_Time_to_Buy_and_Sell_Stock {
    public static int BruteForce(int[] prices) {
        int max_profit = 0;
        int buy = prices[0];
        for (int i = 0; i < prices.length; i++) {
            if (buy > prices[i]) {
                buy = prices[i];
            } else if (prices[i] - buy > max_profit) {
                max_profit = prices[i] - buy;
            }
        }
        return max_profit;
    }
    
    public static int Dynamic(int[] prices) {
          int sellOne = 0;
    int holdOne = Integer.MIN_VALUE;

    for (final int price : prices) {
      sellOne = Math.max(sellOne, holdOne + price);
      holdOne = Math.max(holdOne, -price);
    }

    return sellOne;
    }
    
    public static void main(String[] args) {
    int[] prices1 = {7,1,5,3,6,4}; //solution: 5
    // int[] prices = {7,6,4,3,1}; //solution: 0
    // System.out.println(BruteForce(prices));
    System.out.println(Dynamic(prices1));

    }
}
