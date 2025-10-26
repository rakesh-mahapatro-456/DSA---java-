public class spiralMatrix {
    public static void spiralMatrixPrint(int arr[][]){
        int startRow = 0;
        int endRow = arr.length-1;
        int startColumn = 0;
        int endCoulmn = arr[0].length-1;

        while (startColumn<=endCoulmn && startRow<= endRow) {
            //top
            for(int i=startColumn;i<=endCoulmn;i++){
                System.out.print(arr[startRow][i]+" ");
            }

            //right
            for(int j=startRow+1;j<=endRow;j++){
                System.out.print(arr[j][endCoulmn]+" ");
            }

            //bottom
            for(int i=endCoulmn-1;i>=startColumn;i--){
                //for odd case 
                // if (startRow == endRow) {
                //     break;
                // }
               
                System.out.print(arr[endRow][i]+" ");
            }

            //left
            for(int j=endRow-1;j>=startRow+1;j--){
                //for odd case 
                // if (endCoulmn == startColumn) {
                //     break;
                // }
                System.out.print(arr[j][startColumn]+" ");
            }

            startColumn++;
            startRow++;
            endCoulmn--;
            endRow--;
        }
    }


    public static void main(String[] args) {
        int arr[][] = {
            // {1, 2, 3, 4},
            // {5, 6, 7, 8},
            // {9, 10, 11, 12}
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        spiralMatrixPrint(arr);
    }
}
