class Solution {
    public int longestConsecutive(int[] nums) 
    {
        if(nums.length == 0) return 0;
        if(nums.length == 1) return 1;
        
        Set<Integer> set = new HashSet<>();
        for (int i:nums)
        {
            set.add(i);
        }

        int max = 0;

        for (int k:set)
        {
            if(set.contains(k-1))
            {
                int length = 1;
                while(set.contains(k+length))
                {
                    length++;
                }
                max = Math.max(max, length);
            }
        }

        return ++max;
    }
}
