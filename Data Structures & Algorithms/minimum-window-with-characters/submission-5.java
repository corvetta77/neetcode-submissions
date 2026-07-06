class Solution {
    public String minWindow(String s, String t) {
        if (t.length() == 0) {
            return "";
        }
        Map<Character, Integer> neededT = new HashMap();
        for (int i=0; i<t.length(); i++) {
            char currChar = t.charAt(i);
            neededT.put(currChar, neededT.getOrDefault(currChar,0)+1);
        }

        Map<Character, Integer> windowed = new HashMap();
        int l=0;
        
        int resStart = -1;
        int resEnd = -1;

        int need = t.length();
        int have = 0;
        int winSize = 1000;

        for (int r=0; r < s.length(); r++) {
            char singleChar = s.charAt(r);
            windowed.put(singleChar, windowed.getOrDefault(singleChar, 0) + 1);

            if (neededT.containsKey(singleChar) && windowed.get(singleChar)<=neededT.get(singleChar)) {
                have++;
                
                while (need==have) {
                    if (winSize > r-l+1) {
                        winSize=r-l+1;
                        resEnd = r;
                        resStart = l;                                         
                    }

                    char leftChar = s.charAt(l);
                    windowed.put(leftChar, windowed.getOrDefault(leftChar, 0) - 1);
                    if (neededT.containsKey(leftChar) && windowed.get(leftChar)< neededT.get(leftChar) ) {
                        have--;
                    }
                    l++;
                }
            }
        }

        return winSize<1000 ? s.substring(resStart, resEnd+1) : "";
    }
}
