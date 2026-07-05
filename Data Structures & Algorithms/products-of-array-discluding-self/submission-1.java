class Solution {
    public int[] productExceptSelf(int[] nums) {

        int[] products = new int[nums.length];
        int prod = 1, zeros = 0;

        for (int i=0; i< nums.length; i++) {
            if (nums[i]==0) {
                zeros++;
            } else {
                prod *= nums[i];
            }
        }
        if (zeros>1) {
            return new int[nums.length];
        }

        for (int i=0; i< nums.length; i++) {
            if (zeros>0) {
                products[i] = nums[i] == 0 ? prod : 0;
            } else {
                products[i] = prod / nums[i];
            }

        }
        return products;
    }
}  
