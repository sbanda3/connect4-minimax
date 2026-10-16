import java.util.*;

public class Board {
  public static final int ROWS = 6;
  public static final int COLS = 7;

  public static final int EMPTY = 0;
  public static final int PLAYER = 1;
  public static final int AI = 2;
  private final int[][] grid = new int[ROWS][COLS];
  private final int[] heights = new int[COLS];
  private int movesPlayed = 0;

  public int get(int row, int col){
    return grid[row][col];
  }

  public in movesPlayed(){
    return movesPlayed;
  }

  public boolean canDrop(int col){
    return col>=0 && col<COLS && heights[col]<ROWS;
  }
  
 public boolean drop(int col, int player) {
        if (!canDrop(col)) {
            return false;
        }
        grid[heights[col]][col] = player;
        heights[col]++;
        movesPlayed++;
        return true;
    }
  
}
