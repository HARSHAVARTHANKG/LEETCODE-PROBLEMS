class Solution {
    public int countConsistentStrings(String allowed, String[] words)
     {
         int num=0;
         int count=0;
		for(int i=0;i<words.length;i++)
		{
			for(int j=0;j<words[i].length();j++)
			{
				for(int k=0;k<allowed.length();k++)
				{
					if(words[i].charAt(j)==allowed.charAt(k))
					{
						num++;
                        break;
					}
				}	
			}
			if(num==words[i].length())
			{
				count++;
			}
			num=0;
		}
        return count;
        
    }
}