class Solution {
    public int[][] kClosest(int[][] points, int k) {
        //max heap
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> Integer.compare(b[0] * b[0] + b[1] * b[1], a[0] * a[0] + a[1] * a[1]));

        for(int[] point : points) {
            if(pq.size() < k) {
                pq.offer(point);
            } else {
                int[] top = pq.peek();
                if(Math.sqrt(top[0] * top[0] + top[1]*top[1]) > Math.sqrt(point[0] * point[0] + point[1] * point[1])){
                    pq.poll();
                    pq.offer(point);
                }
            }
        }

        int[][] res = new int[k][2];

        for(int i = 0; i < k; i++) {
            res[i] = pq.poll();
        
        }
        return res;

    }
}
