import java.util.ArrayList;
import java.util.Collections;

public class Sorting {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(2);
        list.add(8);
        list.add(14);
        list.add(1);

        // we can implement all the sorts i.e bubble,merge,quick,counting,selection,insertion sorts for arraylists
        //collections.sort(list) - its a inbuilt optimised sorting methos which is there in collections class whereas collection is a interface.it sorts in ascending order

        System.out.println(list+" ");
        Collections.sort(list);
        System.out.println(list+" ");

        //descending order
        Collections.sort(list,Collections.reverseOrder());
        // Collections.reverseOrder() - its a comparator - a comparator is a fnx which define logic how sorting should ne done in java we can apply to objects too
        System.out.println(list+" ");

    }
}
