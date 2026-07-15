class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> allElements = new HashSet<>();
        Set<Integer> starts = new HashSet<>();

        for(int n:nums){
            allElements.add(n);
        }
        for(int n:nums){
            if(!allElements.contains(n-1))
                starts.add(n);
        }

        int max=0;

        for(int start:starts){
            int length = 1;
            int checker = start;
            while(allElements.contains(++checker)){
                length++;
            }

            max = Math.max(max,length);
        }
        return max;
    }
}
