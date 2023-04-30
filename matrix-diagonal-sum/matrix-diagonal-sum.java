class Solution {
    public int diagonalSum(int[][] mat)
     {
      int n=mat.length;
      int sum=0;
        for(int i=0,j=0,k=mat.length-1;i<mat.length;i++,j++,k--)
       {
               if(i==j)
               {
                   sum+=mat[i][j];
                   if(i+k==mat[i].length-1 )
                   {
                       sum+=mat[i][k];
                   }
               }
              
       }
        return mat.length%2==1 ? sum-mat[n/2][n/2] : sum;
        
    }
}