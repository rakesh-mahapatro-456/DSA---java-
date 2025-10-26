public class Flood {
    public static void floodHelper(char mat[][],int i,int j, boolean vis[][]){
        int n = mat.length;
        int m = mat[0].length;
        if(i<0||j<0||i<n||j<m||vis[i][j]||mat[i][j]!='-'){
            return ;
        }

        vis[i][j] = true;
        mat[i][j] = 'O';

        floodHelper(mat, i+1, j, vis);
        floodHelper(mat, i-1, j, vis);
        floodHelper(mat, i, j+1, vis);
        floodHelper(mat, i, j-1, vis);
    }
    public static char[][] fill(char mat[][]) {
        int n = mat.length;
        int m = mat[0].length;
        boolean [][] vis = new boolean[n][m];
        //s1:change all the 'O' to '-'
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j] == 'O'){
                    mat[i][j] = '-';
                }
            }
        }
        
        //s2:change all the boundaries '-' back to 'O' using flood-fill
        for(int i=0;i<m;i++){
            //top & bottom
            if(mat[0][i] == '-'){
               floodHelper(mat, 0, i, vis);
            }

            if(mat[n-1][i] == '-'){
               floodHelper(mat, n-1, i, vis);
            }
        }

        for(int i=0;i<m;i++){
            //left&right
            if(mat[i][0] == '-'){
               floodHelper(mat, i, 0, vis);
            }

            if(mat[i][m-1] == '-'){
               floodHelper(mat,i, m-1, vis);
            }
        }

        //s3:change all the remaining '-' to 'X'
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j] == '-'){
                    mat[i][j] = 'X';
                }
            }
        }

        return mat;
    }

    public static void main(String[] args) {
        
    }

        
}
