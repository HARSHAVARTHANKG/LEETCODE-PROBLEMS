class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) 
    {
        List<List<Integer>> Alist = new ArrayList<>();
        int[] arr=new int[2002];

       
        for(int i=0;i<2;i++)
        {
            Alist.add(new ArrayList<>());
        }
        
        for(int x : nums1)
        {
            arr[x+1001]=1;
        }
        for(int y : nums2)
        {
            if(arr[y+1001]==1)
            {
                arr[y+1001]=0;
            }
        }
        
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>0)
            {
                Alist.get(0).add(i-1001);
            }
        }
        
         for(int y : nums2)
        {
            arr[y+1001]=1;
        }
        
        
       for(int x : nums1)
        {
            if(arr[x+1001]==1)
            {
                arr[x+1001]=0;
            }
        }
        
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>0)
            {
                Alist.get(1).add(i-1001);
            }
        }
        return Alist;
        
        
    }
}