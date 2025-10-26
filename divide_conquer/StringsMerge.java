public class StringsMerge {
    public static void mergeSort(String str[],int si,int ei){
        if (si>=ei) {
            return;
        }
        int mid = si+(ei-si)/2;
        mergeSort(str, si, mid);
        mergeSort(str, mid+1, ei);
        merge(str,si,ei,mid);
    }

    public static void merge(String str[],int si,int ei,int mid){
        String temp[] = new String[ei-si+1];

        int i= si; // left iterator
        int j = mid+1; // right iterator
        int k =0; //temp iterator

        while (i<=mid && j<=ei) {
            if (str[i].compareToIgnoreCase(str[j])<0) {
                temp[k] = str[i];
                i++;
                k++;
            }
            else{
                temp[k] = str[j];
                j++;
                k++;
            }
        }


        while (i<=mid) {
            temp[k++] = str[i++];
        }

        while (j<=ei) {
            temp[k++] = str[j++];
        }

        for(k=0,i=si; k<temp.length;i++,k++){
            str[i] = temp[k];
        }

    }


    public static void printArray(String arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        String str[] = { "sun", "earth", "mars", "mercury"};
        mergeSort(str, 0, str.length-1);
        printArray(str);
    }
}
