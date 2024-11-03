package edu.mathurc.assign04;

public class Box {
    private int sr;
    private int sc;
    private int er;
    private int ec;
    private boolean filled;
    private char drawChar;

    public Box(int sr, int sc, int er, int ec, boolean filled, char drawChar) {
        this.sr = sr;
        this.sc = sc;
        this.er = er;
        this.ec = ec;
        this.filled = filled;
        this.drawChar = drawChar;
    }

    public String toString() {
        if(filled) {
            return "Filled Box from (" + sr + "," + sc + ") to (" + er + "," + ec + ") with char '" + drawChar + "'";
        }
        else{
            return "Box from (" + sr + "," + sc + ") to (" + er + "," + ec + ") with char '" + drawChar + "'";
        }
    }

    public void draw(GameBoard s) {
        int rowCnt = s.getRowCnt();
        int colCnt = s.getColCnt();

        for (int i = 0; i < rowCnt; i++) {
            for (int j = 0; j < colCnt; j++) {
                if (filled) {
                    if(i >= sr && j >= sc && i <= er && j <= ec) {
                        s.setPos(i, j, drawChar);
                    }
                }
                else {
                    if((i >= sr && j >= sc && i <= er && j <= ec) && ((j == sc || j == ec) || (i == sr || i == er))) {
                        s.setPos(i, j, drawChar);
                    }
                }
            }
        }
    }
}
