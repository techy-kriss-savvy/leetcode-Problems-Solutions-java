class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Create a new array of pairs to store value and original index
        int[][] numPairs = new int[nums.length][2];
        for (int i = 0; i < nums.length; i++) {
            numPairs[i][0] = nums[i];
            numPairs[i][1] = i;
        }

        // Sort the array of pairs based on the values
        Arrays.sort(numPairs, (a, b) -> Integer.compare(a[0], b[0]));

        // Initialize two pointers
        int left = 0;
        int right = nums.length - 1;

        // Use two-pointer technique to find the two numbers
        while (left < right) {
            int sum = numPairs[left][0] + numPairs[right][0];
            if (sum == target) {
                // Return the original indices of the two numbers
                return new int[] { numPairs[left][1], numPairs[right][1] };
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        // In case there is no solution, although the problem states there will be exactly one solution
        throw new IllegalArgumentException("No two sum solution");
    }

    public static void main(String[] args) {
        Solution ts = new Solution();
        
        int[] nums1 = {2, 7, 11, 15};
        int target1 = 9;
        int[] result1 = ts.twoSum(nums1, target1);
        System.out.println("Indices: " + result1[0] + ", " + result1[1]);
        
        int[] nums2 = {3, 2, 4};
        int target2 = 6;
        int[] result2 = ts.twoSum(nums2, target2);
        System.out.println("Indices: " + result2[0] + ", " + result2[1]);
        
        int[] nums3 = {3, 3};
        int target3 = 6;
        int[] result3 = ts.twoSum(nums3, target3);
        System.out.println("Indices: " + result3[0] + ", " + result3[1]);
    }
}
