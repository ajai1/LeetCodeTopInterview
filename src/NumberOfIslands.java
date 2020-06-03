
public class NumberOfIslands {
	
    public static int numIslands(char[][] grid) {
        int count = 0;
        if(grid.length == 0 || grid == null)	return count;
        
        for(int i=0; i < grid.length; i++) {
        	for(int j = 0; j < grid[i].length; j++) {
        		if(grid[i][j] == '1') {
        			count += 1;
        			dfs(grid, i, j);
        		}
        	}
        }
        
    	return count;
    }
    
    public static void dfs(char[][] grid, int i, int j) {
    	if( i < 0 || i >= grid.length || j < 0 || j >= grid[i].length || grid[i][j] == '0')
    		return;
    	grid[i][j] = '0';
    	dfs(grid, i-1, j);
    	dfs(grid, i+1, j);
    	dfs(grid, i, j-1);
    	dfs(grid, i, j+1);    	
    }

	public static void main(String[] args) {
		char[][] grid = {
				{'1','1','1','0','1'},
				{'1','1','0','1','0'},
				{'1','1','0','0','0'},
				{'0','0','0','1','1'}
		};
		
		System.out.println(numIslands(grid));
	}

}
