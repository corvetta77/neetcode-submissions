class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> mapOfSortedAnagrams = new HashMap<>();
        for (int i=0; i < strs.length; i++) {
            char[] chars = strs[i].toCharArray();
            Arrays.sort(chars);
            String stringFromChars = new String(chars);
            mapOfSortedAnagrams.putIfAbsent(stringFromChars, new ArrayList());
            mapOfSortedAnagrams.get(stringFromChars).add(strs[i]);
        }
        List<List<String>> groups = new ArrayList(mapOfSortedAnagrams.values());
        return groups;
    }
}
