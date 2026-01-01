class Solution {
    private boolean isPossible(int[] weights,int days,int mid){
        int temp=0;
        for(int i=0; i<weights.length; i++){
            int num =weights[i];

            if(num > mid){
                return false;
            }
            if(num + temp > mid){
                days-=1;
                temp=0;
            }

            temp+=num;

            if(days == 0){
                return false;
            }
        }
        return true;
    }
    public int shipWithinDays(int[] weights, int days) {
        int low=1;
        int high=Integer.MAX_VALUE;

        while(low <= high){
            int mid=low + (high - low)/2;

            if(isPossible(weights,days,mid)){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return low;
    }
}