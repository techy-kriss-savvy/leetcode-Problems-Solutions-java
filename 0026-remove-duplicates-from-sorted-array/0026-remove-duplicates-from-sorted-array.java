class Solution
{
    public int removeDuplicates(int[] nums) 
    {
        int i = 1 , j = 1;
          for(i = 1 ; i < nums.length ; i++)
          {
            if(nums[i - 1] != nums[i])
            {
                nums[j] = nums[i];
                j++;
            }
          }
          return j;                                  
    }
}