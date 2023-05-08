class Solution {
    public boolean isAnagram(String s, String t) 
		{
			if(s.length()!=t.length())
	   {
	       return false;
	   }
	   char[] c =s.toCharArray();
	   char[] x =t.toCharArray();
		 int arr[]=new int[128];
		 
		 for(int i=0;i<c.length;i++)
		 {
			 arr[c[i]]++;
			 arr[x[i]]--;
		 }

		 for(int i=0;i<arr.length;i++)
		 {
			 if(arr[i]!=0)
			 {
				 return false;
			 }
		 }
		 return true;
    }
}