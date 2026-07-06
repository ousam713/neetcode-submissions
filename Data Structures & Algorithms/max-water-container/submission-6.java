class Solution {
    public int maxArea(int[] nums) {

        int l=0, r=nums.length-1;
        int maxs = 0;
        int currentSurface = 0;
        
        while(l<r){
            
            currentSurface = Math.min(nums[l],nums[r])*(r-l);
            
            System.out.println(maxs+" "+currentSurface);
            
            maxs = Math.max(maxs,currentSurface);
            
            if(nums[l]<=nums[r]){
                l++;
            }else{
                
                r--;
            }
            
        }

        return maxs;
    }
}
