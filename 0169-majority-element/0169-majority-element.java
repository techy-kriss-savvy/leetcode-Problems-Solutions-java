class Solution
{
    public int majorityElement(int[] nums)
    {
        int count = 0 , Majority = 0;
        Arrays.sort(nums);
        for(int i = 0 ; i < nums.length ; i++)
        {
             count = 0;
            for(int j = 0 ; j < nums.length ; j++)
            {
                if(nums[i] == nums[j])
                {
                    count++;
                }
            }
            if(count > nums.length/2)
            {
                Majority = nums[i];
            }
            if(Majority != 0)
            {
                break;
            }
        }
        return Majority;
    }
}