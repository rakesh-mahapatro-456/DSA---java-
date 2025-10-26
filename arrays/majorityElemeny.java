public class majorityElemeny {
    public static int majorityElement(int arr[]){
        int lead  =1;
        int maj = arr[0];

        for(int i=0;i<arr.length;i++){
            if(maj==arr[i]){
                lead++;
            }
            else if (lead>0) {
                lead--;   
            }
            else{
                maj = arr[i];
                lead = 1;
            }
        }

        return maj;
    }


    public static void main(String[] args) {
        int arr[] = {2,2,3,1,2,3,3,3,3,3};
        System.out.println(majorityElement(arr));
    }
}
