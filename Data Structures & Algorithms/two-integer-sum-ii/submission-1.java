class Solution {
    public int[] twoSum(int[] numbers, int target) {
        //2 pointer algo
        int front = 0;
        int end = numbers.length - 1;
        while(front < end) {
            if(numbers[front] + numbers[end] > target) {
                end--;
            } else if (numbers[front] + numbers[end] < target) {
                front++;
            } else {
                return new int[] {front + 1, end + 1};
            }
        }
        return new int[]{};
    }
}
