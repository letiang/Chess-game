public class King extends Piece {
    public King(int x, int y, Side side, Board board) {
        super(x, y, side, board);
    }

    @Override
    public boolean canMove(int destX, int destY) {
        return (Math.abs(this.x - destX) <= 1 && Math.abs(this.y - destY) <= 1);
    }

    @Override
    public String getSymbol() {
        return this.getSide() == Side.BLACK ? "♚" : "♔";
    }
}