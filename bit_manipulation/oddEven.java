public class oddEven {

    public static void OddEvenCheck(int n){
        int bitMask = 1;
        if ((n&bitMask) == 0) {
            System.out.println("its a even number");
        }
        else{
            System.out.println("its a odd number");
        }
    }

    public static void main(String[] args) {
        OddEvenCheck(2);
        OddEvenCheck(0);
        OddEvenCheck(12);
        OddEvenCheck(3);
    }

     
}