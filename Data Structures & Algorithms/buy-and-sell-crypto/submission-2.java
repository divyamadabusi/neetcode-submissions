class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length <= 1) {
            return 0;
        }
        int l = 0;
        int r = 1;
        int maxP = 0;
        while (r < prices.length && l < r) {
            if(prices[r] <= prices[l]) {
                l = r;
                r++;
            } else {
                int currP = prices[r] - prices[l];
                if(currP > maxP) {
                    maxP = currP;
                }
                r++;
            }
        }
        return maxP;
    }
}
