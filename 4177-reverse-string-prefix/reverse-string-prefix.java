class Solution {
    public String reversePrefix(String s, int k) {
        Stack<Character> st = new Stack<>();
        int count = 0;
        for( char ch : s.toCharArray()){
            count++;
            st.push(ch);
            if(count == k) break;    
        }

        String ans = "";
        while(!st.isEmpty()){
            ans = ans + st.pop();
        }
        for(int i = k; i < s.length(); i++){
            ans = ans + s.charAt(i);
        }

        return ans;
    }
}