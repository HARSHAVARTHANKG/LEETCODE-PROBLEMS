class Solution {
    public int[] replaceElements(int[] arr) 
    {
        int temp=0;
        int greatest=-1;

        for(int i=arr.length-1;i>=0;i--)
        {
            temp=arr[i];
            arr[i]=greatest;
            if(temp>greatest)
            {
                greatest=temp;
            }
        }
        return arr;
        
    }
}