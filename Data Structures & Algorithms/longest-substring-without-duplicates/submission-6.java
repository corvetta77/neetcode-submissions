class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> uniqueLetters = new HashMap<>();
        int maxLen = 0;
        int l = 0;

        for (int r=0; r<s.length(); r++) {
            char ch = s.charAt(r);
            if (uniqueLetters.containsKey(ch)) {
                l = Math.max(l, uniqueLetters.get(ch)+1);
            }
            maxLen = Math.max(maxLen, r-l+1);
            uniqueLetters.put(ch, r);
        }
        return maxLen;
    }
}
