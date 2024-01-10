package SlidingWindow;

public class BestBuySellStock {
    public static void main(String[] args){
        System.out.println(maxProfit(new int[]{7,1,4,3,1}));
    }
    public static int maxProfit(int[] prices) {
        int left = 0;
        int right = 1;
        int max_profit = 0;
        while(right<prices.length){
            if(prices[left]<prices[right]){
                int profit = prices[right]-prices[left];
                max_profit = Math.max(profit,max_profit);
            }
            else{
                left = right;
            }
            right++;
        }
        return max_profit;
    }
}
