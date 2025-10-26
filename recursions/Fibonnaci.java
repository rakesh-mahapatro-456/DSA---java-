public class Fibonnaci {
    public static int printFibonnaci(int n){

        if (n==0) {
            return 0;
        }

        if (n==1) {
            return 1;
        }

        int lst = printFibonnaci(n-1);
        int slst = printFibonnaci(n-2);

        int sum = lst + slst;

        return sum;
    }



    public static void main(String[] args) {
       System.out.println(printFibonnaci(7)); 
    }
}
