class Solution {
    public int maxProfit(int[] nums) {
        int maxP = 0;
        int minBuy = nums[0];

        for(int sell:nums){
            maxP = Math.max(maxP, sell - minBuy);
            minBuy = Math.min(minBuy, sell);
        }

        return maxP;
    }
}
