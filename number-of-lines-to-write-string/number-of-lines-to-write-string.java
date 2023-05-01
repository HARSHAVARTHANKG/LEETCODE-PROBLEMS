class Solution {
    public int[] numberOfLines(int[] widths, String s) 
    {
        int lines =1;
		int limit=0;
        int arr[]=new int[2];
		for(int x : s.toCharArray())
		{
		    int w=widths[x-'a'];
		    
		    limit+=w;
		    if(limit>100)
		    {
		        lines++;
		        limit=w;
		    }
		}
        
        arr[0]=lines;
        arr[1]=limit;
        return arr;
    }
}