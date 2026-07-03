class Solution {
    public int trap(int[] h) {
        int l=0, r=h.length-1;
        int leftMax=h[l], rightMax = h[r];
        int surface = 0;

        while(l<r){

            if(leftMax<rightMax){
                l++;
                leftMax = Math.max(leftMax, h[l]);
                surface += leftMax - h[l];
            } else{
                r--;
                rightMax = Math.max(rightMax, h[r]);
                surface += rightMax - h[r];
            }
        }
        return surface;
    }
}
