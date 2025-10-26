import java.util.HashMap;

public class Itineaey{

    public static String getStart( HashMap<String, String> tickets){
        HashMap<String, String> revMap = new HashMap<>();

        for(String k : tickets.keySet()){
            revMap.put(tickets.get(k), k);
        }

        for(String k : tickets.keySet()){
            if (!revMap.containsKey(k)) {
                return k;
            }
        }

        return null;
    }
    public static void main(String[] args) {
        HashMap<String, String> tickets = new HashMap<>();
        tickets.put("Chennai", "Bengaluru");
        tickets.put("Mumbai", "Delhi");
        tickets.put("Goa", "Chennai");
        tickets.put("Delhi", "Goa");

        String start = getStart(tickets); //O(n)
        System.out.print(start);
        for(String k : tickets.keySet()){
            System.out.print("->"+tickets.get(start));
            start = tickets.get(start);
        }

        System.out.println();

    }
}