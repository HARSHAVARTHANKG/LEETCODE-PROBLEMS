class Solution {
    public String reverseOnlyLetters(String s) 
    {
        char[] c = s.toCharArray();
		
		int i=0;
		int j=c.length-1;
		
		while(i<j)
		{
		    int x=c[i];
		    int y=c[j];
		    
		    if(check(x)==true && check(y)==true)
		    {
		        swap(i,j,c);
		    }
		    else if(check(x)==true && check(y)==false)
		    {
		        i--;
		    }
		    else if(check(x)==false && check(y)==true)
		    {
		        j++;
		    }
		    i++;
		    j--;
		}
        return  String.valueOf(c);
    }
    public static void swap(int a ,int b , char[] c)
	{
	    char temp=c[a];
	    c[a]=c[b];
	    c[b]=temp;
	}
	
	public static boolean check(int x)
	{
	    if(x>=65 && x<=90 || x>=97 && x<=122)
	    {
	        return true;
	    }
	    return false;
	}
}