public class arrayItems {
    public static boolean elementsRepeatInArray(int n[]){
        boolean flag = false;
        for(int i=0;i<n.length;i++){
            int curr = n[i];
            for(int j=i+1;j<n.length;j++){
                if(curr==n[j]){
                    flag = true;
                    break;
                }
            }
        }
        return flag;
    }



    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 1};
        System.out.println(elementsRepeatInArray(arr));


    }
}
