package game;

import board.Board;
import pieces.Piece;
import pieces.Color;
import pieces.PieceType;
import players.Player;

import java.util.Scanner;

// Game class to control the flow of the game
public class GameController {
    Board board;
    Player[] players;
    boolean isGameOver;

    GameController(Player playerToStart) {
        board = new Board();
        players = new Player[2];
        players[0] = new Player(Color.WHITE, true);
        players[1] = new Player(Color.BLACK, false);
        isGameOver = false;
    }
    public void startGame() {
        // Implement method to start the game
        // Implement method to start the game
        Scanner scanner = new Scanner(System.in);
        while (!isGameOver()) {
            // Get current player
            Player currentPlayer = getCurrentPlayer();

            // Display the board
            displayBoard();

            // Get input for move
            System.out.println("Player " + currentPlayer.getColor() + "'s turn:");
            System.out.print("Enter start position (e.g., 'a2'): ");
            String startPosition = scanner.next();
            int startX = startPosition.charAt(0) - 'a';
            int startY = Character.getNumericValue(startPosition.charAt(1)) - 1;

            System.out.print("Enter end position (e.g., 'a4'): ");
            String endPosition = scanner.next();
            int endX = endPosition.charAt(0) - 'a';
            int endY = Character.getNumericValue(endPosition.charAt(1)) - 1;

            // Make the move
            boolean moveSuccess = currentPlayer.makeMove(board, startX, startY, endX, endY);
            if (!moveSuccess) {
                System.out.println("Invalid move! Try again.");
            }
        }
        // Game over
        System.out.println("Game over!");
        scanner.close();
    }

    public Player getCurrentPlayer(){
        for (Player player: players){
            if(player.isTurn())
                return player;
        }
        return null;
    }

    public void endGame(){
        // Implement method to end the game
        isGameOver = true;
    }

    public boolean isGameOver(){
        // Implement method to check if the game is over
        // Return true if the game is over, false otherwise
        return isGameOver || board.isCheckmate(Color.WHITE) || board.isCheckmate(Color.BLACK);
    }

    private void displayBoard(){
        // Implement method to display the board
        // This could involve printing out the current state of the board
        // with pieces in their positions

    }
}
