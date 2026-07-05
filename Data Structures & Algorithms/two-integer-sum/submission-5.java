class Solution {
    public int[] twoSum(int[] nums, int target) {      
        Map<Integer, Integer> numsNumber = new HashMap<>();

        for (int i=0; i < nums.length; i++) {
            numsNumber.put(nums[i], i);
        }

        for (int i=0; i < nums.length; i++) {
            int desiredValue = target - nums[i];
            int j = numsNumber.getOrDefault(desiredValue, -1);
            if (j!=-1 && j != i) {
                return new int[]{i, j};
            }
        }
        return null;
    }
}