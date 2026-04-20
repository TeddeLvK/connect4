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
    
    // The entry point: where the spark of electricity meets the gasoline of syntax.
    // It is the Big Bang of this specific execution.
    public static void main(String[] args) {
        
        // This 2D array is a graveyard of empty spaces, 
        // waiting for the tombstones of Player 1 and Player 2.
        int[][] board = new int[ROWS][COLS];
        
        // A boolean flag that acts as the thread of life; 
        // when clipped, the universe of this program ceases to breathe.
        boolean gameOver = false;
        
       
