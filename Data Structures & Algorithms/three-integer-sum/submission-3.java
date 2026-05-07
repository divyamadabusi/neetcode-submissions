class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> out = new ArrayList<>();
        Arrays.sort(nums);
        Set<List<Integer>> set = new HashSet<>();
        //fix one, and do 2 pointer w the rest
        for (int i = 0 ; i < nums.length; i++) {
            int front = 0;
            if(front == i) {
                front++;
            }

            int end = nums.length - 1;
            if(end == i) {
                end--;
            }
            int sum = nums[i];
            while(front < end) {
                int temp = sum + nums[front] + nums[end];
                if(temp > 0) {
                    end--;
                    if(end == i) {
                        end--;
                    }
                } else if (temp < 0) {
                    front++;
                    if(front == i){
                        front++;
                    }
                } else {
                    if(front != end && front != i && i != end) {
                        List<Integer> triplet = new ArrayList<>();
                        triplet.add(nums[i]);
                        triplet.add(nums[front]);
                        triplet.add(nums[end]);
                        Collections.sort(triplet);
                        if(set.add(triplet)){
                            out.add(triplet);
                        }
                    }
                    front++;
                    end--;
                }
            }
        }
        return out;
    }
}
