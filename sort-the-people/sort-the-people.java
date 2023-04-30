class Solution {
    public String[] sortPeople(String[] names, int[] heights) 
    {
         for(int i=0;i<heights.length;i++)
        {
            int temp=0;
            String str="";
            for(int j=1;j<heights.length;j++)
            {
                if(heights[j-1]<heights[j])
                {
                    temp=heights[j-1];
                    str=names[j-1];
                    heights[j-1]=heights[j];
                    names[j-1]=names[j];
                    heights[j]=temp;
                    names[j]=str;
                }
            }
           
        }
         return names;
        
    }
}