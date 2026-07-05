class Solution {
    public boolean isPalindrome(String s) {
        String lower = s.toLowerCase();
        int i=0, j=s.length()-1;
        while(i<j) {
            while (i<j && !Character.isLetterOrDigit(lower.charAt(i))) {
                i++;
            }
            while (i<j && !Character.isLetterOrDigit(lower.charAt(j))) {
                j--;
            }
            if (lower.charAt(i) != lower.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
