public class RatWays {
   // Function to find all paths
   public static void rat_Ways(int arr[][], int i, int j, int n, String path) {
    // Base case: if we reach the destination
    if (i == n - 1 && j == n - 1) {
        System.out.println(path);  // Print the path when the destination is reached
        return;
    }

    // If the current position is out of bounds or blocked, return
    if (i < 0 || j < 0 || i >= n || j >= n || arr[i][j] == 0) {
        return;
    }

    // Mark the current cell as visited (blocked for future steps)
    arr[i][j] = 0;

    // Explore all possible directions (left, right, up, down)
    // Add the direction to the path string
    rat_Ways(arr, i, j - 1, n, path + "L");  // Left
    rat_Ways(arr, i, j + 1, n, path + "R");  // Right
    rat_Ways(arr, i - 1, j, n, path + "U");  // Up
    rat_Ways(arr, i + 1, j, n, path + "D");  // Down

    // Backtrack: unmark the current cell (restore it to 1)
    arr[i][j] = 1;
}

// Main function to drive the solution
public static void main(String[] args) {
    // Define the maze (1 = open path, 0 = blocked path)
    int maze[][] = { 
        { 1, 0, 0, 0 },
        { 1, 1, 0, 1 },
        { 0, 1, 0, 0 },
        { 1, 1, 1, 1 }
    };

    // Check if the starting point is valid (it should be open)
    if (maze[0][0] == 1) {
        // Call the recursive function to find paths
        rat_Ways(maze, 0, 0, maze.length, "");
    } else {
        System.out.println("No path from start (0, 0).");
    }
}
}


/*
 *  Steps to Solve the Maze Problem
Initialize Variables:

Create a String path variable to store the current path.
Use a visited 2D array to track which cells have been visited.
Define the Base Case:

If the current cell (i, j) is the destination (n-1, n-1):
Add the path to the result.
Print or store the path.
Check for Valid Moves (Using isSafe):

The function should return true only if:
(i, j) is within bounds of the grid.
The cell (i, j) is not a blocked cell (arr[i][j] == 1).
The cell (i, j) has not already been visited (!visited[i][j]).
Move in All Four Directions:

Move to the next cell in each direction:
Down (i + 1, j)
Up (i - 1, j)
Right (i, j + 1)
Left (i, j - 1)
Update the path variable with the direction: D, U, R, L.
Backtrack:

After exploring all possible paths from the current cell, mark it as unvisited to allow other paths to use it.
 */