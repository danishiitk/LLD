package game;

import board.Board;
import chess_pieces.Color;
import players.Player;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

// Game class to control the flow of the game
public class GameController {
    Board board;
    Deque<Player> players;
    boolean isGameOver;

    public GameController() {
        board = new Board();
        players = new ArrayDeque<>();
        players.add(new Player(Color.WHITE, true));
        players.add(new Player(Color.BLACK, false));
        isGameOver = false;
    }
    public void startGame() {
        // Implement method to start the game
        Scanner scanner = new Scanner(System.in);
        while (!isGameOver()) {
            // Get current player
            Player currentPlayer = players.poll();

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
                players.addFirst(currentPlayer); //Add the current player again at the front
            }else{
                players.add(currentPlayer); // otherwise add at the back
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
