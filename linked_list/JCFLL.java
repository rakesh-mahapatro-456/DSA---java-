import java.util.LinkedList;
public class JCFLL {

    public static void main(String[] args) {
        //create - it uses objects 
        LinkedList<Integer> ll = new LinkedList<>();

        //add
        ll.addLast(2);
        ll.addLast(1);
        ll.addFirst(0);

        //printing ll 0->1->2
        System.out.println(ll);

        //remove
        ll.removeFirst();
        ll.removeLast();
        System.out.println(ll);

    }
    
}
