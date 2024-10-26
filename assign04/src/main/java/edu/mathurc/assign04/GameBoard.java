package edu.mathurc.assign04;

public class GameBoard {
    private char[][] character_array;
    private int rowCnt;
    private int colCnt;
    private char fillChar;

    public GameBoard(int rowCnt, int colCnt, char fillChar) {
        this.rowCnt = rowCnt;
        this.colCnt = colCnt;
        this.fillChar = fillChar;
        character_array = new char[rowCnt][colCnt];

        for(int i = 0; i < rowCnt; i++) {
            for(int j = 0; j < colCnt; j++) {
                character_array[i][j] = fillChar;
            }
        }

    }

    public void clear() {
        for(int i = 0; i < rowCnt; i++) {
            for(int j = 0; j < colCnt; j++) {
                character_array[i][j] = fillChar;
            }
        }
    }
}
