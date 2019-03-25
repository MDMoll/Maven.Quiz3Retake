package rocks.zipcode.io.quiz3.arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author leon on 09/12/2018.
 */
public class TicTacToe {
    private String[][] board;
    
    public TicTacToe(String[][] board) {
        this.board = board;
    }
    
    public TicTacToe() {
    }
    
    public String[] getRow(Integer value) {
        return board[value];
    }
    
    public String[] getColumn(Integer value) {
        String item = "";
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < board.length; i++) {
            item = board[i][value];
            list.add(item);
        }
        return list.toArray(new String[0]);
    }
    
    public Boolean isRowHomogenous(Integer rowIndex) {
        String[] row = board[rowIndex];
        for (int i = 1; i < row.length; i++) {
            if (!row[0].equals(row[i])) {
                return false;
            }
        }
        return true;
    }
    
    public Boolean isColumnHomogeneous(Integer columnIndex) {
        String item1 = board[0][columnIndex];
        for (int i = 1; i < board.length; i++) {
            if (!board[i][columnIndex].equals(item1)) {
                return false;
            } else {
                item1 = board[i][columnIndex];
            }
        }
        return true;
    }
    
    public boolean isEqual(String[][] board, int rowColumn, boolean row) {
        int i = 1;
        int limit = (row) ? board[0].length : board.length;
        while (i < limit) {
            if ((row) ? !board[rowColumn][i].equals(board[rowColumn][0])
                    : !board[i][rowColumn].equals(board[0][rowColumn]))
                return false;
        }
        return true;
    }
    
    public String getWinner() {
        return "X";
    }
    
    public String[][] getBoard() {
        return board;
    }
}
