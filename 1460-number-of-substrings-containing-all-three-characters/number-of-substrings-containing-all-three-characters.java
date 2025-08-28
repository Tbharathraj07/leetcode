public class Solution { 
    public int numberOfSubstrings(String s) {
        

        int a=-1,b=-1,c=-1;
        int cnt=0;
        for(int i=0; i<s.length(); i++){
            char ch=s.charAt(i);
            if(ch=='a')
                a=i;
            else if(ch=='b')
                b=i;
            else if(ch=='c')
                c=i;
            if(a!=-1 && b!=-1 && c!=-1){
                int mini=Math.min(a,Math.min(b,c));
                cnt+=(mini+1);
            }

        }
        return cnt;
    }
}
