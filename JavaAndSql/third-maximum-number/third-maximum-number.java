class Solution {
    public int thirdMax(int[] nums) 
    {
        int max1=Integer.MIN_VALUE;
		int max2=Integer.MIN_VALUE;
		int max3=Integer.MIN_VALUE;
		int max4=Integer.MIN_VALUE;
		
		HashSet<Integer> h1 = new HashSet<Integer>();
		for(int x : nums)
		{
		    h1.add(x);
		}
		
		System.out.println(h1);
		for(int x : h1)
		{
		    if(x>max1)
		    {
		        max3=max2;
		        max2=max1;
		        max1=x;
		    }
		    else if(x>max2)
		    {
		        max3=max2;
		        max2=x;
		    }
		    else if(x>max3)
		    {
		         max3=x;
		    }
		}

		if(h1.size()<=2)
		{
			return max1;
		}
		return max3;
        
    }
}