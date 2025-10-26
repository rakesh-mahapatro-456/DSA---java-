public class nq {
    public static void nqueens(char board[][],int row){
        //base-case
        if (row==board.length) {
            for(int i=0;i<board.length;i++){
                for(int j=0;j<board[0].length;j++){
                    System.out.print(board[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println();
            return;
        }
        for(int j=0;j<board.length;j++){
            if (isSafe(board, row, j)) {
                board[row][j] = 'q'; //placing q1 in row,j th place
                nqueens(board, row+1); // recursively placing q2,...qn in next rows
                board[row][j] = 'x'; // backtracking and checking all the combinations i.e removing q1 from i,j th place and placing in row,j+1 place to try all the possible combinations
            }
        }
    }


    public static boolean isSafe(char board[][],int row,int col){
        //vertical up
        for(int i=row-1;i>=0;i--){
            if (board[i][col]=='q') {
                return false;
            }
         }

         //left diagonal
         for(int i=row-1,j=col-1;i>=0&&j>=0;i--,j--){
            if (board[i][j]=='q') {
                return false;
            }
         }

         //right diagonal
         for(int i=row-1,j=col+1;i>=0&&j<board.length;i--,j++){
            if (board[i][j]=='q') {
                return false;
            }
         }

         return true;

    }
    public static void main(String[] args) {
        int n =4;
        char board[][] = new char[n][n];

        //initalizing board with .(dots)
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                board[i][j] = 'x';
            }
        }

        nqueens(board, 0);
        

    }
}
