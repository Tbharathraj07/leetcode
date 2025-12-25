class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer>st=new Stack<>();

        int n=asteroids.length;
        for(int i=0; i<n; i++){
            int num=asteroids[i];
            while(!st.isEmpty() && st.peek() >0 && num < 0){

                if(Math.abs(num) > st.peek() ){
                    st.pop();
                    continue;
                }
                if(Math.abs(num)==st.peek()){
                    st.pop();
                }

                num=0;
                break;
            }

            if(num != 0){
                st.push(num);
            }
        }

        int[] res = new int[st.size()];
        for (int i = 0; i < st.size(); i++) {
            res[i] = st.get(i);
        }

        return res;
    }
}