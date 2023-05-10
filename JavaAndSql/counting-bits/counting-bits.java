class Solution {
    public int[] countBits(int n) 
    {
        int arr[]=new int[n+1];
        
        for(int i=0;i<=n;i++)
        {
            arr[i]=count1Bits(i);
        }
        return arr;
    }

    public static int count1Bits(int n)
    {
        int count=0;

        while(n!=0)
        {
            count++;
            n=n&(n-1);
        }
        return count;
    }
}