// PROVIDED AS BLANK WITH HEADERS
public abstract class Piece {
    protected int x, y;     //Accessible within package and to subclasses
    protected Board board;
    private Side side;

    public Piece(int x, int y, Side side, Board b) {
        this.x = x;
        this.y = y;
        this.side = side;
        this.board = b;
    }

    public abstract boolean canMove(int destX, int destY);

    public abstract String getSymbol();

    /**
     * Repositions this piece on the board to the given coordinates, if allowed by the rules of the piece.
     *  destX the destX coordinate to move to
     *  destY the destY coordinate to move to
     *  b the board to move on
     *  true if the move was successful, false otherwise
     */
    public boolean move(int destX, int destY){
        if(canMove(destX,destY)){
            if(board.get(destX,destY) != null){
                board.get(destX,destY).capture();
            }
            board.set(this.x, this.y, null);
            board.set(destX,destY,this);
            this.x = destX;
            this.y = destY;
            return true;
        }
        return false;
    }

    public void capture(){
        this.x = -1;
        this.y = -1;
    }

    public Side getSide() {
        return side;
    }

    public void setSide(Side side) {
        this.side = side;
    }
}
