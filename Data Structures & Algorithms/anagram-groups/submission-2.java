class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (String s: strs){
            int[] counter = new int[26];
            for (char c:s.toCharArray()){
                counter[c-'a'] += 1;
            }

            String key = Arrays.toString(counter);
            map.putIfAbsent(key,new ArrayList<String>());
            map.get(key).add(s);
        }

        return new ArrayList<>(map.values());
    }
}
