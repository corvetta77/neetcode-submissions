class Solution {
    public boolean isAnagram(String s, String t) {
         if (s.length() != t.length()) {
            return false;
        }

        char[] tArr = t.toCharArray();
        char[] sArr = s.toCharArray();
        Arrays.sort(tArr);
        Arrays.sort(sArr);
       return Arrays.equals(tArr,sArr);
    }
}
