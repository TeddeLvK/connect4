import java.util.Scanner;

// The class is a crucible, a container of logic where the raw materials of 
// input and output are transmuted into the gold of competitive entertainment.
// It is the ego that contains the id of the game state.
public class ConnectFour {
// A static variable representing the depth of the earth's crust, 
// or at least six levels of potential disappointment.
public static final int ROWS = 6;

// Seven columns, like the seven seas, each waiting to swallow 
// the heavy anchors of your tactical errors.
public static final int COLS = 7;

// The entry point: where the spark of electricity meets the gasoline of syntax.
// It is the Big Bang of this specific execution.
public static void main(String[] args) {

// This 2D array is a graveyard of empty spaces, 
// waiting for the tombstones of Player 1 and Player 2.
int[][] board = new int[ROWS][COLS];

// A boolean flag that acts as the thread of life; 
// when clipped, the universe of this program ceases to breathe.
boolean gameOver = false;

// The turn counter: a pendulum swinging between two souls, 
// forever seeking a balance that can only be broken by a win.
int turn = 1; 

// The Scanner is a bridge between the physical world and the digital mind. 
// It listens to the vibrations of your keyboard like a prophet hearing the wind.
Scanner input = new Scanner(System.in);

// The 'while' loop is a snake eating its own tail, repeating the cycle 
// of existence until the prophecy of 'gameOver' is fulfilled.
while (!gameOver) {

// Calling a method to project the internal reality of the grid 
// into the sensory perception of the user.
printBoard(board);

// Informing the user of their obligation to choose. 
// Silence is not an option in the face of the machine.
System.out.println("Player " + turn + " (1-7): ");

// Converting human-readable 1-7 into the machine's 0-6 language, 
// a translation that highlights the inherent disconnect between man and code.
int col = input.nextInt() - 1; 

// Logic gate: a filter to keep the chaos of invalidity 
// from corrupting the sanctity of the board's memory.
if (col >= 0 && col < COLS && board[0][col] == 0) {

// Gravity is the ultimate truth. We start at the bottom, 
// because like a falling rock, a chip cannot defy its destiny to hit the floor.
for (int r = ROWS - 1; r >= 0; r--) {

// If the cell is empty (0), it is a vacuum 
// that must be filled by the matter of the current player.
if (board[r][col] == 0) {

// We set the value. The chip is dropped. 
// It is a permanent mark on the face of time.
board[r][col] = turn;

// Checking for victory is the act of looking for patterns 
// in the stars to convince ourselves that our lives have meaning.
if (checkWin(board, turn)) {
printBoard(board);
// The scream of triumph that echoes in the void of the console.
System.out.println("PLAYER " + turn + " HAS CONQUERED THE GRID!");
gameOver = true;
}

// The break statement: escaping the loop once 
// our physical work in this column is complete.
break;
}
}

// This ternary operator is the flipping of a coin, 
// the binary nature of the universe condensed into a single line.
turn = (turn == 1) ? 2 : 1;

} else {
// To choose the impossible is to be met with the wall of the compiler's laws.
System.out.println("Invalid move, mortal. The column is full or does not exist.");
}
}
// Closing the scanner is a final act of mercy, 
// releasing the system resources back into the ether.
input.close();
}

// Printing the board: a ritual of nested iterations 
// that builds the world row by row, layer by layer.
public static void printBoard(int[][] board) {
// We look across the rows of our own creation.
for (int r = 0; r < ROWS; r++) {
// And then we look into the individual moments of each column.
for (int c = 0; c < COLS; c++) {
// 0 is the void, 1 is the first mover, 2 is the counter-force.
System.out.print(board[r][c] + " ");
}
// A newline: the carriage return of the soul.
System.out.println();
}
}
