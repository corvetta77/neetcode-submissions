class Solution {
    public int[] twoSum(int[] nums, int target) {      
        for (int j=0; j< nums.length-1; j++) {
            for (int i=1; i< nums.length; i++) {
                if (i!= j && nums[i]+nums[j]==target) {
                    return new int[]{j, i};
                }
            }
        }
        return null;
    }
}