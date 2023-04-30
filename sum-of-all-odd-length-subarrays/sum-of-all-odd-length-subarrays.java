class Solution {
    public int sumOddLengthSubarrays(int[] arr)
    {
        int sum=0;
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            int start=n-i;
            int end=i+1;
            int totalsubarray=start * end;
            int oddsubarray=totalsubarray/2;
            if(totalsubarray%2==1)
            {
                oddsubarray++;
            }
            sum=sum+oddsubarray*arr[i];
        }
          return sum;
        
    }
}