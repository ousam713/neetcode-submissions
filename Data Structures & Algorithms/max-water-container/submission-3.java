class Solution {
    public int maxArea(int[] h) {
        int maxH = 0;
        int i=0;
        while(i<h.length-1){
            int j=i+1;
            while(j<h.length){
                if(Math.min(h[i],h[j])*(j-i) > maxH){
                    maxH = Math.min(h[i],h[j])*(j-i);
                }
                j++;
            }
            i++;
        }
        return maxH;
    }
}