import piece.Piece;

public class Player {
    Piece playerPiece;
    Player(Piece piece){
        this.playerPiece = piece;
    }

    public Piece getPlayerPiece() {
        return playerPiece;
    }
    public boolean addPiece(Board board, Piece piece, int x, int y){
        boolean isAddSuccessFul = board.addPiece(piece,x,y);
        return isAddSuccessFul;
    }
}
