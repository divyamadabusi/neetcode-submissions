class Solution {
    public int maxArea(int[] heights) {
        if(heights.length <= 1) {
            return 0;
        }
        int front = 0;
        int end = heights.length - 1;
        int maxArea = 0;

        while(front < end) {
            int curr = (end - front) * Math.min(heights[front], heights[end]);
            if (curr > maxArea) {
                maxArea = curr;
            }

            if(heights[front] < heights[end]) {
                front++;
            } else {
                end--;
            }
        }
        return maxArea;
    }
}
