class Solution {
    private boolean isPossible(int[] candies, long k,int mid){
        int temp=0;
        for(int i=0; i<candies.length; i++){
            int num=candies[i];

            temp=num/mid;
            k-=temp;
            if(k<=0){
                return true;
            }
        }
        return false;
    }
    public int maximumCandies(int[] candies, long k) {
        int low=1;
        int high=Integer.MAX_VALUE;
        int ans=0;

        while(low <= high){
            int mid=low + (high-low)/2;

            if(isPossible(candies,k,mid)){
                ans=mid;
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return ans;
    }
}