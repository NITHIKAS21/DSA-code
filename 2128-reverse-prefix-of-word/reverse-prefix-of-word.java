class Solution {
    public String reversePrefix(String word, char ch) {
        int index = 0;
        for( char c : word.toCharArray()){
            if(c == ch) break;
            index++;
        }
        if(word.length()==index) return word;
        char[] ans = word.toCharArray();
        int j=index;
        int i=0;
        while(i<j){
            char temp = ans[i];
            ans[i]=ans[j];
            ans[j]=temp;
            i++;
            j--;
        }
        String str = new String(ans);
        return str;
    }
}