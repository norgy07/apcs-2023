package unit10;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Maze {
    private boolean solution;
    private char[][] maze;

    /**
     * Instantiates a Maze instance based on the provided arguments
     * 
     * @param rows the number of rows
     * @param cols the number of columns
     * @param line the values to be placed in the maze.
     */
    public Maze(int rows, int cols, String line) {
        // TODO part a

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
    private void check(int r, int c) {
        // TODO part b

    }

    /**
     * Determines if there is a solution (a path of '.') for this maze.
     * 
     * @return true if the maze has a path from Start (@) to End ($).
     */
    public boolean hasSolution() {
        // TODO part c
        return false; // replace me!

    }

    // HINT overriding toString may be handy. :)

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
package unit10;


public class Maze {

    private char[][] grid;
    private boolean solution; 
  
    
    public Maze(int rows, int cols, String maze) {
    grid = new char[rows][cols];
    int r = rows;
    int c = cols;
      for (int row = 0; row < r; row++){
        for (int col = 0; col < c; col++){
          grid[row][col] = maze.charAt(row * r + col);
        }
      } 
    }
  
    /**
     * returns coordinates of the starting location, as "r,c" (row, column)
     */
    public String getStart() {
      char start = '@';
      int r = 0; 
      int c = 0; 
      String s = "";
      for (int row = 0; row < grid.length; row++){
        for(int col = 0; col < grid[0].length; col++){
          if (grid[row][col] == start)
             s = "("+r+","+c+")";
          else{
            r++;
            c++;
          }
        }
      }
      return s; 
    }
  
    /**
     * @returns coordinates of the target location, as "r,c" (row, column)
     */
    public String getGoal() { 
      char goal = '$';
      int r = 0; 
      int c = 0; 
      String gg = "";
      for (int row = 0; row < grid.length; row++){
        for(int col = 0; col < grid[0].length; col++){
          if (grid[row][col] == goal)
            gg = ("("+r+","+c+")");
          else{
            r++;
            c++;
          }
        }
      }
      return gg; 
    }
  
    /**
     * Explores the maze from point r,c to determine if there is a path
     * to the goal.
     */
    private void explore(int r, int c) { 
      int a = r; 
      int b = c; 
      for (int row = a; row < grid.length; row++){
        for(int col = b; col < grid[0].length; col++){
          if (grid[row+1][col] == '.'){
            grid[row][col] = 'V';
            row = row+1;
          }
          else if (grid[row][col+1] == '.'){
            grid[row][col] = '>';
            col = col+1; 
          }
          else if (grid[row][col] == '$'){
            solution = true;
          }
        }
      }
    }
  
    /**
     * Determins if the maze has a solution or not.
     */
    public boolean hasSolution() {
      return solution;
    }

    public static void check(boolean test) throws AssertionError {
      if (!test)
          throw new AssertionError("sad panda");
    }



  public static void main(String[] args) {
      Maze example = new Maze(3, 3, "#.@.....$");
      check(example.hasSolution());

      //Maze case1 = new Maze(5, 7, ".#.#....#.#.##@.....$#...#.##..#...");
      //(case1.hasSolution());

     // Maze case2 = new Maze(4, 4, ".#.$.##..##.@..#");
     // check(!case2.hasSolution());

    //  Maze test = new Maze(3, 3, "#.@.....$");
     // check(test.hasSolution());

     // test = new Maze(3, 3, "##@#####$");
    //  check(!test.hasSolution());

     // test = new Maze(3, 3, "##@#..#.$");
     // check(test.hasSolution());

     // test = new Maze(3, 3, "#.@#.##.$");
      //check(test.hasSolution());

     // test = new Maze(3, 3, "##@#.##.$");
     // check(!test.hasSolution());

     // System.out.println("Happy Panda! \uD83D\uDC3C");

  }

}