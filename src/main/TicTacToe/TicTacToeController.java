import piece.PieceO;
import piece.PieceType;
import piece.PieceX;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class TicTacToeController {
    Board board;
    Deque<Player> players;
    boolean hasWon;
    TicTacToeController(){
        this.board = new Board(3);
        players = new ArrayDeque<>();
        players.add(new Player(new PieceX()));
        players.add(new Player(new PieceO()));
        hasWon = false;
    }
    public void startGame(){
        while(!hasWon){
            Player currentPlayer = players.poll();
            System.out.println("Current Board Status");
            displayBoard();
            System.out.println("Player: "+currentPlayer.playerPiece.getPieceType()+"'s turn");
            System.out.println("Please enter x and y coordinates where you want to add");
            Scanner sc = new Scanner(System.in);
            int x = sc.nextInt();
            int y = sc.nextInt();
            boolean isAdditionSuccess = currentPlayer.addPiece(board, currentPlayer.getPlayerPiece(), x, y);
            if(!isAdditionSuccess){
                System.out.println("Invalid addition, please add again!");
                players.addFirst(currentPlayer); //replay
            } else{
                players.add(currentPlayer); //add at the back
                boolean isThereWinner = isThereWinner(x,y,currentPlayer.getPlayerPiece().getPieceType());
                if(isThereWinner) {
                    System.out.println("Player: " + currentPlayer.getPlayerPiece().getPieceType() + " has won");
                    hasWon = true;
                }
            }
        }
    }

    public boolean isThereWinner(int row, int column, PieceType pieceType) {

        boolean rowMatch = true;
        boolean columnMatch = true;
        boolean diagonalMatch = true;
        boolean antiDiagonalMatch = true;

        //need to check in row
        for(int i=0;i<board.BOARD_SIZE;i++) {

            if(board.board[row][i] == null || board.board[row][i].getPieceType() != pieceType) {
                rowMatch = false;
            }
        }

        //need to check in column
        for(int i=0;i<board.BOARD_SIZE;i++) {

            if(board.board[i][column] == null || board.board[i][column].getPieceType() != pieceType) {
                columnMatch = false;
            }
        }

        //need to check diagonals
        for(int i=0, j=0; i<board.BOARD_SIZE;i++,j++) {
            if (board.board[i][j] == null || board.board[i][j].getPieceType() != pieceType) {
                diagonalMatch = false;
            }
        }

        //need to check anti-diagonals
        for(int i=0, j=board.BOARD_SIZE-1; i<board.BOARD_SIZE;i++,j--) {
            if (board.board[i][j] == null || board.board[i][j].getPieceType() != pieceType) {
                antiDiagonalMatch = false;
            }
        }

        return rowMatch || columnMatch || diagonalMatch || antiDiagonalMatch;
    }

    private void displayBoard() {
        board.printBoard();
    }
}
