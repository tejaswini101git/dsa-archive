class Solution {
    public int waysToSplitArray(int[] nums) {

        int count=0;
        long leftsum[]=new long[nums.length];
        long rightsum[]=new long[nums.length];
        long prefix[]=new long[nums.length];
               
        prefix[0]=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            prefix[i]=prefix[i-1]+nums[i];
        }
         long totalsum=prefix[nums.length-1];

        for(int i = 0; i < nums.length - 1; i++)
        {
            leftsum[i] = prefix[i];

            rightsum[i] = totalsum - prefix[i];
        }

for(int i=0;i<nums.length-1;i++)
{
    if(leftsum[i]>=rightsum[i])
    {
        count++;
    }
}
return count;
    }
}