package players;

import board.Board;
import pieces.Color;
import pieces.Piece;

public class Player {
    Color color;
    boolean isTurn;
    public Player(Color color, boolean isTurn) {
        this.isTurn = true;
    }

    public boolean makeMove(Board board, int startX, int startY, int endX, int endY){
        // Implement method for the player to make a move
        if (!isTurn) {
            System.out.println("It's not your turn.");
            return false; // Not the player's turn
        }

        Piece piece = board.getPiece(startX, startY);
        if (piece == null || piece.getColor() != color) {
            System.out.println("Invalid piece selection.");
            return false; // The selected piece is either empty or not owned by the player
        }

        if (!isValidMove(board, startX, startY, endX, endY)) {
            System.out.println("Invalid move.");
            return false; // The move is not valid
        }

        boolean moveSuccess = board.movePiece(startX, startY, endX, endY);
        if (moveSuccess) {
            // Toggle turn after successful move
            isTurn = !isTurn;
        }
        return moveSuccess;
    }

    private boolean isValidMove(Board board, int startX, int startY, int endX, int endY) {
        // Implement method to check if the move is valid
        Piece piece = board.getPiece(startX, startY);
        if (piece == null) {
            return false; // There is no piece at the start position
        }

        // Check if the end position is out of bounds
        if (endX < 0 || endX >= Board.BOARD_SIZE || endY < 0 || endY >= Board.BOARD_SIZE) {
            return false;
        }

        // Check if the end position is occupied by own piece
        Piece endPiece = board.getPiece(endX, endY);
        if (endPiece != null && endPiece.getColor() == piece.getColor()) {
            return false;
        }

        // Check specific rules for different piece types
        switch (piece.getType()) {
            case PAWN:
                // Implement pawn movement rules
                // This implementation assumes all pawn moves are valid for now
                return true;
            case KNIGHT:
                // Implement knight movement rules
                // This implementation assumes all knight moves are valid for now
                return true;
            case BISHOP:
                // Implement bishop movement rules
                // This implementation assumes all bishop moves are valid for now
                return true;
            case ROOK:
                // Implement rook movement rules
                // This implementation assumes all rook moves are valid for now
                return true;
            case QUEEN:
                // Implement queen movement rules
                // This implementation assumes all queen moves are valid for now
                return true;
            case KING:
                // Implement king movement rules
                // This implementation assumes all king moves are valid for now
                return true;
            default:
                return false;
        }
    }

    public boolean isTurn() {
        return isTurn;
    }

    public void setTurn(boolean turn) {
        isTurn = turn;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
