// import java.util.HashMap;
// import java.util.Map;

class Solution 
{
    public boolean isAnagram(String s, String t) 
    {
        Map<Character , Integer> map1 = getOccureneceMap(s);
    	Map<Character , Integer> map2 = getOccureneceMap(t);    	

    	
    	System.out.println(map1);
    	System.out.println(map2);
    	
    	if(map1.equals(map2)) {return true;}
    	else {return false;}
    }

    public Map<Character , Integer> getOccureneceMap(String s)
	{
		Map<Character , Integer> map = new HashMap<>();
		char[] ss = s.toCharArray();
    	int count = 0;
    	for (char c:ss) 
    	{
//    		if(!map.containsKey(c)) 
//    		{
//    			count = 0;
//    		}
//    		map.put(c, ++count);
            map.put(c, map.getOrDefault(c, 0) + 1);
    	}
    	
		return map;
	}
}
