class Solution {
    public boolean uniqueOccurrences(int[] arr) 
    {
        Arrays.sort(arr);
        ArrayList<Integer> list = new ArrayList<Integer>();
        int i;
        for(i=0;i<arr.length;)
        {
            int count=1;
            int j;
            for(j=i+1;j<arr.length;j++)
            {
                if(arr[i]==arr[j])
                {
                    count++;
                }
                else
                {
                    break;
                }
            }
            i=j;
            if(list.contains(count))
            {
                return false;
            }
            list.add(count);
        }
       
       return true;
        
    }
}