class Solution 
{

    public static String encode(List<String> strs) 
    {
		if(strs.size()==0) 
		{
			return "\\";
		}
		
		if(strs.size()==1 && strs.get(0).equals("")) 
		{
			return "";
		}

		String str = "";
		for(String s:strs) 
		{
			str += s+"[";
		}
		return str;
    }

    public static List<String> decode(String str) 
    {
    	
    	if(str.equals("\\")) 
    	{
    		return Collections.emptyList();
    	}
    	String[] strs = str.split("\\[");
    	List<String> strsList = new ArrayList<>();
    	
    	for(String s:strs) 
    	{
    		strsList.add(s);
    	}
    	
    	return strsList;
    }
}
