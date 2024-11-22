package edu.mathurc.assign06;
import edu.mathurc.assign04.GameBoard;

public class Skeleton extends Creature {
    public Skeleton() {
        super();
    }

    public Skeleton(int row, int col) {
        super(row, col);
    }

    public String toString() {
        return "Skeleton at " + getRow() + "," + getCol();
    }

    public void draw(GameBoard map) {
        map.setPos(getRow(), getCol(), 'S');
    }
}
