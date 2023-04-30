class Solution {
    public int[] separateDigits(int[] nums) 
    {
       StringBuilder str= new StringBuilder();

        for(int n: nums)
        {
            str.append(n);
        }

        int arr[]=new int[str.length()];
        for(int i=0;i<arr.length;i++)
        {
           arr[i]=str.charAt(i)-48;
        }
        return arr;
        
    }
}