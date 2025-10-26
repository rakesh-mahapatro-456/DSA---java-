import java.util.ArrayList;
public class ArrayListBasics {
    public static void main(String[] args) {
        // array list are of the part java collection framework - its a set of classes and interfaces containing many classes thte have inbuilt data structures
        // it has dynamic size and we cannot store primitive datatypees like int,bool,char and etc instead we store objects in it
        // array list have saimilar to properties has that of arrays it has all the functions and methods of any array
        ArrayList<Integer> list = new ArrayList<>();
        // ArrayList<Float> list2 = new ArrayList<>();  
        // ArrayList<Boolean> list3 = new ArrayList<>();  
        // ArrayList<String> list4 = new ArrayList<>();          

        //array list opeartiions
        // 1. adding elements - .add() - tc :O(1) - similar to python list
        list.add(1);
        list.add(2);

        //adding a elemnt at a particular index -tc:O(n)
        list.add(2,3);
        list.add(1,9);


        System.out.println(list);


        // 2.Get elemnt - to know what element is there at a specific index - tc:O(1)- .get()
        int elemnt = list.get(0);
        System.out.println(elemnt);


        // 3.remove - to delete a particular element from the array list - tc:O(n) - .remove()
        // list.remove(1);
        // System.out.println(list);

        //4. set element at index  - tc : O(n) - setting element at a given index - .set()
        list.set(1,10);
        System.out.println(list);

        //5. contains element - tc:O(n) - it checks whether a elemnt is present in the list or not - .contains
        System.out.println(list.contains(2));
        System.err.println(list.contains(1));

        // 6 to get a elemnt we use .get()
        // 7. size - its similar to .length in array and string it gives size of an array list its not a propert unlike in an array its a method- .size()
        System.out.println(list.size());

        //printing a array list
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }
        System.out.println();



        // array list in memory 
        // array list internally in java are stored in form of array only i.e whenever array list is created then an array of some fixed size is created and elemnts are stored in it if the array is filled totally or half the java autimatically creates duplicate array od double the original size and copies all the elements to it

    }
}