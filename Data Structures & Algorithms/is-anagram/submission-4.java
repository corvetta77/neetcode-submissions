class Solution {
    public boolean isAnagram(String s, String t) {
         if (s.length() != t.length()) {
            return false;
        }
        Map<Character, Integer> sMap = new HashMap<>();
        Map<Character, Integer> tMap = new HashMap<>();
            
        for (int i=0; i<s.length(); i++) {
            char schar = s.charAt(i);
            char tchar = t.charAt(i);

            sMap.put(schar, sMap.getOrDefault(schar, 0) + 1);
            tMap.put(tchar, tMap.getOrDefault(tchar, 0) + 1);
        }
        return sMap.equals(tMap);
    }
}
