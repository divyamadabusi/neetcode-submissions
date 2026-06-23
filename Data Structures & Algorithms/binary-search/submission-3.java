class Solution {
    public int search(int[] nums, int target) {
        int l = 0;
        int r = nums.length;

        while(l < r) {
            int m = (r - l) / 2 + l;
            if(target > nums[m]) {
                l = m + 1;
            } else if (target < nums[m]) {
                r = m;
            } else {
                return m;
            }
        }
        return - 1;
    }
}
