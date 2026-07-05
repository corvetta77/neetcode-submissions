class Solution {

    private static  int[][] directions = {{1,0},{-1,0},{0,1},{0,-1}};

    public int numIslands(char[][] grid) {
        if (grid.length==0) {
            return 0;
        }
        int numOfIslands = 0;
        for (int i=0; i < grid.length; i++) {
            for (int j=0; j < grid[0].length; j++) {
                if (grid[i][j]=='1') {
                    lookForNeighbours(i,j, grid);
                    numOfIslands++;
                }
            }    
        }
        return numOfIslands;
    }

    private void lookForNeighbours(int i, int j, char[][] grid) {
        if (i<0 || j<0 || i>=grid.length || j>=grid[0].length
            || grid[i][j]=='0') {
            return;
        }
        grid[i][j]='0';

        for (int[] dir: directions) {
            lookForNeighbours(i+dir[0], j+dir[1], grid);
        }
    }
}
