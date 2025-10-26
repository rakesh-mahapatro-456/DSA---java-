public class transposeMatrix {
    public static void Transpose(int arr[][]){
        int rows = arr.length;
        int columns = arr[0].length;

        // int transpose[] []= new int[columns][rows];

        // for(int i=0;i<columns;i++){
        //     for(int j=0;j<rows;j++){
        //         transpose[i][j] = arr[j][i];
        //     }
        // }


        // for(int i=0;i<columns;i++){
        //     for(int j=0;j<rows;j++){
        //        System.out.print(transpose[i][j]+" ");
        //     }
        //     System.out.println();
        // }


        for (int i = 0; i < rows; i++) {
            for (int j = i + 1; j < columns; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        


        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
 

    public static void main(String[] args) {
        int[][] nums = { {1,2,3},{4,5,6},{7,8,9}};
       Transpose(nums);
    }
}
