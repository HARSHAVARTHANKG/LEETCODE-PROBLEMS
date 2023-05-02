class Solution {
    public boolean judgeCircle(String moves) 
		{
			int l=0;
	    int r=0;
	    int u=0;
	    int d=0;
	 
	   for(char x : moves.toCharArray())
		 {
			 if(x=='R')
			 {
				 r++;
			 }
			 else if(x=='L')
			 {
				 l++;
			 }
			 else if(x=='U')
			 {
				 u++;
			 }
			 else
			 {
				 d++;
			 }
		 }
	    return l==r && u==d;
        
    }
}