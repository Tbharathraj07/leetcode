class Solution {

    private boolean isPossible(int n,int[] quantities,int limit){

        for(int i=0; i<quantities.length; i++){
            int num=quantities[i];
            int temp=num/limit;
            if(num%limit != 0){
                temp++;
            }
            n-=temp;

            if(n<0){
                return false;
            }    
        }
        return true;
    }
    public int minimizedMaximum(int n, int[] quantities) {
        int low=1;
        int high=Integer.MAX_VALUE;
        while(low <= high){
            int mid=low + (high - low)/2;

            if(isPossible(n,quantities,mid)){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return low;
    }
}