class Solution 
{
    public int getLucky(String s, int k) 
    {
      
		int n=0;
		
		    int sum=0;
		    for(char c :s.toCharArray())
		    {
		        if(c>=97 && c<=122)
		        {
		            int num=(int)(c-'a'+1);
		            sum+=sumOfDigits(num);
		        }
		    }
		    n++;
		    
		 while(n<k)
		 {
		    sum=sumOfDigits(sum);
		    n++;
		 }
         return sum;
        
    }

    public static int sumOfDigits(int n)
	{
	    int sum=0;
	    while(n!=0)
	    {
	        sum+=n%10;
	        n=n/10;
	    }
	    return sum;
	}
}