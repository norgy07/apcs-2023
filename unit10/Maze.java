package unit10;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Maze {

  private char[][] maze;
  private boolean solution;

  public Maze(int rows, int cols, String grid) {
    maze = new char[rows][cols];
    int r = rows;
    int c = cols;
    for (int row = 0; row < r; row++) {
      for (int col = 0; col < c; col++) {
        maze[row][col] = grid.charAt(row * r + col);
      }
    }
  }


    /**
     * @return the starting coordinates as "r c"
     */
    public String getStart() { /* Not shown, plz ignore implementation */
      int z = Arrays.stream(maze).map(String::new).collect(Collectors.joining("")).indexOf('@');
      return "" + z / maze[0].length + " " + z % maze[0].length;
  }

  /**
   * @return the ending coordinates as "r c"
   */
  public String getEnd() { /* Not shown, plz ignore implementation */
      int z = Arrays.stream(maze).map(String::new).collect(Collectors.joining("")).indexOf('$');
      return "" + z / maze[0].length + " " + z % maze[0].length;
  }


  /**
   * Explores the maze from point r,c to determine if there is a path
   * to the goal.
   */
   /**
     * Uses recursion to see if the maze has a solution or not.
     * 
     * Suggested algorithm:
     * if R and C are in bounds and spot is !#
     * - if you are at $:
     * - - set has a solution
     * - else:
     * - - mark spot as checked
     * - - recur up
     * - - recur down
     * - - recur left
     * - - recur right
     * 
     * @param r current row index
     * @param c current column index
     */
  private void explore(int r, int c) {
    if(r<maze.length && r>=0 && c<maze[0].length && c>=0 && maze[r][c] != '#'){
      if(maze[r][c] == '$')
        solution = true;
      else{
        maze[r][c]= '#';
        explore(r-1, c);
        explore(r+1, c);
        explore(r, c-1);
        explore(r, c+1);
      }
    }
  }

  /**
   * Determins if the maze has a solution or not.
   */
  public boolean hasSolution() {
    String a = getStart();
    String gs = a.substring(0,1);
    String ge = a.substring(2);
    int s = Integer.parseInt(gs);
    int e = Integer.parseInt(ge);
    explore(s,e);
    return solution;
  }

  public static void check(boolean test) throws AssertionError {
    if (!test)
      throw new AssertionError("sad panda");
  }

  public static void main(String[] args) {
    Maze example = new Maze(3, 3, "#.@.....$");
    check(example.hasSolution());

    Maze case1 = new Maze(5, 7, ".#.#....#.#.##@.....$#...#.##..#...");
    check(case1.hasSolution());

    Maze case2 = new Maze(4, 4, ".#.$.##..##.@..#");
    check(!case2.hasSolution());

    Maze test = new Maze(3, 3, "#.@.....$");
    check(test.hasSolution());

    test = new Maze(3, 3, "##@#####$");
    check(!test.hasSolution());

    test = new Maze(3, 3, "##@#..#.$");
    check(test.hasSolution());

    test = new Maze(3, 3, "#.@#.##.$");
    check(test.hasSolution());

    test = new Maze(3, 3, "##@#.##.$");
    check(!test.hasSolution());

    System.out.println("Happy Panda! \uD83D\uDC3C");

  }

}