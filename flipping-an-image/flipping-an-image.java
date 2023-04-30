class Solution {
    public int[][] flipAndInvertImage(int[][] image) 
    {
         int arr2[][]=new int[image.length][image[0].length];
       
       for(int i=0;i<image.length;i++)
      {
          for(int j=image[0].length-1,k=0;j>=0;j--,k++)
          {
              if(image[i][j]==0)
              {
                  arr2[i][k]=1;
              }
              else
              {
                  arr2[i][k]=0;
              }
          }
      }
      return arr2;
      
    }
}