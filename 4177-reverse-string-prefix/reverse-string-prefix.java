class Solution {
    public String reversePrefix(String s, int k) {
        int n= s.length();
        char[] ans = s.toCharArray();
        int j=k-1;
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