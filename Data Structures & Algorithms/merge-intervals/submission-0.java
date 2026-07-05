class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        List<int[]> finalIntervals = new ArrayList();
        finalIntervals.add(intervals[0]);
        
        for (int i = 0; i < intervals.length; i++) {
            int start = intervals[i][0];
            int end = intervals[i][1];
            int lastEnd = finalIntervals.get(finalIntervals.size()-1)[1];

            if (start <= lastEnd) {
                finalIntervals.get(finalIntervals.size()-1)[1]=Math.max(lastEnd, end);
            } else {
                finalIntervals.add(new int[]{start, end});
            }
        }

        return finalIntervals.toArray(new int[finalIntervals.size()][]);
    }
}
