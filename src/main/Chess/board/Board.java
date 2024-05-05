package board;

import chess_pieces.Color;
import chess_pieces.Piece;
import chess_pieces.PieceType;
// Board class to represent the chess board
public class Board {
    public static final int BOARD_SIZE = 8;
    private Piece[][] board;

    public Board() {
        board = new Piece[BOARD_SIZE][BOARD_SIZE];
        initializeBoard();
    }

    private void initializeBoard() {
        // Place white pieces
        board[0][0] = new Piece(PieceType.ROOK, Color.WHITE);
        board[0][1] = new Piece(PieceType.KNIGHT, Color.WHITE);
        board[0][2] = new Piece(PieceType.BISHOP, Color.WHITE);
        board[0][3] = new Piece(PieceType.QUEEN, Color.WHITE);
        board[0][4] = new Piece(PieceType.KING, Color.WHITE);
        board[0][5] = new Piece(PieceType.BISHOP, Color.WHITE);
        board[0][6] = new Piece(PieceType.KNIGHT, Color.WHITE);
        board[0][7] = new Piece(PieceType.ROOK, Color.WHITE);
        for (int i=1; i<8; i++)
            board[1][i] = new Piece(PieceType.PAWN, Color.WHITE);
        //Place black pieces
        board[7][0] = new Piece(PieceType.ROOK, Color.BLACK);
        board[7][1] = new Piece(PieceType.KNIGHT, Color.BLACK);
        board[7][2] = new Piece(PieceType.BISHOP, Color.BLACK);
        board[7][3] = new Piece(PieceType.QUEEN, Color.BLACK);
        board[7][4] = new Piece(PieceType.KING, Color.BLACK);
        board[7][5] = new Piece(PieceType.BISHOP, Color.BLACK);
        board[7][6] = new Piece(PieceType.KNIGHT, Color.BLACK);
        board[7][7] = new Piece(PieceType.ROOK, Color.BLACK);
        for (int i = 0; i < 8; i++) {
            board[6][i] = new Piece(PieceType.PAWN, Color.BLACK);
        }
    }
    public boolean movePiece(int startX, int startY, int endX, int endY){
        // Implement method to move a piece from one position to another
        // Check if the move is valid, update the board, etc.
        Piece piece = board[startX][startY];
        if(piece == null)
            return false; //No piece at the starting position
        // Check if the move is valid (e.g., if the piece can move to the destination)
        // This implementation assumes all moves are valid for now
        board[endX][endY] = piece;
        board[startX][startY] = null;
        return true; // Return true if the move was successful, false otherwise
    }
    public boolean isCheck(Color color){
        // Implement method to check if the specified color is in check
        return false; // Return true if the color is in check, false otherwise
    }
    public boolean isCheckmate(Color color) {
        // Implement method to check if the specified color is in checkmate
        return false; // Return true if the color is in checkmate, false otherwise
    }

    public Piece getPiece(int x, int y) {
        return board[x][y];
    }
}
