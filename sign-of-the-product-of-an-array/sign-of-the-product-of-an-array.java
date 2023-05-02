class Solution {
    public int arraySign(int[] nums) 
    {

	    int[] arr=new int[nums.length];
	    
	    for(int i=0;i<nums.length;i++)
	    {
	        if(nums[i]<0)
	        {
	            arr[i]=-1;
	        }
	        else if(nums[i]>0)
	        {
	            arr[i]=1;
	        }
	        else
	        {
	            arr[i]=0;
	        }
	    }
	    int product=1;
	    
	   for(int x : arr)
	   {
	       product*=x;
	   }
       return product;
        
    }
}