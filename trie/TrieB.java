public class TrieB {
    static class  Node {
       Node children[] = new Node[26];
       boolean eow;

       public Node(){
        for(int i=0;i<children.length;i++){
            children[i] = null;
        }
       }
    }

    public static Node root = new Node();

    public static void insert(String words){
        Node curr = root;
        for(int i=0;i<words.length();i++){
            int idx = words.charAt(i) - 'a';
            if (curr.children[i] == null) {
                curr.children[idx] = new Node();
            }

            curr = curr.children[idx];
        }

        curr.eow = true;
    }

    public static boolean search(String key){
        Node curr = root;
        for(int i=0;i<key.length();i++){
            int idx = key.charAt(i) - 'a';
            if (curr.children[i] == null) {
                return false;
            }

            curr = curr.children[idx];
        }

        return curr.eow ==true;
    }

    

    public static void main(String args[]){
        String words[] = {"the","their","a","their","any","thee"};

        for(int i =0; i<words.length; i++){
            insert(words[i]);
        }

        System.out.println(search("any"));
        System.out.println(search("an"));
    }
}