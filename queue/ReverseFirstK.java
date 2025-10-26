import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseFirstK {

    // public static Queue<Integer>  reverseFirstK(Queue<Integer> q,int n){
    //     Stack<Integer> s = new Stack<>();

    //     for(int i=0;i<n;i++){
    //         s.push(q.remove());
    //     }

    //     Queue<Integer> ans = new LinkedList<>();

    //     while (!s.isEmpty()) {
    //         ans.add(s.pop());
    //     }

    //     while (!q.isEmpty()) {
    //         ans.add(q.remove());
    //     }

    //     return ans;
    // }



    public static void reverseFirstK(Queue<Integer> q, int n) {
        //Time Complexity: O(N)
        //Space Complexity: O(n)

        if (q == null || n <= 0 || n > q.size()) {
            return;
        }

        Stack<Integer> s = new Stack<>();

        // Step 1: Push first n elements into stack
        for (int i = 0; i < n; i++) {
            s.push(q.remove());
        }

        // Step 2: Pop from stack and enqueue back into queue
        while (!s.isEmpty()) {
            q.add(s.pop());
        }

        // Step 3: Move the remaining elements to the back of the queue
        int size = q.size();
        for (int i = 0; i < size - n; i++) {
            q.add(q.remove());
        }
    }
    

    public static void main(String[] args) {
         Queue<Integer> q = new LinkedList<>();
         q.add(1);
         q.add(2);
         q.add(3);
         q.add(4);
         q.add(5);
         q.add(6);
         q.add(7);
         q.add(8);
         q.add(9);
         q.add(10);

         int n =5;

        //  Queue<Integer> ans  = reverseFirstK(q, n);

        //  int k = ans.size(); // Store size before iterating
        //  for (int i = 0; i < k; i++) {
        //     System.out.print(ans.remove() + " ");
        //  }

        reverseFirstK(q, n);

        // Print the modified queue
        while (!q.isEmpty()) {
            System.out.print(q.remove() + " ");
        }

    }
}
