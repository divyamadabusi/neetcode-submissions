class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] out = new int[nums.length];
        int num = 1;
        boolean zero = false;
        int temp = 0;
        int zeroCt = 0;
        for(int i = 1; i < nums.length; i++) {
            if(nums[i] != 0) {
                num *= nums[i];
            } else {
                zero = true;
                zeroCt++;
            }
            
        }
        if(zeroCt > 1) {
            temp = 0;
        } else {
            temp = num;
        }
        
        if(zero) {
            out[0] = 0;
        } else {
            out[0] = num;
        }

        for(int i = 1; i < nums.length; i++) {
            if(nums[i] == 0) {
                out[i] = temp * nums[0];
            } else {
                out[i] = out[0] * nums[0] / nums[i];
            }
        } 
        return out;
    }
}  
