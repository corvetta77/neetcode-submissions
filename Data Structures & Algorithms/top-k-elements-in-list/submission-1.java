class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
        }

        List<int[]> statsList = new ArrayList();
        for (Map.Entry<Integer,Integer> entry : map.entrySet()) {
            statsList.add(new int[]{entry.getValue(), entry.getKey()});
        }
        statsList.sort((a, b) -> b[0] - a[0]);

        int[] result = new int[k];
        for (int j=0; j<k; j++) {
            result[j] = statsList.get(j)[1];
        }
        return result;
    }
}
