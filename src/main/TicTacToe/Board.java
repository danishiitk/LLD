import piece.Piece;

public class Board {
    final int BOARD_SIZE;
    Piece[][] board;
    Board(int boardSize){
        this.BOARD_SIZE = boardSize;
        this. board = new Piece[BOARD_SIZE][BOARD_SIZE];
    }
    public boolean addPiece(Piece piece, int x, int y){
        if(!validAddition(x, y))
            return false;
        board[x][y] = piece;
        return true;
    }

    private boolean validAddition(int x, int y) {
        if(x<0 || x>=BOARD_SIZE || y<0 || y>= BOARD_SIZE) //Out of boundary
            return false;
        if(board[x][y] != null) //Already occupied
            return false;
        return true;
    }

    void printBoard(){
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                if(board[i][j] != null)
                    System.out.print(board[i][j].getPieceType()+" ");
                else
                    System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }

    public Piece[][] getBoard() {
        return board;
    }
}
