class Solution {
    public int countEven(int num) 
    {
        int count=0;
	    for(int i=1;i<=num;i++)
	    {
	        int s = SumOfDigits(i);
	        
	        if(s%2==0)
	        {
	            count++;
	        }
	    }
        return count;
    }

    public static int SumOfDigits(int n)
	    {
	        int s=0;
	        
	        while(n!=0)
	        {
	            s+=n%10;
	            n=n/10;
	        }
	        return s;
	    }
}