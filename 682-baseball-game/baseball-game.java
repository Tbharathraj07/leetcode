class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer>st=new Stack<>();

        for(int i=0; i<operations.length; i++){
            String ch=operations[i];

            if(ch.equals("C")){
                st.pop();
            }
            else if(ch.equals("D")){
                st.push(st.peek() * 2);
            }

            else if(ch.equals("+")){
                int top=st.pop();
                int newscore=st.peek() + top;
                st.push(top);
                st.push(newscore);
            }
            else{
                st.push(Integer.valueOf(ch));
            }
        }

        int sum=0;
        for(int score : st){
            sum+=score;
        }

        return sum;
    }
}