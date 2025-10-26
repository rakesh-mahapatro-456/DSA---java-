public class DigitString {
    public static void digitToString(int n){
       String digits[] = {"zero","one","two","three","four","five","six","seven","eight","nine"};

       if (n == 0) {
         return ;
       }

       int lastDigit=n % 10;
       digitToString(n / 10);
       System.out.print(digits[lastDigit]+" ");
    }


    public static void main(String[] args) {
        digitToString(194788);
    }
}
