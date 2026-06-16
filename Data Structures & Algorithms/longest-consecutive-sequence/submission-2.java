class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) {
            return 0;
        }
        int longest = 1;
        Set<Integer> numSet = new HashSet<>();
        for(int i = 0; i < nums.length; i++) {
            numSet.add(nums[i]);
        }

        for(int i = 0; i < nums.length; i++) {
            int curr = nums[i];
            int temp = 1;
            if(!numSet.contains(curr - 1)) {
                while(numSet.contains(curr + 1)){
                    temp++;
                    curr += 1;
                } 
                if(temp > longest) {
                    longest = temp;
                }
            }
        }
        return longest;
    }
}
