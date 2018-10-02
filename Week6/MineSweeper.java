
public class MineSweeper {

	public static void main(String[] args) {
		
		final int HEIGHT = 10;
		final int WIDTH = 10;
		MineSweeperWindow window = new MineSweeperWindow(HEIGHT,WIDTH);
		
		int[][] board = makeBoard(HEIGHT,WIDTH);
		boolean[][] open = new boolean[HEIGHT][WIDTH];

		/* To test only the makeBoard method, uncomment the following code:
		for (int i=0; i<board.length; i++)
			for (int j=0; j<board[0].length; j++)
				open[i][j] = true;
		 */
		
		/* To test makeBoard and computeHints, recomment the code above and uncomment the following code:
		computeHints(board);
		for (int i=0; i<board.length; i++)
			for (int j=0; j<board[0].length; j++)
				open[i][j] = true;
		 */

		/* To run the full game after finishing clicked, recomment the code above and uncomment this code: 
		computeHints(board);
		
		boolean alive = true;
		while (alive) {
			window.printBoard(board,open);
			int[] move = window.getMove();
			alive = clicked(move[0],move[1],board,open);
		}
		 */

		window.printBoard(board,open);
	}
	
	public static int[][] makeBoard(int height, int width) {
	    // TO BE IMPLEMENTED, and the line below should of course be replaced
	    int[][] board = new int[height][width];

	    for(int i = 0; i < board.length; i++)
	    {
	    	for (int j = 0 ; j < board[i].length; j++) {
	    		board[i][j] = generatorBoard();

	    	}
	    }


	    return null;
	}
	
	public static void computeHints(int[][] array) {
	    // TO BE IMPLEMENTED
	}
	
	public static boolean clicked(int x, int y, int[][] board, boolean[][] open) {
	    // TO BE IMPLEMENTED, and the line below should of course be replaced
	    return true;
	}

	//10% chance of returning 9, 90% -> 0 
	public static int generatorBoard(){
		if (Math.random() > 0.1){
			return 0 ;
		}
		else return 9 ;

	}

}
