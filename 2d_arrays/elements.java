public class elements {
    public static void numberOfTimes(int arr[][],int key){
        int count = 0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if (arr[i][j]==key) {
                    count++;
                }
            }
        }

        System.err.println("no.of times is :"+count);

    }


    public static void main(String[] args) {
        int[][] array = { {4,7,8},{8,8,7} };
        numberOfTimes(array, 7);
    }
}
