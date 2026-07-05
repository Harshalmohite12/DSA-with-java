class Solution {
    public int maxProfit(int[] prices) {
        int maxdiff = 0;
        int cheapest = prices[0];

        for(int i = 1; i < prices.length; i++){
            if(cheapest > prices[i]) cheapest = prices[i];

            int profit = prices[i] - cheapest;

            if(profit > maxdiff) maxdiff = profit;
            
        }
        return maxdiff;
    }
}