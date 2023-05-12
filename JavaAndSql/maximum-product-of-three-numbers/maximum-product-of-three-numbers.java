class Solution {
    public int maximumProduct(int[] nums) 
    {
         int max1=Integer.MIN_VALUE;
	    int max2=Integer.MIN_VALUE;
	    int max3=Integer.MIN_VALUE;
	    
	    int min1=Integer.MAX_VALUE;
	    int min2=Integer.MAX_VALUE;
	   
	    
	    
	    for(int x : nums)
	    {
	       if(max1<x)
	       {
	           max3=max2;
	           max2=max1;
	           max1=x;
	       }
	       
	       else if(max2<x)
	       {
	           max3=max2;
	           max2=x;
	       }
	       else if(max3<x)
	       {
	           max3=x;
	       }
	    }
	    
	    
	    
	    for(int x :nums)
	    {
	        if(min1>x)
	        {
	            
	            min2=min1;
	            min1=x;
	        }
	        else if(min2>x)
	        {
	            
	            min2=x;
	        }

	    }
	   
        int product1=max1*max2* max3;
        int product2=max1*min1*min2;

        return Math.max(product1,product2);
      
    }
}