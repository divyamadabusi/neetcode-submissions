class Solution {
    public int trap(int[] height) {
    if (height.length == 0) {
        return 0;
    }

    int left = 0;
    int right = height.length - 1;
    int leftMax = 0, rightMax = 0;
    int total = 0;

    while(left < right) {
        if(height[left] < height[right]) {
            //left is bottleneck
            if(height[left] > leftMax) {
                leftMax = height[left];
            } else {
                total += leftMax - height[left];
            }
            left++;
        } else {
            //right is bottleneck
            if(height[right] > rightMax) {
                rightMax = height[right];
            } else {
                total += rightMax - height[right];
            }
            right--;
        }
    }
    return total;





    }
}
