class Solution {
    public long pickGifts(int[] gifts, int k) {
        PriorityQueue<Integer>pq=new PriorityQueue<>(Collections.reverseOrder());
        int cnt=0,temp=0;

        for(int i : gifts)pq.add(i);

        for(int i=0; i<k; i++){
            temp=pq.poll();
            int sqrt=(int)Math.sqrt(temp);
            pq.add(sqrt);
        }

        long ans=0;
        for(int i : pq){
            ans+=i;
        }
        return ans;
    }
}