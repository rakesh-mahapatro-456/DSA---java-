import java.util.*;

public class BinaryNumber {

    public static void generateBinary(int n){
        Queue<String> q = new LinkedList<>(); // Use String queue
        q.add("1"); // Start with "1"

        for(int i = 0; i < n; i++){
            String bn = q.remove(); // Get the front binary number
            System.out.print(bn + " "); // Print it
            
            q.add(bn + "0"); // Append "0" and add to queue
            q.add(bn + "1"); // Append "1" and add to queue
        }
    }

    public static void main(String[] args) {
        int n = 5;
        generateBinary(n);
    }
}
