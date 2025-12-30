class Solution {

    private boolean isPossible(int[] piles, int h, int k){
        for(int i=0; i<piles.length; i++){
            int val=piles[i]/k;

            if(piles[i]%k!=0){
                val++;
            }
            h-=val;

            if(h < 0){
                return false;
            }
        }
        return true;
    }
    public int minEatingSpeed(int[] piles, int h) {
        
        int low=1;
        int high=(int)Math.pow(10,9);

        while(low <= high){
            int mid=low + (high-low)/2;

            if(isPossible(piles,h,mid)){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return low;
    }
}