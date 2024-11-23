package edu.mathurc.assign06;
import edu.mathurc.assign04.GameBoard;

public class Skeleton extends Creature {
    public Skeleton() {
    }

    public Skeleton(int row, int col) {
        super(row, col);
    }

    @Override
    public String toString() {
        return "Skeleton at " + getRow() + "," + getCol();
    }

    @Override
    public void draw(GameBoard map) {
        map.setPos(getRow(), getCol(), 'S');
    }
}
