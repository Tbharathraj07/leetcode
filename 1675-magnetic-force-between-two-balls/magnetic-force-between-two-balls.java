class Solution {
    private boolean isPossible(int[]position, int m, int minforce){
        int prev=position[0];
        m-=1;
        for(int i=1; i<position.length; i++){
            int num=position[i];

            if(num - prev >= minforce){
                m-=1;
                prev=num;
            }

            if(m == 0){
                return true;
            }
        }
        return false;
    }
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int low=1;
        int high=Integer.MAX_VALUE;

        while(low <= high){
            int mid=low + (high-low)/2;

            if(isPossible(position,m,mid)){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return high;
    }
}