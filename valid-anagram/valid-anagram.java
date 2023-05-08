class Solution {
    public boolean isAnagram(String s, String t) 
		{
			if(s.length()!=t.length())
	   {
	       return false;
	   }
	   
	   else
	   {
	    char[] c =s.toCharArray();
	   char[] x =t.toCharArray();
	   
	   Arrays.sort(c);
	   Arrays.sort(x);
	   
	   for(int i=0;i<c.length;i++)
	   {
	       if(c[i]!=x[i])
	       {
	           return false;
	       }
	   }
	   }
       return true; 
    }
}