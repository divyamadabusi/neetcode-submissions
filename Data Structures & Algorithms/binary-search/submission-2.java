class Solution {
    public int search(int[] nums, int target) {
        if(nums.length == 0) {
            return -1;
        }

        int minIdx = 0;
        int maxIdx = nums.length - 1;

        while(maxIdx - minIdx >= 0) {
            int med = ((maxIdx - minIdx) + minIdx / 2);
            if(nums[med] == target) {
                return med;
            } else if (nums[med] < target) {
                minIdx = med + 1;
            } else {
                maxIdx = med - 1;
            }
        }
        return -1;
    }
}
