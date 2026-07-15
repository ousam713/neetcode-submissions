class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        
        for (String str : strs){
            
            int[] freq = new int[26];
            
            for(char c:str.toCharArray()){
                freq[c-'a'] += 1;
            }

            String s = Arrays.toString(freq);
            
            if(map.get(s) == null)
                map.put(s, new ArrayList<>());

            map.get(s).add(str);
        }

        return new ArrayList<>(map.values());
    }
}
