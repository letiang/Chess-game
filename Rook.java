public class Rook extends Piece{
    public Rook(int x, int y, Side side, Board board) {
        super(x, y, side, board);
    }

    @Override
    public boolean canMove(int destX, int destY) {
        return (this.x == destX || this.y == destY);
    }

    @Override
    public String getSymbol() {
        return this.getSide() == Side.BLACK ? "♜" : "♖";
    }
}
