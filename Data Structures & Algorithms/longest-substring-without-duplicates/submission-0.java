class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int left = 0;
        int maxLen = 0;
        
        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            
            // If duplicate found, remove from left until duplicate is gone
            while (set.contains(c)) {
                set.remove(s.charAt(left));
                left++;
            }
            
            // Add current character
            set.add(c);
            
            // Update max length
            maxLen = Math.max(maxLen, right - left + 1);
        }
        
        return maxLen;
    }
}