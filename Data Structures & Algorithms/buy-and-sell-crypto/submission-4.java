class Solution {
    public int maxProfit(int[] nums) {
        int minBuy = nums[0], maxP = 0;

        for(int sell: nums){
            maxP = Math.max(maxP, sell - minBuy);
            minBuy = Math.min(minBuy, sell);
        }

        return maxP;
    }
}
