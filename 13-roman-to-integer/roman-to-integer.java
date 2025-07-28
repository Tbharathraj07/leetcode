class Solution {

    static int integerval(char ch){
        if(ch == 'I'){
            return 1;
        }else if(ch == 'V'){
            return 5;
        }else if(ch == 'X'){
            return 10;
        }else if(ch == 'L'){
            return 50;
        }else if(ch == 'C'){
            return 100;
        }else if(ch == 'D'){
            return 500;
        }else if(ch == 'M'){
            return 1000;
        }
        return 0;
    }
    public int romanToInt(String s) {
        
        int ans =0;
        int i=0;
        for( i=0; i<s.length()-1; i++){
            char n1=s.charAt(i);
            char n2=s.charAt(i+1);
            int n1val=integerval(n1);
            int n2val=integerval(n2);
            if(n1val >= n2val){
                ans+=n1val;
            }else{
                ans+=(n2val - n1val);
                i++;
            }
            //System.out.println(ans);
        }
        if(i == s.length()-1){
            ans+=integerval(s.charAt(i));
        }
        return ans;
    }
}