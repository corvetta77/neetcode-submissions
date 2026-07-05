class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<Integer>> mapOfSortedAnagrams = new HashMap<>();
        for (int i=0; i < strs.length; i++) {
            char[] chars = strs[i].toCharArray();
            Arrays.sort(chars);
            String stringFromChars = new String(chars);
            mapOfSortedAnagrams.putIfAbsent(stringFromChars, new ArrayList());
            mapOfSortedAnagrams.get(stringFromChars).add(i);
        }
        List<List<String>> groups = new ArrayList();
        for (String anagramKey : mapOfSortedAnagrams.keySet()) {
            List<Integer> listOfIndices = mapOfSortedAnagrams.get(anagramKey);
            
            List<String>groupedAnagrams = listOfIndices.stream()
                .map(id -> strs[id])
                .collect(Collectors.toList());

            groups.add(groupedAnagrams);
        }
        return groups;
    }
}
