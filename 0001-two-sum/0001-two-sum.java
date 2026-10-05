class Solution {
    public int[] twoSum(int[] nums, int target) 
    {
        int l = nums.length;
        int i=0,j=0;

        int sum=0;

        for(i=0;i<l;i++)
        {
            for(j=0;j<l;j++)
            {
                if(i==j) continue;
                
                sum=nums[i]+nums[j];
                
                if(sum==target)
                {
                    return new int[]{i,j};
                }   
            }
        }
        return new int[]{0,0};
    }
}