class Solution {
    public String truncateSentence(String s, int k) 
    {
        
		   
		      ArrayList<String> sentences = new ArrayList<String>();
		      int last=s.lastIndexOf(' ');
		      for(int i=0,j=0;i<s.length();i++)
		      {
		          if(s.charAt(i)==' ')
		          {
		        	  
		              sentences.add(s.substring(j,i+1));
		              j=i+1;  
		              if(last==j-1)
		        	  {
		        		  sentences.add(s.substring(j,s.length()));
		        	  }
		          }
		         
		      }
		     
		      String str="";
              if(sentences.isEmpty())
		      {
		    	  str+=s;
		    	  
		      }
              else
              {
                    for(int i=0;i<k;i++)
		            {
		    	        str+=sentences.get(i);
		             }
              }
		     
              str=str.trim();
              return str;
        
    }
}