class Solution {
    public int singleNumber(int[] nums)
    {
        int count = 0 , unique = 0;
        Arrays.sort(nums);
        for(int  i = 0 ; i < nums.length ; i++)
        {
                 count = 0;
            for(int j = 0 ; j < nums.length ; j++)
            {
                        if(nums[i] == nums[j])
                        {
                            count++;
                            if(count > 1)
                            {
                                break;
                            }
                        }
            }
            if(count == 1)
            {
                unique = nums[i];
            }
            if( unique != 0)
            {
                break;
            }
        }
        return unique;
    }
}