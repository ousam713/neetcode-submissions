class Solution 
{

    public static String encode(List<String> strs) 
    {
		// if(strs.size()==0) 
		// {
		// 	return "\\";
		// }
		
		// if(strs.size()==1 && strs.get(0).equals("")) 
		// {
		// 	return "";
		// }
		StringBuilder sb = new StringBuilder();
		for(String s:strs) 
		{
			sb.append(s.length()).append('?').append(s);
		}
		
		String str = sb.toString();
		return str;
    }

    public static List<String> decode(String str) 
    {
    	
    	// if(str.equals("\\")) 
    	// {
    	// 	return Collections.emptyList();
    	// }
    	List<String> strsList = new ArrayList<>();
    	
    	int i = 0;
    	while(i<str.length())
    	{
    		int j=i;
    		while(str.charAt(j) != '?') 
    		{
    			j++;
    		}
    		
    		int ln = Integer.parseInt(str.substring(i,j));
    		i = j+1; 
    		j = i + ln;
    		strsList.add(str.substring(i,j));
    		i = j;
    	}
    	return strsList;
    }
}
