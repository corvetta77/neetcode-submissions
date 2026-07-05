class Solution {
    public int numIslands(char[][] grid) {
        if (grid.length==0) {
            return 0;
        }
        int numOfIslands = 0;
        for (int i=0; i < grid.length; i++) {
            for (int j=0; j < grid[0].length; j++) {
                if (grid[i][j]=='1') {
                    grid[i][j]='0';
                    lookForNeighbours(i,j, grid);
                    numOfIslands++;
                }
            }    
        }
        return numOfIslands;
    }

    private void lookForNeighbours(int i, int j, char[][] grid) {
        int[][] directions = {{1,0},{-1,0},{0,1},{0,-1}};
        for (int[] dir: directions) {
            int idx=i+dir[0];
            int idy=j+dir[1];

            if ((idx>=0 && idx < grid.length) 
                && (idy>=0 && idy < grid[0].length) 
                && grid[idx][idy]=='1') {
                grid[idx][idy]='0';
                lookForNeighbours(idx, idy, grid);
            }
        }
    }
}
