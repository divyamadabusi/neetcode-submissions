class Solution {
    public int maxSubArray(int[] nums) {
        int curr = 0;
        int max = nums[0];
        for(int n : nums) {
            if(curr < 0) {
                curr = 0;
            }
            curr += n;
            max = Math.max(curr , max);
        }
        return max;
    }
}
