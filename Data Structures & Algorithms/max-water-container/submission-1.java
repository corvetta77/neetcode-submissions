class Solution {
    public int maxArea(int[] heights) {
        int i=0;
        int k=heights.length-1;
        int maxArea = 0;

        while (i < k) {
            int barHeight = Math.min(heights[i], heights[k]);
            int area = barHeight * (k-i);
            maxArea = Math.max(area, maxArea);

            if (heights[i] < heights[k]) {
                i++;
            } else {
                k--;
            }
        }
        return maxArea;
    }
}
