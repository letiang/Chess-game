public class Pawn extends Piece {
    public Pawn(int x, int y, Side side, Board board) {
        super(x, y, side, board);
    }

    @Override
    public boolean canMove(int destX, int destY) {
        if (board.get(destX,destY) != null) {
            if (this.getSide() == Side.WHITE){
                return (((this.y - destY) == 1) && (Math.abs(destX - this.x) == 1));
            }
            if (this.getSide() == Side.BLACK) {
                return (((destY - this.y) == 1) && (Math.abs(destX - this.x) == 1));
            }
        }
        if (destX == this.x) {
            if (this.getSide() == Side.WHITE) {
                if (this.y == 6) {
                    return ((y - destY == 1) || ((y - destY == 2)));
                } else {
                    return (y - destY == 1);
                }
            }
            if (this.getSide() == Side.BLACK) {
                if (this.y == 1) {
                    return ((destY - y == 1) || ((destY - y == 2)));
                } else {
                    return (destY - y == 1);
                }
            }
        }
        return false;
    }

    @Override
    public String getSymbol() {
        return this.getSide() == Side.BLACK ? "♟" : "♙";
    }
}
