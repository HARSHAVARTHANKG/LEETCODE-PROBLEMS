class Solution {
    public boolean isPalindrome(String s) 
    {
        	StringBuilder str=new StringBuilder();
		
		for(char c : s.toCharArray())
		{
		    if(c>=65 && c<=90)
		    {
		        s=s.replace(String.valueOf((char)c),String.valueOf((char)(c+32)));
		    }
		}
		
		for(char c:s.toCharArray())
		{
		    if(c>=97 && c<=122 || c>=47 && c<=57)
		    {
		        str.append(c);
		    }
		}
		
		StringBuilder str1=new StringBuilder(str);

		str.reverse();
		
		if(str1.toString().equals(str.toString()))
		{
		    return true;
		}
		else{
		    return false;
		}
        
    }
}