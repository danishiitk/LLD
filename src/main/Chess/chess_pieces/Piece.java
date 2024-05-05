package chess_pieces;

// pieces.Piece class to represent a chess piece
public class Piece {
    PieceType pieceType;
    Color color;

    public Piece(PieceType pieceType, Color color) {
        this.pieceType = pieceType;
        this.color = color;
    }

    public Object getColor() {
        return color;
    }

    public PieceType getType() {
        return pieceType;
    }
}
