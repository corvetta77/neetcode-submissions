class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = prices[0];
        int bestGain = 0;

        for (int i=1; i<prices.length; i++) {
            minPrice = Math.min(minPrice, prices[i]);
            bestGain = Math.max(prices[i]-minPrice, bestGain);
        }
        return bestGain;
    }
}
