class Solution {
    public int maxVowels(String s, int k) 
    {
      int count=0;
		
		for(int i=0;i<k;i++)
		{
		    if(("aeiouAEIOU").contains(s.valueOf(s.charAt(i))))
		    {
		        count++;
		    }
		}
		
		int max = count;
		
		for(int i=k;i<s.length();i++)
		{
		    if(("aeiouAEIOU").contains(s.valueOf(s.charAt(i-k))))
		    {
		        count--;
		    }
		    
		    if(("aeiouAEIOU").contains(s.valueOf(s.charAt(i))))
		    {
		        count++;
		    }
		    
		    max = Math.max(max,count);
		}
    return max;
    }
}