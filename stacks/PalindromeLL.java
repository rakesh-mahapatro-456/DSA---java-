import java.util.*;
// public class PalindromeLL {
    
//     public static boolean isPalindrome(LinkedList<Character> ll){
//         //tc:O(n) and sc:O(n)
//         Stack<Character> s = new Stack<>();

//         // Push all elements into the stack
//         for (int i = 0; i < ll.size(); i++) {
//             s.push(ll.get(i));
//         }
    
//         int j = 0;
//         // Compare elements from the stack with the list
//         while (!s.isEmpty()) {
//             if (s.pop() != ll.get(j)) {
//                 return false;  // Not a palindrome
//             }
//             j++;  // Move to the next element in the list
//         }
    
//         return true;  // It's a palindrome
//     }

//     public static void main(String[] args) {
//         LinkedList<Character> ll = new LinkedList<>();
//         ll.addFirst('a');
//         ll.addFirst('b');
//         ll.addFirst('c');
//         ll.addFirst('b');
//         ll.addFirst('a');

//         System.out.println(ll);

//         System.out.println(isPalindrome(ll));
//     }
// }



public class PalindromeLL {

    //t:O(n) and sc:O(n)

    // Node class for singly linked list
    static class Node {
        char data;
        Node next;

        Node(char data) {
            this.data = data;
            this.next = null;
        }
    }

    // Function to check if the linked list is a palindrome using a stack
    public static boolean isPalindrome(Node head) {
        if (head == null || head.next == null) {
            return true;  // Empty or single-node list is always a palindrome
        }

        // Step 1: Find the middle of the linked list
        Node slow = head;
        Node fast = head;
        Stack<Character> stack = new Stack<>();

        // Push the first half of elements onto the stack
        while (fast != null && fast.next != null) {
            stack.push(slow.data);
            slow = slow.next;
            fast = fast.next.next;
        }

        // Step 2: Handle odd-length lists by skipping the middle element
        if (fast != null) {
            slow = slow.next;  // Skip the middle element
        }

        // Step 3: Compare the second half of the list with the stack
        while (slow != null) {
            if (stack.pop() != slow.data) {
                return false;  // Not a palindrome
            }
            slow = slow.next;
        }

        return true;  // It's a palindrome
    }

    public static void main(String[] args) {
        // Create the linked list: a -> b -> c -> b -> a
        Node head = new Node('a');
        head.next = new Node('b');
        head.next.next = new Node('c');
        head.next.next.next = new Node('b');
        head.next.next.next.next = new Node('a');

        // Print the result
        System.out.println(isPalindrome(head));  // Output: true
    }
}

