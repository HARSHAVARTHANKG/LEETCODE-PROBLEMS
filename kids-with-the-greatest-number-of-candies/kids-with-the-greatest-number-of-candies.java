class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies)
     {
         int n=extraCandies;
         int max=0;
         List result = new ArrayList<>();
         for(int i=0;i<candies.length;i++)
         {
             if(candies[i]>max)
             {
                 max=candies[i];
             }
         }
         for(int i=0;i<candies.length;i++)
         {
             int extra=candies[i]+n;
             if(extra>=max)
             {
                 result.add(i,true);
             }
             else
             {
                 result.add(i,false);

             }

         }
         return result;
        
    }
}