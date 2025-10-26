public class LinkedList {
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node head; // variable of node data type that point head
    public static Node tail; // variable of node data type that point tail
    public static int size; // variable for knowing size of ll

    // we write methods to perform operations like search,add,delete,removing elements from ll and call it in main function

    public void addFirst(int data){ // tc :O(1)
        // step 1: create node
        Node newNode = new Node(data);
        size++;
 
        // base-case when ll is empty
        if (head == null) {
            head = tail = newNode;
            return;
        }

        // step 2: initialize newNode next as head
        newNode.next = head; // linking with previous head node

        //step 3: change head value to newNode as it is the new head
        head = newNode;
    }

    public void addlast(int data){ //tc:O(1)
        // step 1: create node
        Node newNode = new Node(data);
        size++;

        // base-case when ll is empty
        if (head == null) {
            head = tail = newNode;
            return;
        }

        // step 2: change tail nodes next from null to pointing towards new node
       tail.next = newNode; // linking with previous tail node

        //step 3: change tail value to newNode as it is the new tail
        tail = newNode;
    }

    public void printLinkedList(){ //tc:O(n)
        if (head == null) { //base case
            System.out.println("linked list is empty");
            return;
        }
        // as we cannot traverse through ll usinh head or tail variabbles i.e it should be always fixed it should only change when ll is changes 
        // so we create a temp pointer or variable that will help us to traverse through the ll and print its data onn the console/terminal
        Node temp = head;

        // we use a while with condition till temp's next i.e till we encounter next as null signifying that its the last node and we should stop now
        while (temp!=null) {
            System.out.print(temp.data +" ->"); // printing current nodes data
            temp = temp.next; // updating temp to next node with help of current node's next refrence variable
        }
        System.out.println("null");
    }

    public void add(int data, int idx) {
        if (idx == 0) {
            addFirst(data);
            return;
        }

        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;
    
        // Traverse to the node just before the insertion point
        while (temp != null && i < idx - 1) {
            temp = temp.next;
            i++;
        }

        // Insert the new node at the specified position
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public int removeFirst(){
        if (size == 0) {
            // when linked list is empty
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }
        else if (size == 1) {
            // when linked list has only one node then we have to change both head and tail value
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val= head.data; // accessing data and returning it as it is being deleted
        head = head.next; // changing head value to next node
        size--;
        return val;
    }

    public int removeLast(){
        if (size == 0) {
            // when linked list is empty
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }
        else if (size == 1) {
            // when linked list has only one node then we have to change both head and tail value
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }


        Node prev = head;
        for(int i=0;i<size-2;i++){
            prev = prev.next;
        }
        
        int val = prev.next.data;
        prev.next = null;
        tail = prev;
        size--;

        return val;
        
    }

    // Search for a key in a Linked List. Return the position where it is found.
    // If not found, return -1.

    public int iterativeSearch(int key){ // tc:O(n)
        // here we use loops and perform linear serach on ll using an while loop and temp variable
        Node temp = head;
        int i=0; // for index purpose

        while (temp != null ) {
            if (temp.data == key) { //succesfully found key
                return i;
            }

            temp = temp.next;
            i++;
        }

        return -1; // key not found
    }

    public int recursiveSearch(Node head, int key, int i) { //tc & sc :O(n)
        // Base case: if the current node is null, the key is not in the list
        if (head == null) {
            return -1;
        }
    
        // Check if the current node's data matches the key
        if (head.data == key) {
            return i;
        }
    
        // Recurse to the next node, incrementing the index
        return recursiveSearch(head.next, key, i + 1);
    }


    public void reverse(){ //tc :O(n) &sc:O(1)
        Node prev = null ; // as head does not have any previous node so its is null
        Node curr = tail = head; // as from head ll starts so its is the start
        Node nxt ;


        while (curr != null) {
            nxt = curr.next; //saving the link of next nodes in ll to not lose it
            curr.next = prev; //now revrsing the link
            prev = curr; // updating curr as prev node
            curr = nxt; // updating next as curr node

        }

        head = prev; //new head is assigned to head
    }

    public void deleteNthFromEnd(int n){
        //calculate size of ll
        int sz =0;
        Node temp = head;
        while (temp!=null) {
            temp = temp.next;
            sz++;
        }

        if (n == sz) { // head is only to be deleted
            head = head.next; //remove first
            return;
        }

        // middle node to be deleted sz-n
        int i=1;
        int iToFindPrev = sz-n;
        Node prev = head;
        while (i<iToFindPrev) { //traverse from head n-1 that nth node's prev node
            prev = prev.next;
            i++;
        }

        //delete 
        prev.next = prev.next.next;  // prev.next = nthnode.next
        return;

    }

    public Node findMid(Node head){
        // slow fast approach
        Node slow = head;
        Node fast = head;

        while (fast !=null && fast.next != null) { // both odd and even case
            slow = slow.next; // +1 step in ll
            fast = fast.next.next; //+2 step in ll
        }

        return slow; // slow is on mid noode
    }
    
    public boolean isPalindrome(){ //tc:O(n) & sc:O(1)
        // base case
        if (head == null || head.next ==null) {
            return true;
        }
       //step 1 : find mid by using findmid() helper function
       Node midNode = findMid(head);

       //step 2 : reverse 2nd half of the ll
       Node prev = null ; // as head does not have any previous node so its is null
        Node curr = midNode; // as from head ll starts so its is the start
        Node nxt ;


        while (curr != null) {
            nxt = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nxt;

        }

        Node right = prev; //right-half node
        Node left = head; //left half node

       //step 3 : compare left and right values
       while (right !=null) {
        if (left.data != right.data) {
            return false;
        }
        left = left.next;
        right = right.next;
       }

       return true;
    }


    public static boolean isCycle(){
        Node slow = head;
        Node fast = head;

        while (fast!=null && fast.next!=null ) {
            slow = slow.next; //+1
            fast = fast.next.next; //+2

            if (slow == fast) {
                return true; // cycle exists
            }
        }

        return false;
    }


    public static void removeCycle(){
        //detect cycle
        Node slow = head;
        Node fast = head;
        boolean flag = false;

        while (fast!=null && fast.next!=null ) {
            slow = slow.next; //+1
            fast = fast.next.next; //+2
            if (slow == fast) {
                flag = true;
                break;
            }
        }

        if (flag == false) {
            return; // no cycle in ll
        }

        //find meeting point
        slow = head;
        Node prev  = null; //stores last node of ll
        while (slow != fast) {
            prev = fast;
            slow = slow.next; //+1
            fast = fast.next; //+1
        }

        //remove cycle --> last.next = null
        prev.next = null;
    }
    private Node getMid(Node head){
        // slow fast approach
        Node slow = head;
        Node fast = head.next;

        while (fast !=null && fast.next != null) { // both odd and even case
            slow = slow.next; // +1 step in ll
            fast = fast.next.next; //+2 step in ll
        }

        return slow; // slow is on mid noode
    }


    private Node merge(Node head1,Node head2){
        Node mergedLL = new Node(-1);
        Node temp = mergedLL;

        while (head1!=null && head2!=null) {
            if (head1.data <= head2.data) {
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            }else{
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
        }

        while (head1!=null) {
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }

        while (head2!=null) {
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }

        return mergedLL.next;
    }

    public Node mergeSort(Node head){
        //base case when ll is emty or one node only
        if (head == null || head.next ==null) {
            return head;
        }
        //find mid
        Node mid = getMid(head);
        //divide in left and right ll
        Node rightHead = mid.next;
        mid.next = null;
        Node newLeft = mergeSort(head);
        Node newRight = mergeSort(rightHead);

        //merge using temp ll
        return merge(newLeft,newRight);
    }

    public void zigzag(){
        //find mid
        Node slow = head;
        Node fast = head.next;

        while (fast!=null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        Node mid = slow;


        //reverse 2nd half of ll
        Node prev = null;
        Node curr = mid;
        Node nxt;

        while (prev!=null) {
            nxt = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nxt;
        }

        Node right = prev; //right-half node
        Node left = head; //left half node
        Node nextL,nextR;

        while (right!=null && left!=null) {
            nextL = left.next;
            left.next = right;
            nextR  = right.next;
            right.next = nextL;
            
            right = nextR;
            left = nextL;
        }

    }


    

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        // ll.addFirst(2);
        // ll.addFirst(1);
        // ll.addlast(3);
        // ll.addlast(4);
        // ll.addlast(5);
        // ll.printLinkedList();
        // ll.deleteNthFromEnd(3);
        // ll.printLinkedList();

        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(2);
        //ll.addFirst(1);

        ll.printLinkedList();
        System.out.println(ll.isPalindrome());


        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = head;
        // 1->2->3->1

        System.out.println(isCycle());
       
    }
}