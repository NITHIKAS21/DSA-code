class Solution {
    public int maxFreqSum(String s) {
        int[] count = new int[26];
        for (char c : s.toCharArray()) {
            count[c - 'a']++;
        }

        int Vowel = 0;
        int Consonant = 0;

        for (int i = 0; i < 26; i++) {
            char c = (char) (i + 'a');

            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                Vowel = Math.max(Vowel, count[i]);
            } else {
                Consonant = Math.max(Consonant, count[i]);
            }
        }

        return Vowel + Consonant;
    }
}