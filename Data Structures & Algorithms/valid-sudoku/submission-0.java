class Solution 
{
    public boolean isValidSudoku(char[][] board) 
    {	
        for (int i=0;i<board.length;i++) 
        {
        	Set<Character> rowSet = new HashSet<>();
        	Set<Character> colSet = new HashSet<>();
        	Set<Character> boxSet = new HashSet<>();
    		        	
        	for (int j=0;j<board[i].length;j++) 
        	{
        		if(board[i][j] != '.') 
        		{
        			if(!rowSet.add(board[i][j])) return false;
        		}
        		
        		if(board[j][i] != '.') 
        		{
        			if(!colSet.add(board[j][i])) return false;
        		}
        		
        		int rowIndex = 3*(i/3) + j/3;
        		int colIndex = 3*(i%3) + j%3;
        		
        		if(board[rowIndex][colIndex] != '.')
        			if(!boxSet.add(board[rowIndex][colIndex])) return false;
        	}
        	
        }
    	return true;
    }
}
