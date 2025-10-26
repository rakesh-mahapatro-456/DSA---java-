import java.util.*;;

public class HashMapCode{
    static class HashMap<K,V> { //generic - it can be any datatype of data - parameterised types - the key and value can be of any data type
        private class  Node {
            K key;
            V value;
            
            public Node( K key,V value){
                this.key = key;
                this.value = value; 
            }
        }


        private static int n; //n
        private static int N; //N = buckets.length
        private LinkedList<Node> bucket[]; 

        @SuppressWarnings("unchecked")
        public HashMap(){
            this.N = 4;
            this.bucket = new LinkedList[4];
            for(int i=0;i<4;i++){
                this.bucket[i] = new LinkedList<>();
            }
        }  
        
        private int hashFunction(K key){
            int hc = key.hashCode();
            return Math.abs(hc)%N; // modulo with any no will give a no bn 0 to n-1 and abs converts negative to +ve nos
        }

        private int SearchInLL(K key,int bi){
            LinkedList<Node> ll = bucket[bi];
            int di = 0;

            for(int i=0;i<ll.size();i++){
                Node node = ll.get(i);
                if (node.key == key) {
                    return di;
                }

                di++;
            }


            return -1;
        }

        @SuppressWarnings("unchecked")
        private void rehash(){
            LinkedList<Node> oldBuck[] = bucket;
            bucket = new LinkedList[N*2];
            N = N*2;

            for(int i=0;i<bucket.length;i++){
                this.bucket[i] = new LinkedList<>();
            }

            //remove nodes from oldbuck and add to new buck
            for(int i=0;i<bucket.length;i++){
               LinkedList<Node> ll = oldBuck[i];
               for(int j=0;j<ll.size();j++){
                    Node node = ll.remove();
                    put(node.key, node.value);
               }
            }
        }

        public void put(K key, V value) {
            int bi = hashFunction(key); // 0 to size-1
            int di = SearchInLL(key,bi); //valid or -1 bi- says which bukets ll to be searched

            if (di !=-1) {
                Node node = bucket[bi].get(di);
                node.value = value;
            }
            else{
                bucket[bi].add(new Node(key, value));
                n++;
            }

            double lambda = (double)n/N;
            if (lambda > 2.0) {
                rehash();
            }
        }
        
        public boolean containsKey(K key) {
            int bi = hashFunction(key); // 0 to size-1
            int di = SearchInLL(key,bi); //valid or -1 bi- says which bukets ll to be searched

            if (di !=-1) { //valid
               return true;
            }
            else{
                return false;
            }
            
        }
        
        public V get(K key) {
            int bi = hashFunction(key); // 0 to size-1
            int di = SearchInLL(key,bi); //valid or -1 bi- says which bukets ll to be searched

            if (di !=-1) {
                Node node = bucket[bi].get(di);
                return node.value;
            }
            else{
                return null;
            }
        }
        
        public V remove(K key) {
            int bi = hashFunction(key); // 0 to size-1
            int di = SearchInLL(key,bi); //valid or -1 bi- says which bukets ll to be searched

            if (di !=-1) {
                Node node = bucket[bi].remove(di);
                n--;
                return node.value;
            }
            else{
                return null;
            }
        }
        
        public ArrayList<K> keySet() {
            ArrayList<K> keys = new ArrayList<>();

            for(int i=0; i<bucket.length; i++) { 
                LinkedList<Node> ll = bucket[i]; 
                for (Node node : ll) {
                    keys.add(node.key);
                }
            }
            return keys; 
        }

        public boolean isEmpty(){
            return n==0;
        }

        
    }

    public static void main(String[] args) {
        HashMap<Integer, String> hm = new HashMap<>();

        // Adding elements
        hm.put(1, "A");
        hm.put(2, "B");
        hm.put(3, "C");
        hm.put(4, "D");
        hm.put(5, "E");

        // Display all keys
        System.out.println("Keys: " + hm.keySet());

        // Getting values
        System.out.println("Value of key 3: " + hm.get(3));
        System.out.println("Value of key 6 (not present): " + hm.get(6));

        // Checking if key exists
        System.out.println("Contains key 2? " + hm.containsKey(2));
        System.out.println("Contains key 6? " + hm.containsKey(6));

        // Removing a key
        System.out.println("Removing key 3, Value: " + hm.remove(3));
        System.out.println("Keys after removal: " + hm.keySet());

        // Checking if empty
        System.out.println("Is HashMap empty? " + hm.isEmpty());

        // Clearing all elements
        hm.remove(1);
        hm.remove(2);
        hm.remove(4);
        hm.remove(5);
        System.out.println("Is HashMap empty after removing all elements? " + hm.isEmpty());
    }


}