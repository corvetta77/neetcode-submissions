class Solution {

    public String encode(List<String> strs) {
        if (strs.size()==0) {
            return "";
        }

        StringBuilder res = new StringBuilder();
        for (int i=0; i<strs.size(); i++) {
            res.append(strs.get(i).length())
            .append("#")
            .append(strs.get(i));
        }
        return res.toString();
    }

    public List<String> decode(String str) {
        if (str.isEmpty()) {
            return new ArrayList<>();
        }
        List<String> resultStrings = new ArrayList();

        int i=0;
        while (i < str.length()) {
            StringBuilder sb = new StringBuilder();
            while (str.charAt(i) != '#') {
                sb.append(str.charAt(i));
                i++;
            }
            int stringSize = Integer.valueOf(sb.toString());
            i++;

            resultStrings.add(str.substring(i,i+stringSize));
            i=i+stringSize;
        }
        
        return resultStrings;
    }
}
