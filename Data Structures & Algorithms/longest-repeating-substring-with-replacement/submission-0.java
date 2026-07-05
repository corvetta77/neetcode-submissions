class Solution {

    public int characterReplacement(String s, int k) {
        Map<Character, Integer> map = new HashMap();
        int l=0;
        int repeatCount=0;
        int consecutiveCharsCount=0;

        for (int r = 0; r < s.length(); r++) {
            char currChar = s.charAt(r);
            map.put(currChar, map.getOrDefault(currChar, 0)+1);
            consecutiveCharsCount =  Math.max(consecutiveCharsCount, map.get(currChar));
            while (r-l+1-consecutiveCharsCount>k) {
                map.put(s.charAt(l), map.get(s.charAt(l))-1);
                l++;
            }
            repeatCount = Math.max(repeatCount, r-l+1);
        }    
        return repeatCount;
    }
}
