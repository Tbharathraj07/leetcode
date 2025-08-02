class Solution {
public:
    string convert(string s, int numRows) {
        vector<string>ans(numRows);
        for(int i=0;i<numRows;i++){
            ans[i]="";
        }
        int i=0;
        while(i<s.length()){
            for(int j=0;j<numRows && i<s.length();j++){
                ans[j]=ans[j]+s[i];
                i++;
            }
            for(int j=numRows-2;j>=1 && i<s.length();j--){
                ans[j]+=s[i];
                i++;
            }
        }
        string res="";
        for(string str:ans){
            res+=str;
        }
        return res;
    }
};