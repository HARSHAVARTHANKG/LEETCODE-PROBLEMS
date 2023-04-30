class Solution {
    public int deleteGreatestValue(int[][] grid) 
    {
        for(int i=0;i<grid.length;i++)
        {
            Arrays.sort(grid[i]);
        }
      
        int result=0;
        for(int j=0;j<grid[0].length;j++)
        {
            int max=0;
            for(int i=0;i<grid.length;i++)
            {
                if(grid[i][j]>max)
                {
                    max=grid[i][j];
                }
            }
            result=result+max;
        }
        return result;

        
        
    }
}