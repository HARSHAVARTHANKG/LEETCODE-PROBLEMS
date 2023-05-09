class Solution {
    public boolean checkPerfectNumber(int num) 
    {
      /*  
      if(num==28 || num==6 || num==496 || num==8128 | num==33550336)
       {
           return true;
       }
       return false;
       
*/
      //this Approach also will work

        if(num%2!=0)
        {
            return false;
        }
        int sum=0;
        for(int i=1;i<=num/2;i++)
        {
            if(num%i==0)
            {
                sum+=i;
            }
           
        }
        
        if(sum==num)
        {
            return true;
        }
        else
        {
            return false;
        }
        
    }
}