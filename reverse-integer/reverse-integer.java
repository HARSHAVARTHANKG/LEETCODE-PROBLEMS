class Solution {
    public int reverse(int x)
    {
        StringBuilder str = new StringBuilder();
        str.append(Math.abs(x)).reverse();
        

        try
        {
            if(x<0)
        {
            return Integer.parseInt(str.toString())*-1;
        }
        else
        {
            return Integer.parseInt(str.toString());
        }

        }
        catch(NumberFormatException e)
        {
            return 0;
        }
        
        
    }
}