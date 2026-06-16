class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length == 0) {
            return 0;
        }

        int lowest = 0;
        int highest = 1;
        int maxProfit = 0;
        while(highest < prices.length) {
            if(prices[highest] > prices[lowest]) {
                int curr = prices[highest] - prices[lowest];
                if(curr > maxProfit) {
                    maxProfit = curr;
                }
                highest++;
            } else {
                lowest = highest;
                highest++;
            }
        }
        return maxProfit;
    }
}
