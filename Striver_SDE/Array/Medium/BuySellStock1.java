class Solution {
    public int maxProfit(int[] prices) {
        int maxPro=0;
        int minVal = Integer.MAX_VALUE;
        for(int i=0;i<prices.length;i++){
            minVal = Math.min(minVal,prices[i]);
            maxPro = Math.max(prices[i]-minVal, maxPro);
        }
        return maxPro;
    }
}
