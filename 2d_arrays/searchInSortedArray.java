public class searchInSortedArray {
    public static boolean search_In_Sorted_Array(int arr[][],int key){
        // int rows = arr.length;
        // int columns = arr[0].length-1;

        //brute-force -o(n^2) -25 comparsions
        // for(int i=0;i<rows;i++){
        //     for(int j=0;j<columns;j++){
        //         if (arr[i][j]==key) {
        //             return true;
        //         }
        //     }
        // }
        // return false;

        //rows-biary search - o(nlogn) -15 comparisions
        // for(int i=0;i<rows;i++){
        //     int start = 0;
        //     int end  = arr[0].length-1;
        //     while (start <= end) {
        //         int mid = (start+end)/2;
        //         if (arr[i][mid]==key) {
        //             System.out.println("found at :"+i+","+mid);
        //             return true;
        //         }
               
        //         if (arr[i][mid]>key) {
        //             end = mid-1;
        //         }
        //         else{
        //             start = mid+1;
        //         }
        //     }
            
        // }
        // return false;

        // stair-case search  - o(m+n)
        int rows = 0;
        int columns = arr[0].length-1;
        while (rows<arr.length && columns >= 0) {
            if (arr[rows][columns]==key) {
                return true;
            }
            else if (arr[rows][columns]>key) {
                columns--;
            }
            else{
                rows++;
            }
        }

        return false;
        }
    




    public static void main(String[] args) {
        int[][] num = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println(search_In_Sorted_Array(num,5));
}
}