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
                character_array[i][j] = fillChar; //
            }
        }
    }

    public int getRowCnt() {
        return rowCnt;
    }

    public int getColCnt() {
        return colCnt;
    }

    public boolean isValidPosition(int row, int col) {
        return (row >= 0 && row < rowCnt) && (col >= 0 && col < colCnt);
    }

    public char getPos(int row, int col) {
        if(isValidPosition(row, col)) {
            return character_array[row][col];
        }
        else {
            return ' ';
        }
    }

    public boolean setPos(int row, int col, char c) {
        if(isValidPosition(row, col)) {
            character_array[row][col] = c;
            return true;
        }
        else {
            return false;
        }
    }

    public String toString() {
        return (rowCnt + " x " + colCnt + " GameBoard (default: " + fillChar + ")");
    }

    public String getBoardString() {
        StringBuilder our_string = new StringBuilder();
        for(int i = 0; i < rowCnt; i++) {
            for(int j = 0; j < colCnt; j++) {
                our_string.append(character_array[i][j]);
            }
            our_string.append("\n");
        }
        return our_string.toString();
    }
}
