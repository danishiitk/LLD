package piece;

public abstract class Piece {
    piece.PieceType pieceType;
    Piece(PieceType pieceType){
        this.pieceType = pieceType;
    }

    public PieceType getPieceType() {
        return pieceType;
    }
}
