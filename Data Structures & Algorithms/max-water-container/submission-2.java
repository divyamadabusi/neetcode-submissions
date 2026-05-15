class Solution {
    public int maxArea(int[] heights) {
        int front = 0;
        int back = heights.length -1;
        int maxArea = 0;


        while(front < back) {
            int f = heights[front];
            int b = heights[back];

            if(f < b) {
                int curr = (back - front) * f;
                if(curr > maxArea) {
                    maxArea = curr;
                }
                front++;
            } else {
                int curr = (back - front) * b;
                if(curr > maxArea) {
                    maxArea = curr;
                }
                back--;
            }
        }   

        return maxArea;
    }
}
