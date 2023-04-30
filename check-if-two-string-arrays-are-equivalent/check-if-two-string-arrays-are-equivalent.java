class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2)
    {
        String word01="";
        String word02="";
        /*for(int i=0;i<word1.length;i++)
        {
           for(int j=0;j<word1[i].length();j++)
           {
                word01=word01+word1[i].charAt(j);
           }
           
        }
        for(int i=0;i<word2.length;i++)
        {
           for(int j=0;j<word2[i].length();j++)
           {
                word02=word02+word2[i].charAt(j);
           }
        }
        */
        for(int i=0;i<word1.length;i++)
        {
            word01+=word1[i];
        }
        for(int i=0;i<word2.length;i++)
        {
            word02+=word2[i];
        }

        if(word01.equals(word02))
        {
            return true;
        }
        else
        {
            return false;
        }
        

        
    }
}