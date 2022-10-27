

public class _121_Best_Time_to_Buy_and_Sell_Stock {
     public static int  BruteForce(int[] prices) {
        int max_profit = 0; 
        int buy = prices[0];
        for (int i = 0; i < prices.length; i++) {
            if(buy > prices[i]){
                buy = prices[i];
            } else if(prices[i] - buy > max_profit){
                max_profit = prices[i]-buy;
            }
        }
        return max_profit;
    }

    public static void main(String[] args) {
    // int[] prices1 = {7,1,5,3,6,4};
    int[] prices = {7,6,4,3,1};
    System.out.println(BruteForce(prices));
    }
}
