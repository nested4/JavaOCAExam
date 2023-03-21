package ch3.arrays.basic;

public class Q127_2 {

	public static void main(String[] args) {
		
		/*
		 * 	The following grid shows the state of a 2D array:
	
		|--O--|--O--|-----|
		|-----|--X--|--O--|
		|-----|--X--|--X--|
		
		The grid is created with the following code:	
		 */
	
		char[][] grid = new char [3] [3];
		
		grid [1][1] = 'x';
		grid [0][0] = 'o';
		grid [2][1] = 'x';
		grid [0][1] = 'o';
		grid [2][2] = 'x';
		grid [1][2] = 'o';
		
		// line n1
	}

}


/*
	Which line of code, when inserted in place of //line n1, 
	adds an X into the grid so that the grid contains three consecutive X’s?
	
	A. grid[1][3] = ‘X’;
	B. grid[3][1] = ‘X’;
	C. grid[0][2] = ‘X’;
	D. grid[2][0] = ‘X’;  		>> OK
	E. grid[1][2] = ‘X’;

*/