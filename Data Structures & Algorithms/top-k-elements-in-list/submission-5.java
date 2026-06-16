class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        for(int n : nums) {
            freqMap.put(n, freqMap.getOrDefault(n, 0) + 1);
        }

        List<Integer>[] list = new ArrayList[nums.length + 1];
        for(int num : freqMap.keySet()) {
            int idx = freqMap.get(num);
            if(list[idx] == null) {
                list[idx] = new ArrayList<>();
            }
            list[idx].add(num);
        }
        int[] out = new int[k];
        int ct = 0;
        for(int i = nums.length; i >= 0; i--){
            if(list[i] != null) {
                for(int n : list[i]) {
                out[ct] = n;
                ct++;
                //i--;
                if(ct == k) {
                    return out;
                }
            }
            }
            
        }
        return out;
    }
}
