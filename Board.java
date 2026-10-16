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

}
