class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> sums = new ArrayList();
        Map<Integer, Integer> occurances =  new HashMap();
        for (int i=0; i<nums.length; i++) {
            occurances.put(nums[i], i);
        }

        // int k=nums.length-1;
        for (int i=0; i<nums.length-2; i++) {
            if (nums[i] > 0) break; //safe condition;
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            for (int j=i+1; j< nums.length-1; j++) {
                if (j > i+1 && nums[j] == nums[j - 1]) continue;

                int target=-(nums[i]+nums[j]);
                Integer idx = occurances.get(target);

                if (idx != null 
                    && idx > i && idx > j) {
                    sums.add(Arrays.asList(nums[i], nums[j], target));
                    // occurances.put(target, occurances.get(target))
                }
            }
        }

        return sums;
    }
}
