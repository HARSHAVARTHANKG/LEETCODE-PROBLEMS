class Solution {
    public boolean isHappy(int n)
   {
        int sum=0;
        while(sum!=1 && n>=7)
        {
            sum=0;
            while(n!=0)
            {
                int rem=n%10;
                sum+=rem*rem;
                 n=n/10;
            }
            n=sum;
        }
        if(n==1)
        {
           return true;
        }
        else 
        {
            return false;
        }
      
    }
}