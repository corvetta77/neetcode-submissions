class Solution {
    public boolean isPalindrome(String s) {
        char[] chars = s.toLowerCase()
                        .trim()
                        .toCharArray();

        int i=0, j=chars.length-1;
        while(i<j) {
            while (i<j &&!Character.isLetterOrDigit(chars[i])) {
                i++;
            }
            while (i<j && !Character.isLetterOrDigit(chars[j])) {
                j--;
            }
            if (chars[i]!=chars[j]) {
                return false;
            }
             if (i>=j) {
                break;
            }
            i++;
            j--;
        }
        return true;
    }
}
