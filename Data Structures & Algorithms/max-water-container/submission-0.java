class Solution {
    public int maxArea(int[] heights) {
        int front = 0;
        int end = heights.length - 1;

        int max = 0;

        while(front < end) {
            //int smaller;
            int curr = (end-front) * Math.min(heights[front] , heights[end]);
            if(curr > max) {
                max = curr;
            }
            if(heights[front] < heights[end]) {
                front++;
            } else {
                end--;
            }

        }
        return max;
    }
}
