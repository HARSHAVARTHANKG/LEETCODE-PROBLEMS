class Solution {
    public int[] shuffle(int[] nums, int n)
    {
        int arr[]=new int[2*n];
        for(int i=0,j=n,k=n;i<2*n;i++)
        {
            if(i%2==0)
            {
                arr[i]=nums[n-j];
                j--;
            }
            else
            {
                arr[i]=nums[k];
                k++;
            }
            
        }
        return arr;
        
    }
}