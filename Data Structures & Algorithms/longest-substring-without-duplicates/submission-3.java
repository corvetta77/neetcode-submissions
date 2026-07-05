class Solution {
    public int lengthOfLongestSubstring(String s) {
        String sb = "";
        char[] charArr = s.toCharArray();
        int maxLen = 0;
        for (char ch: charArr) {
            if (sb.length()>0 && sb.contains(String.valueOf(ch))) {
                sb = sb.substring(sb.indexOf(ch)+1);
            } 
            sb+=ch;

            maxLen = Math.max(maxLen, sb.length());
        }
        return maxLen;
    }
}
