//import java.util.ArrayList;

public class StackB {

    static class  Node {
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
        
    }

    static class Stack {
        // // array list implementation
        // static ArrayList<Integer> list = new ArrayList<>();

        // //operations on stack

        // // 1. isEmpty()
        // public static boolean isEmppty(){
        //     //checks whether the stack is empty or not
        //     return list.size() == 0;
        // }

        // //2.push() - stores a element in the stack
        // public static void push(int data){
        //     list.add(data); // the add fn of arraylist automatically add it to the end of the array list hence the top of the stack
        // }

        // //3.pop() - deletes a element fromm the stack and returns it
        // public static int pop(){
        //     // tc :O(1)
        //     if (isEmppty()) {
        //         return -1;
        //     }
        //     int top = list.get(list.size()-1); // storing the last element in the arraylist 
        //     list.remove(list.size()-1); //deleteing the last element of the arraylist
        //     return top; // returning the element which is deleted
        // }

        // //4.peek() -returning the last elemnt i.e top of stack
        // public static int peek(){
        //     if (isEmppty()) {
        //         return -1;
        //     }
        //     return  list.get(list.size()-1);
        // }

        //ll implementation
        static Node head = null;

         // 1. isEmpty()
        public static boolean isEmpty(){
            //checks whether the stack is empty or not
            return head == null;
        }

        //2.push() - stores a element in the stack
        public static void push(int data){
            Node newNode = new Node(data);

            if (isEmpty()) {
                //if ll is empty
                head = newNode;
                return;
            }

            newNode.next = head;
            head = newNode;
        }

        //3.pop() - deletes a element fromm the stack and returns it
        public static int pop(){
            if (isEmpty()) {
                return -1;
            }
            int top = head.data;
            head = head.next;
            return top;
        }
        //4.peek() -returning the last elemnt i.e top of stack
        public static int peek(){
            if (isEmpty()) {
                return -1;
            }
            return head.data;
        }
    }

    public static void main(String[] args) {
        // Stack s = new Stack();
        // s.push(1);
        // s.push(2);
        // s.push(3);
        // s.push(4);

        // while (!s.isEmpty()) {
        //     System.out.println(s.peek());
        //     s.pop();
            
        // }
    }
}