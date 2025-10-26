public class MajorityElement {
    public static int majority(int arr[]){
        // parms = int arr[],int lead,int i,int curr
        // recursions
        // if (i == arr.length) {
        //     return curr;
        // }

        // // If lead is 0, set the current element as the new candidate
        // if (lead == 0) {
        //     curr = arr[i];
        //     lead = 1;
        // } else if (curr == arr[i]) {
        //     lead++;
        // } else {
        //     lead--;
        // }

        // return majority(arr, lead, i + 1, curr);


        int maj = arr[0];
        int lead = 1;

        for(int i=1;i<arr.length;i++){
            if (maj==arr[i]) {
                lead++;
            }
            else if(lead>0){
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
        int arr[] ={6,5,5};
        System.out.println(majority(arr));
    }
}
