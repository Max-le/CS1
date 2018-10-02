
public class MineSweeper {

	public static void main(String[] args) {
		
		final int HEIGHT = 10;
		final int WIDTH = 10;
		MineSweeperWindow window = new MineSweeperWindow(HEIGHT,WIDTH);
		
		int[][] board = makeBoard(HEIGHT,WIDTH);
		boolean[][] open = new boolean[HEIGHT][WIDTH];

		// for (int i=0; i<board.length; i++)
		// 	for (int j=0; j<board[0].length; j++)
		// 		open[i][j] = true;
		 
		
		// computeHints(board);
		// for (int i=0; i<board.length; i++)
		// 	for (int j=0; j<board[0].length; j++)
		// 		open[i][j] = true;

		computeHints(board);
		
		boolean alive = true;
		while (alive) {
			window.printBoard(board,open);
			int[] move = window.getMove();
			alive = clicked(move[0],move[1],board,open);
		}

		window.printBoard(board,open);
	}
	
	public static int[][] makeBoard(int height, int width) {
	    int[][] board = new int[height][width];

	    for(int i = 0; i < board.length; i++)
	    {
	    	for (int j = 0 ; j < board[i].length; j++) {

	    		if (countBombs(board) < 10){ 
	    		board[i][j] = fillBoard(0.1);
	    	}
	    	// Do not add bomb if there's already ten bombs
	    	else board[i][j] = 0 ; 

	    	}
	    }


	    return board;
	}
	
	public static void computeHints(int[][] array) {

		System.out.println("array length: "+array.length);
	    for (int i = 0 ; i < array.length; i++){
	    	for (int j = 0 ; j < array[i].length; j++){
			System.out.println("i,j : "+i+","+j);
			
				if (array[i][j] != 9){
	    		array[i][j]= bombsAround(array, i, j);
	    	}
	    		
	    		
	    	}
	    }
	}
	
	public static boolean clicked(int x, int y, int[][] board, boolean[][] open) {

		if (open[x][y]){
			//square was already opened
			return true;
		}
		else if (board[x][y] == 9){
			System.out.println("GAME OVER !");
			return false; 
		}
		else{
			open[x][y]=true;
		} 


	    return true;
	}

	/** Fill the boardgame
	@param chance Probability of returning a bomb(between 0 and 1)

	**/
	public static int fillBoard(double chance){

		if (Math.random() > chance){
			return 0 ;
		}
		else return 9 ;

	}


	/** Counts the number of bombs in the **whole board**
	@param board the board
	@return bombs The number of bombs 

	**/
	public static int countBombs(int[][]board){
		int bombs = 0  ; 

		for(int i = 0; i < board.length; i++)
	    {
	    	for (int j = 0 ; j < board[i].length; j++) {

	    		
	    		if (board[i][j] == 9) {
	    			bombs++;
	    		}
	    	}
	    }

		return bombs; 
	}
	/** Counts the number of bombs around a **particular position**
	@param x A position in the board (coordonates x,y)
	@param y A position in the board (coordonates x,y)
	@param board the board itself
	**/
	public static int bombsAround(int[][] board, int x, int y){
		int bombs = 0 ; 
		System.out.println("initial values : " +"\n"+ x+" "+y);

		//search through all adjacent spaces ( x-1 to x+1, y-1 to x+1)
		for (int i = -1; i<2; i++){

			for (int j= -1; j<2; j++){
				//Avoid outOfBound Exception
				//System.out.println("OUT IF : "+x+""+i+" "+y+""+j);

				if  ((x+i) >= 0 && (y+j) >= 0 && ((x+i) < 10 && (j+y) < 10 )){
					//System.out.println("IN IF : "+x+""+i+" "+y+""+j);


					if (board[x+i][y+j] == 9){
					//it's a bomb ! 
					bombs++;
					} 
				} 

			}
		}

		return bombs; 

	}//End bombsAround method

}


