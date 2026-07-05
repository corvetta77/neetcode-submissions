class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> uniqueLetters = new HashSet();
        int maxLen = 0;
        int l = 0;

        for (int i=0; i<s.length(); i++) {
            char ch = s.charAt(i);
            while (uniqueLetters.contains(ch)) {
                uniqueLetters.remove(s.charAt(l));
                l++;
            }
            maxLen = Math.max(maxLen, i-l+1);
            uniqueLetters.add(ch);
        }
        return maxLen;
    }
}
