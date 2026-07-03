class Solution {
    public int maxArea(int[] h) {
        int maxH = 0;
        int i=0;
        // while(i<h.length-1){
        //     int j=i+1;
        //     while(j<h.length){
        //         if(Math.min(h[i],h[j])*(j-i) > maxH){
        //             maxH = Math.min(h[i],h[j])*(j-i);
        //         }
        //         j++;
        //     }
        //     i++;
        // }

        int l=0,r=h.length-1;
        int res = 0;
        while(l<r){
            int surface = Math.min(h[l],h[r])*(r-l);
            res = Math.max(surface,res);

            if(h[l]<h[r]){
                l++;
            }
            else{
                r--;
            }
        }
        return res;
    }
}