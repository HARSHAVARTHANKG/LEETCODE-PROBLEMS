class Solution {
    public int minMovesToSeat(int[] seats, int[] students)
     {
          Arrays.sort(seats);
        Arrays.sort(students);
        int count=0;
        int sum=0;
        for(int i=0;i<seats.length;i++)
        {
            if(seats[i]<students[i])
            {
            while(seats[i]+count!=students[i])
            {
                count++;
            }
            }
            else
            {
                while(students[i]+count!=seats[i])
            {
                count++;
            }
            }
            sum+=count;
            count=0;
        }


        return sum;
        
    }
}