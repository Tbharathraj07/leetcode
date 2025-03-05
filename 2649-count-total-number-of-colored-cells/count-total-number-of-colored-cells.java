class Solution {
    public long coloredCells(int n) {
        long temp=1;
        if(n==1){
            return temp;
        }
        else{
            while(n>0){
                temp=temp+(n-1)*4;
                n--;
            }
            return temp;
        }
    }
}