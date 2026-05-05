class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        //creat hashmap for (num, freq)
        Map<Integer, Integer>  map = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            if(!map.containsKey(nums[i])) {
                map.put(nums[i], 1);
            } else {
                int count = map.get(nums[i]);
                map.put(nums[i], count + 1);
            }
        }

        //pq of int arrays [freq, key], ordered so highest freq at top
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> b[0] - a[0]);
        for(int key : map.keySet()) {
            int[] curr = new int []{map.get(key), key};
            pq.offer(curr);
        }
        int[] out = new int[k];
        //poll highest k freq numbers
        for(int i = 0; i < k; i++) {
            out[i] = pq.poll()[1];
        }
        return out;
    }
}
