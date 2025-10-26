public class NKnights {
        static int count = 0;
    
        public static void main(String[] args) {
            int n = 2;  // Define the size of the chessboard and number of knights
            char[][] chessBoard = new char[n][n];
    
            // Initialize the chessboard with 'x' representing empty squares
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    chessBoard[i][j] = 'x';
                }
            }
    
            // Start placing knights
            nKnights(chessBoard, 0, 0, 0, n);
    
            System.out.println("Total ways to place " + n + " knights: " + count);
        }
    
        // Recursive function to place knights on the board
        public static void nKnights(char[][] chessBoard, int row, int col, int knightsPlaced, int n) {
            if (knightsPlaced == n) {
                count++;
                printChessBoard(chessBoard);
                return;
            }
    
            // If we reach the end of the board, stop the recursion
            if (row >= n) {
                return;
            }
    
            // Move to the next row if we reach the end of the current row
            int nextRow = (col == n - 1) ? row + 1 : row;
            int nextCol = (col == n - 1) ? 0 : col + 1;
    
            // Place the knight if it's safe
            if (isSafe(chessBoard, row, col)) {
                chessBoard[row][col] = 'K';
                nKnights(chessBoard, nextRow, nextCol, knightsPlaced + 1, n);
                // Backtrack
                chessBoard[row][col] = 'x';
            }
    
            // Try not placing a knight and move to the next position
            nKnights(chessBoard, nextRow, nextCol, knightsPlaced, n);
        }
    
        // Function to check if placing a knight at (row, col) is safe
        public static boolean isSafe(char[][] chessBoard, int row, int col) {
            // Define all possible knight moves
            int[][] moves = {
                {-2, -1}, {-2, 1},  // Two up, one left/right
                {-1, -2}, {-1, 2},  // One up, two left/right
                {1, -2}, {1, 2},    // One down, two left/right
                {2, -1}, {2, 1}     // Two down, one left/right
            };
    
            // Check each possible knight move
            for (int[] move : moves) {
                int newRow = row + move[0];
                int newCol = col + move[1];
    
                // Check if the new position is within bounds and occupied by a knight
                if (newRow >= 0 && newRow < chessBoard.length && newCol >= 0 && newCol < chessBoard.length) {
                    if (chessBoard[newRow][newCol] == 'K') {
                        return false;
                    }
                }
            }
    
            return true;
        }
    
        // Function to print the chessboard
        public static void printChessBoard(char[][] chessBoard) {
            System.out.println("-------- Chessboard --------");
            for (int i = 0; i < chessBoard.length; i++) {
                for (int j = 0; j < chessBoard.length; j++) {
                    System.out.print(chessBoard[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
    

   
//    class KnightTour {
//        static int N = 8;
    
//        /* A utility function to check if i,j are
//           valid indexes for N*N chessboard */
//        static boolean isSafe(int x, int y, int sol[][])
//        {
//            return (x >= 0 && x < N && y >= 0 && y < N
//                    && sol[x][y] == -1);
//        }
    
//        /* A utility function to print solution
//           matrix sol[N][N] */
//        static void printSolution(int sol[][])
//        {
//            for (int x = 0; x < N; x++) {
//                for (int y = 0; y < N; y++)
//                    System.out.print(sol[x][y] + " ");
//                System.out.println();
//            }
//        }
    
//        /* This function solves the Knight Tour problem
//           using Backtracking.  This  function mainly
//           uses solveKTUtil() to solve the problem. It
//           returns false if no complete tour is possible,
//           otherwise return true and prints the tour.
//           Please note that there may be more than one
//           solutions, this function prints one of the
//           feasible solutions.  */
//        static boolean solveKT()
//        {
//            int sol[][] = new int[8][8];
    
//            /* Initialization of solution matrix */
//            for (int x = 0; x < N; x++)
//                for (int y = 0; y < N; y++)
//                    sol[x][y] = -1;
    
//            /* xMove[] and yMove[] define next move of Knight.
//               xMove[] is for next value of x coordinate
//               yMove[] is for next value of y coordinate */
//            int xMove[] = { 2, 1, -1, -2, -2, -1, 1, 2 };
//            int yMove[] = { 1, 2, 2, 1, -1, -2, -2, -1 };
    
//            // Since the Knight is initially at the first block
//            sol[0][0] = 0;
    
//            /* Start from 0,0 and explore all tours using
//               solveKTUtil() */
//            if (!solveKTUtil(0, 0, 1, sol, xMove, yMove)) {
//                System.out.println("Solution does not exist");
//                return false;
//            }
//            else
//                printSolution(sol);
    
//            return true;
//        }
    
//        /* A recursive utility function to solve Knight
//           Tour problem */
//        static boolean solveKTUtil(int x, int y, int movei,
//                                   int sol[][], int xMove[],
//                                   int yMove[])
//        {
//            int k, next_x, next_y;
//            if (movei == N * N)
//                return true;
    
//            /* Try all next moves from the current coordinate
//                x, y */
//            for (k = 0; k < 8; k++) {
//                next_x = x + xMove[k];
//                next_y = y + yMove[k];
//                if (isSafe(next_x, next_y, sol)) {
//                    sol[next_x][next_y] = movei;
//                    if (solveKTUtil(next_x, next_y, movei + 1,
//                                    sol, xMove, yMove))
//                        return true;
//                    else
//                        sol[next_x][next_y]
//                            = -1; // backtracking
//                }
//            }
    
//            return false;
//        }
    
//        /* Driver Code */
//        public static void main(String args[])
//        {
//            // Function Call
//            solveKT();
//        }
//    }
    
   
    
   
   