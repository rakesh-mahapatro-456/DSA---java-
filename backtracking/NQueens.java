public class NQueens {
    // Time-Complexity : O(n!)
    // public static boolean n1queens(char chessborad[][],int row){
    //     if (row == chessborad.length) {
    //         count++;
    //         //printChesssBoard(chessborad);
    //         return true;
    //     }

    //     //recursion
    //     for(int i=0;i<chessborad.length;i++){
    //         if (isSafe(chessborad, row, i)) {
    //             chessborad[row][i] ='q';
    //             if (n1queens(chessborad, row+1)) {
    //                 return true;
    //             }
    //            //bactrack
    //             chessborad[row][i] = 'x';
    //         }
    //     }

    //     return false;
    // }

    public static void nqueens(char chessborad[][],int row){
        if (row == chessborad.length) {
            count++;
            printChesssBoard(chessborad);
            return;
        }

        //recursion
        for(int i=0;i<chessborad.length;i++){
            if (isSafe(chessborad, row, i)) {
                chessborad[row][i] ='q';
                nqueens(chessborad, row+1);
               //bactrack
                chessborad[row][i] = 'x';
            }
        }
    }

    public static boolean isSafe(char chessBoard[][],int row,int col){
         //vertical up
         for(int i=row-1;i>=0;i--){
            if (chessBoard[i][col]=='q') {
                return false;
            }
         }

         //diag left up
         for(int i=row-1,j =col-1;i>=0&&j>=0;i--,j-- ){
            if (chessBoard[i][j]=='q') {
                return false;
            }
         }

         //diag left right
         for(int i=row-1,j =col+1;i>=0&&j<chessBoard.length;i--,j++ ){
            if (chessBoard[i][j]=='q') {
                return false;
            }
         }


         return true;
    }


    static int count = 0;

    public static void printChesssBoard(char chessBoard[][]){
        System.out.println("--------chessboard----------");
        for(int i=0;i<chessBoard.length;i++){
            for(int j=0;j<chessBoard.length;j++){
                System.out.print(chessBoard[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 5;
        char chessBoard [][] = new char[n][n];
        //intialize the chessboard
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                chessBoard[i][j] = 'x';
            }
        }
        nqueens(chessBoard, 0);
        // if (n1queens(chessBoard, 0)) {
        //     System.out.println("soln is possible");
        //     printChesssBoard(chessBoard);
        // }
        // else{
        //     System.out.println("soln is not possible");
        // }
        
        System.out.println("total ways to solve nqueens is :"+ count);

    }
}
