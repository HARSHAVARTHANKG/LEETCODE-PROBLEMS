class Solution {
    public List<String> commonChars(String[] words) 
    {
         int arr[]=new int[26];
				
	    Arrays.fill(arr,Integer.MAX_VALUE);
	  for(int i=0;i<words.length;i++)
	  {
	        int a[]=new int[26];
	        for(char w : words[i].toCharArray())
	        {
	            a[w-'a']++;
	        }
	        
	        for(int j=0;j<26;j++)
	        {
	            arr[j]=Math.min(arr[j],a[j]);
	        }
	  }
	  
	  ArrayList<String> list = new ArrayList<String>();
	  for(int i=0;i<arr.length;i++)
	  {
	      if(arr[i]>0)
	      {
	          while(arr[i]!=0)
	          {
	              list.add(String.valueOf((char) ('a' + i)));
	              arr[i]--;
	          }
	      }
	  }
      return list;
        
    }
}