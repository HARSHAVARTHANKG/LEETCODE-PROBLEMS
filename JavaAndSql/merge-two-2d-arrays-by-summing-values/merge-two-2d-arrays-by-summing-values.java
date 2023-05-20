class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) 
    {
 ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
        
        for(int i=0;i<nums1.length+nums2.length;i++)
        {
            list.add(new ArrayList());
        }
        
        int i=0;
        int j=0;
        int k=0;
        
        while(i<nums1.length || j<nums2.length)
        {
            if(i<nums1.length && j<nums2.length)
            {
                if(nums1[i][0]==nums2[j][0])
                {
                    list.get(k).add(nums1[i][0]);
                    list.get(k).add(nums1[i][1]+nums2[j][1]);
                    k++;
                    i++;
                    j++;
                }
                else if(nums1[i][0]<nums2[j][0])
                {
                        list.get(k).add(nums1[i][0]);
                        list.get(k).add(nums1[i][1]);
                        k++;
                        i++;
                       
                }
                    else
                    {
                        list.get(k).add(nums2[j][0]);
                        list.get(k).add(nums2[j][1]);
                        k++;
                        j++;
                       
                    }
            }
            else
            {
            
            if(i<nums1.length)
            {
                list.get(k).add(nums1[i][0]);
                list.get(k).add(nums1[i][1]);
                k++;
                i++;
            }
            if(j<nums2.length)
            {
                 list.get(k).add(nums2[j][0]);
                list.get(k).add(nums2[j][1]);
                k++;
                j++;
            }
            }
        }
        
        list.removeIf(List::isEmpty);
        int arr[][] = new int[list.size()][2];
        for(int x=0;x<list.size();x++)
        {
            for(int y=0;y<2;y++)
            {
                arr[x][y]=list.get(x).get(y);
            }
        }
        return arr;

        
    }
}