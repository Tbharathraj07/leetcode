class Solution {
    public int trap(int[] height) {
        
        int left=0,right=height.length-1,lmax=0,rmax=0,total=0;

        while(left < right){
            
            if(height[left] <= height[right]){

                if(lmax > height[left]){
                    total+=lmax-height[left];
                }else{
                    lmax=height[left];
                }
                left++;
            }
            else{

                if(height[right] <= height[left]){

                    if(rmax > height[right]){
                        total+=rmax-height[right];
                    }
                    else{
                        rmax=height[right];
                    }
                    right--;
                }
            }
        }
        return total;
    }
}