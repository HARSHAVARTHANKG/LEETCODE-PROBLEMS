class Solution {
    public int subsetXORSum(int[] nums) 
    {
       return getAns(nums,0,0);
    }

      public static int getAns(int arr[],int i,int curr)
    {
        if(i==arr.length)
        {
            return curr;
        }
        return getAns(arr,i+1,curr) + getAns(arr,i+1,curr^arr[i]);
    }
}