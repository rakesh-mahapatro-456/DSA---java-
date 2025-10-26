public class sumSecondRow {
    public static void sum_of_second_row(int arr[][]){
        int sum =0;
        for(int i=0;i<arr.length;i++){//row
            for(int j=0;j<arr[0].length;j++){//column
                if (i==1) {
                    sum += arr[i][j];
                }
            }
        }

        System.out.println(sum);
    }


    public static void main(String[] args) {
        int[][] nums = { {1,4,9},{11,4,3},{2,2,3} };
        sum_of_second_row(nums);
    }
}
