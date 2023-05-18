class Solution {
    public boolean checkDistances(String s, int[] distance) 
    {
     
        for(int i=0;i<s.length();i++)
        {
            int count=0;
            if(s.charAt(i)!='_')
            {
               int j=i+1;
               while(s.charAt(i)!=s.charAt(j))
               {
                   count++;
                   j++;
               }
               if(count!=distance[s.charAt(i)-'a'])
               {
                   return false;
               }
               s=s.replace(s.charAt(j),'_');
            }
        }
        return true;
        
    }
}