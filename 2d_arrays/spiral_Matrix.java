public class spiral_Matrix {
    public static void printSpiralMatrix(int arr[][]){
        int startRow = 0;
        int endRow = arr.length-1;
        int startColumn = 0;
        int endColumn = arr[0].length-1;

        while (startRow<=endRow && startColumn <=endColumn) {
            
            
            //left
            for(int i=startRow;i<=endRow;i++){
                System.out.print(arr[i][startColumn]+" ");
            }
            
    
    
            //bottom
            for(int i=startRow+1;i<=endRow;i++){
                System.out.print(arr[endRow][i]+" ");
            }
    
            //right
            for(int i=endRow-1;i>=startRow;i--){
                System.out.print(arr[i][endColumn]+ " ");
            }
    
            

            startColumn++;
            startRow++;
            endColumn--;
            endRow--;


            //System.out.println();
        }     

     
    }



    public static void main(String[] args) {
        int arr[][] = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {19, 100, 111, 112}
        };
        
        printSpiralMatrix(arr);
    }
}
