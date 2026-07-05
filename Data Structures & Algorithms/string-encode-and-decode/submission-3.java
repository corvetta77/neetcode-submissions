class Solution {

    public String encode(List<String> strs) {
        if (strs.size()==0) {
            return "";
        }

        StringBuilder res = new StringBuilder();
        for (int i=0; i<strs.size(); i++) {
            res.append(strs.get(i).length()).append(',');
        }
        res.append("#");
        for (int i=0; i<strs.size(); i++) {
            res.append(strs.get(i));
        }
        return res.toString();
        //return String.join(",", strs);
    }

    public List<String> decode(String str) {
        if (str.isEmpty()) {
            return new ArrayList<>();
        }

        int i=0;
        List<Integer> sizes = new ArrayList();

        while (str.charAt(i) != '#') {
            StringBuilder sb = new StringBuilder();
            while (str.charAt(i) != ',') {
                sb.append(str.charAt(i));
                i++;
            }
            sizes.add(Integer.valueOf(sb.toString()));
            i++;
        }
        i++;

        List<String> resultStrings = new ArrayList();
        
        for (int sizeOfSingleString : sizes) {
            resultStrings.add(str.substring(i, i + sizeOfSingleString));
            i += sizeOfSingleString;
        }
        
        return resultStrings;
    }
}
