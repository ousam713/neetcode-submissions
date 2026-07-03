class Solution 
{
    public static int[] topKFrequent(int[] nums, int k) 
    {
        Map<Integer,Integer> freq = new HashMap<>();
        for (int i=0;i<nums.length;i++)
        {
        	freq.put(nums[i], freq.getOrDefault(nums[i], 1)+1);
        }
        System.out.println(freq);
        
     // Sort keys by values in DESCENDING order (highest values first)
        List<Integer> sortedKeys = freq.entrySet()
            .stream()
            .sorted((a, b) -> b.getValue() - a.getValue())
            .map(Map.Entry::getKey)
            .collect(Collectors.toList());

		int[] result = new int[k];
		for(int i=0;i<k;i++) 
		{
			result[i] = sortedKeys.get(i);
		}
        
        
        return result;
    }
}
