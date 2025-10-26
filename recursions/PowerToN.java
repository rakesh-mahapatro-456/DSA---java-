public class PowerToN {
    public static int power(int a,int n){
        if (n == 0) {
            return 1;
        }

        return a*power(a,n-1);
    }

    public static int optpow(int a,int n){
        if (n == 0) {
            return 1;
        }

        int halfpow = optpow(a, n/2);
        int halfpowsq = halfpow*halfpow;

        if (n%2!=0) {
            halfpow = a*halfpowsq;
            return halfpow;
        }


        return halfpowsq;
    }


    public static void main(String[] args) {
        System.out.println(power(2, 5));
        System.out.println(optpow(2, 5));

    }
}
