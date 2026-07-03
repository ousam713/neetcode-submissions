class Solution {
    public boolean isAnagram(String s, String t) {
        char[] str1 = s.toCharArray();
        char[] str2 = t.toCharArray();
        
        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();

        for(char c: str1){
            map1.put(c, map1.getOrDefault(c, 0) + 1);

        }

        for(char c: str2){
            map2.put(c, map2.getOrDefault(c, 0) + 1);
        }

        if(map1.equals(map2)) return true;

        return false;
    }
}
