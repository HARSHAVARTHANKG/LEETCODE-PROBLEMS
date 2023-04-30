class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue)
    {
        String temp[]={"type","color","name"};
        int t=0;
        int count=0;
        for(int i=0;i<temp.length;i++)
        {
            if(temp[i].equals(ruleKey))
            {
                t=i;
            }
        }

        for(int i=0;i<items.size();i++)
        {
            for(int j=0;j<items.get(i).size();j++)
            {
                if(items.get(i).get(j).equals(ruleValue) && t==j)
                {
                    count++;
                }
            }
        }
        return count;
        
    }
}