class Solution 
{
    public void moveZeroes(int[] nums) 
    {
        int[] numsCopy = new int[nums.length];
        int j=0;
        
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=0)
            {
                numsCopy[j] = nums[i];
                j++;
            }            
        }       

        //Copy into main Array
        for(int i=0;i<nums.length;i++)
        {
            nums[i] = numsCopy[i];
        }        
    }
}