class Solution {
    public int islandPerimeter(int[][] grid) {
        int pm = 0 , rws = grid.length , cols = grid[0].length;
        for(int r = 0;r<rws;r++){
            for(int c = 0 ; c<cols;c++){
                if(grid[r][c] == 1){
                    pm +=4;
                    if(r>0 && grid[r-1][c] == 1){   pm -=2;    }
                    if(c>0 && grid[r][c-1] == 1){   pm -=2;    }
                }

            }
        }
        return pm;
    }
}
