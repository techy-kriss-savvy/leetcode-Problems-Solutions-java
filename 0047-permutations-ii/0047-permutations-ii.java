class Solution {
        public void solve(int[] nums,int start,int end,List<List<Integer>> res)
    {
        if(start==end)
        {
            List<Integer> list = new ArrayList<>(); 
            int i; 
            for(i=0 ; i<=nums.length-1 ; i++)
            {
                list.add(nums[i]);
            }
            
            res.add(new ArrayList<>(list)); 
            return;
        }
        else 
        { 
            HashSet<Integer> hs=new HashSet<>();
            for(int i=start ;  i<=end ; i++)
            {
                if(hs.contains(nums[i]))
                {
                    continue;
                }
                hs.add(nums[i]);
               int temp = nums[i]; 
               nums[i]  = nums[start]; 
               nums[start] = temp; 
               solve(nums,start+1,end,res); 
               temp = nums[i]; 
               nums[i]  = nums[start]; 
               nums[start] = temp;
            }
        }
    }
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> res = new ArrayList<>(); 
        solve(nums,0,nums.length-1,res);  
        return res;
    }
}