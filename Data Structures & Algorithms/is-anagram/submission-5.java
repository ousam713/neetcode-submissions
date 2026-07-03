class Solution {
    public boolean isAnagram(String s, String t) {
        char[] table_s = s.toCharArray();
        char[] table_t = t.toCharArray();

        Map<Character, Integer> map_s = new HashMap<>();
        Map<Character, Integer> map_t = new HashMap<>();

        for (char c : table_s ){
            map_s.put(c, map_s.getOrDefault(c,0) + 1);
        }

        for (char c : table_t ){
            map_t.put(c, map_t.getOrDefault(c,0) + 1);
        }

        if (map_s.equals(map_t)) return true;

        
        return false;
    }
}
