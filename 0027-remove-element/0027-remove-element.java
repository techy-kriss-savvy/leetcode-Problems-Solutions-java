class Solution
{
    public int removeElement(int[] nums, int val)
    {
        int count = 0;
        for(int i = 0 ; i < nums.length ; i++)
        {
            if(nums[i] != val)
            {
                count++;
            }
            else
            {
                nums[i] = 200;
            }
        }
        Arrays.sort(nums);
        return count;
    }
}