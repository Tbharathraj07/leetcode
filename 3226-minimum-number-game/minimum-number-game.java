class Solution {
    public int[] numberGame(int[] nums) {
        PriorityQueue<Integer>pq=new PriorityQueue<>();

        for(int x : nums) pq.add(x);

        int arr[]=new int[nums.length];
        int idx=0;

        while(!pq.isEmpty()){
            int firstmin=pq.poll();
            int secondmin=pq.poll();

            arr[idx++]=secondmin;
            arr[idx++]=firstmin;
        }
        return arr;
    }
}