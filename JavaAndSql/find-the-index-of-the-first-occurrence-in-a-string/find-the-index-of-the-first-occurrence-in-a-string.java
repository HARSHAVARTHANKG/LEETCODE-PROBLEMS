class Solution {
    public int strStr(String haystack, String needle) 
    {
		 
		 for(int i=0;i<haystack.length();i++)
		 {
		     int count=0;
		     int k=i;
		     int j=0;
		     while(j<needle.length() && k<haystack.length())
		     {
		         if(haystack.charAt(k)==needle.charAt(j))
		         {
		            count++;
		         }
		         else
		         {
		             break;
		         }
		          j++;
		          k++;
		      }
		     if(count==needle.length())
		     {
		         return i;
		     }
		 }
         return -1;
    }
}