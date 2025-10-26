public class XO {
    public static void fill0X(int m,int n){
        int top = 0;
        int bottom = m-1;
        int left = 0;
        int right = n-1;
        char ch = 'X';
        char board[][] = new char[m][n];

        while (top<=bottom && left<=right) {
            //top
            for(int i=left;i<=right;i++){
                board[top][i] = ch;
            }
            top++; 
            
            //right
            for(int i=top;i<=bottom;i++){
                board[i][right] = ch;
            }
            right--; 
           
            //bottom
            for(int i=right;i>=left;i--){
                board[bottom][i] = ch;
            }
            bottom--; 

           //left
            for(int i=bottom;i>=top;i--){
                board[i][left] = ch;
            }
            left++;
            

            if(ch == 'X'){
                ch = 'O';
            }
            else{
                ch = 'X';
            }
        }

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.err.print(board[i][j]+"");
            }
            System.out.println();
        }

    }
    


    public static void main (String[] args) {
 
        System.out.println("Output for m = 5, n = 6");
        fill0X(5, 6);
     
        System.out.println("Output for m = 4, n = 4");
        fill0X(4, 4);
     
        System.out.println("Output for m = 3, n = 4");
        fill0X(3, 4);
             
        
    }
}
