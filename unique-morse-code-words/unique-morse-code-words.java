class Solution {
    public int uniqueMorseRepresentations(String[] words)
    {
        String diffwords[]=new String[words.length];
         String wordtransform[]={".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
       char wordalpha[]={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
       
        String word2="";
       for(int i=0;i<words.length;i++)
       {
           for(int k=0;k<words[i].length();k++)
           {
               for(int j=0;j<wordalpha.length;j++)
                 {
               
                     if(words[i].charAt(k)==wordalpha[j])
                    {
                         word2+=wordtransform[j];
                    }
                }

           }
           diffwords[i]=word2;
           word2="";
       }
       int count=0;
      for(int i=0;i<diffwords.length;i++)
      {
          int j;
          for( j=0;j<i;j++)
          {
              if(diffwords[i].equals(diffwords[j]))
              {
               break;   
              }
          }
          if(j==i)
          {
              count++;
          }
      }
      return count;
        
    }
}